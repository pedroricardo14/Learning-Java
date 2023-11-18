public class aula2 {
    public static void main(String[] args) {
        // Aula sobre booleanos: True or False
        //boolean resultado = false;
        //System.out.println(resultado);

        // Algoritmo para ir à praia
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false e true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = false
        // false || true = false
        // false || false = false


        // Operador ternário

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);



    }


}
