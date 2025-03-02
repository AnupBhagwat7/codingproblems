package com.strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacters {

    public static void main(String[] args) {

        String s = "andhdvdbsabsbsababaaa";

        countDuplicateCharacters(s);
    }

    private static void countDuplicateCharacters(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(char c:s.toCharArray()){
            /*if(map.get(c) != null){
                System.out.println(c);
            }else{*/
                if(map.get(c) == null){
                    map.put(c,1);
                }else{
                    map.put(c,map.get(c)+1);
                }
            //}
        }
        map.entrySet().stream().filter(m -> m.getValue()>1).
                forEach(characterIntegerEntry -> System.out.println(characterIntegerEntry.getKey()));

        System.out.println(map);

        LinkedHashMap map1 = map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
                //.entrySet().stream().forEach(characterIntegerEntry -> System.out.println(characterIntegerEntry.getKey()));

        System.out.println(map1);

        map1.entrySet().stream().forEach(System.out::println);

        String x ="Book";
        String y ="Book";
        String z ="Book";

        x= "Cook";

        System.out.println(x.hashCode()+" "+y.hashCode()+" "+z.hashCode());
    }
}
