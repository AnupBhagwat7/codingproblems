package com.interview;

import java.util.*;

class FindFriends{

    /*[ 1  , 2
        2  , 3
        4  , 1
        1 ,  5
            ]*/
    public static void main(String[] args) {

        int[][] inputArr;
        inputArr = new int[][]{{2,3},{4,1},{1,5},{1,2}};

        Map<Integer, Integer> output = new HashMap<>();

        for(int i=0; i<4;i++){

            for(int j=0; j<2;j++){

                if(output.containsKey(inputArr[i][j])){
                    output.put(inputArr[i][j], output.get(inputArr[i][j]) + 1);
                }else{
                    output.put(inputArr[i][j], 1);
                }

            }
        }

        System.out.println(output);

        System.out.println(output.entrySet().stream().findFirst());

        Optional<Map.Entry<Integer, Integer>> output1 =  output.entrySet().stream().findFirst();

        System.out.println(output1.get().getKey());

        List<Integer> friends = new ArrayList<>();

        for(int i=0; i<4;i++){

            boolean found = false;
            for(int j=0; j<2;j++){

                if(inputArr[i][j] == output1.get().getKey()){
                    found = true;
                    if(j ==1){
                        friends.add(inputArr[i][j-1]);
                    }
                }
                if(found && j==0){
                    friends.add(inputArr[i][j+1]);
                }
            }
        }

        System.out.println(friends);
    }

}