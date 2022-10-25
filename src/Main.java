import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nomeCliente;
    String numConta;
    int resposta;
    float vlrSaldo;

    // na linha abaixo estamos instânciando o objeto minhaConta do tipo Conta
    System.out.println(" ******* Programa do Banco do Brasil ******* ");
    System.out.print("Informe o seu nome: ");
    nomeCliente = sc.nextLine();
    System.out.print("Informe o número da sua conta: ");
    numConta = sc.nextLine();
    System.out.print("Informe o seu saldo: ");
    vlrSaldo = sc.nextFloat();

    System.out.println("**** Escolha o Tipo da Conta ****");
    System.out.println(" 1) Corrente");
    System.out.println(" 2) Poupança");
    System.out.println(" 3) Salario");
    System.out.println(" 4) Sair");
    System.out.println("Digite a opção desejada: ");
    resposta = sc.nextInt();

    Conta minhaConta = null;
    switch (resposta) {
      case 1:
        minhaConta = new Conta();
        break;
      case 2: 
        minhaConta = new Poupanca();
      case 3: 
        minhaConta = new Salario();
        break;
      default:
        System.out.println("Opção não é válida!");
        break;
    }
    // na linha abaixo estamos abrindo a conta do cliente
      minhaConta.AbrirConta(nomeCliente, numConta, vlrSaldo);   

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
          if (minhaConta.Depositar(vlrDep)) 
            System.out.println("O depósito " + vlrDep + " ocorreu com sucesso");
          else 
            System.out.println("Erro ao fazer o deposito");
          
          break;

        case 3:
          System.out.print("Insira o valor do saque: ");
          float vlrSaq = sc.nextFloat();

          if (minhaConta.Depositar(vlrSaq)) 
            System.out.println("O saque de " + vlrSaq + " ocorreu com sucesso");
          else 
            System.out.println("Erro ao fazer o saque");
          
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
