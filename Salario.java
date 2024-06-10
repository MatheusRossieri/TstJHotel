//Nome: Matheus José Rossieri  RA: 2600986

import java.util.Scanner;

public class Salario {

    private Scanner scanner = new Scanner(System.in);

    public void menu(){
        int op;
        do{
            System.out.println("\n------ Calcular Salário ------");
            System.out.println("1) Calcular salário do Líder");
            System.out.println("2) Calcular salário do Subordinado");
            System.out.println("0) Voltar");
            System.out.print("Escolha uma opção: ");
          
            op = scanner.nextInt();
            switch(op){
              case 1:
                calSal_Lider();
                break;

              case 2:
                calSal_Subor();
                break;

              case 0:
                System.out.println("\nVoltando...");
                break;

              default:
                System.out.println("Opção inválida!");
            }
        } while(op != 0);
    }

    public void calSal_Lider(){
        System.out.print("Digite o CPF do Líder: ");
        int cpf = scanner.nextInt();
    
        // Busca a remuneração diária e o bônus gerencial do líder
        double remuneracaoDiaria = FuncDados.buscarRemuneracaoDiaria(cpf);
        double bonusGerencial = FuncDados.buscarBonusGerencial(cpf);
    
        if (remuneracaoDiaria != -1 && bonusGerencial != -1) {
            // Se encontrou a remuneração diária e o bônus gerencial
            System.out.print("Quantidade de dias trabalhados: ");
            int diasTrabalhados = scanner.nextInt();
    
            // Calcula o salário total, somando o bônus gerencial ao produto da remuneração diária pelo número de dias trabalhados
            double salarioTotal = (remuneracaoDiaria * diasTrabalhados);
            System.out.println("Salário do(a) Líder: R$" + salarioTotal);
        } else {
            // Se não encontrou a remuneração diária e/ou o bônus gerencial
            System.out.println("Líder não encontrado com o CPF fornecido.");
        }
    }
    


    public void calSal_Subor(){
      System.out.print("Digite o CPF do Subordinado: ");
      int cpf = scanner.nextInt();

      double remuneracaoDiaria = FuncDados.buscarRemuneracaoDiaria(cpf);

      if (remuneracaoDiaria != -1) {
          System.out.print("Quantidade de dias trabalhados: ");
          int diasTrabalhados = scanner.nextInt();

          double salarioTotal = remuneracaoDiaria * diasTrabalhados;
          System.out.println("Salário do Subordinado: R$" + salarioTotal);
      } else {
        System.out.println("Subordinado não encontrado com o CPF fornecido.");
    }
    }
}

