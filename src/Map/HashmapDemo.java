package Map;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Mahzabin");
        map.put(102, "Rahim");
        map.put(103, "Anika");

        System.out.println(map);

        System.out.println(map.get(102));

        map.remove(103);

        System.out.println(map);
    }
}
