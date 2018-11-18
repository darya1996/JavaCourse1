import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List animals = new ArrayList();

        animals.add(new Frog("Tree Frog","Green"));
        animals.add(new Snake("Black Mamba","Gray"));
        animals.add(new Owl("Barn Owl","Gray"));

        for(int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getClass());
        }
        System.out.println("Are the " + animals.get(0).getClass() + " and " + animals.get(1).getClass() + " siblings? " + Search(animals,animals.get(0),animals.get(1)));
        System.out.println("Are the " + animals.get(1).getClass() + " and " + animals.get(2).getClass() + " siblings? " + Search(animals,animals.get(1),animals.get(2)));
        System.out.println("Are the " + animals.get(0).getClass() + " and " + animals.get(2).getClass() + " siblings? " + Search(animals,animals.get(0),animals.get(2)));
    }

    public static boolean Search(List list,Object a, Object b) {
        for (int i = 0 ; i < list.size(); i++) {
            if(list.get(i).equals(a) && i != list.size()-1) {
                if(list.get(++i).equals(b)) return true;
            }
            else if(list.get(i).equals(b) && i != list.size()-1) {
                if(list.get(++i).equals(a)) return true;
            }
        }
        return false;
    }
}
