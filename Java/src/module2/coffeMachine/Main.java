package module2.coffeMachine;

public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 1;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        boolean isBlocked = false;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        boolean milkIsEnough = milkAmount >= cappucinoMilkRequired
                || skimmedMilkAmount >= cappucinoMilkRequired;
        boolean coffeIsEnough = coffeeAmount >= cappucinoCoffeeRequired;

        //пример вложенности
        if (isBlocked) {
            System.out.println("Кофе-машина звблокирована");
        } else {
            if (milkIsEnough && milkIsEnough) {
                System.out.println("Кофе готовится");
            } else {
                if (!coffeIsEnough) {
                    System.out.println("Кофе недостаточно");
                }
                if (!milkIsEnough) {
                    System.out.println("Молока недостаточно");
                }
            }
        }
        //пример балее простой для чтения
        if (isBlocked) {
            System.out.println("Кофе-машина звблокирована");
        } else if (milkIsEnough && milkIsEnough) {
            System.out.println("Кофе готовится");
        } else {
            if (!coffeIsEnough) {
                System.out.println("Кофе недостаточно");
            }
            if (!milkIsEnough) {
                System.out.println("Молока недостаточно");
            }
        }

        if (milkAmount >= cappucinoMilkRequired
                || skimmedMilkAmount >= cappucinoMilkRequired
                || lowLactoseMilkAmount >= cappucinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока недостаточно");
        }

        if (!isBlocked && coffeIsEnough && milkIsEnough) {
            System.out.println("Кофе готовится");
        } else {
            System.out.println("Кофе не может быть приготовлено");
        }
    }
}
