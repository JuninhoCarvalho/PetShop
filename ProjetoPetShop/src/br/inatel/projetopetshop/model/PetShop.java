package br.inatel.projetopetshop.model;

public class PetShop {
    private static String CNPJ;
    private static String nome;
    private static String endereco;
    private static String telefone;
    private static int qtdFuncionarios;
    
    public PetShop(String CNPJ, String nome, String endereco, String telefone){
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public static String getCNPJ() {
        return CNPJ;
    }

    public static String getNome() {
        return nome;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setQtdFuncionarios(int qtdFuncionarios) {
        PetShop.qtdFuncionarios = qtdFuncionarios;
    }
    
    public static int getQtdFuncionarios() {
        return qtdFuncionarios;
    }
    
}
