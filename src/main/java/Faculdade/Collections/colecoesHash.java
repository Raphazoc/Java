package Faculdade.Collections;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class colecoesHash {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet ();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Raphael");
        conjunto.add(1);
        conjunto.add('X');
        System.out.println(conjunto.size());

        conjunto.add("raphael");
        System.out.println(conjunto.size());

        conjunto.remove("Raphael");
        System.out.println(conjunto.size());

        System.out.println(conjunto.contains('X'));

        // =============================================================

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println(nums);

        conjunto.addAll(nums); // Uniao entre dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }

}
