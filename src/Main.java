import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        System.out.println(bootcamp.toString());

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila);
        devCamila.progredir();
        System.out.println(devCamila);

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(devJoao);
        devJoao.progredir();
        System.out.println(devJoao);



    }
}