package Lesson1;

public class Man implements Participants {
    public boolean lost;
    private final String name;
    private  final int Maxrun;
    private  final int Maxjump;

   public Man (String name, int Maxrun, int Maxjump) {
       this.name = name;
       this.Maxrun = Maxrun;
       this.Maxjump = Maxjump;
   }
    @Override
    public boolean getStatus () {
        return this.lost;
    }
    @Override
    public void run(Road road){
        if (road.length <= Maxrun){
            System.out.printf("Человек"+ name+ " прошёл препятствие - %s\n", road);
        } else {
            System.out.printf("Человек"+ name+ " не прошёл препятствие - %s\n", road);
            lost = true;
        }

    }
    @Override
    public void jump(Wall wall){
        if (wall.height <= Maxjump){
            System.out.printf("Человек"+ name+ " прошёл препятствие - %s\n", wall);
        } else {
            System.out.printf("Человек"+ name+ " не прошёл препятствие - %s\n", wall);
            lost = true;
        }
    }
}
