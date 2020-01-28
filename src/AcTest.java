public class AcTest {
    public static void main(String[] args) {
        DecreaseTemp decreaseTemp = new DecreaseTemp();
        Room room1 = new Room("Kitchen", 50, 25, true, 20);
        Room room2 = new Room("Livingroom", 20, 30, false, 10);

        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room2);

    }
}
