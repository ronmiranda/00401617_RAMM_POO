package com.RAMM.x00401617;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio5 {

    public static void main(String[] args) {
        // write your code here
        Scanner sca=new Scanner(System.in);
        ArrayList lista=new ArrayList();
        // char a,e,i,o,u;
        String cadena="";
        System.out.println("Introduzca una frase");
        cadena=sca.nextLine();

        for(int x=0;x<cadena.length();x++){
            switch (cadena.charAt(x)) {
                case 'a':
                    lista.add('a');
                    break;
                case 'e':
                    lista.add('e');
                    break;
                case 'i':
                    lista.add('i');
                    break;
                case 'o':
                    lista.add('o');
                    break;
                case 'u':
                    lista.add('u');
                    break;
                case 'A':
                    lista.add('A');
                    break;
                case 'E':
                    lista.add('E');
                    break;
                case 'I':
                    lista.add('I');
                    break;
                case 'O':
                    lista.add('O');
                    break;
                case 'U':
                    lista.add('U');
                    break;
                default:
                    break;
            }
            System.out.println("Las vocales que contiene la frase son:");
            for(Object vocal:lista){
                System.out.print(vocal+"-");
            }
        }
    }
}
