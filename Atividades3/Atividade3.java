package Atividades3;

public class Atividade3 {

    public static void main(String[] args) {

        String[] formula1 = {"Mercedes" , "Ferrari" , "Mclaren" , "Aston Martin" , "Red Bull"};
        int equipes = 0;

        while (equipes < formula1.length) {                   // length serve pra matriz pre definido no caso a formula1
            System.out.println(formula1[equipes]);
            equipes ++;
        }
    }
}
