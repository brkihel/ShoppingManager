public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        //this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        //this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    /*
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    */
    public Data getData() {
        return dataFundacao;
    }

    public String toString() {
        return "Loja{ " +
                "Nome da loja: " + nome +
                ", Quantidade de funcionários: " + quantidadeFuncionarios +
                ", Salário base dos funcionários: " + salarioBaseFuncionario +
                "R$"+
                " }";
    }

    public double gastosComSalario(){
        if(getSalarioBaseFuncionario() == -1){
            return -1;
        } else{
            return getQuantidadeFuncionarios() * getSalarioBaseFuncionario();
        }
    }

    public char tamanhoDaLoja(){
        if(getQuantidadeFuncionarios() < 10){
            return 'P';
        } else if (getQuantidadeFuncionarios() <= 30) {
            return 'M';
        } else{
            return 'G';
        }
    }
}
