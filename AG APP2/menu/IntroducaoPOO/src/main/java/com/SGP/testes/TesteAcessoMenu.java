import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Aplicar desconto");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    Produto p = new Produto(nome, preco, quantidade, categoria);
                    lista.add(p);

                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto prod : lista) {
                            System.out.println("\n" + prod);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Informe o nome do produto: ");
                    String busca = sc.nextLine();

                    for (Produto prod : lista) {
                        if (prod.getNome().equalsIgnoreCase(busca)) {
                            System.out.print("Desconto (%): ");
                            double desc = sc.nextDouble();
                            prod.aplicarDesconto(desc);
                            System.out.println("Desconto aplicado!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}