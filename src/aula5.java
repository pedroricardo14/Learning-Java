public class aula5 {
    public static void main(String[] args) {
        // Aula 5 - Laços Numéricos
        // Na aula de hoje vamos aprender a fazer laços numéricos em Java.
        // Vamos imprimir a sequência a seguir em ordem crescente de cima pra baixo.
        // 1 2 3 4 5 6 7 8 9 10
        // Para uma variável que inicia em 1 e vai até 10, mudando 1-por-1, faça:
     //   for (int i = 1; i <= 10; i++) {
        // para cada item(inteiro) == 1 onde item for menor ou igual a 10, acrescente
        // 1 e imprima abaixo essa variável.
        // para ir de dois em dois é só substituir o i++ por i+=2
     //       System.out.println(i);



        // Aninhando laços for
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                // Primeiro o java vau rodar o laço for de dentro e depois o de fora.
                // Como as variáveis não podem se repetir, trocamos o nome de i para j
                // cada vez que o j fizer a contagem completa, multiplique o resultado com i
                // e imprima na tela
        //        System.out.println(j*i);
                // Esse sout é tipo isso:
                //  System.out.println(1 * i);
                //  System.out.println(2 * i);
                //  System.out.println(3 * i);
                //  System.out.println(4 * i);
                //  System.out.println(5 * i);
                //  System.out.println(6 * i);
                //  System.out.println(7 * i);
                //  System.out.println(8 * i);
                //  System.out.println(9 * i);
                //  System.out.println(10 * i);

                // melhorando essa taboada

                  System.out.println(j + "x" + i + " = " + j * i);
                  // 1x1=1
                  // 1x2=2
                  // 1x3=3
                  // [...]

        }
    }
    }
}
