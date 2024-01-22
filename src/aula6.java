import java.util.Arrays;

public class aula6 {
    public static void main(String[] args) {
        // Aula 06 - Vetores/Arrays

        // Uma array serve para facilitar ao escrever, por exemplo, variáveis
        // pois, se formos criar vários elementos seria tipo assim:

     //   int numero1 = 1;
     //   int numero2 = 2;
     //   int numero3 = 3;
     //   int numero4 = 4;

        // Detalhe sobre arrays no Java: Nós não podemos mistrurar
        // vários tipos de elementos dentro de uma array, por exemplo
        // colocar um inteiro e uma string dentro de uma array.
        // A array, uma vez declarada como inteiro, só pode receber
        // números inteiros.

        // Para conseguirmos criar uma array, faremos o seguinte:

        // Primeiro declaramos o tipo da array, colocamos colchetes para dizer
        // ao Java que estamos trabalhando com arrays, em seguida vamos dizer o
        // nome da array, vamos usar o elemento new, o tipo da array e dizer a
        // quantidade máxima de elementos que nosso array poderá ter.

     //   int[] numeros = new int[5];

        // Ao declarar a array no tamanho de 5, não podemos adicionar um sexto
        // elemento. O Java é imutável nessa questão de número de elementos dentro
        // de uma array. Podemos colocar 1 elemento, deixar vazio ou preencher até os 
        // 5 elementos, mas nunca podemos adicionar um sexto elemento.

        // Uma coisa que acontece no array quando declaramos é a criação dos
        // índices entro do array, que são dados pela formula 0 <= N-1. Ou seja,
        // Todo array em java, começa no índice 0, vai até N (Número definido como o
        // tamanho limite do array, no nosso caso, 5) menos 1. 
        // Nossos índices nesse array são, respectivamente: 
        // [0] [1] [2] [3] [4] 
        // Agora que sabemos nossos índices, precisamos declara ao Java qual elemento
        // será armazenado em qual índice. Veja abaixo:

     //   numeros[0] = 1;
      //  numeros[1] = 2;
      //  numeros[2] = 3;
      //  numeros[3] = 4;
      //  numeros[4] = 5;

        // Para conseguirmos acessar o array, vamos usar um laço de repetição
        // (Isso é possível pois sabemos qual é o tamanho máximo do array)
        // vamos usar um laço de repetição, vamos definir o int i = 0, pois 
        // a contagem começa em 0, vamos definir que a contagem deverá ser
        // do menor para o maior do array "numeros", vamos atribuir a 
        // propriedade lenght para fazer a contagem de elementos que temos
        // dentro do array e vamos definir a variável de incremento.

      //  for(int i = 0; i < numeros.length; i++) {
            // vamos printar o array mostrando cada item de um por um
     //       System.out.println(numeros[i]);
     //   }

        // Para ficar fixo que não há relação entre o índice e o valor, vamos mudar
        // o esquema que fizemos acima, vamos mudar tudo para string.

      //  String[] letras = new String[5];

      //  letras[0] = "A";
      //  letras[1] = "B";
      //  letras[2] = "C";
      //  letras[3] = "D";
      //  letras[4] = "E";

      //  for(int i = 0; i < letras.length; i++) {
      //      System.out.println(letras[i]);
      //  }

        // Como adicionar de antemão todos os valores no array:
        // Além de tudo não será preciso definir o tamanho máimo do array

     //   String[] letras = {"A", "B", "C", "J", "F", "X"};
    //    for(int i = 0; i < letras.length; i++) {
     //       System.out.println(letras[i]);
    //    }

        // Se eu já sei de antemão quais os valores que vou adicionar no array,
        // eu posso utilizar essa segunda notação que você vê acima.
        // O Java já vai entender o número de posições daquele array, o tipo do array,
        // e já atribui cada valor à cada posicção.
        

        // Outra dica: Não precisamos definir um laço para mostrar a array.
        // Podemos fazer assim:
    //    System.out.println(Arrays.toString(letras));










        // Como que eu posso descobrir qual é o maior elemento dentro do
        // meu array, qual é o menor e qual é a média.

            int[] numeros = {9, 10, 12, 25, 2};

            // Como descobrir o maior desses números:
            int maior = numeros[0];
            int menor = numeros[0];
            int media = 0;

            // Vamos utilizar um laço numérico
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
                media += numeros[i];
            }

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Media: " + media/numeros.length);


            // Essa foi a aula de hoje. Obrigado por acompanhar e até a próxima.


    }
}
