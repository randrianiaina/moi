import java.time.format.TextStyle;
import java.util.Collection;
import java.util.Stack;

public class Pile {
    public static void main(String[] args) {
        Stack<String> pile = new Stack<>();
        if (pile.empty() == true) {
            System.out.println("pile vide");
        } else {
            System.out.println(pile);
        }
        pile.add("10");
        pile.push("new");
        pile.push("1");
        pile.push("2");
        pile.push("3");
        pile.push("4");
        System.out.println(pile);
        pile.pop();

        System.out.println(pile);
        Stack stk = new Stack();
        stk.push(1);
        stk.push(59);
        stk.push(19);
        stk.push(89);
        stk.push(18);
        stk.add(4, 56);

        System.out.println(stk);
        stk.removeElementAt(2);
        System.out.println(stk);
        stk.pop();

        System.out.println(stk);
        if (stk.empty() == true) {
            System.out.println("pile vide");
        } else {
            System.out.println("stk non vide ");
        }
        System.out.println(stk);
        stk.pop();
        stk.push(15);
        stk.push(15);
        stk.push(15);
        stk.push(15);
        stk.push(stk);
        System.out.println(stk);
        System.out.println(stk.capacity());
        stk.addElement(105);
        stk.addAll(stk);
        stk.remove(0);
        stk.removeElement(15);
        stk.setElementAt(1000, 3);        
        stk.removeElementAt(15);     
        System.out.println(stk);

    }

}
