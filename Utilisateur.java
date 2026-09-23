public abstract class Utilisateur {
    private Long id;
   private String nom;
    private String email;
    
     public Utilisateur(Long id, String nom, String email) {
        setId(id);
        setNom(nom);
        setEmail(email);
    }

    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNom(String nom) {
        if (nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide.");
        }
        this.nom = nom;
    }
    public void setEmail(String email) {
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("L'email ne peut pas être vide.");
        }
        this.email = email;
    }

    public abstract String getRole(); // Méthode abstraite pour obtenir le rôle de l'utilisateur
     public abstract String afficherProfil();
}
