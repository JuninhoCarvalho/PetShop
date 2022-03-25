/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.Animal;
import br.inatel.projetopetshop.model.Banho;
import java.sql.SQLException;
import java.util.ArrayList;

public class BanhoDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirBanho(Banho banho) {
        connectToDB();
        String sql = "INSERT INTO Banho (cpfDono, cpfAuxiliar, idAnimal, valor, data, horario) values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, banho.getCpfDono());
            pst.setString(2, banho.getCpfAuxiliar());
            pst.setInt(3, banho.getIdAnimal());
            pst.setFloat(4, banho.getValor());
            pst.setString(5, banho.getData());
            pst.setString(6, banho.getHorario());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro Banho: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro Banho: " + exc.getMessage());
            }
        }
        
        return sucesso;
    }
    
    public ArrayList<Banho> buscaBanhos(String cpfDono){
        
        ArrayList<Banho> listaBanhos = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Banho WHERE cpfDono = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpfDono);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Banho temp = new Banho(rs.getString("cpfDono"), rs.getString("cpfAuxiliar"), rs.getInt("idAnimal"), rs.getFloat("Valor"),
                rs.getString("data"), rs.getString("horario"));
                
                listaBanhos.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro Banho: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Banho.: " + e.getMessage());
            }
        }
        
        return listaBanhos;
        
    }
    
    public ArrayList<Banho> buscaBanhosSemFiltro(){
        
        ArrayList<Banho> listaBanhosSemFiltro = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Banho";
        
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Banho temp = new Banho(rs.getString("cpfDono"), rs.getString("cpfAuxiliar"), rs.getInt("idAnimal"), rs.getFloat("Valor"),
                rs.getString("data"), rs.getString("horario"));
                
                listaBanhosSemFiltro.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro Banho: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Banho.: " + e.getMessage());
            }
        }
        
        return listaBanhosSemFiltro;
        
    }
    
    public boolean deletarBanho(int id) {
        connectToDB();
        String sql = "DELETE FROM Banho where idAnimal = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
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
