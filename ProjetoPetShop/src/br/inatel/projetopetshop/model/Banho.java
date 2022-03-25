package br.inatel.projetopetshop.model;

public class Banho {
    private String cpfDono;
    private String cpfAuxiliar;
    private int idAnimal;
    private String data;
    private String horario;
    private float valor;

    public Banho(String cpfDono, String cpfAuxiliar, int idAnimal, float valor, String data, String horario) {
        this.cpfDono = cpfDono;
        this.cpfAuxiliar = cpfAuxiliar;
        this.idAnimal = idAnimal;
        this.valor = valor;
        this.data = data;
        this.horario = horario;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public String getCpfAuxiliar() {
        return cpfAuxiliar;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public float getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }
    
}
