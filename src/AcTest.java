public class AcTest {
    public static void main(String[] args) {
        DecreaseTemp decreaseTemp = new DecreaseTemp();
        Room room1 = new Room("Kitchen", 4, 4, 5, 23, true, 20);
        Room room2 = new Room("Livingroom", 5, 6, 7, 22, true, 20);
        Room room3 = new Room("Garage", 7, 7, 7, 25, false, 15);

        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);
        decreaseTemp.decreasing(room1);

        decreaseTemp.decreasing(room2);
        decreaseTemp.decreasing(room2);
        

        decreaseTemp.decreasing(room3);
    }
}
