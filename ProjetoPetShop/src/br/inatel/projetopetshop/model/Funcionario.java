package br.inatel.projetopetshop.model;

public abstract class Funcionario {
    private String cpf;
    private String nome;
    private String endereco;
    private String email;
    private String senha;
    private String telefone;
    private String CNPJPetShop;
    
    public Funcionario(String cpf, String nome, String endereco, String email,
            String senha, String telefone, String CNPJPetShop){
        
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
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

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public String getCNPJPetShop() {
        return CNPJPetShop;
    }
}
