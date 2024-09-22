package com.mycompany.project23;
import java.util.Scanner;

public class Project23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número inicial: ");
        int n1 = in.nextInt();
        System.out.println("Digite o número secundário: ");
        int n2 = in.nextInt();
        int soma = 0;
        int i = n1;
        while(i <= n2){
            soma = soma + i;
            i++;
        }
        System.out.println("Soma dos valores: " + soma);
    }
}
