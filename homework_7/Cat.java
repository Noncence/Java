package geekbrains.homework_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;
    public static boolean sat = false;
    public static int count = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = sat;
        this.count = 0;

    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat (Plate p){
        if (p.decreaseFood(appetite)) {sat = true; count++;}
        else sat = false;
    }

    public void info(){
        System.out.println("Кот: " + name +"\n" + "Аппетит: " + appetite + "\n" + "Сытость: " + sat + "\n");
    }
}
