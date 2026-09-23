public class Etudiant extends Utilisateur {
    private String numEtudiant; 
    private Niveau niveau;

     public Etudiant(String nom, int age, String email, String numEtudiant, Niveau niveau) {
        super(null, nom, email); // Appel du constructeur de la classe mère pour initialiser les attributs
        setNumEtudiant(numEtudiant);
        setNiveau(niveau);
    }


    public String getNumEtudiant() {
        return numEtudiant;
    }

    public Niveau getNiveau() {
        return niveau;
    }   

    public void setNumEtudiant(String numEtudiant) {
        if (numEtudiant == null || numEtudiant.isEmpty()) {
            throw new IllegalArgumentException("Le numéro d'étudiant ne peut pas être vide.");
        }
        this.numEtudiant = numEtudiant;
    }
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public String getRole() {
        return "Etudiant";
    }
    public String afficherProfil() {
        return "Nom: " + getNom() + ", Email: " + getEmail() + ", Numéro d'étudiant: " + numEtudiant + ", Niveau: " + niveau;
    }
}
