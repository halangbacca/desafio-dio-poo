import domain.Curso;
import domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("POO");
        cursoJava.setCargaHoraria(10);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Data Science");
        cursoPython.setCargaHoraria(20);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Java");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoPython);
        System.out.println(mentoriaJava);
    }
}