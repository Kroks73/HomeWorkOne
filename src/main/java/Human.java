public class Human implements Actions {
    private final int maxRunDistance;
    private final int jumpHeight;

    public Human(int maxRunDistance, int jumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public int jump() {
        System.out.printf("человек прыгнул на высоту %s метров ", jumpHeight);
        return jumpHeight;
    }

    @Override
    public int run() {
        System.out.printf("человек побежал");
        return maxRunDistance;
    }
}