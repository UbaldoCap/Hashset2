import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hash1 = newFullHash(5);
        System.out.println(hash1);
        Integer numero = 6;
        System.out.println(numero);
        for (Integer num : hash1) {
            if (numero.equals(num)) {
                System.out.println("L'elemento è parte del Set");
                break;
            } else if (num == hash1.size() - 1) {
                System.out.println("L'elemento non è parte del Set");
            }
        }
    }
    public static HashSet<Integer> newFullHash (int numElementi) {
        HashSet<Integer> nuovo = new HashSet<>();
        for (int i = 0; i < numElementi; i++) {
            nuovo.add(i);
        }
        return nuovo;
    }
}
