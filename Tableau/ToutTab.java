import java.util.Scanner;

public class ToutTab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Entrer la taille du tableau");
        n = input.nextInt();
        int []tab= new int [n+1];
        System.out.println("Entrer les valeurs du tableau");
        for (int i = 0; i < n; i++) {
                System.out.println("tab["+i+"]");
            tab[i]= input.nextInt();
        }
        System.out.println("Voici les valeurs saisies");
        for (int i : tab) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Entrer le nombe à ajouter");
        int valeur = input.nextInt();
        System.out.println("Entrer la position ou " + valeur + " va être placé");
        int position = input.nextInt();
        int i = tab.length-1;
        // for (int i = tab.length-1; i > b; i--) {
        //     tab[i]=tab[i-1];
        // }
        while (i>position){
            tab[i]=tab[i-1];
            i--;
        }
        tab[position]=valeur;
        System.out.println("Voici le tableau avec la nouvelle valeur");
        for (int a : tab) {
            System.out.print(a+" ");
        }
        System.out.println("");
    }
    
}
