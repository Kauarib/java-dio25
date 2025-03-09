public class Moto extends Veiculo {

    public void ligar(){
        conferirCombustivel();
        System.out.println("Moto ligada");
    }
    private void conferirCombustivel(){
        System.out.println("Combustível OK");
    }
    public void desligar(){
        System.out.println("Moto desligada");
    }
}
