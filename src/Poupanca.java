public class Poupanca extends Conta {
  private
    float vlrLimeteDia = 300;
    float vlrTotalSaqueDia = 0;

  protected boolean aindaPodeSacar(float vlrSaque) {
    return (vlrSaque + vlrTotalSaqueDia <= vlrLimeteDia);
  }

  public boolean Sacar(float Quanto) {
   if (aindaPodeSacar(Quanto) ) {
    super.Sacar(Quanto);
    vlrTotalSaqueDia += Quanto;
    return true;
   } else {
      System.out.println(" Limite de saque por dia excedido!");
      return false;
   }
  }
}
