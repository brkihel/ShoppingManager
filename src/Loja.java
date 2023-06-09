public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    public String toString() {
        return "Loja{" +
                "Nome da loja: " + nome + '\'' +
                ", Quantidade de funcionários: " + quantidadeFuncionarios +
                ", Salário base dos funcionários" + salarioBaseFuncionario +
                '}';
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
