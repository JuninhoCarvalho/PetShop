package br.inatel.projetopetshop.model;

public class Animal {
    private int idAnimal;
    public static int qtdAnimais=0;
    private String nome;
    private String especie;
    private int idade;
    private float peso;
    private boolean vacinado;
    private String CPFDono;
    
    public Animal(int qtd, String nome, String especie, int idade, float peso,
            boolean vacinado, String CPFDono){
        
        this.idAnimal = qtd;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.vacinado = vacinado;
        this.CPFDono = CPFDono;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public String getCPFDono() {
        return CPFDono;
    }
    
}
