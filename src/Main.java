// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.



            // Variáveis do tipo texto


            String nome;
            // string nome = "Ricardo";
            nome = "Ricardo";
            // Se atribuir outros valores à variável nome, o valor que vai valer
            // será o mais recente.
            System.out.println("Olá, " + nome);






            // Variáveis do tipo número

            // byte: usado para números entre -128 e 127 (positivo)
            // short: usado para números entre -32.768 e 32.767 (positivo)
            // int: é o padrão. Usado para números entre -2³¹ e 2³¹-¹
            // long: é usado para números entre -2^63 e 2^63
            // float: usado em números com decimais
            // double: usado como dobro do float
            // boolean: usado como condição verdadeiro ou falso
            // chair: Para representar um único caractere (qualquer caractere)







        // Usando o tipo numérico:

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        // Vamos mudar o tipo para float para o Java entender que não é um
        // número inteiro.
        float divisao = (float) a / b;
        // Usamos acima o cast (float) para que o resultado não seja 1.0

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        System.out.println("Obrigado por acompanhar.");

    }
}