import java.util.*;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        Arrays.asList(palavras.add("alura oline"));
        Arrays.asList(palavras.add("editora casa do código"));
        Arrays.asList(palavras.add("caelum"));

        Comparator<String> comparadorPorTamanho = new ComparadorPorTamanho();

       // Collections.sort(palavras, comparadorPorTamanho);
        palavras.sort(comparadorPorTamanho); // default methods -> java 8
        System.out.println(palavras);

//        for(String p : palavras) {
//            System.out.println(p);
//        }

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}
