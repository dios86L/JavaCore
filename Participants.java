package Lesson1;

public interface Participants {
    default void thrueObstracle (Obstracle obstracle){
        if (obstracle instanceof Wall){
            Wall wall= (Wall) obstracle;
            this.jump (wall);
        } else if (obstracle instanceof Road){
            Road road = (Road) obstracle;
            this.run(road);
        }
    }
    boolean getStatus();
    void run (Road road);
    void jump (Wall wall);
}
