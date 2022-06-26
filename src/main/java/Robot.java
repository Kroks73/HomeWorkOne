public class Robot implements Actions {
    private final int maxRunDistance;
    private final int jumpHeight;

    public Robot(int maxRunDistance, int jumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int jump() {
        System.out.printf("прыгнул на высоту %s метров ", jumpHeight);
        return jumpHeight;
    }

    @Override
    public int run() {
        System.out.printf("побежал ");
        return maxRunDistance;
    }
}