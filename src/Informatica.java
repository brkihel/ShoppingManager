public class Informatica extends Loja{

    double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco enderecoLoja, Data dataFundacao, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, enderecoLoja, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Valor do seguro de eletrônicos: " + seguroEletronicos;
    }
}
