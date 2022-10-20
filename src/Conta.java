import java.util.Scanner;

public class Conta {
  private float Valor;
  protected String Nome;
  protected String Conta;

  public int ExibirMenu() {
    System.out.printf("\n\n\n");
    System.out.println(" ****** Conta Corrente *********");
    System.out.println(" 1) Consultar Saldo");
    System.out.println(" 2) Depositar");
    System.out.println(" 3) Sacar");
    System.out.println(" 4) Sair");
    System.out.print("Digite a opção desejada: ");
    // na linha abaixo o comando print nao tem o "ln" para manter o cursor na mesma
    // linha
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  }

  public void ConsultarSaldo() {
    System.out.printf("\n\n\n");
    System.out.println("****** Saldo da Conta ************");
    System.out.println("Nome correntista: " + Nome);
    System.out.println("Numero da Conta: " + Conta);
    System.out.println("Valor do Saldo: " + Valor);
  }

  public boolean Depositar(float Quanto) {
    System.out.printf("\n\n\n");
    if (Quanto <= 0) {
      return (false);
    } else {
      Valor += Quanto;
      return (true);
    }
  }

  public boolean Sacar(float Quanto) {
    if (Quanto <= 0) {
      return false;
    } else if (Quanto > Valor) {
      System.out.println("Saldo insuficiente");
      return false;
    } else {
      Valor -= Quanto;
      return true;
    }
  }

  public boolean AbrirConta(String Cliente, String numConta, float Quanto) {
    if (Quanto < 0) {
      System.out.println("Valor não pode ser negativo!");
      return false;
    } else {
      Nome = Cliente;
      Valor = Quanto;
      Conta = numConta;
      return true;
    }
  }
}
