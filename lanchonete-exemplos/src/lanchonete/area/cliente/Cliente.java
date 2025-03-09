package lanchonete.area.cliente;

import lanchonete.atendimento.Atendente;

public class Cliente {
    private void escolherItem(){
        System.out.println("Escolhendo o item...");
    }
    public void fazerPedido(){
        escolherItem();
        System.out.println("Fazendo o pedido...");
    }
    public void pagarConta(){
        consultarSaldoAplicativos();
        System.out.println("Pagando a conta...");
    }
    private void consultarSaldoAplicativos(){
        System.out.println("Consultando saldo nos aplicativos...");
    }
    Atendente atendente = new Atendente();
    public void pegarPedido(){
        atendente.entregarPedido();
        System.out.println("Pegando o pedido...");
    }
}
