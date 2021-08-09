package Lesson1;

public class Robot implements Participants {
    public boolean lost;
    private final String name;
    private  final int Maxrun;
    private  final int Maxjump;

    public Robot (String name, int Maxrun, int Maxjump) {
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
            System.out.printf("Робот"+ name+ "прошёл препятствие - %s\n", road);
        } else {
            System.out.printf("Робот"+ name+ " не прошёл препятствие - %s\n", road);
            lost = true;
        }

    }
    @Override
    public void jump(Wall wall){
        if (wall.height <= Maxjump){
            System.out.printf("Робот"+ name+ " прошёл препятствие - %s\n", wall);
        } else {
            System.out.printf("Робот"+ name+ " не прошёл препятствие - %s\n", wall);
            lost = true;
        }
    }
}
