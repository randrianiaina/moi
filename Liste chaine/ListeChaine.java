import java.util.ArrayList;
import java.util.LinkedList;

public class ListeChaine {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    LinkedList<String> fiara = new LinkedList<String>();
    fiara.add("OVLVO");
    fiara.add("WMB");
    fiara.add("ORFD");
    fiara.add("ford");
    fiara.add("ORFD");
    fiara.add("ford");
    

    fiara.add("DZAMA");
    fiara.add("ford");
    System.out.println(fiara);
    System.out.println(cars.indexOf("Ford"));
    System.out.println(fiara.get(3));

    fiara.addFirst("Tedt");
    fiara.spliterator();
    fiara.addLast("Min");
    cars.set(3,"New cars");
    System.out.println(cars);
    System.out.println(fiara);
    System.out.println("111111111111111111");
    ArrayList <String> voiture = new ArrayList<>();

    voiture= cars;
    System.out.println("Voiture");
    System.out.println(voiture);
    System.out.println("cars");
    voiture.add("Min");
    System.out.println(cars);
    cars.clear();
    System.out.println(voiture);
    System.out.println(cars.size());;
    System.out.println(cars);
    int [] tab = new int [3];
    for (int i = 0; i < tab.length; i++) {
      tab[i]=i+1;
    }
    for (int i : tab) {
      System.out.println(i);
    }
    int[] tab2 = tab;
    for (int i : tab2) {
      System.out.println(i);
    }
    for (int i = 0; i < tab2.length; i++) {
      tab[i]=0;
    }
    System.out.println("Tab");
    for (int i : tab) {
      System.out.print(i+ " ");
    }
    System.out.println("Tab2");
    for (int i : tab2) {
      System.out.print(i+ " ");
    }
    
  }
}