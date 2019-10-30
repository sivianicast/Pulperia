
package Pulperia;

import javax.swing.JOptionPane;

public class Pulperia {
    public static void main(String[] args) {
        String opcion = "";
        boolean salir = true;
        do{
            opcion = JOptionPane.showInputDialog("Bienvenidos a la pulpería elija una opción:\n\n"
                +"1 - Ir a inventario\n"
                + "2 - Ir a ventas\n"
                + "3 - Ir a clientes\n"
                + "4 - Ir a pedidos\n"
                + "5 - Salir\n\n");
            switch (opcion){
                case "1":
                    submenuInventarios();
                    break;
                case "2":
                    submenuVentas();
                    break;
                case "3":
                    submenuClientes();
                    break;
                case "4":
                    submenuPedidos();
                    break;
                case "5":
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Por favor ingrese una opocion correcta\n");
            }        
        }while(salir);
    }
    public static void submenuInventarios (){
        String opcion = "";
        boolean salir = true;
        do {
            opcion = JOptionPane.showInputDialog("Bienvenidos a Inventarios:\n\n"
                +"1 - Ver todos los registros\n"
                + "2 - Agregar un registro nuevo\n"
                + "3 - Modificar algún registro\n"
                + "4 - Eliminar algún registro\n"
                + "5 - Volver al menu principal\n\n");
            switch (opcion){
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Por favor ingrese una opocion correcta\n");
            }   
        } while (salir);
    }
    public static void submenuVentas(){
        String opcion = "";
        boolean salir = true;
        do {
            opcion = JOptionPane.showInputDialog("Bienvenidos a Ventas:\n\n"
                +"1 - Ver todos los registros\n"
                + "2 - Agregar un registro nuevo\n"
                + "3 - Modificar algún registro\n"
                + "4 - Eliminar algún registro\n"
                + "5 - Volver al menu principal\n\n");
            switch (opcion){
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Por favor ingrese una opocion correcta\n");
            }   
        } while (salir);
    }
    public static void submenuClientes(){
        String opcion = "";
        boolean salir = true;
        do {
            opcion = JOptionPane.showInputDialog("Bienvenidos a Clientes:\n\n"
                +"1 - Ver todos los registros\n"
                + "2 - Agregar un registro nuevo\n"
                + "3 - Modificar algún registro\n"
                + "4 - Eliminar algún registro\n"
                + "5 - Volver al menu principal\n\n");
            switch (opcion){
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Por favor ingrese una opocion correcta\n");
            }   
        } while (salir);
    }
    public static void submenuPedidos(){
        String opcion = "";
        boolean salir = true;
        do {
            opcion = JOptionPane.showInputDialog("Bienvenidos a Pedidos::\n\n"
                +"1 - Ver todos los registros\n"
                + "2 - Agregar un registro nuevo\n"
                + "3 - Modificar algún registro\n"
                + "4 - Eliminar algún registro\n"
                + "5 - Volver al menu principal\n\n");
            switch (opcion){
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Por favor ingrese una opocion correcta\n");
            }   
        } while (salir);
    }
}
