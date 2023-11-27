package Atividades3;

import java.util.*;

public class Atividade5 {
    
    public static void main(String[] args) {

        Scanner velocidade = new Scanner(System.in);
        Scanner continua = new Scanner(System.in);
        Scanner vamos = new Scanner(System.in);
       
        boolean viagemContinua = true;
        double velocidadeAtual = 0;

        System.out.println("Vamos fazer uma viagem? Digite sim ou nao.");
        String Viagem = vamos.nextLine();

        if (Viagem.equalsIgnoreCase("sim")){
       System.out.println("A viagem começou.");

        do {
            while (viagemContinua) {
            System.out.println("A viagem ainda não terminou. Digite apenas o valor da velocidade atual do carro (em km/h): ");
            double novaVelocidade = velocidade.nextDouble();
           
            if (novaVelocidade > velocidadeAtual) {
                System.out.println("O carro esta acelerando.");

            } else if (novaVelocidade < velocidadeAtual) {
                System.out.println("O carro esta desacelerando.");

            } else {
                System.out.println("O carro esta mantendo a mesma velocidade.");
            }
           
            velocidadeAtual = novaVelocidade;
            
            System.out.println("O carro está a " + novaVelocidade + "km/h.");
           
            System.out.println("A viagem terminou? (Digite 'p' para terminar a viagem ou 's' para seguir para continuar.): ");
            String resposta = continua.nextLine();

            if (resposta.equalsIgnoreCase("p")) {
                System.out.println("O carro parou e chegou ao destino.");
                break;

            } else if (resposta.equalsIgnoreCase("s")) {
                System.out.println("O carro continua a viagem.");

            } else {
                System.out.println("Ocorreu um erro.");
            }
           
          }

        }
        while (viagemContinua = false); {
       
        System.out.println("Viagem terminada.");
        }
    }

    else if (Viagem.equalsIgnoreCase("nao")) {
        System.out.println("Tudo bem, fica para a proxima.");
    }

    else {
        System.out.println("Ocorreu um erro");
    }
    
        velocidade.close();
        continua.close();
        vamos.close();
    }
 }
