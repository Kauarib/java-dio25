public class SistemaCadastro {
    public static void main(String[] args){
        Pessoa carlos = new Pessoa("Carlos", "123.321.456-65");

        carlos.setEndereço("Av atlantica, 100, copacabana, RJ");

        System.out.println( carlos.getNome() + " " + carlos.getCpf() + " mora em " + carlos.getEndereço());
    }
}
