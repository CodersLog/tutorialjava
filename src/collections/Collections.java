package collections;

import java.util.*;
import java.util.Arrays;

public class Collections {
    public static void main(String[] args) {

        String[] capitals = new String[5];
        capitals[0] = "Amsterdam";
        capitals[1] = "Paris";
        capitals[2] = "Berlin";
        capitals[3] = "Stockholm";
        capitals[4] = "Washington D.C.";


        List<String> moreCapitals = new ArrayList<>(); // LETS YOU MAKE A ARRAYLIST WHICH IS JUST AN ARRAY AS SEEN BEFORE BUT MORE COMPACT
        moreCapitals.add("Brussel");
        moreCapitals.add("Boedapest");
        moreCapitals.add("Dublin");
        moreCapitals.add("Helsinki");
        moreCapitals.add("Kopenhagen");

        System.out.println("Capitals are: " + Arrays.toString(capitals) + moreCapitals);



        List<Integer> numberOfPeopleInACapital = new ArrayList<>(); // YOU CAN'T USE INT IT MUST BE THE FOLL DATATYPE
        numberOfPeopleInACapital.add(20000);
        numberOfPeopleInACapital.add(40000);
        numberOfPeopleInACapital.add(60000);
        numberOfPeopleInACapital.add(80000);
        numberOfPeopleInACapital.add(100000);

        System.out.println("They have people that vary between: " + numberOfPeopleInACapital + "people");

        Set<String> countriesToVisit = new HashSet<>(); // A SET IS DEFINED AS A COLLECTION THAT CAN NOT HAVE DUPLICATES
        countriesToVisit.add("Netherlands");
        countriesToVisit.add("France");
        countriesToVisit.add("Turkey");
        countriesToVisit.add("Spain");
        countriesToVisit.add("Hungary");
        countriesToVisit.add("Netherlands"); /*THIS WILL NOT BE DISPLAYED IN THE CONSOLE SINCE
                                            WE ALREADY PUT NETHERLANDS IN AND A SET CAN NOT HAVE DUPLICATES*/

        System.out.println(countriesToVisit);
        Map<String, Integer> countryToPopulationMap = new HashMap<>();
        countryToPopulationMap.put("USA", 331000000);
        countryToPopulationMap.put("United Kingdom", 67330000);
        countryToPopulationMap.put("Austria", 8950000);

        System.out.println(countryToPopulationMap.get("USA"));
        System.out.println(countryToPopulationMap.get("Germany"));

        System.out.println(countryToPopulationMap);


        moreCapitals.add("What website hosts most videos in the world?");
        moreCapitals.add("What is the capital of Germany?");
        for(int i = 0; i < moreCapitals.size(); i++) {
            System.out.println(moreCapitals.get(i));
        }

        for(Map.Entry<String, Integer> entry : countryToPopulationMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " | Value = " + entry.getValue());
        }


    }
}
