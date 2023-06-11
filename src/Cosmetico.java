public class Cosmetico extends Loja{

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco enderecoLoja, Data dataFundacao, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, enderecoLoja, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "/ Taxa de comercializção de cosméticos: " + taxaComercializacao;
    }
}
