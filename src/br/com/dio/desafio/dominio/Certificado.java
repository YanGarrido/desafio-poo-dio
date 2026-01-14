package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;

public class Certificado {

    public static String gerar(Dev dev, Bootcamp bootcamp) {
        Set<Conteudo> concluidos = dev.getConteudosConcluidos();
        Set<Conteudo> bootConteudos = bootcamp.getConteudos();

        if (concluidos != null && bootConteudos != null && concluidos.containsAll(bootConteudos)) {
            return String.format("Certificado de Conclusão%nNome: %s%nBootcamp: %s%nData: %s",
                    dev.getNome(),
                    bootcamp.getNome(),
                    LocalDate.now());
        }
        return null;
    }
}
