package geekbrains.homework_6;

public class Test {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Vaska", 6, 100,3,0);
        Animal dog1 = new Dog("Sharik", 5, 400, 1, 3);


        System.out.println(cat1.run(200));
        System.out.println(cat1.swim(7));
        System.out.println(cat1.jump(2));

        System.out.println(dog1.run(300));
        System.out.println(dog1.swim(2));
        System.out.println(dog1.jump(4));


    }
}
