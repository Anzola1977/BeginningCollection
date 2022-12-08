import java.security.Key;
import java.util.*;

public class auto {

    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("Mazda");
        //System.out.println(auto.add("Toyota"));
        auto.add("BMW");
        auto.add("Fiat");
        auto.add("VW");
        auto.add("Audi");
        auto.add("Mercedes");
        auto.add("Porsche");
        auto.add("Mercedes");
//        for (String car : auto) {
//            //            if (car.equals("Fiat")) {
////                iterator.remove();
//            System.out.println(car);
////            }
//        }
//
//        Iterator<String> iterator = auto.iterator();
//        while (iterator.hasNext()){
//            String car = iterator.next();
//            System.out.println(car);
//        }


//        System.out.println(auto.removeIf(car -> car.equals("Fiat")));
        //System.out.println(auto);
        auto.add(2, "Tesla");
//        System.out.println(auto);
//        System.out.println(auto.get(1));
//        System.out.println(auto.lastIndexOf("Mercedes"));
//        System.out.println(auto.remove("VW"));
//        System.out.println(auto.set(4, "Saab"));
//        System.out.println(auto);
//        for (int i = 0; i <= auto.size(); i++) {
//            System.out.println(i);
        //}

        Set<Integer> room = new HashSet<>();
        room.add(24);
        room.add(2);
        room.add(21);
        room.add(26);
        room.add(4);
        room.add(14);
        room.add(74);
        //for (Integer chamber : room) {
            //System.out.println(chamber);
//            if (chamber == 26){
//                iterator1.remove();
        //}


//        for (int i = 0; i < room.size(); i++) {
//            System.out.println(i);
//        }
//        System.out.println(room);
//
        City<String> city = new City<>("Tokyo");
        Deque<Object> location = new ArrayDeque<>();
        location.add(city.getName());
        location.add("Miami");
        location.add("Los Angeles");
        location.add("Dallas");
        //System.out.println(location.pop());
        location.add("Honolulu");
        location.add("Mexico");
        location.add("Barbados");
        location.add("Las Vegas");
        location.add("Leipzig");
        location.add("Hawaii");
//        System.out.println(location.remove());
//        System.out.println(location);
//        System.out.println(location.poll());
//        System.out.println(location);
       location.push("Berlin");
       location.offer("Hamburg");
        System.out.println(location.poll());//queue
        System.out.println(location);
        System.out.println(location.pop());//deque
        System.out.println(location);
        System.out.println(location.remove());//queue
        location.push(4);
        System.out.println(location);


        //System.out.println(location);
//        System.out.println(location.peek());
//        System.out.println(location.element());
//        System.out.println(location);
//        for (int i = 0; i <= location.size(); i++) {
//            System.out.println("New destination: " + i);
//        }
//        Iterator<Object> place = location.iterator();
//        while (place.hasNext()){
//            Object nation = place.next();
//            System.out.println(nation);
//        }
//
//       for (Object nation : location){
//           System.out.println(nation);
//       }

//        System.out.println(location.poll());
//        System.out.println(location);
//        System.out.println(location.remove());
//        System.out.println(location);


        Map<String, Integer> income = new HashMap<>();
        income.put("Segal", 2300);
        income.put("Connor", 2600);
        income.put("Miller", 3300);
        income.put("Smith", 3900);
        income.put("Morgan", 4600);

//        income.
//        for (String K : income) {
//            System.out.println(K);
//        }
//        for (int i = 0; i <= income.size(); i++) {

//        }
//        System.out.println(income.containsKey("Morgan"));
//        System.out.println(income.get("Smith"));
//        System.out.println(income.remove("Miller"));
//        System.out.println(income.keySet());
//        System.out.println(income.values());
    }
}
