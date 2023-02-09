package src;

import java.time.LocalDate;
import src.br.com.projeto.dominio.Bootcamp;
import src.br.com.projeto.dominio.Conteudo;
import src.br.com.projeto.dominio.Curso;
import src.br.com.projeto.dominio.Dev;
import src.br.com.projeto.dominio.Mentoria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author WINDOWS
 */
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria e java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        
//        System.out.println(curso1.toString());
//        System.out.println(curso2.toString());
//        System.out.println(mentoria1.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrção Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev dev = new Dev();
        dev.setNome("Mateus");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Mateus: "+dev.getConteudosInscritos());
        
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Mateus: "+dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos Mateus: "+dev.getConteudoConcluidos());
        System.out.println("XP: "+dev.calcularTotalXp());
        
        System.out.println("\n--------------XXXXXXXX---------------\n");
        
        Dev dev2 = new Dev();
        dev2.setNome("Fulano");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Fulano: "+dev2.getConteudosInscritos());
        
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Fulano: "+dev2.getConteudosInscritos());
        System.out.println("Conteudos concluido Fulano: "+dev2.getConteudoConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXp());
    }
}
