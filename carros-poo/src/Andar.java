public class Andar {
    
    public static void main(String[] args){
        Carro creta = new Carro();
        creta.setChassi("123456789");
        //creta.ligar();

        Moto gs310 = new Moto();
        gs310.setChassi("987654321");
        //gs310.ligar();

        Veiculo coringa = creta;
        coringa.ligar();
        coringa.desligar();

    }

}
