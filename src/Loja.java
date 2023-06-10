public class Loja {
    private String nome = "Loja Padrão";
    private int quantidadeFuncionarios = 10;
    private double salarioBaseFuncionario = 1000.0;
    private Endereco enderecoLoja = new Endereco("Rua Principal", "Porto Alegre", "Rio Grande do Sul", "Brasil", "91000-000", "2000", "Prédio Comercial Loja 1");
    private Data dataFundacao = new Data(1,1,2000);;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios,Endereco enderecoLoja, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.enderecoLoja = enderecoLoja;
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

    public Endereco getEndereco() {
        return enderecoLoja;
    }

    public void setEndereco(Endereco endereco) {
        this.enderecoLoja = endereco;
    }

    public Data getData() {
        return dataFundacao;
    }

    public String toString() {
        return "Loja{ " +
                "Nome da loja: " + nome +
                ", Quantidade de funcionários: " + quantidadeFuncionarios +
                ", Salário base dos funcionários: " + salarioBaseFuncionario +
                "R$ / "+
                "Endereço: " + enderecoLoja +
                "Data de fundação da loja: " + dataFundacao +
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
