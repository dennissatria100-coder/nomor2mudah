/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomor2kategorimudah;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class Nomor2kategorimudah {

 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }
    }
}
