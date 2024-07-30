import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);

        Dev devHalan = new Dev();
        devHalan.setNome("Halan");
        devHalan.inscreverBootcamp(bootcamp);
        devHalan.progredir();
        System.out.println("Conteúdos inscritos: " + devHalan.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devHalan.getConteudosConcluidos());
        System.out.println("XP: " + devHalan.calcularXp());

        System.out.println("------------");

        System.out.println(cursoJava);
        System.out.println(cursoPython);
        System.out.println(mentoriaJava);
    }
}