import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("descricao curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JS");
        cursoJs.setDescricao("descricao curso js");
        cursoJs.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("descricao mentoria java");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(cursoJava.toString());
        System.out.println(cursoJs.toString());
        System.out.println(mentoriaJava.toString());

    }
}