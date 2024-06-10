//Nome: Matheus José Rossieri  RA: 2600986

import java.util.Scanner;

public class GerenHot {

    static GchFunc f = new GchFunc();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int op;

        do{
        System.out.println("\n------ Grenciamento Hoteleiro ------");
        System.out.println("1) Gerenciar Hóspede. - Indisponível");
        System.out.println("2) Gerenciar Colaboradores.");
        System.out.println("3) Gerenciar Terceiros. - Indisponível");
        System.out.println("0) Sair.");
        System.out.print("Escolha uma opção: ");

            op = scanner.nextInt();
            switch (op) {
                case 1:

                    break;
                
                case 2:        
                    f.menu();
                    break;

                case 3:
                   
                    break;

                case 0:
                    System.out.println("\nSaindo...\n");
                    break;
            
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (op != 0);
    }
}
