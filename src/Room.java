public class Room {
    String name;
    double lenght;
    double width;
    double height;
    double temperature;
    boolean airConditioner;
    double temperatureLimit;

    public Room(String name, double length, double width, double height, double temperature, boolean airConditioner, double temperatureLimit) {
        this.name = name;
        this.lenght = length;
        this.width = width;
        this.height = height;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.temperatureLimit = temperatureLimit;
    }

    boolean decreaseTemperature(Room room) {
        double size = room.width * room.height * room.lenght;
        double performance = 40 / size; // 40 meters is a small room and in it the temperature will decrease by 1 degree on one use
        if ((room.airConditioner) && (room.temperature > (room.temperatureLimit + performance))) {
            room.temperature -= 1 * performance;
            return true;
        } else {
            return false;
        }
    }
}
