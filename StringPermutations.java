import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StringPermutations {

    public static void main(String[] args) {
        String s = "abc";
        List<String> iterativePerms = iterativePermutations(s);
        List<String> recursivePerms = recursivePermutations(s);

        Collections.sort(iterativePerms);
        Collections.sort(recursivePerms);

        boolean areEqual = iterativePerms.equals(recursivePerms);
        System.out.println("Permutations are equal: " + areEqual);
    }

    public static List<String> iterativePermutations(String s) {
        if (s.length() == 0) {
            return new ArrayList<>();
        }

        Queue<String> permutations = new LinkedList<>();
        permutations.add(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int size = permutations.size();

            while (size > 0) {
                String perm = permutations.poll();
                for (int j = 0; j <= perm.length(); j++) {
                    String newPerm = perm.substring(0, j) + currentChar + perm.substring(j);
                    permutations.add(newPerm);
                }
                size--;
            }
        }

        return new ArrayList<>(permutations);
    }

    public static List<String> recursivePermutations(String s) {
        if (s.length() == 0) {
            return new ArrayList<>();
        }
        if (s.length() == 1) {
            List<String> single = new ArrayList<>();
            single.add(s);
            return single;
        }

        List<String> perms = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            for (String perm : recursivePermutations(remaining)) {
                perms.add(currentChar + perm);
            }
        }
        return perms;
    }
}
