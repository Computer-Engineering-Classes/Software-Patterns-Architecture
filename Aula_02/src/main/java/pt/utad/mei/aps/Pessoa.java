package pt.utad.mei.aps;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private final LocalDate dataNascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        var intervalo = Period.between(dataNascimento, LocalDate.now());
        return intervalo.getYears();
    }

    public Pessoa(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

}
