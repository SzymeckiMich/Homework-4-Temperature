public class Room {
    private String name;
    private double lenght;
    private double width;
    private double height;
    private double temperature;
    private boolean airConditioner;
    private double temperatureLimit;

    public Room() {
    }

    public Room(String name, double length, double width, double height, double temperature, boolean airConditioner, double temperatureLimit) {
        this.name = name;
        this.lenght = length;
        this.width = width;
        this.height = height;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.temperatureLimit = temperatureLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void setTemperatureLimit(double temperatureLimit) {
        this.temperatureLimit = temperatureLimit;
    }

    public String getName() {
        return name;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public double getTemperatureLimit() {
        return temperatureLimit;
    }

    boolean decreaseTemperature(Room room) {
        double size = room.width * room.height * room.lenght;
        double performance = 40 / size; // 40 meters is a small room and in it the temperature will decrease by 1 degree on one use
        if ((this.airConditioner) && (this.temperature > (this.temperatureLimit + performance))) {
            this.temperature -= 1 * performance;
            return true;
        } else {
            return false;
        }
    }
}
