public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        String aluno = "Kauã";
        double nota = 0;
        /* Metodo de controle de fuxo
        if(nota >= 7){
            System.out.println("Parabéns " + aluno + "! Você foi Aprovado!");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Você está de Recuperação!");
        } else{
            System.out.println("Você foi Reprovado!");
        }*/
        //Metodo ternário
        String resultado = (  nota >= 7 ? "Aprovado"  : nota <=5 && nota < 7 ? "Recuperação" : "Reprovado");
        System.out.println(aluno + ", você foi " + resultado);
        //Switch case
        /*switch (resultado) {
            case "Aprovado":{
                System.out.println("Parabéns, " + aluno + "! Você foi " + resultado + "!");
                break;
            }
            case "Recuperação":{
                System.out.println(aluno + ", você foi para " + resultado + "!"); 
                break;
            }
            case "Reprovado":{
                System.out.println( aluno + ", você foi " + resultado + "!");
                break;
            }    
            default:{
                break;
            }    
        }*/
       
    }
}
