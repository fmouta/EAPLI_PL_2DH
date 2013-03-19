/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package eapli.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author Paulo Gandra Sousa
*
* based on code form Nuno Silva
*/
public class Console {

    static public String readLine(String prompt) {
        try {
            System.out.println(prompt);

            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);

            return in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static public int readInteger(String prompt) {
        do {
            try {
                String strInt = readLine(prompt);

                int valor = Integer.parseInt(strInt);

                return valor;
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    static public boolean readBoolean(String prompt) {
        do {
            try {
                String strBool = readLine(prompt).toLowerCase();

                if (strBool.equals("s") || strBool.equals("y")) {
                    return true;
                } else if (strBool.equals("n")) {
                    return false;
                }
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    static public Date readDate(String prompt) {
        do {
            try {
                String strDate = readLine(prompt);

                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                Date date = df.parse(strDate);

                return date;
            } catch (ParseException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    public static double readDouble(String prompt) {
        do {
            try {
                String input = readLine(prompt);

                double valor = Double.parseDouble(input);

                return valor;
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }
}