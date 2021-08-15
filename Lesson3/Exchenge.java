package Lesson3;

public class Exchenge <T>{
    public void exchenge (T[]array, int first, int second){
        T any = array[first];
        array[first] = array[second];
        array[second] = any;
    }
}
