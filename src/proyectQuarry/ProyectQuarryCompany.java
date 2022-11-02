package proyectQuarry;


import java.util.Scanner;
import static proyectQuarry.Customer.Customer;
import static proyectQuarry.RecordOfRequests.RecordOfRequests;
import static proyectQuarry.VehicleRegistration.VehicleRegistration;
import static proyectQuarry.billing.billing;



 
public class ProyectQuarryCompany {

    public static final Scanner teclado = new Scanner(System.in);
    public static final Customer[] Customers = new Customer[11];
    public static final VehicleRegistration[] registration = new VehicleRegistration[11];
    
   
    
    
   //* creamos el menu pricipal 
    
    public static void main(String[] args) {
        int opc = 11;
        boolean cerrar = false;
        while (!cerrar) {

            System.out.println("\n\t\tWELCOME TO QUARRY COMPANY");
            System.out.println("[1] -- new client");
            System.out.println("[2] -- new request");
            System.out.println("[3] -- registration entry and exit vehicles");
            System.out.println("[4] -- billing");
            System.out.println("[5] -- exit");
            System.out.print("choose opcion: ");

            opc = Integer.parseInt(teclado.nextLine());

            switch (opc) {
                case 1 ->
                    Customer();
                case 2->
                    RecordOfRequests();
                case 3 ->
                    VehicleRegistration();
                case 4 ->
                    billing(11);
                case 5 ->
                    cerrar = true;
                default ->
                    System.out.println("\ninvalid option.");
            }

        }
        while (opc != 5);

                   }

    // creamos un ciclo en el cual no se podra salir del meu hasta que se presione 5
    
    }
     
    
    

   
                  

    

    

    

 
   
 


