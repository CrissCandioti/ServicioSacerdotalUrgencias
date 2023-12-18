package utilidades;

import javax.swing.JInternalFrame;
import raven.drawer.Drawer;
import raven.drawer.DrawerOption;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.MenuEvent;
import raven.drawer.component.menu.MenuValidation;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.swing.AvatarIcon;
import vista.ConsultaGuardianes;
import vista.ConsultaSacerdotes;
import vista.HistoricoPedidos;
import vista.PedidosDelDia;
import static vista.Principal.escritorio;
import vista.RegistroEnfermoContactoPedido;
import vista.RegistroGuardianes;
import vista.RegistroSacerdotes;

/**
 *
 * @author Cristian
 */
public class MyDrawerBuilder extends SimpleDrawerBuilder {

    @Override
    public SimpleHeaderData getSimpleHeaderData() {
        return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("/Imagenes/logito.png"), 60, 60, 999))
                .setTitle("Servicio Sacerdotal de Urgencias")
                .setDescription("ServicioSacerdotal@gmail.com");

    }

    @Override
    public SimpleMenuOption getSimpleMenuOption() {
        String menus[][] = {
            {"~MAIN~"},
            {"DashBoard"},
            {"~LLAMADOS~"},
            {"Registrar pedidos"},
            {"Ver pedidos"},
            {"Calendar"},
            {"~ADMNISTRACION~"},
            {"Registrar Sacerdote"},
            {"Registrar Guardian"},
            {"~CONSULTAS~"},
            {"Historico Pedidos"},
            {"Sacerdotes"},
            {"Guardianes"},};
        String icons[] = {
            "dashboard.svg",
            "email.svg",
            "chat.svg",
            "calendar.svg",
            "ui.svg",
            "forms.svg",
            "chart.svg",
            "icon.svg",
            "page.svg",};

        return new SimpleMenuOption()
                .setMenus(menus)
                .setIcons(icons)
                .setBaseIconPath("iconos")
                .setIconScale(0.45f)
                .addMenuEvent(new MenuEvent() {
                    @Override
                    public void selected(MenuAction action, int index, int subIndex) {
                        if (index == 1) {
                            cerrarFrames();
                            RegistroEnfermoContactoPedido registro = new RegistroEnfermoContactoPedido();
                            ControlaInstancia(registro);
                            Drawer.getInstance().closeDrawer();
                        }
                        if (index == 2) {
                            cerrarFrames();
                            PedidosDelDia pd = new PedidosDelDia();
                            ControlaInstancia(pd);
                            Drawer.getInstance().closeDrawer();

                        }
                        if (index == 4) {
                            cerrarFrames();
                            RegistroSacerdotes s = new RegistroSacerdotes();
                            ControlaInstancia(s);
                            Drawer.getInstance().closeDrawer();
                        }
                        if (index == 5) {
                            cerrarFrames();
                            RegistroGuardianes r = new RegistroGuardianes();
                            ControlaInstancia(r);
                            Drawer.getInstance().closeDrawer();
                        }
                        if (index == 6) {
                            cerrarFrames();
                            HistoricoPedidos hp = new HistoricoPedidos();
                            ControlaInstancia(hp);
                            Drawer.getInstance().closeDrawer();
                        }
                        if (index == 7) {
                            cerrarFrames();
                            ConsultaSacerdotes cs = new ConsultaSacerdotes();
                            ControlaInstancia(cs);
                            Drawer.getInstance().closeDrawer();
                        }
                        if (index ==8) {
                            cerrarFrames();
                            ConsultaGuardianes cg=new ConsultaGuardianes();
                            ControlaInstancia(cg);
                            Drawer.getInstance().closeDrawer();
                        }
                        System.out.println("Menu Selected " + index + " , " + subIndex);
                    }
                })
                .setMenuValidation(new MenuValidation() {
                    @Override
                    public boolean menuValidation(int index, int subIndex) {
                        if (index == 0) {
                            return false;
                        } else if (index == 3) {
                            return false;
                        }
                        return true;
                    }
                });

    }

    @Override
    public SimpleFooterData getSimpleFooterData() {
        return new SimpleFooterData()
                .setTitle("ServicioSacerdotal")
                .setDescription("Version 1.1,0");
    }

    public final void ControlaInstancia(JInternalFrame inter) {
        cerrarFrames();
        for (JInternalFrame frame : escritorio.getAllFrames()) {
            if (frame.getClass().equals(inter.getClass())) {
                frame.toFront(); // Si está abierto, tráelo al frente
                return;
            }
        }

        // Si no está abierto, crea una nueva instancia 
        escritorio.add(inter);
        inter.setVisible(true);
        inter.setLocation(190, 10);
    }

    void cerrarFrames() {
        for (JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
    }

}
