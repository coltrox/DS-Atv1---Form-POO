import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;
        
        while (true) {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Editar Pessoa");
            System.out.println("3 - Apresentar Pessoa");
            System.out.println("4 - Excluir Pessoa");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();
                    pessoa = new Pessoa(nome, idade, email);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                case 2:
                    if (pessoa == null) {
                        System.out.println("Nenhuma pessoa cadastrada!");
                    } else {
                        System.out.print("Novo nome: ");
                        pessoa.setNome(scanner.nextLine());
                        System.out.print("Nova idade: ");
                        pessoa.setIdade(scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Novo e-mail: ");
                        pessoa.setEmail(scanner.nextLine());
                        System.out.println("Dados editados com sucesso!");
                    }
                    break;
                case 3:
                    if (pessoa == null) {
                        System.out.println("Nenhuma pessoa cadastrada!");
                    } else {
                        pessoa.apresentar();
                    }
                    break;
                case 4:
                    if (pessoa == null) {
                        System.out.println("Nenhuma pessoa cadastrada!");
                    } else {
                        pessoa = null;
                        System.out.println("Cadastro excluído com sucesso!");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
