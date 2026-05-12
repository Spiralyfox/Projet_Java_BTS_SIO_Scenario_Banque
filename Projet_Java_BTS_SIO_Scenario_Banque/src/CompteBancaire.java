class CompteBancaire {
    private float solde;

    public CompteBancaire() {
        solde = 0;
    }

    public void changerSolde(float montant) {
        solde = solde + montant;
    }

    public float getSolde() {
        return solde;
    }
}