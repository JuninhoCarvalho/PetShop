/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.DonoAnimal;
import java.sql.SQLException;
import java.util.ArrayList;

public class DonoAnimalDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
     public boolean inserirDonoAnimal(DonoAnimal dono) {
        connectToDB();
        String sql = "INSERT INTO DonoAnimal (cpf, nome, endereco, telefone, idade, email, senha) values(?, ?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, dono.getCpf());
            pst.setString(2, dono.getNome());
            pst.setString(3, dono.getEndereco());
            pst.setString(4, dono.getTelefone());
            pst.setInt(5, dono.getIdade());
            pst.setString(6, dono.getEmail());
            pst.setString(7, dono.getSenha());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
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
    
    public DonoAnimal buscarClientePorEmail(String email, String senha) {

        connectToDB();

        DonoAnimal atAux = null;
        String sql = "SELECT * FROM DonoAnimal WHERE email = ? and senha = ?";

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
                    atAux = new DonoAnimal(rs.getString("cpf"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("telefone"), rs.getInt("idade"), rs.getString("email"), rs.getString("senha"));
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
    
    public DonoAnimal buscarClientePorCpf(String cpf) {

        connectToDB();

        DonoAnimal atAux = null;
        String sql = "SELECT * FROM DonoAnimal WHERE cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            while (rs.next()) {
                atAux = new DonoAnimal(rs.getString("cpf"), rs.getString("nome"),
                rs.getString("endereco"), rs.getString("telefone"), rs.getInt("idade"), rs.getString("email"), rs.getString("senha"));
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
     
    public ArrayList<DonoAnimal> buscaClientes(){
        
        ArrayList<DonoAnimal> listaClientes = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM DonoAnimal";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                DonoAnimal temp = new DonoAnimal(rs.getString("cpf"), rs.getString("nome"),
                rs.getString("endereco"), rs.getString("telefone"), rs.getInt("idade"),
                rs.getString("email"), rs.getString("senha"));
                
                listaClientes.add(temp);
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
        
        return listaClientes;
        
    }
    
    public boolean deletarCliente(String cpf) {
        connectToDB();
        String sql = "DELETE FROM DonoAnimal WHERE cpf = ?";
        
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
        String sql = "UPDATE DonoAnimal SET endereco=? where cpf=?";
        
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
        String sql = "UPDATE DonoAnimal SET telefone=? where cpf=?";
        
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
    
    public boolean atualizarIdade(String cpf, int idade) {
        connectToDB();
        String sql = "UPDATE DonoAnimal SET idade=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idade);
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
        String sql = "UPDATE DonoAnimal SET senha=? where cpf=?";
        
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
