/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20_controlwork_summ_of_digits;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20_ControlWork_Summ_of_digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userscanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста трехзначное число");
        int usernumber;
        usernumber = userscanner.nextInt();
        int number_tens = usernumber%10;
        int summ_tens = (usernumber%100)/10;
        double ostatok_ot_100 = usernumber%100;
        double summ_hundreds = (usernumber-ostatok_ot_100)/100;
        double all_summ = summ_hundreds + summ_tens + number_tens;
        System.out.printf("сумма всех цифр %.0f%n", all_summ);
        
    }
    
}
