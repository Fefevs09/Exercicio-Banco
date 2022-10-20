import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nomeCliente;
    String numConta;
    float vlrSaldo;

    // na linha abaixo estamos instânciando o objeto minhaConta do tipo Conta
    Conta minhaConta = new Conta();
    System.out.println(" ******* Programa do Banco do Brasil ******* ");
    System.out.print("Informe o seu nome: ");
    nomeCliente = sc.nextLine();
    System.out.print("Informe o número da sua conta: ");
    numConta = sc.nextLine();
    System.out.print("Informe o seu saldo: ");
    vlrSaldo = sc.nextFloat();

    // na linha abaixo estamos abrindo a conta do cliente
    if (minhaConta.AbrirConta(nomeCliente, numConta, vlrSaldo)) {
      System.out.println("Parabéns! Conta aberta com sucesso!");
    } else {
      System.out.println("Conta não foi aberta!");
    }
    int opcao;
    do {
      // Na lihha abaixo estamos chamando o metodo ExibirMenu do objeto minhaConta da
      // classe Conta
      opcao = minhaConta.ExibirMenu();
      switch (opcao) {
        case 1:
          minhaConta.ConsultarSaldo();
          break;

        case 2:
          System.out.print("Insira o valor do deposito: ");
          float vlrDep = sc.nextFloat();
          if (vlrDep <= 0) {
            System.out.println("\nValor inválido");
          } else if (minhaConta.Depositar(vlrDep)) {
            System.out.println("O depósito ocorreu com sucesso");
          } else {
            System.out.println("Erro ao fazer o deposito");
          }
          break;

        case 3:
          System.out.print("Insira o valor do saque: ");
          float vlrSaq = sc.nextFloat();
          if (vlrSaq <= 0) {
            System.out.println("\nValor inválido");
          } else if (minhaConta.Depositar(vlrSaq)) {
            System.out.println("O saque ocorreu com sucesso");
          } else {
            System.out.println("Erro ao fazer o saque");
          }
          break;

        case 4:
          System.out.println("Saindo do programa...");
          break;

        default:
          System.out.println("Opção inválida, por favor selecionar uma das opções");
          break;
      }

    } while (opcao != 4);
    sc.close();

  }
}
