package DSTopic.Arrays;

import java.util.HashSet;

public class IsUniqueArray {


    public static void main(String... args) {
        int[] ar = {2, 3, 6, 9, 8, 7, 2, 10};

        IsUniqueArray isUnique = new IsUniqueArray();
        boolean unique = isUnique.checkUnique(ar);

        System.out.println(unique);
    }

    private boolean checkUnique(int[] ar) {
        boolean checkUnique = true;
        HashSet<Integer> hash = new HashSet<>();
        for (int val : ar) {
            if (hash.contains(val)) {
                checkUnique = false;
                break;
            }
            hash.add(val);
        }
        return checkUnique;
    }
}
