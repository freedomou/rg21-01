package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String[] dir = sc.nextLine().split(" ");
        sc.close();
        File file = new File(dir[0]);
        if(!file.exists()){
            file.mkdirs();
        }
        for(int i = 1; i < dir.length; i++){
            File newFile = new File(dir[i]);
            if(!newFile.exists()){
                newFile.mkdirs();
            }
        }
    }
}