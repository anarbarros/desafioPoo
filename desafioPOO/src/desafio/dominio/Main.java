package desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Ruby");
		curso1.setDescricao("descricao do curso");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Rails");
		curso2.setDescricao("descricao do curso");
		curso2.setCargaHoraria(8);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria ruby");
		mentoria.setDescricao("mentoria do curso ruby");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Developer");
		bootcamp.setDescricao("Descricao");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Mateos");
		dev.inscreverBootcamp(bootcamp);
		System.out.println(dev.getConteudoInscrito());
		dev.progredir();
		System.out.println(dev.getConteudoConcluidos());
		System.out.println("XP " + dev.calcularTotalXP());
		
		System.out.println("------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Virgilio");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Vigilio esta inscrito em: " + dev.getConteudoInscrito());
		
		
	}

}
