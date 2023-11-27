import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class aula4 {
    public static void main(String[] args) {
        // Aula 04 - Manipulação de strings e datas.
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Pedro";
        System.out.println(nome.toUpperCase()); // P letra maiúscula
        System.out.println(nome.toLowerCase()); // P letra minúscula
        System.out.println(nome.length()); // Contagem de caracteres

        String nomeOutro = "Ricardo";
        System.out.println(nome.equals(nomeOutro));
        // Verifica a diferença entre strings.
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); // Ignora as diferenças
        // entre strings.

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        //  Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite!";
        }
        else {
            saudacao = "Olá.";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
