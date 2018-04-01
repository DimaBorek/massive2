package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int array = 0;
	int[]arrayRandom = new int[15];
        for (int i = 0; i <arrayRandom.length ; i++) {
            Random rnd = new Random();
            arrayRandom[i] = rnd.nextInt(10);
            System.out.print(arrayRandom[i] + " ");
            if (arrayRandom[i]>0& arrayRandom[i] % 2 == 0) array++;
        }
        System.out.println(" ");
        System.out.print("Четных = "+ array  );
            
        }

}
