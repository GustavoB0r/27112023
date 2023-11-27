package Atividades3;

public class Atividade1 {
    public static void main(String[] args) {
        
        int i = 0;
        int tempo = 2;

        while (i < tempo) { 
            try {
                Thread.sleep(6000);
                i++;
                System.out.println("Assistindo filme. ja se passaram " + i + " minutos.");
            } catch (InterruptedException e) {
                System.out.println("Ocorreu um erro" + e);
            }
        }
        System.out.println("Fim do filme.");
    }
}
