package app;

import java.util.Scanner;

import com.sgp.modelos.gatos;
import com.sgp.util.Validacoes;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gato gato = new gato("Mingau", 2);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(gato.toString());
                    break;
                case 2:
                    alterarNome(gato, scanner);
                    break;
                case 3:
                    alterarIdade(gato, scanner);
                    break;
                case 4:
                    gato.saudacao();
                    break;
                case 0:
                    System.out.println("Programa finalizado! Até mais🐾");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu do Gato ===");
        System.out.println("1. Mostrar dados do gato");
        System.out.println("2. Alterar nome do gato");
        System.out.println("3. Alterar idade do gato");
        System.out.println("4. Mostrar saudação do gato");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Gato gato, Scanner scanner) {
        System.out.print("Digite o novo nome do gato: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            pessoa.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarIdade(Gato gato, Scanner scanner) {
        System.out.print("Digite a nova idade do gato: ");
        try {
            int novaIdade = Integer.parseInt(scanner.nextLine());
            if (Validacoes.idadeValida(novaIdade)) {
                gato.setIdade(novaIdade);
                System.out.println("Idade alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroIdade(novaIdade));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
        }
    }
    
}
