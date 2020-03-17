package com.RAMM.x00401617;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sca=new Scanner(System.in);
        int x=0,y=0,solucion;

        System.out.print("Ingrese la cantidad de numeros a calcular:");
        int n=sca.nextInt();
        for (int i = 1; i <n+1; i++) {
            if(i==1||i==2){
                System.out.print("1,");
                x=1;
                y=1;
            }

        }
    }
}
