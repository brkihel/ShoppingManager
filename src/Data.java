public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Atribuindo a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //Método para verificar se o ano inserido no atributo da classe é bissexto
    private boolean verificaAnoBissexto(){
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    //Método que valida a data inserida nos atributos da classe
    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(verificaAnoBissexto()){
            diasPorMes[1] = 29; //Caso o ano seja bissexto, fevereiro recebe 29(por ter 29 dias)
        }

        //verificando se o dia existe no mês especificado
        if (dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Data{" +
                "Dia: " + dia +
                ", Mês: " + mes +
                ", Ano: " + ano +
                '}';
    }
}
