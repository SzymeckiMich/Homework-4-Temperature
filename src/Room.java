public class Room {
    String name;
    double measurement;
    double temperature;
    boolean airConditioner;
    double temperatureLimit;

    public Room(String name, double measurement, double temperature, boolean airConditioner, double temperatureLimit) {
        this.name = name;
        this.measurement = measurement;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.temperatureLimit = temperatureLimit;
    }

    boolean decreaseTemperature(Room room) {
        if ((room.airConditioner) && (room.temperature > room.temperatureLimit)) {
            room.temperature--;
            return true;
        } else {
            return false;
        }
    }
}
