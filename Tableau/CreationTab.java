import java.util.Scanner;

public class CreationTab {
    Scanner input = new Scanner(System.in);
    public int[] createTable(int [] tab,int n){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("tab["+i+"]");
            tab[i]= input.nextInt();
        }
        System.out.println("");
        return tab;
    }
    
}
