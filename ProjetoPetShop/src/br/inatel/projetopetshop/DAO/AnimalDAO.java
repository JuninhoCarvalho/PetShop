package br.inatel.projetopetshop.DAO;

import br.inatel.projetopetshop.model.Animal;
import java.sql.SQLException;
import java.util.ArrayList;


public class AnimalDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirAnimal(Animal animal) {
        connectToDB();
        String sql = "INSERT INTO Animal (nome, especie, idade, peso, vacinado, CPFDono) values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, animal.getNome());
            pst.setString(2, animal.getEspecie());
            pst.setInt(3, animal.getIdade());
            pst.setFloat(4, animal.getPeso());
            pst.setBoolean(5, animal.isVacinado());
            pst.setString(6, animal.getCPFDono());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro Animal: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro Animal: " + exc.getMessage());
            }
        }
        
        return sucesso;
    }
    
    public ArrayList<Animal> buscaAnimalLogin(String CpfDono){
        
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Animal WHERE CPFDono = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, CpfDono);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                Animal temp = new Animal(rs.getInt("idAnimal"), rs.getString("nome"), rs.getString("especie"),
                rs.getInt("idade"), rs.getFloat("peso"), rs.getBoolean("vacinado"),
                rs.getString("CPFDono"));
                
                listaAnimais.add(temp);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro Animal: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro Animal.: " + e.getMessage());
            }
        }
        
        return listaAnimais;
        
    }
    
    public boolean deletarAnimal(int id) {
        connectToDB();
        String sql = "DELETE FROM Animal where idAnimal = ?";
        
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
