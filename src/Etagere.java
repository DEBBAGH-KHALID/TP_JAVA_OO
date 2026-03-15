public class Etagere {
    private Livre[] livers;
    private int nbrlivre ;

    public Etagere(int capacite){
        this.livers = new Livre[capacite];
        this.nbrlivre = 0;
    }
    public int getCapacite(){
        return this.livers.length;
    }
    public int getNblivres(){
        return nbrlivre;
    }
    public void ajouterLivre(Livre livre){
        if (livers.length >nbrlivre){
           livers[nbrlivre] = livre;
           nbrlivre++;
        }else{
            System.out.println("impossible dajuter livre!!!!");
        }
    }
    public Livre getLivre(int position) {
        if (position < 1 || position > nbrlivre) {
            System.out.println("Erreur : position invalide !");
            return null;
        }
        return livers[position - 1]; // position 1 → indice 0
    }
    public int chercherLivre(String titre , String auteur){
        for(int i=0;i<nbrlivre;i++){
            if(livers[i].getTitre().equals(titre)&& livers[i].getAuteur().equals(auteur)){
                return i+1;
            }
        }
        return 0;
    }
    public void supprimerLivre(int position){
        if (position < 1 || position > nbrlivre) {
            System.out.println("Erreur : position invalide !");
            return;
        }
        for(int i=position-1 ; i<nbrlivre;i++){
          livers[i]=livers[i+1];
          livers[nbrlivre-1]=null;
        }
        nbrlivre--;
    }
    public String toString() {
        String result = "Etagere (" + nbrlivre + "/" + livers.length + " livres) :\n";
        for (int i = 0; i < nbrlivre; i++) {
            result += "  " + (i + 1) + ". " + livers[i] + "\n";
        }
        return result;
    }

}
