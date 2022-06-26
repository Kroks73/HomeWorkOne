public class Cat implements Actions {
    private final int maxRunDistance;
    private final int jumpHeight;

    public Cat(int maxRunDistance, int jumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int jump() {
        System.out.printf("Кот прыгнул на высоту %s метров ", jumpHeight);
        return jumpHeight;
    }

    @Override
    public int run() {
        System.out.print("побежал");
        return maxRunDistance;
    }
}
