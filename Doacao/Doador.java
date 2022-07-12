package Doacao;

import java.util.Scanner;

public class Doador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Qual é a sua Idade");
        idade = sc.nextInt();

        if ((idade >= 18) && (idade <= 67))
            System.out.println("Você Pode Doar Sangue! ");

        else
            System.out.println("Você Não pode doar Sangue! ");
    }
}
