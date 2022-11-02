package proyectQuarry;

import static proyectQuarry.ProyectQuarryCompany.registration;
import static proyectQuarry.ProyectQuarryCompany.teclado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toshiba
 */
public class VehicleRegistration {

    public VehicleRegistration(String LicensePlateVehicle1, String NameOfClient) {
    }

  public static void VehicleRegistration() {
        //Pedimos datos para crear un CLiente
        System.out.print("\nlicense plate of vehicle: ");
        String LicensePlateVehicle = teclado.nextLine();
        System.out.print("driver name or client name: ");
        String NameOfClient = teclado.nextLine();
        
        //Creamos Cliente
        VehicleRegistration nuevoVehicleRegistration = new VehicleRegistration(LicensePlateVehicle, NameOfClient);
        //Buscamos posicion libre en el array
        int huecoLibre = -1;
        for (int i = 0; i < registration.length && huecoLibre == -1; i++) {
            if (registration[i] == null) //Hemos encontrado hueco libre
            {
                huecoLibre = i; //Guardamos posicion libre, esto ademas pone fin al bucle
            }
        }
        //Comprobamos si hemos encontrado hueco libre
        if (huecoLibre == -1) {
            System.out.println("There is no space available to save the new record of vehicle");
        } else {
            registration[huecoLibre] = nuevoVehicleRegistration;
            System.out.println ("he client is " + "\n" +" license of vehicle = "  + LicensePlateVehicle + "\n" + "name of client= " + NameOfClient + "\n" +"THE VEHICLE HAS BEEN REGISTERED");
        }
    }
          
  public int LicensePlateVehicle;
  public String EntryDate;
  public String EntryTime;
  public String NameDriver;
  public String ExitDate;
  public String ExitTime; 
  
    public VehicleRegistration(int LicensePlateVehicle, String EntryDate, String EntryTime, String NameDriver, String ExitDate, String ExitTime) {
        this.LicensePlateVehicle = LicensePlateVehicle;
        this.EntryDate = EntryDate;
        this.EntryTime = EntryTime;
        this.NameDriver = NameDriver;
        this.ExitDate = ExitDate;
        this.ExitTime = ExitTime;
    }

    VehicleRegistration(String LicensePlateVehicle, String NameOfClient, String EntryDate, String EntryTime, String ExitDate, String ExitTime) {
    }

    @Override
    public String toString() {
        return "VehicleRegistration{" + '}';
    }

    public int getLicensePlateVehicle() {
        return LicensePlateVehicle;
    }

    public void setLicensePlateVehicle(int LicensePlateVehicle) {
        this.LicensePlateVehicle = LicensePlateVehicle;
    }

    public String getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(String EntryDate) {
        this.EntryDate = EntryDate;
    }

    public String getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(String EntryTime) {
        this.EntryTime = EntryTime;
    }

    public String getNameDriver() {
        return NameDriver;
    }

    public void setNameDriver(String NameDriver) {
        this.NameDriver = NameDriver;
    }

    public String getExitDate() {
        return ExitDate;
    }

    public void setExitDate(String ExitDate) {
        this.ExitDate = ExitDate;
    }

    public String getExitTime() {
        return ExitTime;
    }

    public void setExitTime(String ExitTime) {
        this.ExitTime = ExitTime;
    }

}