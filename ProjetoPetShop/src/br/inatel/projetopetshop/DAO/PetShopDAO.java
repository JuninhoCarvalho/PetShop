/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.PetShop;
import java.sql.SQLException;
import java.util.ArrayList;

public class PetShopDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirPetShop(PetShop petshop) {
        connectToDB();
        String sql = "INSERT INTO PetShop (CNPJ, nome, endereco, telefone, qtdFuncs) values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, PetShop.getCNPJ());
            pst.setString(2, PetShop.getNome());
            pst.setString(3, PetShop.getEndereco());
            pst.setString(4, PetShop.getTelefone());
            pst.setInt(5, PetShop.getQtdFuncionarios());
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
    
    public ArrayList<PetShop> buscaInfoPetShop(){
        
        ArrayList<PetShop> listaInfoPS = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM PetShop";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                PetShop temp = new PetShop("CNPJ", "nome", "endereco", "telefone");
                        
                listaInfoPS.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro Petshop: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Petshop: " + e.getMessage());
            }
        }
        
        return listaInfoPS;
        
    }
    
    public boolean updateQtdFuncs(int qtd){
        connectToDB();
        String sql = "UPDATE PetShop SET qtdFuncs = ? WHERE CNPJ = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, PetShop.getQtdFuncionarios());
            pst.setString(2, PetShop.getCNPJ());
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
    
}
