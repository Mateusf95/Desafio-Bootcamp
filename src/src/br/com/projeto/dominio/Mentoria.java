/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.br.com.projeto.dominio;

import java.time.LocalDate;

/**
 *
 * @author WINDOWS
 */
public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return Xp_PADRAO + 20;
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{Mentoria{ "+
                "Titulo: "+ getTitulo()+
                "Descrição: "+ getDescricao()+ 
                "Data=" + data + '}';
    }

    
    
}
