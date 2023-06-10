import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu mainMenu = new Menu();

        mainMenu.mostrarMenu();
        int escolhaUsuario = sc.nextInt();
        clearBuffer(sc);

        switch (escolhaUsuario){
            case 1:
                System.out.println("====================================================");
                //Registrando o nome da loja pelo usuário
                System.out.println("Digite o nome da loja:");
                String nomeLoja = sc.nextLine();

                System.out.println("====================================================");
                //Registrando a quantidade de funcionários pelo usuário
                System.out.println("A loja terá mais de um funcionário? [1] - Sim / [2] - Não");
                int qFuncionarios = sc.nextInt();

                int quantidadeFuncionarios = 1;
                if(qFuncionarios == 1){
                    System.out.println("Digite a quantidade de funcionários na loja:");
                    quantidadeFuncionarios = sc.nextInt();
                } else if (qFuncionarios == 2) {
                    quantidadeFuncionarios = 1;
                } else {
                    System.out.println("OPÇÃO INVÁLIDA...");
                }

                System.out.println("====================================================");
                //Registrando o salário base dos funcionários pelo usuário
                System.out.println("Digite o salário base dos funcionários da loja:");
                double salarioBaseFuncionarios = sc.nextDouble();
                clearBuffer(sc);

                System.out.println("====================================================");
                //Registrando o endereço da loja pelo usuario
                System.out.println("Agora vamos registrar o endereço da sua loja.");
                System.out.println();
                System.out.println("...");
                System.out.println();
                System.out.println("Digite o nome da rua onde a sua loja fica:");
                String nomeRua = sc.nextLine();
                System.out.println("Digite o nome da cidade onde sua loja fica:");
                String nomeCidade = sc.nextLine();
                System.out.println("Digite o nome do estado onde sua loja fica:");
                String nomeEstado = sc.nextLine();
                System.out.println("Digite o nome do país onde sua loja fica:");
                String nomePais = sc.nextLine();
                System.out.println("Digite o CEP(xxxxx-xxx) da rua da sua loja:");
                String cepLoja = sc.nextLine();
                System.out.println("Digite o número do endereço da sua loja:");
                String numeroEndLoja = sc.nextLine();
                System.out.println("Digite o complemento do endereço da sua loja:");
                String complementoEndereço = sc.nextLine();
                Endereco enderecoLoja1 = new Endereco(nomeRua, nomeCidade, nomeEstado, nomePais, cepLoja, numeroEndLoja, complementoEndereço);

                System.out.println("====================================================");
                //Registrando a data de fundação da loja pelo usuario:
                System.out.println("Vamos registrar a data de fundação da sua loja:");
                System.out.println();
                System.out.println("...");
                System.out.println();
                System.out.println("Digite o dia da fundação da sua loja:");
                clearBuffer(sc);
                int diaFundacao = sc.nextInt();
                System.out.println("Digite o mês da fundação da sua loja:");
                int mesFundacao = sc.nextInt();
                System.out.println("Digite o ano da fundação da sua loja:");
                int anoFundacao = sc.nextInt();
                Data fundacaoLoja1 = new Data(diaFundacao, mesFundacao, anoFundacao);

                Loja loja1 = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionarios, enderecoLoja1, fundacaoLoja1);

        }

    }

    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
