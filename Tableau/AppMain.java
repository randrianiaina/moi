import java.util.Scanner;

public class AppMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("Entrer la taille du tableau");
        n = input.nextInt();
        int[] table = new int [n];
        CreationTab crea = new CreationTab();
        crea.createTable(table, n);       
        // System.out.println("Entrer les valeurs du tableau");
        // for (int i = 0; i < n; i++) {

        //     System.out.println("tab[" + i + "]");
        //     table[i] = input.nextInt();

        // }
        AfficheTab afTab = new AfficheTab();
        afTab.affiche(table,n);
        System.out.println("Entrer le nombe à ajouter");
        int a = input.nextInt();
        System.out.println("Entrer la position ou " + a + " va être placé");
        int b = input.nextInt();
        InsertionTab insert = new InsertionTab();
        table=insert.insertion(table, a, b);
        afTab.affiche(table,n+1);

    }

}
