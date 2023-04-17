import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("mentoria de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();
    }
}