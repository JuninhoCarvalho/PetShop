package br.inatel.projetopetshop.model;

public class Veterinario extends Funcionario {
    
    private String especialidade;
    private String CRMV;
    
    public Veterinario(String cpf, String nome, String endereco, String email, 
            String senha, String telefone, String especialidade, String CRMV, String CNPJPetShop) {
        super(cpf, nome, endereco, email, senha, telefone, CNPJPetShop);
        this.especialidade = especialidade;
        this.CRMV = CRMV;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCRMV() {
        return CRMV;
    }
    
}
