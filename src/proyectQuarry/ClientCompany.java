package proyectQuarry;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toshiba
 */
public class ClientCompany {
   public int CIF;
   public int cellphone;        

    public ClientCompany(int CIF, int cellphone) {
        this.CIF = CIF;
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "ClientCompany{" + '}';
    }

    public int getCIF() {
        return CIF;
    }

    public void setCIF(int CIF) {
        this.CIF = CIF;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

   

}