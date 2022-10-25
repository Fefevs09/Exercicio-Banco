public class Salario extends Poupanca {
  private int limiteDepositosMes = 1;
  private int totalDepositosRealizados = 0;

  protected boolean aindaPodeDepositar() {
    return (totalDepositosRealizados <= limiteDepositosMes);
  }

  public boolean Depositar(float Quanto) {
   if (aindaPodeDepositar()) {
    super.Depositar(Quanto);
    totalDepositosRealizados++;
    return true;
   } else {
      System.out.println(" Limite de depositos por mês excedido!");
      return false;
   }
  }
}
