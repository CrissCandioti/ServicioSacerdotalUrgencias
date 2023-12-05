/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import accesoDatos.DAO;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import entidades.Guardia;
import java.io.File;

import java.time.LocalDate;
import javax.swing.JFileChooser;
import service.GuardianService;
import service.SacerdoteService;

/**
 *
 * @author criss
 */
public final class pdfGuardia extends DAO {

    public void pdfPorDietaID(int id) {
        try {
            String sql = "SELECT * FROM `guardia` WHERE idGuardia = " + id;
            consultarBaseDatos(sql);

            int contador = 0;

            //Se crea un String con valor null
            String nombrePDF = null;

            // Se crear un objeto JFileChooser
            JFileChooser fileChooser = new JFileChooser();

            // Se establecer el título de la ventana
            fileChooser.setDialogTitle("Guardar Reporte");

            // Se muestra la ventana de diálogo para seleccionar la ruta
            int seleccion = fileChooser.showSaveDialog(null);

            // Se comprueba si se seleccionó una ruta
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                // Se obtiene la ruta seleccionada y la almacenamos en el String creado anteriormente
                nombrePDF = fileChooser.getSelectedFile().getAbsolutePath();
            }

            // Si el usuario no escribre la extension nos aseguramos de agregarla
            if (!nombrePDF.toLowerCase().endsWith(".pdf")) {
                nombrePDF += ".pdf";
            }

            Document documento = new Document();

            //Si el reporte contiene el mismo nombre y se ubica en el mismo lugar le agregamos un numero auto incremental al nombre
            while (new File(nombrePDF).exists()) {
                contador++;
                nombrePDF += "(" + contador + ")" + ".pdf";
            }

            PdfWriter.getInstance(documento, new FileOutputStream(nombrePDF));

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Servicio Sacerdotal © \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));

            Paragraph texto = new Paragraph();
            texto.setAlignment(Paragraph.ALIGN_LEFT);

            Chunk FECHA = new Chunk("FECHA:", FontFactory.getFont("Tahoma", 10, Font.BOLD | Font.UNDERLINE, BaseColor.DARK_GRAY));
            Chunk VOCAL = new Chunk("VOCAL:", FontFactory.getFont("Tahoma", 10, Font.BOLD | Font.UNDERLINE, BaseColor.DARK_GRAY));
            Chunk TELEFONISTA = new Chunk("TELEFONISTA:", FontFactory.getFont("Tahoma", 10, Font.BOLD | Font.UNDERLINE, BaseColor.DARK_GRAY));
            Chunk CHOFER = new Chunk("CHOFER:", FontFactory.getFont("Tahoma", 10, Font.BOLD | Font.UNDERLINE, BaseColor.DARK_GRAY));
            Chunk ACOMPAÑANTE = new Chunk("ACOMPAÑANTE:", FontFactory.getFont("Tahoma", 10, Font.BOLD | Font.UNDERLINE, BaseColor.DARK_GRAY));
            Chunk SACERDOTE = new Chunk("SACERDOTE:", FontFactory.getFont("Tahoma", 10, Font.BOLD | Font.UNDERLINE, BaseColor.DARK_GRAY));

            Guardia aux = null;
            while (resultado.next()) {
                GuardianService gs = new GuardianService();
                SacerdoteService ss = new SacerdoteService();

                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);

                aux = new Guardia(id, localDate, gs.buscarGuardianPorID(idVocalIndex), gs.buscarGuardianPorID(idTelefonistaIndex), gs.buscarGuardianPorID(idChoferIndex), gs.buscarGuardianPorID(idAcompañanteIndex), ss.buscarSacerdotePorID(idSacerdoteIndex), resultado.getString(8));

                texto.add(FECHA);
                texto.add(" " + aux.getFecha() + "\n\n");

                texto.add(VOCAL);
                texto.add(" " + aux.getIdVocal().getNombre() + " " + aux.getIdVocal().getApellido() + "\n\n");

                texto.add(TELEFONISTA);
                texto.add(" " + aux.getIdTelefonista().getNombre() + " " + aux.getIdTelefonista().getApellido() + "\n\n");

                texto.add(CHOFER);
                texto.add(" " + aux.getIdChofer().getNombre() + " " + aux.getIdChofer().getApellido() + "\n\n");

                texto.add(ACOMPAÑANTE);
                texto.add(" " + aux.getIdAcompañante().getNombre() + " " + aux.getIdAcompañante().getApellido() + "\n\n");

                texto.add(SACERDOTE);
                texto.add(" " + aux.getIdSacerdote().getNombre() + " " + aux.getIdSacerdote().getApellido() + "\n\n");

            }

            parrafo.add(aux.getEstado() + "\n\n");

            documento.open();
            documento.add(parrafo);
            documento.add(texto);

            documento.close();
            JOptionPane.showMessageDialog(null, "Se generó con éxito el Reporte");
        } catch (NullPointerException f) {
            JOptionPane.showMessageDialog(null, "Reporte Cancelado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al realizar el reporte: " + e);
        } finally {
            desconectarBaseDatos();
        }
    }
}
