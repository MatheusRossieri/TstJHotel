//Nome: Matheus José Rossieri  RA: 2600986

import java.util.Scanner;

public class GchFunc {
    
    static Scanner scanner = new Scanner(System.in);
    static Salario s = new Salario();
    static ContraDemi cd = new ContraDemi();
  
    public void menu(){

        int op;

        do{
            System.out.println("\n -----------Gerenciar Coloboradores----------");
            System.out.println("1) Calcular salario.");
            System.out.println("2) Gerenciar tarefas. - Indisponível");
            System.out.println("3) Avaliar Desempenho. - Indisponível");
            System.out.println("4) Cadastrar/demitir coloborador.");
            System.out.println("0) Voltar.");
            System.out.print("Escolha uma opção: ");

            op = scanner.nextInt();
            switch (op) {
                case 1:
                    s.menu();
                    break;

                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                
                case 4:
                    cd.menu();
                    break;
                
                case 0:
                    System.out.println("\nVoltando...\n");
                    break;

                default:
                    System.out.println("\n Opção Inválida!\n");
                    break;
            }       
        } while (op != 0);
            
    }
}


