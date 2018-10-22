package com.company;

public class Tabungan {

    private int saldo;
    public void Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
        int total = saldo-jumlah;
        return total;
    }
}
