import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0)
                newList.add(intList.get(i));
        }

      for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) % 2 == 0) {

            } else {
                newList.remove(i);
                i--;
            }
        }

        Collections.sort(newList);
        System.out.println(newList);
    }
}
