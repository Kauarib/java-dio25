public class Carro extends Veiculo {

    
    public void ligar(){

        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro ligado");

    }
    public void desligar(){

        System.out.println("Carro desligado");
        
    }
    private void conferirCombustivel(){

        System.out.println("Combustível OK");

    }
    private void conferirCambio(){
            
        System.out.println("Câmbio OK");

    }
}
