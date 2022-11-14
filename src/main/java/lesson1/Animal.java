package lesson1;

public abstract class Animal implements Competitor {
    protected String type;
    protected String name;

    protected int maxRunDistance;
    protected int maxJumpHeight;

    protected boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " отлично справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не смог справиться с кроссом и сошел с дистанции");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " отлично перепрыгнул через стену");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть через стену и сошел с дистанции");
            onDistance = false;
        }
    }

    @Override
    public void result() {

        System.out.println(type + " " + name + ": " + onDistance);
    }
}