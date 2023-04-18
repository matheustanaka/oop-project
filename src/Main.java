import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("aprendendo orientacão obejto");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("aprendendo programacao funcional");
        curso2.setCargaHoraria(10);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("mentoria de java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMatheus = new Dev();

        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Matheus - Conteúdo inscritos: " + devMatheus.getConteudosInscritos());

        devMatheus.progredir(); // progredir = concluir o conteudo
        // Analisando como ficou os conteúdos inscritos depois de serem progredidos
        System.out.println("Matheus - Conteúdo inscritos: " + devMatheus.getConteudosInscritos());
        System.out.println("Matheus - Conteúdo concluidos: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());

        Dev devJoao = new Dev();

        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("João - Conteúdo inscritos: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        // Analisando como ficou os conteúdos inscritos depois de serem progredidos
        System.out.println("João - Conteúdo inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("João- Conteúdo concluidos: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());



    }
}