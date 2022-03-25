package br.inatel.projetopetshop.model;

public class Auxiliar extends Funcionario {
    
    private String especialidade;
    private String CRMVVet;
    
    public Auxiliar(String cpf, String nome, String endereco, String telefone, 
            String senha, String email, String especialidade, String CNPJPetShop, String CrmvVet) {
        super(cpf, nome, endereco, email, senha, telefone, CNPJPetShop);
        this.especialidade = especialidade;
        this.CRMVVet = CrmvVet;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCRMVVet() {
        return CRMVVet;
    }
    
}
