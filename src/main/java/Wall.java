public class Wall implements Obstacles {
    private final int jumpHeight;

    public Wall(int jumpHeight) {
        this.jumpHeight = jumpHeight;

    }

    @Override
    public boolean doAction (Actions actions) {
        if (actions.jump() >= jumpHeight) {
            System.out.println("перепрыгнул стену");
            return true;
        } else {
            System.out.println("не смог перепрыгнуть стену");
            return false;
        }
    }
}

