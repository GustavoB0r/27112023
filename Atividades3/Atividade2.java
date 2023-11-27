
package Atividades3;

import java.util.*;

public class Atividade2 {
        public static void main(String[] args) {
            
        Scanner stringScanner = new Scanner(System.in);

                System.out.println("Digite o nome de usuario: ");
                
                boolean continua = true;
                
                while (continua) {
                    if (continua = true) {
                       String usuario = stringScanner.nextLine();
                           if (usuario.length() <= 0) {
                             continua = false;
                             System.out.println("Voce nao digitou um nome de usuario");
                        }
                    }
                }
        stringScanner.close();
  }
}
