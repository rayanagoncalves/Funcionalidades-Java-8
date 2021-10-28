import java.util.*;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        Arrays.asList(palavras.add("alura oline"));
        Arrays.asList(palavras.add("editora casa do código"));
        Arrays.asList(palavras.add("caelum"));

        Comparator<String> comparadorPorTamanho = new ComparadorPorTamanho();

        palavras.sort((s1, s2) -> {
                if (s1.length() < s2.length())
                    return -1;
                if (s1.length() > s2.length())
                    return 1;
                return 0;
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(palavras);

        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);

        palavras.forEach(s -> System.out.println(s));

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        }).start();

        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}
