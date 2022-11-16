import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random(1000);
        ArrayList<Integer> integerSet = new ArrayList<>();
        for (int i = 0;i < 20; i++){
            integerSet.add(random.nextInt(20));
            if (integerSet.get(i) % 2 != 0);
        }
        integerSet.sort(Comparator.naturalOrder());
        System.out.println(integerSet);
    }
}