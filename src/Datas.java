import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasToquio = LocalDate.of(2021, Month.JUNE, 5);

        int anos = olimpiadasToquio.getYear() - hoje.getYear();

        Period periodo = Period.between(hoje, olimpiadasToquio);

        LocalDate proximasOlimpiadas = olimpiadasToquio.plusYears(4);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = proximasOlimpiadas.format(formatador);

        System.out.println(dataFormatada);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

        // Exercicios

        System.out.println("==== Exercicios =====");
        LocalDate date = LocalDate.of(2099, Month.JANUARY, 25);
        LocalDate today = LocalDate.now();

        Period periodoEntreDuasDatas = Period.between(date, today);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println( today.format(formatter));

    }
}
