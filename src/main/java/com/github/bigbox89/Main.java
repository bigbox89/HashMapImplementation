package com.github.bigbox89;

import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Demonstrate put method
        HashMapImplementation<Integer, String> hashMapImplementation = new HashMapImplementation();
        for (int i = 0; i < 4; i++) {
            hashMapImplementation.put(i, Main.getRandomString(10));
        }
        //demonstrate remove method
        System.out.println(" element 0: " + hashMapImplementation.get(0) + " element 1: " + hashMapImplementation.get(1) + " element 2: " + hashMapImplementation.get(2));

        System.out.println("Delete element " + hashMapImplementation.get(1) + "\n");
        hashMapImplementation.remove(1);

        System.out.println(" element 0: " + hashMapImplementation.get(0) + " element 1: " + hashMapImplementation.get(1) + " element 2: " + hashMapImplementation.get(2));

        Iterator iterator = hashMapImplementation.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
