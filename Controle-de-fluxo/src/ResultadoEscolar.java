public class ResultadoEscolar {
    public static void main(String[] args) {
        String aluno = "Kauã";
        double nota = 5.5;
        if(nota >= 7){
            System.out.println("Parabéns " + aluno + "! Você foi Aprovado!");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Você está de Recuperação!");
        } else{
            System.out.println("Você foi Reprovado!");
        }
        
    }
}
