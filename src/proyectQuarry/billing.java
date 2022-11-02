
package proyectQuarry;

import java.lang.reflect.Array;
import static proyectQuarry.ProyectQuarryCompany.registration;
import static proyectQuarry.ProyectQuarryCompany.teclado;
import java.util.Arrays;
/**
 *
 * @author toshiba
 */
class billing {
    public static final billing[] bill =new billing[11];
    
public static void billing(int par) {
        //Pedimos datos para crear un CLiente
        System.out.print("\nlicense plate of vehicle: ");
        String LicensePlateVehicle = teclado.nextLine();
        System.out.print("driver name or client name: ");
        String NameOfClient = teclado.nextLine();
        System.out.print("entry date: ");
        String EntryDate = teclado.nextLine();
        System.out.print("\nentry time: ");
        String EntryTime = teclado.nextLine();
        System.out.print("exit date : ");
        String ExitDate = teclado.nextLine();
        System.out.print("exit time: ");
        String ExitTime = teclado.nextLine();
        System.out.print("Status of invoice: ");
        String invoice = teclado.nextLine();
        //Creamos Cliente
        billing billing = new billing(LicensePlateVehicle, NameOfClient, EntryDate, EntryTime, ExitDate, ExitTime, invoice);
        //Buscamos posicion libre en el array
        int huecoLibre = -1;
        for (int i = 0; i < bill.length && huecoLibre == -1; i++) {
            if (bill[i] == null) //Hemos encontrado hueco libre
            {
                huecoLibre = i; //Guardamos posicion libre, esto ademas pone fin al bucle
            }
        }
        //Comprobamos si hemos encontrado hueco libre
        if (huecoLibre == -1) {
            
        } else {
            System.out.println( );
            bill[huecoLibre] = billing;
            System.out.println("THE INVOICE CREATED IS: " + "\n" +" name of client = "  + NameOfClient + "\n" + "Entry date=" + EntryDate + "\n" + "emtry time =" + EntryTime + "\n" +"exit time ="+ExitTime+"\n"+"exit date="+ ExitDate+"\n"+"INVOICE STATUS="+ invoice );

        }
    }

    public billing(String LicensePlateVehicle, String NameOfClient, String EntryDate, String EntryTime, String ExitDate, String ExitTime, String invoice) {
    }
    
    }

    

    


    
        
    
    

