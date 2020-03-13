package geekbrains.homework_7;

public class Test {
    public static void main(String[] args) {
       Cat[] cats = {new Cat("Barsik", 20), new Cat("Rizik", 10),
               new Cat("Snezhok", 25), new Cat("Koteika", 5),
               new Cat("Pushok", 8)};

       Plate plate = new Plate(50);
        plate.info();
        System.out.println();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
            System.out.println();
        }

        System.out.println("Итого сытых котов: " + Cat.count + ", голодных: " + (cats.length - Cat.count));
        System.out.println("Наполняем тарелку....");
        plate.setFood(1000);
        plate.info();

    }
}
