package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        Integer[] arr = {3,15,8,6};
        Exchenge<Integer> integerExchenge = new Exchenge<>();
        integerExchenge.exchenge(arr,2,3);

        for (Integer i : arr) {
            System.out.print(i + " ");
        }

        Box<Apple> appleBox = new Box(new ArrayList<>(Arrays.asList(new Apple(),new Apple(),new Apple(),new Apple(),new Apple(),new Apple(),new Apple())));
        Box<Apple> newAppleBox = new Box<>();
        Box<Orange> orangeBox = new Box(new ArrayList<>(Arrays.asList(new Orange(),new Orange(),new Orange(),new Orange(),new Orange(),new Orange(),new Orange(),new Orange(),new Orange())));
        Box<Orange> newOrangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(),new Orange())));

        System.out.println("Apple box: "+ appleBox);
        System.out.println("New apple box: "+ newAppleBox);
        System.out.println("Orange box: "+orangeBox);
        System.out.println("New orange box: "+newOrangeBox);

        appleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple())));
        appleBox.toAnotherBox(newAppleBox);

        System.out.println("New apple box weight: "+newAppleBox.getWeight());
        System.out.println("Orange box weight: "+orangeBox.getWeight());
        System.out.println(newAppleBox.compare(orangeBox));

        newAppleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(),new Apple())));
        orangeBox.addFruits(new ArrayList<>(Arrays.asList(new Orange(),new Orange())));

        System.out.println("New apple box weight: "+newAppleBox.getWeight());
        System.out.println("Orange box weight: "+orangeBox.getWeight());

        newOrangeBox.toAnotherBox(orangeBox);

        System.out.println("Orange box weight: "+orangeBox.getWeight());
        System.out.println("Apple box: "+ appleBox);
        System.out.println("New apple box: "+ newAppleBox);
        System.out.println("Orange box: "+ orangeBox);
        System.out.println("New orange box: "+ newOrangeBox);


    }
}
