package lanchonete.atendimento.cozinha;

public class Cozinheiro {
   Almoxarife almoxarife = new Almoxarife();
    public void adicionarItemNoBalcao(){
      System.out.println("Adicionando o item no balcão...");
    }
    public void adicionarBebidaNoBalcao(){
      System.out.println("Adicionando a bebida no balcão...");
    }
    public void adicionarComboNoBalcao(){
      adicionarBebidaNoBalcao();
      adicionarItemNoBalcao();
    }
   private void prepararItem(){
      System.out.println("Preparando o item...");
   }
   private void prepararBebida(){
      System.out.println("Preparando a bebida...");
   }
   private void prepararCombo(){
      prepararItem();
      prepararBebida();
   }
   public void pedidoPronto(){
      System.out.println("Pedido pronto para ser entregue...");
   }
   void pedirIngredienteAoAlmoxarife(){
      System.out.println("Pedindo o item ao almoxarife...");
      almoxarife.entregarIngredientes();
   }
   void pedirBebidaAoAlmoxarife(){
      System.out.println("Pedindo a bebida ao almoxarife...");
      almoxarife.entregarBebida();
   }
   void solicitarTrocaIngredientreAoAlmoxarife(){
      System.out.println("Solicitando a troca do item ao almoxarife...");
      almoxarife.trocarIngredientes();
   }
   void solicitarTrocaBebidaAoAlmoxarife(){
      System.out.println("Solicitando a troca da bebida ao almoxarife...");
      almoxarife.trocarBebida();
   }


}
