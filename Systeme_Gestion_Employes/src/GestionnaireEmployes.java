import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmployes {
    private List<Employe> employes;

    public GestionnaireEmployes() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void supprimerEmploye(int index) {

        if (index >= 0 && index < employes.size()) {
            employes.remove(index);
        } else {
            System.out.println("Index invalide");
        }
    }

    public void afficherEmployes() {
        for (Employe employe : employes) {
            System.out.println(employes);
        }
    }
}