/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.PetShop;
import br.inatel.projetopetshop.model.Veterinario;
import java.sql.SQLException;
import java.util.ArrayList;

public class VeterinarioDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirVeterinario(Veterinario veterinario) {
        connectToDB();
        String sql = "INSERT INTO Veterinario (CRMVvet, nome, cpf, endereco, telefone, senha, email, especialidade, CNPJPetShop) values(?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, veterinario.getCRMV());
            pst.setString(2, veterinario.getNome());
            pst.setString(3, veterinario.getCpf());
            pst.setString(4, veterinario.getEndereco());
            pst.setString(5, veterinario.getTelefone());
            pst.setString(6, veterinario.getSenha());
            pst.setString(7, veterinario.getEmail());
            pst.setString(8, veterinario.getEspecialidade());
            pst.setString(9, PetShop.getCNPJ());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro Vet: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro Vet: " + exc.getMessage());
            }
        }

        return sucesso;
    }
    
    public Veterinario buscarVeterinarioPorEmail(String email, String senha) {

        connectToDB();

        Veterinario atAux = null;
        String sql = "SELECT * FROM Veterinario WHERE email = ? and senha = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("email");
                if(aux.isEmpty())
                {
                    sucesso = false;
                }else{
                    atAux = new Veterinario(rs.getString("cpf"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                    rs.getString("telefone"), rs.getString("especialidade"), rs.getString("CRMVvet"), rs.getString("CNPJPetShop"));
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return atAux;
    }
    
    public Veterinario buscarVeterinarioPorCpf(String cpf) {

        connectToDB();

        Veterinario atAux = null;
        String sql = "SELECT * FROM Veterinario WHERE cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            while (rs.next()) {
                atAux = new Veterinario(rs.getString("cpf"), rs.getString("nome"),
                rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                rs.getString("telefone"), rs.getString("especialidade"), rs.getString("CRMVvet"), rs.getString("CNPJPetShop"));
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return atAux;
    }
    
    public ArrayList<Veterinario> buscaVeterinarios(){
        
        ArrayList<Veterinario> listaVets = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Veterinario";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Veterinario temp = new Veterinario(rs.getString("cpf"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                    rs.getString("telefone"), rs.getString("especialidade"), 
                        rs.getString("CRMVvet"), rs.getString("CNPJPetShop"));
                
                listaVets.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        return listaVets;
        
    }
    
    public boolean deletarVeterinario(String cpf) {
        connectToDB();
        String sql = "DELETE FROM Veterinario WHERE cpf = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public boolean atualizarEndereco(String cpf, String endereco) {
        connectToDB();
        String sql = "UPDATE Veterinario SET endereco=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, endereco);
            pst.setString(2, cpf);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public boolean atualizarTelefone(String cpf, String telefone) {
        connectToDB();
        String sql = "UPDATE Veterinario SET telefone=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, telefone);
            pst.setString(2, cpf);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public boolean atualizarEspecialidade(String cpf, String especialidade){
        connectToDB();
        String sql = "UPDATE Veterinario SET especialidade=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, especialidade);
            pst.setString(2, cpf);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public boolean atualizarSenha(String cpf, String senha) {
        connectToDB();
        String sql = "UPDATE Veterinario SET senha=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, senha);
            pst.setString(2, cpf);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
}
