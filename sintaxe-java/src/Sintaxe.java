public class Sintaxe {
    public static void main(String[] args) {
        // Varáveis
       /*   Tipos primitivos
            byte b = 1;
            short s = 2;
            int i = 3;
            long l = 4;
            float f = 5.0f;
            double d = 6.0;
            char c = 'a';
            boolean bool = true;

            // Tipos de referência
            String str = "Hello, World!";
            Integer integer = 7;
            Double doub = 8.0;
            Character ch = 'b';
            Boolean bo = false; 
            Podem ser alterados
        */

        /*Constantes 
            final double PI = 3.14159;
            final int ANO = 2021;
            final String NOME = "João";
            a constante deve ter o modificador final e o valor em caixa alta.
            NÃO PODE SER ALTERADO
        */
        /* Escopos
            variáveis locais: são declaradas dentro de um método e só podem ser acessadas dentro dele.
            variáveis de instância: são declaradas dentro de uma classe e podem ser acessadas por todos os métodos da classe.
            variáveis de classe: são declaradas com o modificador static e podem ser acessadas por todos os métodos da classe.

        */
        /* Operadores
            Aritméticos: +, -, *, /, %
            Relacionais: ==, !=, >, <, >=, <=
            Lógicos: &&, ||, !
            Bitwise: &, |, ^, ~, <<, >>
            Ternário: ?:
            de atribuição: =, +=, -=, *=, /=, %=
            de incremento e decremento: ++, --
            booleanos: false, true
            New: cria uma nova instância de uma classe
            instanceof: verifica se um objeto é uma instância de uma classe
            unarios são aqueles que operam em um único operando podem ser prefixados ou posfixados são eles: +, -, ++, --, !, ~
            binários são aqueles que operam em dois operandos são eles: +, -, *, /, %, <, >, <=, >=, ==, !=, &&, ||, &, |, ^, <<, >>, >>>
            incremento e decremento são operadores unários que incrementam ou decrementam o valor de uma variável em 1
            operadores de atribuição são operadores binários que atribuem um valor a uma variável
            operadores de comparação são operadores binários que comparam dois valores e retornam um valor booleano exemplo: ==, !=, <, >, <=, >=
            ternário é um operador que recebe três operandos e retorna um valor booleano exemplo: ?, :
            ex int a,b;
            a=10;
            b=11;
            string resultado = a == b ? "a é igual a b" : "a é diferente de b";
            System.out.println(resultado);
        */
        /*palavras reservadas
         * Modificadores de acesso:
         * private 
         * protected 
         * public 

         * Modificadores de classe, variáveis ou métodos:
         * abstract
         * final
         * static
         * strictfp

         * Controle de fluxo dentro de um bloco de código:
         * break
         * case
         * continue
         * default
         * do
         * else
         * for
         * if
         * return 
         * switch
         * while

         * Tratamento de exceções:
         * assert
         * catch
         * finally
         * throw
         * throws
         * try

         * Modificadores de variáveis:
         * const
         * transient
         * volatile

         * Modificadores de métodos:
         * native
         * synchronized

         * Outros:
         * boolean
         * byte
         * char
         * class
         * double
         * enum
         * extends
         * float
         * goto
         * implements
         * import
         * instanceof
         * int
         * interface
         * long
         * new
         * package
         * short
         * super
         * this
         * void
        */
        /*java doc
         * javadoc é uma ferramenta que gera documentação a partir de comentários no código fonte
         * para gerar a documentação é necessário utilizar o comando javadoc seguido do nome do arquivo
         * exemplo: javadoc Sintaxe.java
         * a documentação é gerada em um arquivo HTML
         * a documentação é gerada a partir de comentários que começam com /** e terminam com /
         * os comentários podem conter tags que são utilizadas para formatar a documentação
         * as tags são precedidas por @
         * as tags mais comuns são:
         * @param: descreve um parâmetro de um método
         * @return: descreve o valor de retorno de um método
         * @throws: descreve uma exceção lançada por um método
         * @see: cria um link para outra classe ou método
         * @since: descreve a versão em que o método foi introduzido
         * @version: descreve a versão do método
         * @author: descreve o autor do método
         * comentários javadoc são utilizados para documentar classes, métodos e variáveis
         * os comentários javadoc são colocados antes da declaração da classe, método ou variável
         * exemplo: 
         * /**
         * * Esta classe representa um carro. 
         * public class Carro {
         * 
         * /**
         * * Este método liga o carro.
         * * @param chave a chave do carro
         * * @return true se o carro foi ligado com sucesso, false caso contrário
         * public boolean ligar(String chave) {
         * if (chave.equals("1234")) {
         * return true;
         * 
         * } else {
         * 
         *  return false;
         * 

         */
        /*terminais e argumentos
         * terminal é um programa que permite interagir com o sistema operacional
         * para executar um programa java é necessário utilizar o terminal
         */

    }
}
