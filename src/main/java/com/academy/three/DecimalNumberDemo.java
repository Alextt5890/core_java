package com.academy.three;

public class DecimalNumberDemo{
    public static void main(String[] args) {
        /* float
        32 bitni zapis u memoriji priblizno precizan 6 do 7 dedcimala.
        Nije za finansijske proracune.
        Step1 : 3.4 kaze java ovo je 64 bitni decimalni broj i treba mi 64 bita
        Step2 : 64 bit 3.4 ubaci u float
        Step3 : ubaci u floatNumber
          */
     float floatNumber =(float) 3.4;
        /**
         * Step 1 : 3.4F float 32 bit
         * step 3 : ubaci float vrednosti u float varijablu/memorijski prostor
         */
     float floatNumber2 =(float) 3.4F;

     /**

      * double DEFAULT za decimalne brojeve
      * 3.4 Java ovo interpretira kao 64 bitni double broj
      */

     double a = 0.1;
     double b = 0.2;
     double c = a + b;
        System.out.println("0.1 + 0.2 = " + c);
        System.out.println("Da li je 0.1 + 0.2 = 0.3 ? Odgovor = "+ (c == 0.3));

/**
 * Zasto su float i double neprecizni?
 * Odgovor : oni koirste binarni floating point format
 * 0.1 BigDecimal
 * GUI
 */



    }
}
