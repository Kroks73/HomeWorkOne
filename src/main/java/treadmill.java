public class treadmill implements Obstacles {
    private final int maxRunDistance;

    public treadmill(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean doAction(Actions actions) {

        if (actions.run() >= maxRunDistance) {
            System.out.println("и пробежал дистанцию");
            return true;
        } else {
            System.out.println("и не смог пробежать дистанцию");
            return false;
        }
    }
}
