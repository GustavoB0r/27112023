package Atividades3;

import java.util.*;

public class Atividade4 {
        public static void main(String[] args) {

        Scanner inputText = new Scanner(System.in);

        List<String> listaProdutos = new ArrayList<>();
        List<Integer> valorProdutos = new ArrayList<>();

        while (true) {

            System.out.println("Escreva o seu produto (ou 'sair' para encerrar): ");
            String produto = inputText.nextLine();
            
            if (produto.equals("sair")) {
                break; 
            }
            
            listaProdutos.add(produto);

            System.out.println("Escreva o valor do produto '" + produto + "': ");
            int valor = inputText.nextInt();
            inputText.nextLine(); 
            valorProdutos.add(valor);
        }

        int somaValores = 0;

        System.out.println("Produtos e seus valores:");
        for (int i = 0; i < listaProdutos.size(); i++) {                                          // size serve pra matriz ou list, usa pra arraylist
            System.out.println(listaProdutos.get(i) + " - R$" + valorProdutos.get(i));
            
            somaValores += valorProdutos.get(i);
        }

        System.out.println("Total dos valores: R$" + somaValores);

        inputText.close();
    }
}
