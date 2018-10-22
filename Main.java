package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int D;
        System.out.println("====Program Penarikan Uang====");
        Tabungan T = new Tabungan();

        System.out.printf("Masukan Saldo Awal : ");
        T.Tabungan(scn.nextInt());
        System.out.printf("Jumlah uang yang akan diambil : ");
        D = scn.nextInt();

        System.out.println("Saldo Anda Sekarang : "+ T.ambilUang(D));

    }
}
