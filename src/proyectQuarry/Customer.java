package proyectQuarry;

import javax.swing.JOptionPane;
import static proyectQuarry.ProyectQuarryCompany.Customers;
import static proyectQuarry.ProyectQuarryCompany.teclado;


public class Customer extends Person{

    public Customer(String Id, String Name1, String Address1) {
    }
   
     
public static void Customer() {
        //Pedimos datos para crear un CLiente
        System.out.print("\n ID OR CIF: ");
        String Id =teclado.nextLine(); 
        System.out.print("name: ");
        String Name = teclado.nextLine();
        System.out.print("Address: ");
        String Address = teclado.nextLine();
        System.out.print("cellphone of client: ");
        String Cellphone = teclado.nextLine();
        
        //Creamos Cliente
        Customer nuevoCustomer = new Customer(Id, Name, Address);
        //Buscamos posicion libre en el array
        int huecoLibre = -1;
        for (int i = 0; i < Customers.length && huecoLibre == -1; i++) {
            if (Customers[i] == null) //Hemos encontrado hueco libre
            {
                huecoLibre = i; //Guardamos posicion libre, esto ademas pone fin al bucle
            }
        }
        //Comprobamos si hemos encontrado hueco libre
        if (huecoLibre == -1) {
            System.out.println("There is no space available to save the new customer");
            
            
        } else {
            Customers[huecoLibre] = nuevoCustomer;
            System.out.println("he client is " + "\n" +" nombre = "  + Name + "\n" + "direccion= " + Address + "\n" + "id =" + Id +"\n"+ "celphone"+ Cellphone+"THE CUSTOMER HAS BEEN REGISTERED");

        }
}

    
    
}
    