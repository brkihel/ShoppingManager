public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, int quantidadeProdutosEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutosEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios,Endereco enderecoLoja, Data dataFundacao, int quantidadeProdutosEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutosEstoque];
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

    public Endereco getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(Endereco endereco) {
        this.enderecoLoja = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public String toString() {
        return "Loja{ " +
                "Nome da loja: " + nome +
                "Quantos espaços em estoque há para produtos serem guardados: " + estoqueProdutos +
                ", Quantidade de funcionários: " + quantidadeFuncionarios +
                ", Salário base dos funcionários: " + salarioBaseFuncionario +
                "R$ / "+
                "Endereço: " + enderecoLoja +
                " / Data de fundação da loja: " + dataFundacao +
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

    public void imprimeProdutos(){
        System.out.println("Produtos em estoque na loja: ");

        if(estoqueProdutos != null){
            for(Produto produto : estoqueProdutos){
                if(produto != null){
                    System.out.println("|---------------------------------------------|");
                    System.out.println("| Nome: " + produto.getNome());
                    System.out.println("| Preço: " + produto.getPreco());
                    System.out.println("| Data de Validade: " + produto.getDataValidade());
                    System.out.println("|---------------------------------------------|");
                }
            }
        }else {
            System.out.println("A loja não possui produtos em estoque.");
        }
    }

    public boolean insereProduto(Produto produto){
        if(estoqueProdutos != null){
            for(int i = 0; i < estoqueProdutos.length; i++){
                if (estoqueProdutos[i] == null){
                    estoqueProdutos[i] = produto;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        if (estoqueProdutos != null){
            for (int i = 0; i < estoqueProdutos.length; i++){
                if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
                    estoqueProdutos[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
