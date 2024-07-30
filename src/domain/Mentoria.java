package domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
