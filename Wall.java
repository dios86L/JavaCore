package Lesson1;

public class Wall implements Obstracle{
    public final int height;

   public Wall(int height){
        this.height=height;
   }
   @Override
    public String toString(){
       return String.format("Стена высотой: %d", height);
   }

}
