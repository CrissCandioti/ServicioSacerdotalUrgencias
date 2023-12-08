/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package raven.cell;

/**
 *
 * @author Cristian
 */
public interface TableActionEvent {
    public void onEdit(int row);
    public void onView(int row);
    public void onDelete(int row);
}
