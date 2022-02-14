package module3.SwimmingPool;

public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;

        int swimmingPool = 0;
        int minute = 0;

        while (true) {
            swimmingPool += fillingSpeed;
            swimmingPool-= devastationSpeed;
            minute++;
            if (swimmingPool == volume) {
                break;
            }
        }
        System.out.println("Бассейн заполнился за " + minute + " минут");

    }
}
