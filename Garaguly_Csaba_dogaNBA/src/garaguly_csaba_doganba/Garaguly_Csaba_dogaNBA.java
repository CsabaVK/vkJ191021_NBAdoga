/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garaguly_csaba_doganba;
import java.util.Random;
import java.io.*;
import java.util.Collections;
import java.util.Arrays;

/**
 *
 * @author garaguly.csaba
 */
public class Garaguly_Csaba_dogaNBA {

    /**
     * @param args the command line arguments
     */
    static String[] nev = new String[15];
    static int[] number1 = new int[15];
    static int[] number2 = new int[15];
    static int rep = 0;
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        /*Random rnd = new Random();
        int number = 0;
        System.out.print("Hány számot szeretne generálni 1-10 között:");
        number = Integer.parseInt(Readline(System.in));*/
        try 
        {
            FileReader f = new FileReader("NBA2003.txt");
            BufferedReader br = new BufferedReader(f);
            String row = null;
            int x = 0;
            while ((row = br.readLine()) !=null) 
            {                
                String [] d = row.split(";");
                nev[x] = d[0];
                number1[x] = Integer.parseInt(d[1]);
                number2[x] = Integer.parseInt(d[2]);
                x++;
            }
            br.close();
        } 
        catch (Exception hiba) 
        {
            System.out.println("Nincs fájl");
        }
        
        for (int i = 0; i < 15; i++) 
        {
            System.out.println(nev[i]+" "+number1[i]*number2[i]+" $");
        }
        
        int max = 0;
        for (int i = 0; i < number1.length; i++) 
        {
            if (number1[i] > number1[max]) 
            {
                max = i;
            }
        }
        System.out.println("A legnagyobb fizetést kapja: " + nev[max] );
        
        
        int sum = 0;
        for (int i = 0; i < number1.length; i++) {
            sum =+ number1[i];
        }
        System.out.println("Egy évben ennyit költ a csapat a játékosokra: $" + sum);
        
        int min = 0;
        for (int i = 0; i < number1.length; i++) 
        {
            if (number1[i] < number1[max]) 
            {
                min = i;
            }
        }
        System.out.println("A különmség a max és min között: " + (max - min));
        
        int count = 0;
        double avg = 0;
        for (int i = 0; i < number1.length; i++) {
            if (number1[i] % 2 !=0)
            {
                avg =+ number1[i];
                count++;
            }
        }
        double avgf = (double) avg/count;
        System.out.println("Az átlag fizetés a csapatban: " + avgf);
        
        
        
        
    }
    
}
