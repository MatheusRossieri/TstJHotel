//Nome: Matheus José Rossieri  RA: 2600986  

public class FuncDados {
    static Lider[] dadosLiders = new Lider[20];
    static Subor[] dadosSubor = new Subor[100];

    
    public static void adicionarSubordinado(Subor novoSubor) {
        for (int i = 0; i < dadosSubor.length; i++) {
            if (dadosSubor[i] == null) {
                dadosSubor[i] = novoSubor;
                System.out.println("Subordinado cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o subordinado. O banco de dados está cheio.");
    }
    
    public static void adicionarLider(Lider novoLider) {
        for (int i = 0; i < dadosLiders.length; i++) {
            if (dadosLiders[i] == null) {
                dadosLiders[i] = novoLider;
                System.out.println("Líder cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o líder. O banco de dados está cheio.");
    }

    public static void demitirColaborador(int cpf, String tipoColaborador) {
        if (tipoColaborador.equalsIgnoreCase("lider")) {
            for (int i = 0; i < dadosLiders.length; i++) {
                if (dadosLiders[i] != null && dadosLiders[i].getCpf() == cpf) {
                    dadosLiders[i] = null;
                    System.out.println("Líder demitido com sucesso!");
                    return;
                }
            }
        } else if (tipoColaborador.equalsIgnoreCase("subordinado")) {
            for (int i = 0; i < dadosSubor.length; i++) {
                if (dadosSubor[i] != null && dadosSubor[i].getCpf() == cpf) {
                    dadosSubor[i] = null;
                    System.out.println("Subordinado demitido com sucesso!");
                    return;
                }
            }
        } else {
            System.out.println("Tipo de colaborador inválido!");
        }
    }
    
    public static boolean cpfCadastrado(int cpf) {
        for (Subor subor : dadosSubor) {
            if (subor != null && subor.getCpf() == cpf) {
                return true;
            }
        }
        for (Lider lider : dadosLiders) {
            if (lider != null && lider.getCpf() == cpf) {
                return true;
            }
        }
        return false;
    }

    public static double buscarRemuneracaoDiaria(int cpf) {
        // Procura o valor da remuneração diária pelo CPF do colaborador nos subordinados
        for (Subor subor : dadosSubor) {
            if (subor != null && subor.getCpf() == cpf) {
                return subor.getValor_diaria();
            }
        }
        
        // Procura o valor da remuneração diária pelo CPF do colaborador nos líderes
        for (Lider lider : dadosLiders) {
            if (lider != null && lider.getCpf() == cpf) {
                return lider.getValor_diaria() + lider.getBonus_gerencial(); // Adiciona o bônus gerencial para líderes
            }
        }
        
        // Se não encontrar o colaborador, retorna -1 ou outro valor de indicativo de erro
        return -1;
    }
    

    public static double buscarBonusGerencial(int cpf) {
        for (Lider lider : dadosLiders) {
            if (lider != null && lider.getCpf() == cpf) {
                return lider.getBonus_gerencial();
            }
        }
        // Retorna -1 se o líder não for encontrado com o CPF fornecido
        return -1;
    }

}


