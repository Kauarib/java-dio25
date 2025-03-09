package lanchonete.atendimento;

import lanchonete.atendimento.cozinha.Cozinheiro;

public class Atendente {
 public void anotarPedido(){
      System.out.println("Anotando o pedido...");
 }
  Cozinheiro cozinheiro = new Cozinheiro();
 private void pegarPedidoNaCozinha(){
      System.out.println("Pegando o pedido na cozinha...");
      cozinheiro.itemPronto();
      cozinheiro.bebidaPronta();
      cozinheiro.comboPronto();
 }
 public void entregarPedido(){
      pegarPedidoNaCozinha();
      pegarPedidoNoBalcao();
      System.out.println("Entregando o pedido...");
 }
 public void receberPagamento(){
      System.out.println("Recebendo o pagamento...");
 }
 private void pegarPedidoNoBalcao(){
      System.out.println("Pegando o pedido no balcão...");
      cozinheiro.adicionarComboNoBalcao();
      cozinheiro.adicionarItemNoBalcao();
      cozinheiro.adicionarBebidaNoBalcao();
 }

}

