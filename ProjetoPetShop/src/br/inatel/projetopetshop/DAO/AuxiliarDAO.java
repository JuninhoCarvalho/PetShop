/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.Auxiliar;
import br.inatel.projetopetshop.model.PetShop;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuxiliarDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirAuxiliar(Auxiliar auxiliar) {
        connectToDB();
        String sql = "INSERT INTO Auxiliar (cpf, nome, endereco, telefone, senha, email, especialidade,CNPJPetShop, CRMVVet) values(?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, auxiliar.getCpf());
            pst.setString(2, auxiliar.getNome());
            pst.setString(3, auxiliar.getEndereco());
            pst.setString(4, auxiliar.getTelefone());
            pst.setString(5, auxiliar.getSenha());
            pst.setString(6, auxiliar.getEmail());
            pst.setString(7, auxiliar.getEspecialidade());
            pst.setString(8, PetShop.getCNPJ());
            pst.setString(9, auxiliar.getCRMVVet());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro Auxiliar: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro Auxiliar: " + exc.getMessage());
            }
        }

        return sucesso;
    }    
    
    public Auxiliar buscarAuxiliarPorEmail(String email, String senha) {

        connectToDB();

        Auxiliar atAux = null;
        String sql = "SELECT * FROM Auxiliar WHERE email = ? and senha = ?";

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
                    atAux = new Auxiliar(rs.getString("cpf"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                    rs.getString("telefone"), rs.getString("especialidade"), 
                    rs.getString("CNPJPetShop"), rs.getString("CRMVVet"));
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro Auxiliar: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Auxiliar: " + e.getMessage());
            }
        }
        return atAux;
    }
    
    public Auxiliar buscarAuxiliarPorCpf(String cpf) {

        connectToDB();

        Auxiliar atAux = null;
        String sql = "SELECT * FROM Auxiliar WHERE cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            while (rs.next()) {
                atAux = new Auxiliar(rs.getString("cpf"), rs.getString("nome"),
                rs.getString("endereco"), rs.getString("email"), rs.getString("senha"),
                rs.getString("telefone"), rs.getString("especialidade"), 
                rs.getString("CNPJPetShop"), rs.getString("CRMVVet"));
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro Auxiliar: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Auxiliar: " + e.getMessage());
            }
        }
        return atAux;
    }
    
    public ArrayList<Auxiliar> buscaAuxiliares(){
        
        ArrayList<Auxiliar> listaAuxiliar = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Auxiliar";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Auxiliar temp = new Auxiliar(rs.getString("cpf"), rs.getString("nome"),
                rs.getString("endereco"), rs.getString("telefone"), rs.getString("senha"), rs.getString("email"),
                rs.getString("especialidade"), rs.getString("CNPJPetShop"), rs.getString("CRMVVet"));
                
                listaAuxiliar.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro Auxiliar: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Auxiliar: " + e.getMessage());
            }
        }
        
        return listaAuxiliar;
        
    }
    
    public boolean deletarAuxiliar(String cpf) {
        connectToDB();
        String sql = "DELETE FROM Auxiliar WHERE cpf = ?";
        
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
        String sql = "UPDATE Auxiliar SET endereco=? where cpf=?";
        
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
        String sql = "UPDATE Auxiliar SET telefone=? where cpf=?";
        
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
    
    public boolean atualizarCrmvAux(String cpf, String crmv) {
        connectToDB();
        String sql = "UPDATE Auxiliar SET CRMVVet=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, crmv);
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
        String sql = "UPDATE Auxiliar SET senha=? where cpf=?";
        
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
