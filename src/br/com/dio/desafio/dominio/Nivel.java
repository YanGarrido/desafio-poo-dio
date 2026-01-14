package br.com.dio.desafio.dominio;

public enum Nivel {
    BASICO(1.0),
    INTERMEDIARIO(1.5),
    AVANCADO(2.0);

    private final double multiplicador;

    Nivel(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }
}
