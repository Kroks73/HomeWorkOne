public class Wall implements Obstacles {
    private final int jumpHeight;

    public Wall(int jumpHeight) {
        this.jumpHeight = jumpHeight;

    }

    @Override
    public boolean doAction (Actions actions) {
        if (actions.jump() >= jumpHeight) {
            System.out.println("и перепрыгнул стену");
            return true;
        } else {
            System.out.println("и не смог перепрыгнуть стену");
            return false;
        }
    }
}

