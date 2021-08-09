package Lesson1;

public class Road implements Obstracle{
    public   final int length;

    public Road(int length){
        this.length = length;
    }
    @Override
    public String toString(){
        return String.format("Дорожка длинной: %d", length);
    }

}
