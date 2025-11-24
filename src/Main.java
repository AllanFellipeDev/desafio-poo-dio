import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAllan = new Dev();
        devAllan.setNome("Allan");
        devAllan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Allan:" + devAllan.getConteudosInscritos());

        devAllan.progredir();
        devAllan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Allan:" + devAllan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Allan:" + devAllan.getConteudosConcluidos());
        System.out.println("XP:" + devAllan.calcularXp());

        System.out.println("----------");

        Dev devBreno = new Dev();
        devBreno.setNome("Breno");
        devBreno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Breno:" + devBreno.getConteudosInscritos());

        devBreno.progredir();
        devBreno.progredir();
        devBreno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Breno:" + devBreno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Breno:" + devBreno.getConteudosConcluidos());
        System.out.println("XP:" + devBreno.calcularXp());
    }
}
