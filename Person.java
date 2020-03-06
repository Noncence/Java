package geekbrains.lesson_5;

public class Person {

    String name;
    String position;
    String mail;
    String number;
    int salary;
    int age;


    public Person(String name, String position, String mail, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public static void getPersonInfo(Person[] persAray, int i){
        System.out.println("ФИО - " + persAray[i].name + ";\n" + "Должность - " + persAray[i].position + ";\n" +
                "E-mail - " + persAray[i].mail + ";\n" + "Телефон - " + persAray[i].number + ";\n" +
                "Зарплата - " + persAray[i].salary + ";\n" + "Возраст - " + persAray[i].age + ";\n");
    }
    public static void getPersonInfoByAge(Person[] persAray){
        for (Person f : persAray){
    if (f.age > 40) {
        System.out.println("Полное имя: " + f.name + "\n" + "Должность: " + f.position + "\n" + "Электронный адрес: " + f.mail + "\n" +
                "Номер телефона: " + f.number + "\n" + "Зарплата: " + f.salary + "\n" + "Возраст: " + f.age);
        System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Директор","ivanov@company.com",
                "89991111111",90000,55);
        persArray[1] = new Person("Петров Петр Петрович", "Инженер","petrov@company.com",
                "89992222222",40000,33);
        persArray[2] = new Person("Сидоров Сидр Сидрович", "Электрик","sidorov@company.com",
                "89993333333",55000,40);
        persArray[3] = new Person("Хабибулин Хабиб Иванович", "Сторож","habib@company.com",
                "89994444444",15000,48);
        persArray[4] = new Person("Путин Владимир Владимирович", "Дворник","tcar@company.com",
                "89995555555",30000,67);

        getPersonInfo(persArray,1);
        getPersonInfoByAge(persArray);

    }
}
