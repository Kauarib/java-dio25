package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;

import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        
       
        //Ações do cozinheiro com o estabelecimento
        cozinheiro.adicionarItemNoBalcao();
        cozinheiro.adicionarBebidaNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.itemPronto();
        cozinheiro.bebidaPronta();
        cozinheiro.comboPronto();

        Atendente atendente = new Atendente();

       
        
        
        //Ações do atendente com o cliente
        atendente.anotarPedido();
        atendente.entregarPedido();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();

        //Ações do cliente com o estabelecimento e atendente
        cliente.fazerPedido();
        cliente.pegarPedido();
        cliente.pagarConta();

       
        



    }
    


}
