public class DecreaseTemp {

    void decreasing(Room room) {
        if (room.decreaseTemperature(room)) {
            System.out.format("Temperature in " + room.name + " was decreased. Actual temperature: %.2f\n", room.temperature);
        } else {
            System.out.println(room.name + " does not have an Air Conditioner or limit temperature has been reached");
        }
    }
}
