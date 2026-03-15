public class Livre {
    private String titre;
    private String auteur;
    private int pages;
    private Float prix;
    private boolean fixe ;
    Livre(String titre, String auteur, int pages){
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
        this.prix = (float)-1;
        this.fixe = false;
    }
    Livre(String titre, String auteur, int pages,Float prix){
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
        this.prix = prix;
        this.fixe = true;
    }
    public String getTitre(){
        return titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public int getPages(){
        return pages;
    }
    public Float getPrix(){
        return prix;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    public void setPages(int pages){
        this.pages = pages;
    }

    public void setPrix(Float prix){
        if (this.fixe==true) {
            System.out.println("Erreur : le prix a déjà été fixé et ne peut pas être modifié.");
        } else {
            this.prix = prix;
            this.fixe = true;
        }
    }

    public String toString(){
        String Result = (this.prix==-1)? "Prix pas encore donné" : prix + "DH";
        return "Livre{titre='" + titre + "', auteur='" + auteur +
                "', pages=" + pages + ", prix=" + Result + "}";
    }
    public int compare(Livre b){
        if(this.pages ==b.pages){
            return 0;
        }else if(this.pages>b.pages){
            return 1;
        }else{
            return -1;
        }

    }
}




