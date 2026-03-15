class  Personne{
    private String CIN;
    private String nom;
    private String prenom;
    private String email;
    private int age;
    public void initialiser(String CIN , String nom, String prenom, String email, int age){
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }
    public void afficherPersonne(){
        System.out.println("Votre CIN est : "+this.CIN);
        System.out.println("Votre nom est : "+this.nom);
        System.out.println("Votre prenom est : "+this.prenom);
        System.out.println("Votre email est : "+this.email);
        System.out.println("Votre age est : "+this.age);
    }
}


