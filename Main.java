package Seminar_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Barsik"),
                new Dog("Sharik"),
                new Rabbit("Whik"),
                new Cow("Murrka"),
                new Duck("Duck"),
                new Butterfly("Yello"),
                new Fish("Nemo")));
        for (Sayable item : zoopark.getSayAble()){
            System.out.println(item.say());
        }
        System.out.println("                                    ");
        for (Runable item : zoopark.getRunable()){
            System.out.println(item);
        }
        System.out.println("                                    ");
        for (Flyable item : zoopark.getFlyable()){
            System.out.println(item);
        }
        System.out.println("                                    ");
        for (Swimable item : zoopark.getSwimable()){
            System.out.println(item);
        }

        System.out.println(                                  );

        System.out.println(zoopark.getWinner());

        System.out.println(                                  );

        System.out.println(zoopark.getWinnerFLy());

        System.out.println(                                  );

        System.out.println(zoopark.getWinnerSwim());
    }
}
