public class Elevator {
    private final int minFloor;
    private final int maxFloor;
    private int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Ошибочный этаж");
            return;
        }
        while (currentFloor < floor) {
            moveUp();
            System.out.println("Текущий этаж: " + currentFloor);
        }
        while (currentFloor > floor) {
            moveDown();
            System.out.println("Текущий этаж: " + currentFloor);
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
