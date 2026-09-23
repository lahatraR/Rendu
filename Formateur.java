public class Formateur extends Utilisateur {
    private String specialite;   
    private int anneeExperience;
       public Formateur(String nom, int age, String email, String specialite, int anneeExperience) {
        super(null, nom, email); // Appel du constructeur de la classe mère pour initialiser les attributs      
        setSpecialite(specialite);
        setAnneeExperience(anneeExperience);
    }
    public String getSpecialite() {
        return specialite;
    }

    public int getAnneeExperience() {
        return anneeExperience;
    }

    public void setSpecialite(String specialite) {
        if (specialite == null || specialite.isEmpty()) {
            throw new IllegalArgumentException("La spécialité ne peut pas être vide.");
        }
        this.specialite = specialite;
    }

    public void setAnneeExperience(int anneeExperience) {
        if (anneeExperience < 0) {
            throw new IllegalArgumentException("L'année d'expérience ne peut pas être négative.");
        }
        this.anneeExperience = anneeExperience;
    }
    public String getRole() {
        return "Formateur";
    }
    public String afficherProfil() {
        return "Nom: " + getNom() + ", Email: " + getEmail() + ", Spécialité: " + specialite + ", Années d'expérience: " + anneeExperience;
    }
}
