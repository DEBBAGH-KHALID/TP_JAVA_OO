import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        ex8();
    }

    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer nombre A :");
        double A = sc.nextDouble();
        System.out.println("Entrer nombre B :");
        double B = sc.nextDouble();
        System.out.println("La somme est: " + (A + B));
        System.out.println("La difference est :" + (A - B));
        System.out.println("Le produit est :" + A * B);
        if (B == 0) {
            System.out.println("la division par 0 est impossible !!!");
        } else {
            System.out.println("la division est :" + A / B);
        }
    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le rayon du cercle :");
        float R = sc.nextFloat();
        final float pi = 3.14f;
        System.out.println("la surface du cercle est :" + (pi * R * R));
        System.out.println("le perimetre du cercle est :" + (2 * pi * R));

    }

    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer nombre A :");
        int A = sc.nextInt();
        System.out.println("Entrer nombre B :");
        int B = sc.nextInt();
        int temp;
        temp = A;
        A = B;
        B = temp;
        System.out.println("Les nouvelles valeurs de A = " + A + " et B = " + B);
    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le reel x :");
        float x = sc.nextFloat();
        System.out.println("entrer l'entier n :");
        int n = sc.nextInt();
        System.out.println("x a la puissance n est : " + (Math.pow(x, n)));
    }

    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le nombre : ");
        int x = sc.nextInt();
        long Fact = 1;
        while (x > 1) {
            Fact *= x--;
        }
        System.out.println("le factoriel de " + x + " est : " + Fact);

    }

    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------RESOLUTION DE L'EQUATION DU 1 ERE DEGRE----------");
        System.out.println("entrer les deux coefficients a et b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("la solution de x est : " + (-b / a));
    }

    public static void ex7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------RESOLUTION DE L'EQUATION DU 2 EME DEGRE----------");
        System.out.println("entrer le  coefficient a : ");
        int a = sc.nextInt();
        System.out.println("entrer le  coefficient b : ");
        int b = sc.nextInt();
        System.out.println("entrer le  coefficient c : ");
        int c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            float x1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("l'equation admet deux solutions x1 = " + x1 + " et x2 = " + x2);
        } else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.println("l'equation admet une seule solution : " + x);
        } else {
            System.out.println("L'equation n'a pas de solution reel");
        }
    }

    public static void ex8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le 1 ere entier :");
        int a = sc.nextInt();
        System.out.println("Entrer le 2 eme entier :");
        int b = sc.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b; // reste de la division
            a = temp;
        }
        int pgcd = a;
        System.out.println("le PGCD entre "+a+" et "+b+" est : "+pgcd);
    }
}
