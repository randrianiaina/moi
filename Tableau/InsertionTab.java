public class InsertionTab {
    public int[] insertion(int[] tab, int x, int v){
        int [] tab1 = new int [tab.length+1];
        for (int i = 0; i < tab1.length; i++) {
            if(i==v) {
                tab1[v]=x;
            }else if (i>v){
                tab1[i]=tab[i-1];
            }else {
                tab1[i]=tab[i];
            }
            
        }
         return tab1;
    }
}
