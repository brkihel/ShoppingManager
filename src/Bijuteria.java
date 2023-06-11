public class Bijuteria extends Loja{

    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco enderecoLoja, Data dataFundacao, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, enderecoLoja, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Meta de vendas de bijuterias: " + metaVendas;
    }
}
