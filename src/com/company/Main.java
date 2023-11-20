package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner numero = new Scanner (System.in);
        System.out.println("BUBU Milano");
        System.out.println("inserisci il primo numero");
        n1 = numero.nextInt();
        System.out.println("inserisci il secondo numero");
        n2 = numero.nextInt();
        CoppiaNumeri coppia1_obj = new CoppiaNumeri (n1,n2);
        coppia1_obj.setN1(n1);
        coppia1_obj.setN2(n2);
        System.out.println("N1: " + coppia1_obj.getN1());
        System.out.println("N2: " + coppia1_obj.getN2());
        System.out.println("il minimo comune multiplo tra i due numeri è " + coppia1_obj.mcm());
        System.out.println("BUBU Milano");
    }
}