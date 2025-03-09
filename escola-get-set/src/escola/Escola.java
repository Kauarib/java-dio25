package escola;

public class Escola {
    public static void main(String [] args){
        Aluno kaua = new Aluno();
        kaua.setNome("Kauã");
        kaua.setIdade(15);

        System.err.println("o aluno " + kaua.getNome() + " tem " + kaua.getIdade() + "anos.");
    }

    
}
