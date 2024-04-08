public class Dog extends Animal {
    String name;
    static int countDog = 0;

    Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name + " не может пробежать больше 500м!");
        } else {
            System.out.println(name + " пробежал " + range + "м");
        }
    }

    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Собака не может проплыть " + range + "м");
        } else {
            System.out.println(name + " проплыл " + range + "м");
        }
    }

    static int getCountDog() {
        return countDog;
    }
}
