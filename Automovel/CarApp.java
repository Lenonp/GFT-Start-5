package Automovel;

import java.util.Scanner;

public class CarApp extends Automovel{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Digite E para esportivo ou C para caminhão");
        String valor = Sc.nextLine().toUpperCase();

        if(valor.contains("E")) {
            Esportivo e = new Esportivo();
            System.out.println(e.getCombustivel());
        } 
        else if (valor.contains("C")) {
            Caminhao c = new Caminhao();
            System.out.println(c.getCombustivel());
        } 
        else  {
            System.out.println("Valor desconhecido");
        }

    }
} 

