package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private Nivel nivel = Nivel.BASICO;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria * nivel.getMultiplicador();
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", nivel=" + nivel +
                '}';
    }
}
