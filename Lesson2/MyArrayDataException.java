package Lesson2;

public class MyArrayDataException extends Exception{
    public int i;
    public int j;
    public MyArrayDataException(int i, int j) {
        super();
     this.i = i+1;
     this.j = j+1;
    }
}
