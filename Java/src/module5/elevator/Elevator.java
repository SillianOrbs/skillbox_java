package module5.elevator;

public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        //так как 0го этажа нет
        if (currentFloor == 1) {
            currentFloor -= 2;
        } else {
            currentFloor--;
        }
    }

    public void moveUp() {
        //так как 0го этажа нет
        if (currentFloor == -1) {
            currentFloor += 2;
        } else {
            currentFloor++;
        }
    }

    public void move(int floor) {
        if (floor < minFloor) {
            System.out.println("Нижний этаж " + minFloor + ",невозможно проехать на " + floor);
        } else if (floor > maxFloor) {
            System.out.println("Последний этаж " + maxFloor + ",невозможно проехать на " + floor);
        } else {
            while (floor != getCurrentFloor()) {
                if (floor < getCurrentFloor()) {
                    moveDown();
                } else {
                    moveUp();
                }
                System.out.println("Этаж " + getCurrentFloor());
            }
        }
    }
}
