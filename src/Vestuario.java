public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco enderecoLoja, Data dataFundacao, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, enderecoLoja, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "A loja vende produtos importados: " + produtosImportados;
    }
}
