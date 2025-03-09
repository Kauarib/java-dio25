package lanchonete.atendimento.cozinha;

public class Almoxarife {
   private void controlarEntrada(){
    System.out.println("Controlando a entrada dos itens...");
 }
   private void controlarSaida(){
    System.err.println("Controlando a saída dos itens...");
 }
   void entregarIngredientes(){
    System.out.println("Entregando o item solicitado...");
    controlarSaida();

 }
   void entregarBebida(){
    System.out.println("Entregando a bebida solicitada...");
      controlarSaida();
 }
  void trocarIngredientes(){
    System.out.println("Trocando o item solicitado...");
    controlarEntrada();
 }
  void trocarBebida(){
    System.out.println("Trocando a bebida solicitada...");
    controlarEntrada();
 }
}
