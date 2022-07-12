package Medias;

import java.util.Scanner;

public class Medias {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        Integer peso1 = 0;
        Integer faixaEtaria1 = 0;
        Integer peso2 = 0;
        Integer faixaEtaria2 = 0;
        Integer peso3 = 0;
        Integer faixaEtaria3 = 0;
        Integer peso4 = 0;
        Integer faixaEtaria4 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite sua idade");
            Integer idade = Integer.parseInt(Sc.nextLine());

            if(idade > 0 && idade <= 10) {
                System.out.println("Digite seu peso");
                peso1 = peso1 + Integer.parseInt(Sc.nextLine());
                faixaEtaria1 += 1;
            }

            if(idade > 10 && idade < 21) {
                System.out.println("Digite seu peso");
                peso2 = peso2 + Integer.parseInt(Sc.nextLine());
                faixaEtaria2 += 1;
            }

            if(idade > 20 && idade < 31) {
                System.out.println("Digite seu peso");
                peso3 = peso3 + Integer.parseInt(Sc.nextLine());
                faixaEtaria3 += 1;
            }
            if(idade > 30) {
                System.out.println("Digite seu peso");
                peso4 = peso4 + Integer.parseInt(Sc.nextLine());
                faixaEtaria4 += 1;
            }
        }

        System.out.println("Faixa Etária 1 a 10" + (peso1 > 0 ? (peso1/faixaEtaria1) : 0));
        System.out.println("Faixa Etária 11 a 20" + (peso2 > 0 ? (peso2/faixaEtaria2) : 0));
        System.out.println("Faixa Etária 21 a 30" + (peso3 > 0 ? (peso3/faixaEtaria3) : 0));
        System.out.println("Faixa Etária 31+ " + (peso4 > 0 ? (peso4/faixaEtaria4) : 0));
    }
}


