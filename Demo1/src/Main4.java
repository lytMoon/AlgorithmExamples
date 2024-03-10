import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        System.out.println(arrayList);


        Map<Integer,String>  hashMap = new HashMap<>();
        hashMap.put(1,"111");
        hashMap.put(2,"222");
        hashMap.put(3,"333");
        hashMap.put(4,"444");



    }
}
