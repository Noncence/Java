package geekbrains.homework_6;

abstract public class Animal {
    String name;
    int age;
    int maxRun;
    int maxSwim;
    int maxJump;

    public Animal(String name, int age, int maxRun, int maxJump, int maxSwim) {
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }


    public boolean run(int distance){
        return maxRun > distance ? true : false;
    }

    public boolean swim(int distance){
        return maxSwim > distance ? true : false;
    }

    public boolean jump(int height){
        return maxJump > height ? true : false;
    }


}
