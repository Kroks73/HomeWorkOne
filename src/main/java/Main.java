import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Actions human = new Human(400, 1);
        Actions robot = new Robot(200,3);
        Actions cat = new Cat(500, 2);


        Actions[] actions = {cat, robot, human};
        Random random = new Random();
        Obstacles wall = new Wall(random.nextInt(5));
        Obstacles threadmill = new treadmill(random.nextInt(500));

        Obstacles[] obstacles = {wall, threadmill};



        for (int i = 0; i < actions.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                boolean result = obstacles[j].doAction(actions[i]);
                if(!result) {
                    break;
                }

            }

        }

    }


}

