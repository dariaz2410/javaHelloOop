package com.company;

public class Main {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 0.146, 10.49);
        System.out.println("redApple: " + redApple);
        System.out.println("weight: " + redApple.getWeight());

        double d = redApple.price();
        System.out.println("Red apple price: " + redApple.price());

        System.out.println("================================");


        // копия ссылки redApple
        Fruit redApple2 = redApple;

        Fruit greenApple = new Fruit(FruitType.APPLE);
        System.out.println("greenApple: " + greenApple);

        Fruit lemon = new Fruit(FruitType.LEMON);
        System.out.println("lemon: " + lemon);

        Fruit banana = null;
        //banana.setType(FruitType.APPLE);
        System.out.println("banana: " + banana);

        Fruit[] arr = new Fruit[3];
        arr[0] = redApple;
        arr[1] = greenApple;
        arr[2] = lemon;

        printPrice(arr);

    }

    private static void printPrice(Fruit[] arr) {
        double price = 0;
        for (int i = 0; i < arr.length; i++) {
            price += arr[i].price();
        }
        System.out.println("Sum price: " + price);
    }

}
