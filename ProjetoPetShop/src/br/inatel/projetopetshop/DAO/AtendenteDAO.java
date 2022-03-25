/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.Atendente;
import br.inatel.projetopetshop.model.PetShop;
import java.sql.SQLException;
import java.util.ArrayList;

    public class AtendenteDAO extends ConnectionDAO{
        
    boolean sucesso = false;
    
    public boolean inserirAtendente(Atendente atendente) {
        connectToDB();
        String sql = "INSERT INTO Atendente (cpf, nome, endereco, telefone, senha, email, CNPJPetShop) values(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, atendente.getCpf());
            pst.setString(2, atendente.getNome());
            pst.setString(3, atendente.getEndereco());
            pst.setString(4, atendente.getTelefone());
            pst.setString(5, atendente.getSenha());
            pst.setString(6, atendente.getEmail());
            pst.setString(7, PetShop.getCNPJ());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro Atendente: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro Atendente: " + exc.getMessage());
            }
        }

        return sucesso;
    }
    
    public Atendente buscarAtendentePorEmail(String email, String senha) {

        connectToDB();
        boolean found = false;
        
        Atendente atAux = null;
        String sql = "SELECT * FROM Atendente WHERE email = ? and senha = ?";

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
                } else {
                    atAux = new Atendente(rs.getString("cpf"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                    rs.getString("telefone"), rs.getString("CNPJPetShop"));
                    
                    if(email.equals(atAux.getEmail()) && senha.equals(atAux.getSenha()))
                        found = true;
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
    
    public Atendente buscarAtendentePorCpf(String cpf) {

        connectToDB();
        boolean found = false;
        
        Atendente atAux = null;
        String sql = "SELECT * FROM Atendente WHERE cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            while (rs.next()) {
                atAux = new Atendente(rs.getString("cpf"), rs.getString("nome"),
                rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                rs.getString("telefone"), rs.getString("CNPJPetShop"));
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
    
    public ArrayList<Atendente> buscaAtendentes(){
        
        ArrayList<Atendente> listaAtendente = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Atendente";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Atendente temp = new Atendente(rs.getString("cpf"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                    rs.getString("telefone"), rs.getString("CNPJPetShop"));
                
                listaAtendente.add(temp);
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
        
        return listaAtendente;
        
    }
    
    public boolean deletarAtendente(String cpf) {
        connectToDB();
        String sql = "DELETE FROM Atendente WHERE cpf = ?";
        
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
        String sql = "UPDATE Atendente SET endereco=? where cpf=?";
        
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
        String sql = "UPDATE Atendente SET telefone=? where cpf=?";
        
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
    
    public boolean atualizarSenha(String cpf, String senha) {
        connectToDB();
        String sql = "UPDATE Atendente SET senha=? where cpf=?";
        
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
