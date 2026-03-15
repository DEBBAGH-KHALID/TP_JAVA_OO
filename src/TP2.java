import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        ex6();
    }

    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre N :");
        int N = sc.nextInt();
        long sum = 0;
        long prod = 1;
       /* for(int i = 1;i<=N;i++) {
            System.out.println("Entrer le " + i + " nombre :");
            int n = sc.nextInt();
            sum += n;
            prod *= n;
        }
         int i=1 ;
        while(i<=N){
            System.out.println("Entrer le "+i+" nombre :");
            int n = sc.nextInt();
            sum += n;
            prod *= n;
            i++;
        }*/
        int i = 1;
        do {
            System.out.println("Entrer le " + i + " nombre :");
            int n = sc.nextInt();
            sum += n;
            prod *= n;
            i++;
        }
        while (i <= N);
        float moy = (float) sum / N;
        System.out.println("la somme est : " + sum);
        System.out.println("le produit est : " + prod);
        System.out.println("la moyenne est : " + moy);
    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer x :");
        float x = sc.nextFloat();
        System.out.println("entrer n :");
        int n = sc.nextInt();
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("Le resultat est : " + result);
    }

    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer N :");
        int n = sc.nextInt();
        double sum = 0;
        int i = 1;
        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }
        System.out.println("La somme est : " + sum);
    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer N :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer N :");
        int n = sc.nextInt();
        long F = 1;
        for (int i = 1; i <= n; i++) {
            F *= i;
        }
        while (n >= 1) {
            F *= n--;
        }
        System.out.println("le factoriel N! est: " + F);
    }

    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le nombre :");
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("le nombre " + j + " est premier");
            } else {
                System.out.println("le nombre " + j + " n'est pas premier");
            }
        }
    }
}
