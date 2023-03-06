package com.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {

    public static String LongestWord(String sen) {
        // code goes here

        String[] words = sen.split(" ");

        //System.out.println(words);
        return findLengthOfWord(words);

        //return words[0];
    }

    public static String findLengthOfWord(String[] words){

        Map<String,Integer> countWordsLength = new LinkedHashMap<>();

        for(int i=0;i<words.length ;i++){
            int count =0;
            boolean punctuationFlag = false;
            for(int j=0;j<words[i].length();j++){

                if(words[i].charAt(j) == '!' || words[i].charAt(j) == ',' || words[i].charAt(j) ==     ';' || words[i].charAt(j) == '.'  || words[i].charAt(j) == '?' || words[i].charAt(j) == '-' || words[i].charAt(j) == '\'' || words[i].charAt(j) ==   '\"' || words[i].charAt(j) == ':'){
                    punctuationFlag = true;
                    break;
                }
                count++;
            }

            if(!punctuationFlag){
                countWordsLength.put(words[i], count);
            }

        }
        System.out.println(countWordsLength);

        LinkedHashMap<String,Integer> output = countWordsLength.entrySet().stream().sorted((i1,i2) -> i2.getValue().compareTo(i1.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(output.keySet().stream().findFirst().get());
        return output.keySet().stream().findFirst().get();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(LongestWord(s.nextLine()));

        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());
        Thread t4 = new Thread(new MyRunnable());
        Thread t5 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        //int sum = Stream.iterate(new int[] {0,1},
        //        int sum = Stream.iterate()


    }

}

class MyRunnable implements Runnable{

    int x = 0;
    @Override
    public void run() {
        for(int i=0;i<10000000;i++){
            x = x +1;
            System.out.println(x + "" + Thread.currentThread().getName());
        }


    }
}

class Constructor{

    static String a ;

    Constructor(){
        System.out.println("Test");
        a = "Test Const";
    }

    int add(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        /*Constructor c = new Constructor();
        System.out.println(a);

        Constructor c1 = new Constructor();
        System.out.println(a);

        short a = 9;
        System.out.println(c.add(a,3));*/

        try{
            badMethod();
            System.out.println("A");
        }
        catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");

    }

    private static void badMethod() {
    }
}