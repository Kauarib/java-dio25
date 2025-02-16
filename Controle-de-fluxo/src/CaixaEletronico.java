public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 50.43;
        double valorSolicitado = 40.00;
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com Sucesso!");
            System.out.println( "Seu saldo atualizado é de: R$" + saldo);

        }else{
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
