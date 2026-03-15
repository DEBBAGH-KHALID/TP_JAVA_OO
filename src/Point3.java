public class Point3 {
    char nom;
    double abscisse;
    public  Point3(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void afficheImprimant(){
        System.out.println("le point "+this.nom+" est d'abscisse : "+this.abscisse);
    }
    public void translate(double trans){
        this.abscisse+=trans;
        System.out.println("L'abscisse du point "+this.nom+" apres translation est : "+this.abscisse);
    }
}
