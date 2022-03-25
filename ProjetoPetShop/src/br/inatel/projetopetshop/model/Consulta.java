package br.inatel.projetopetshop.model;

public class Consulta {
    private String CRMVvet;
    public static int qtdConsultas = 0;
    private String cpfAtendente;
    private String cpfDono;
    private int idAnimal;
    private String data;
    private String horario;
    private float valor;
    private int idConsulta;
    
    public Consulta(int idConsulta, String cpfAtendente, String CRMVvet,
            int idAnimal, String cpfDono, float Valor, String data, String horario){
        
        this.idConsulta = idConsulta;
        this.CRMVvet = CRMVvet;
        this.cpfAtendente = cpfAtendente;
        this.cpfDono = cpfDono;
        this.idAnimal = idAnimal;
        this.data = data;
        this.horario = horario;
        this.valor = Valor;
    }
    
    public String getCpfAtendente() {
        return cpfAtendente;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public float getValor() {
        return valor;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public String getCRMVvet() {
        return CRMVvet;
    }
}
