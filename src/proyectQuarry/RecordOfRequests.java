package proyectQuarry;

import static proyectQuarry.ProyectQuarryCompany.teclado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toshiba
 */
public class RecordOfRequests {
public static  RecordOfRequests[] requests = new RecordOfRequests [11];
    
    public RecordOfRequests(String date, String time, String client, String quantitytons) {
    }

    public static void setRequests(RecordOfRequests[] requests) {
        RecordOfRequests.requests = requests;
    }

    

   
    
 public static void RecordOfRequests() {
        //Pedimos datos para crear un CLiente
        System.out.print("\nCompany client or client: ");
        String client =teclado.nextLine(); 
        System.out.print("date: ");
        String date = teclado.nextLine();
        System.out.print("time: ");
        String time = teclado.nextLine();
        System.out.print("quentity tons: ");
        String quantitytons = teclado.nextLine();
        //Creamos Cliente
        RecordOfRequests nuevoRecordOfRequests = new RecordOfRequests(date, time, client, quantitytons);
        //Buscamos posicion libre en el array
        int huecoLibre = -1;
        for (int i = 0; i < requests.length && huecoLibre == -1; i++) {
            if (requests[i] == null) //Hemos encontrado hueco libre
            {
                huecoLibre = i; //Guardamos posicion libre, esto ademas pone fin al bucle
            }
        }
        //Comprobamos si hemos encontrado hueco libre
        if (huecoLibre == -1) {
            System.out.println("There is no space available to save the new requests");
        } else {
            requests[huecoLibre] = nuevoRecordOfRequests;
            System.out.println("THE INVOICE CREATED IS: " + "\n" +" name of client = "  + client + "\n" + "Entry date=" + date + "\n" + "emtry time =" + time + "\n" +"exit time ="+quantitytons+"\n"+"APPLICATION RECORD COMPLETED" );
        }
    
        
    
}

    public static RecordOfRequests[] getRequests() {
        return requests;
    }
 
}