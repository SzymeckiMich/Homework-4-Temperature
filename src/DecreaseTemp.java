public class DecreaseTemp {

    void decreasing(Room room) {
        if (room.decreaseTemperature(room)) {
            System.out.format("Temperature in " + room.getName() + " was decreased. Actual temperature: %.2f\n",
                    room.getTemperature());
        } else {
            System.out.println(room.getName() + " does not have an Air Conditioner or limit temperature has been " +
                    "reached");
        }
    }
}
