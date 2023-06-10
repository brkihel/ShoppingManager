public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
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
                ", Data de validade: " +
                " }";
    }

    public boolean estaVencido(Data dataAtual){
        return dataAtual != null & getDataValidade().compararDatas(dataAtual) < 0;
    }
}
