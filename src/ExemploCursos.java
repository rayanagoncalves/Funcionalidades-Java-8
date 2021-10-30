import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Java", 30));
        cursos.add(new Curso("Python", 20));
        cursos.add(new Curso("JavaScript", 25));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

         int sum = cursos.stream()
                 .filter(c -> c.getAlunos() >= 25)
                 .mapToInt(Curso::getAlunos)
                 .sum();

        System.out.println(sum);

        Stream<String> nomes = cursos.stream().map(Curso::getNome);

        nomes.forEach(System.out::println);

    }
}
