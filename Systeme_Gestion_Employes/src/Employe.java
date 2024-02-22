import java.time.LocalDate;

public class Employe {
    private int id;
    private String nom;
    private double salaire;
    private LocalDate dateEmbauche;

    public Employe(int id, String nom,  double salaire, LocalDate dateEmbauche) {
        this.id = id;
        this.nom = nom;
        this.salaire = salaire;
        this.dateEmbauche = dateEmbauche;
    }
    public Employe(int id, String Nom_, String DateEmbauche, int i) {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    public void raiseSalary(double percentage) {
        salaire = salaire + salaire * percentage / 100;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salaire=" + salaire +
                ", dateEmbauche=" + dateEmbauche +
                '}';
    }
}