public class aula3 {
    public static void main(String[] args) {
        // Aula 3 - Estruturas condicionais
        // Exemplo de programa em Java para saber, de acordo com a nota de um aluno,
        // se ele passou ou não.

        int nota = 100;

        // A média para passar é 70, se a nota do aluno for igual ou maior
        // a 70, então ele está aprovado.
        // Operadores if - else

        if (nota >= 70){
           // System.out.println("Aluno aprovado!");
        } else{
           // System.out.println("Não aprovado.");
        }

        // Agora vamos utilizar uma situação mais avançada.
        // Em algumas instituições, é cobrada notas do tipo
        // A, B, C, D. No nosso exemplo:
        // A 80, B 70, C 60, D 0.
        // Em casos assim, temos mais de uma possibilidade no que
        // vai acontecer na situação, então somente um if else
        // é insuficiente. É por isso que agora vamos usar o else if.

        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
        } else if(nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if(nota < 80 && nota >= 60) {
            graduacao = "C";
        } else if(nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado.");
                break;
            default:
                System.out.println("Graduação Inválida.");
        }
    }
}
