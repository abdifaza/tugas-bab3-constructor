/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

/**
 *
 * @author Faza Abdi
 */
public class maindataBase {

    public static void main(String[] args) {
        dataBase a = new dataBase();
        a.get();
        a.get(104);
        a.get("Gaji", 1000);
        a.get("denda", 200);
        a.get("gaji", "<", 1000);
        a.get("gaji", "<=", 1000);
        a.get("gaji", ">", 1000);
        a.get("gaji", ">=", 1000);

    }
}
