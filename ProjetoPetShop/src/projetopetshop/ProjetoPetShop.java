package projetopetshop;
import br.inatel.projetopetshop.DAO.PetShopDAO;
import br.inatel.projetopetshop.model.PetShop;
import br.inatel.projetopetshop.view.Menu;

public class ProjetoPetShop {

    public static void main(String[] args) {
        PetShop p1 = new PetShop("00.623.904/0001-73", "LatiMia",
                "Centro", "(35)99999-9999");
        PetShopDAO pd = new PetShopDAO();
        pd.inserirPetShop(p1);
        Menu m = new Menu();
        m.setVisible(true);
    }
    
}
