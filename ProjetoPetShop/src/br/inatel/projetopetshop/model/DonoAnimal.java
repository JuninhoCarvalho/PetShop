package br.inatel.projetopetshop.model;

public class DonoAnimal {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private int idade;

    public DonoAnimal(String cpf, String nome, String endereco, String telefone,
            int idade, String email, String senha){
        
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getSenha() {
        return senha;
    }
}
