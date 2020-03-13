package geekbrains.homework_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

   public boolean decreaseFood(int n){
        if (n > food) {
            //System.out.println("В тарелке мало еды!");
            return false;
        } else {
        food -= n;
return true;
        }
   }

    public void info(){
        System.out.println("В тарелке: " + food);
    }
}
