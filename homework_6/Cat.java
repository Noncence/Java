package geekbrains.homework_6;

public class Cat extends Animal{
    public Cat(String name, int age, int maxRun, int maxJump, int maxSwim) {
        super(name, age, maxRun, maxJump, maxSwim);
    }

    @Override
    public boolean swim(int b) {
        System.out.print("Cat don`t swim!!! ");
        return false;
    }
}
