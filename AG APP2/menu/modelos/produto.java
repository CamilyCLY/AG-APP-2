public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    // Construtor padrão
    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
        this.quantidade = 0;
        this.categoria = "Geral";
    }

    // Construtor parametrizado
    public Produto(String nome, double preco, int quantidade, String categoria) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
        setCategoria(categoria);
    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        } else {
            System.out.println("Categoria inválida!");
        }
    }

    // Método específico 1
    public double calcularValorTotal() {
        return preco * quantidade;
    }

    // Método específico 2
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
        } else {
            System.out.println("Desconto inválido!");
        }
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Produto: " + nome +
               "\nPreço: R$ " + preco +
               "\nQuantidade: " + quantidade +
               "\nCategoria: " + categoria +
               "\nValor Total: R$ " + calcularValorTotal();
    }
}