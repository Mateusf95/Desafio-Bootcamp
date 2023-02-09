/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.br.com.projeto.dominio;

/**
 *
 * @author WINDOWS
 */
public class Curso extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + 
                " Titulo: " + getTitulo() + 
                " Descricao: " + getDescricao() + 
                " CargaHoraria: " + cargaHoraria + '}';
    }

    @Override
    public double calcularXp() {
        return Xp_PADRAO * cargaHoraria;
    }
    
    
    
}
