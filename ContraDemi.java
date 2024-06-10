import java.util.Scanner;

//Nome: Matheus José Rossieri  RA: 2600986

public class ContraDemi {

    private static Scanner scanner = new Scanner(System.in);
  
    public void menu() {
        int op;
        do {
            System.out.println("\n------ Contratação e Demissão ------");
            System.out.println("1) Cadastrar novo colaborador");
            System.out.println("2) Demitir colaborador");
            System.out.println("0) Voltar");
            System.out.print("Escolha uma opção: ");
          
            op = scanner.nextInt();
            switch(op) {
                case 1:
                    contratar();
                    break;

                case 2:
                    demitir();
                    break;

                case 0:
                    System.out.println("Voltando...");
                    return;

                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            } 
        } while(op != 0);
    }

    public void contratar() {
        System.out.println("\n------ Cadastrar novo colaborador ------");
        System.out.println("1) Líder");
        System.out.println("2) Subordinado");
        System.out.print("Escolha o tipo de colaborador a ser cadastrado (1/2): ");
        int tipoColaborador = scanner.nextInt();
        if (tipoColaborador == 1) {
            // Cadastrar líder
            Lider novoLider = new Lider();

            System.out.print("Nome: ");
            novoLider.setNome(scanner.next());
            System.out.print("Telefone: ");
            novoLider.setTel(scanner.next());
            System.out.print("Email: ");
            novoLider.setEmail(scanner.next());
            System.out.print("CPF: ");
            novoLider.setCpf(scanner.nextInt());
            System.out.print("Departamento: ");
            novoLider.setDepartamento(scanner.next());
            System.out.print("Cargo: ");
            novoLider.setCargo(scanner.next());
            System.out.print("Data de contratação: ");
            novoLider.setData_contratacao(scanner.next());
            System.out.print("Turno de trabalho: ");
            novoLider.setTurno_trabalho(scanner.next());
            System.out.print("Valor da remuneração diaria: R$");
            novoLider.setValor_diaria(scanner.nextDouble());
            System.out.print("Nivel Gerencial: ");
            novoLider.setNivel_gerencial(scanner.next());
            System.out.print("Bônus gerencial diario: R$");
            novoLider.setBonus_gerencial(scanner.nextDouble());
            

            if (FuncDados.cpfCadastrado(novoLider.getCpf())) {
                System.out.println("CPF já cadastrado. Não é possível cadastrar o mesmo CPF novamente.");
                return;
            }

            // Adicionar o novo líder ao banco de dados
            FuncDados.adicionarLider(novoLider);
        } else if (tipoColaborador == 2) {
            Subor novoSubordinado = new Subor();

            System.out.println("\n------ Cadastrar novo colaborador ------");
            System.out.print("Nome: ");
            novoSubordinado.setNome(scanner.next());
            System.out.print("Telefone: ");
            novoSubordinado.setTel(scanner.next());
            System.out.print("Email: ");
            novoSubordinado.setEmail(scanner.next());
            System.out.print("CPF: ");
            novoSubordinado.setCpf(scanner.nextInt());
            System.out.print("Departamento: ");
            novoSubordinado.setDepartamento(scanner.next());
            System.out.print("Cargo: ");
            novoSubordinado.setCargo(scanner.next());
            System.out.print("Data de contratação: ");
            novoSubordinado.setData_contratacao(scanner.next());
            System.out.print("Turno de trabalho: ");
            novoSubordinado.setTurno_trabalho(scanner.next());
            System.out.print("Valor da remuneração diaria: R$");
            novoSubordinado.setValor_diaria(scanner.nextDouble());

            if (FuncDados.cpfCadastrado(novoSubordinado.getCpf())) {
                System.out.println("CPF já cadastrado. Não é possível cadastrar o mesmo CPF novamente.");
                return;
            }

            else{
                FuncDados.adicionarSubordinado(novoSubordinado);
            }
           
        } 
        else {
            System.out.println("Opção inválida!");
        }
    }
        

    public void demitir() {
        System.out.println("\n------ Demitir colaborador ------");
    
        System.out.print("CPF do colaborador a ser demitido: ");
        int cpf = scanner.nextInt();
    
        // Verificar se o colaborador é um líder
        Lider liderDemitido = null;
        for (Lider lider : FuncDados.dadosLiders) {
            if (lider != null && lider.getCpf() == cpf) {
                liderDemitido = lider;
                break;
            }
        }
    
        // Verificar se o colaborador é um subordinado
        Subor colaboradorDemitido = null;
        for (Subor subor : FuncDados.dadosSubor) {
            if (subor != null && subor.getCpf() == cpf) {
                colaboradorDemitido = subor;
                break;
            }
        }
    
        if (colaboradorDemitido != null || liderDemitido != null) {
            if (colaboradorDemitido != null) {
                System.out.println("\nDados do colaborador a ser demitido:");
                System.out.println("Nome: " + colaboradorDemitido.getNome());
                System.out.println("Telefone: " + colaboradorDemitido.getTel());
                System.out.println("Email: " + colaboradorDemitido.getEmail());
                System.out.println("CPF: " + colaboradorDemitido.getCpf());
                System.out.println("Departamento: " + colaboradorDemitido.getDepartamento());
                System.out.println("Cargo: " + colaboradorDemitido.getCargo());
                System.out.println("Data de contratação: " + colaboradorDemitido.getData_contratacao());
                System.out.println("Turno de trabalho: " + colaboradorDemitido.getTurno_trabalho());
            } else {
                System.out.println("\nDados do líder a ser demitido:");
                System.out.println("Nome: " + liderDemitido.getNome());
                System.out.println("Telefone: " + liderDemitido.getTel());
                System.out.println("Email: " + liderDemitido.getEmail());
                System.out.println("CPF: " + liderDemitido.getCpf());
                System.out.println("Departamento: " + liderDemitido.getDepartamento());
                System.out.println("Cargo: " + liderDemitido.getCargo());
                System.out.println("Data de contratação: " + liderDemitido.getData_contratacao());
                System.out.println("Turno de trabalho: " + liderDemitido.getTurno_trabalho());
                System.out.println("Nível Gerencial: " + liderDemitido.getNivel_gerencial());
                System.out.println("Bônus gerencial: " + liderDemitido.getBonus_gerencial());
            }
    
            System.out.print("\nDeseja realmente demitir este colaborador? (S/N): ");
            String confirmacao = scanner.next();
            if (colaboradorDemitido != null || liderDemitido != null) {           
                if (confirmacao.equalsIgnoreCase("S")) {
                    if (colaboradorDemitido != null) {
                        FuncDados.demitirColaborador(cpf, "subordinado");
                        
                    } else {
                        FuncDados.demitirColaborador(cpf, "lider");
                        
                    }
                } else {
                    System.out.println("Operação de demissão cancelada.");
                }
            } else {
                System.out.println("Colaborador não encontrado com o CPF fornecido.");
            }
        }
    
    }
}