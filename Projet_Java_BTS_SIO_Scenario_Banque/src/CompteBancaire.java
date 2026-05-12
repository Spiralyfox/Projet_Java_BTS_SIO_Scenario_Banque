class CompteBancaire {
    private float solde;
    private String nom;

    public CompteBancaire(String nom) {
        solde = 0;
        setNom(nom);
    }

    public void changerSolde(float montant) {
        solde = solde + montant;
    }

    public float getSolde() {
        return solde;
    }

    public void setNom(String nom) {
        if (!nom.equals("")) {
            this.nom = nom;
        }
    }

    public String getNom() {
        return nom;
    }
}