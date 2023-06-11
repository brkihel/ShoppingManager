public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco enderecoLoja, Data dataFundacao, Data dataAlvara){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, enderecoLoja, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Data de emissão do alvará: " + dataAlvara;
    }
}
