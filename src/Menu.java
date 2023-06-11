import java.util.Scanner;


public class Menu {
    Scanner sc = new Scanner(System.in);

    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
    public int mostrarMenu(){
        System.out.println("==========================================");
        System.out.println("=     S H O P P I N G MANAGER - MENU     =");
        System.out.println("==========================================");
        System.out.println("=     DIGITE ABAIXO A OPÇÃO DESEJADA     =");
        System.out.println("=////////////////////////////////////////=");
        System.out.println("=       [1] - PARA CRIAR UMA LOJA        =");
        System.out.println("=       [2] - PARA CRIAR UM PRODUTO      =");
        System.out.println("=       [3] - PARA SAIR DO PROGRAMA      =");
        System.out.println("==========================================");
        int escolhaUsuario = sc.nextInt();
        return escolhaUsuario;
    }

    public boolean opcoesMenu(int escolha){
        switch (escolha) {
            case 1:
                System.out.println("====================================================");
                //Registrando o nome da loja pelo usuário
                System.out.println("Digite o nome da loja:");
                clearBuffer(sc);
                String nomeLoja = sc.nextLine();

                System.out.println("====================================================");
                //Registrando a quantidade de funcionários pelo usuário
                System.out.println("A loja terá mais de um funcionário? [1] - Sim / [2] - Não");
                int qFuncionarios = sc.nextInt();

                int quantidadeFuncionarios = 0;
                if (qFuncionarios == 1) {
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
                String complementoEndereco = sc.nextLine();
                Endereco enderecoLoja1 = new Endereco(nomeRua, nomeCidade, nomeEstado, nomePais, cepLoja, numeroEndLoja, complementoEndereco);

                System.out.println("====================================================");
                //Registrando a data de fundação da loja pelo usuario:
                System.out.println("Vamos registrar a data de fundação da sua loja:");
                System.out.println();
                System.out.println("...");
                System.out.println();
                System.out.println("Digite o dia da fundação da sua loja:");
                int diaFundacao = sc.nextInt();
                System.out.println("Digite o mês da fundação da sua loja:");
                int mesFundacao = sc.nextInt();
                System.out.println("Digite o ano da fundação da sua loja:");
                int anoFundacao = sc.nextInt();
                Data fundacaoLoja1 = new Data(diaFundacao, mesFundacao, anoFundacao);

                Loja loja1 = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionarios, enderecoLoja1, fundacaoLoja1);
                System.out.println(loja1.toString());
                return false;

            case 2:
                clearBuffer(sc);
                System.out.println("====================================================");
                System.out.println("Digite o nome do produto a ser registrado:");
                String nomeProduto = sc.nextLine();

                System.out.println("Digite o preço do produto:");
                double precoProduto = sc.nextDouble();
                System.out.println("O seu produto tem validade: [1] - Sim / [2] - Não");
                int qValidade = sc.nextInt();
                int diaVal;
                int mesVal;
                int anoVal;
                if (qValidade == 1) {
                    System.out.println("Digite o dia da validade do seu produto(ex: 02):");
                    diaVal = sc.nextInt();
                    System.out.println("Digite o mês(número correspondente ex: 04) da validade do seu produto:");
                    mesVal = sc.nextInt();
                    System.out.println("Digite o ano da validade do seu produto(ex: 2001):");
                    anoVal = sc.nextInt();
                    Data dataValidade = new Data(diaVal, mesVal, anoVal);

                    Produto produto1 = new Produto(nomeProduto, precoProduto, dataValidade);
                    System.out.println(produto1.toString());
                } else if (qValidade == 2) {
                    Produto produto1 = new Produto(nomeProduto, precoProduto);
                    System.out.println(produto1.toString());
                } else {
                    System.out.println("OPÇÃO INVÁLIDA...");
                }
                return false;

            case 3:
                System.out.println("Programa finalizando...");
                return true;

            default:
                System.out.println("OPÇÃO INVÁLIDA... Reiniciando.");
                return false;
        }

    }

}