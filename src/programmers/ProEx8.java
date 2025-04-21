package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProEx8 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> d = new ArrayList<>();
        Set<Integer> deleteSet = Arrays.stream(delete_list)
                .boxed()
                .collect(Collectors.toSet());

        for (int i: arr) {
            if (!deleteSet.contains(i)) d.add(i);
        }
        return d.stream().mapToInt(i->i).toArray();
    }


}
