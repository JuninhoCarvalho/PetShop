/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.Consulta;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirConsulta(Consulta consulta) {
        connectToDB();
        String sql = "INSERT INTO Consulta (idConsulta, cpfAtendente, CRMVVet, idAnimal, cpfDono, Valor, data, horario) values(?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, consulta.getIdConsulta());
            pst.setString(2, consulta.getCpfAtendente());
            pst.setString(3, consulta.getCRMVvet());
            pst.setInt(4, consulta.getIdAnimal());
            pst.setString(5, consulta.getCpfDono());
            pst.setFloat(6, consulta.getValor());
            pst.setString(7, consulta.getData());
            pst.setString(8, consulta.getHorario());
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
    
    public ArrayList<Consulta> buscaConsultas(String cpfDono){
        
        ArrayList<Consulta> listaConsultas = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Consulta WHERE cpfDono = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpfDono);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Consulta temp = new Consulta(rs.getInt("idConsulta"), rs.getString("cpfAtendente"), 
                        rs.getString("CRMVvet"), rs.getInt("idAnimal"), rs.getString("cpfDono"),
                        rs.getFloat("Valor"), rs.getString("data"), rs.getString("horario"));
                
                listaConsultas.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro Consulta: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Consulta.: " + e.getMessage());
            }
        }
        
        return listaConsultas;
        
    }
    
    public ArrayList<Consulta> buscaConsultasSemFiltro(){
        
        ArrayList<Consulta> listaConsultasSemFiltro = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Consulta";
        
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Consulta temp = new Consulta(rs.getInt("idConsulta"), rs.getString("cpfAtendente"), 
                        rs.getString("CRMVvet"), rs.getInt("idAnimal"), rs.getString("cpfDono"),
                        rs.getFloat("Valor"), rs.getString("data"), rs.getString("horario"));
                
                listaConsultasSemFiltro.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro Consulta: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Consulta.: " + e.getMessage());
            }
        }
        
        return listaConsultasSemFiltro;
        
    }
    
    public boolean deletarConsulta(int id) {
        connectToDB();
        String sql = "DELETE FROM Consulta where idConsulta = ?";
        
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
