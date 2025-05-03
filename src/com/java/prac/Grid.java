package com.java.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {
    public static String gridChallenge(List<String> grid) {
        for(String s:grid){
            char[] strArray=s.toCharArray();
            Arrays.sort(strArray);
        }
         for(int i=0; i<grid.get(0).length();i++){
             for(int j=1; j<grid.size();j++){
                 if(grid.get(j).charAt(i)<grid.get(j-1).charAt(i)){
                     return "NO";
                 }
             }
         }
        return "YES";
    }
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("ebacd");
        grid.add("fghij");
        grid.add("olmkn");
        grid.add("trpqs");
        grid.add("xywuv");

        System.out.println(gridChallenge(grid)); // Output should be "YES"
    }
}

