import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java", "descricao curso java", 8);
        Curso cursoJs = new Curso("Curso JS", "descricao curso js", 4);

        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "descricao mentoria java", LocalDate.now());

        System.out.println(cursoJava.toString());
        System.out.println(cursoJs.toString());
        System.out.println(mentoriaJava.toString());

    }
}