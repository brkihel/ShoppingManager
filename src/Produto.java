import java.time.LocalDate;

public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public String toString() {
        return "Produto{ " +
                "Nome do produto: " + nome +
                ", Preço do produto: " + preco +
                ", Data de validade: " + dataValidade +
                " }";
    }

    public boolean estaVencido(){
        LocalDate dataAtual = LocalDate.now();
        boolean produtoVenceu = dataValidade != null && dataValidade.toLocalDate().isBefore(dataAtual);
        if (produtoVenceu == true){
            System.out.println("O produto venceu.");
        } else {
            System.out.println("O produto ainda está na validade.");
        }
        return produtoVenceu;
    }
}
