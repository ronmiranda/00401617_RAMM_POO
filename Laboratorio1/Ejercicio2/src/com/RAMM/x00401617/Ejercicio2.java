package com.RAMM.x00401617;
import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {
    // write your code here
        Scanner sca=new Scanner (System.in);

        System.out.println("Introduce una frase");
        String frase=sca.nextLine();
        frase=frase.replaceAll("\\s+", "");
        System.out.println(frase);
        int ini=0;
        int fin=frase.length()-1;
        boolean palindromo=true;
        while(ini<fin){
            if(frase.charAt(ini)!=frase.charAt(fin)){
                palindromo=false;
            }
            ini++;
            fin--;


        }
        if(palindromo)
            System.out.println("Es Palindromo");
        else
            System.out.println("No es Palindromo");
}
}
