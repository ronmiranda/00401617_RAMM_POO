package com.RAMM.x00401617;

public class Ejercicio3 {
    public void imprimir(int n){
        if(n>0){
            imprimir(n-1);
            System.out.print(n+",");

        }
    }
    public static void main(String[] args) {
        // write your code here
        Ejercicio3 recursivo=new Ejercicio3();
    }
}
