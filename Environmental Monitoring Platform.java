import java.util.Random;

// Class to represent environmental data
class EnvironmentalData {
    private double temperature;
    private double humidity;
    private double airQuality;

    // Constructor
    public EnvironmentalData(double temperature, double humidity, double airQuality) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airQuality = airQuality;
    }

    // Getters
    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getAirQuality() {
        return airQuality;
    }

    // Method to print environmental data
    public void printData() {
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + " %");
        System.out.println("Air Quality: " + airQuality);
    }
}

// Class to simulate environmental sensor
class EnvironmentalSensor {
    // Method to generate random environmental data
    public EnvironmentalData generateData() {
        Random rand = new Random();
        double temperature = 15 + rand.nextDouble() * 15; // Range: 15°C to 30°C
        double humidity = 40 + rand.nextDouble() * 40; // Range: 40% to 80%
        double airQuality = 0 + rand.nextDouble() * 100; // Range: 0 to 100
        return new EnvironmentalData(temperature, humidity, airQuality);
    }
}

public class EnvironmentalMonitoringPlatform {
    public static void main(String[] args) {
        EnvironmentalSensor sensor = new EnvironmentalSensor();
        EnvironmentalData data = sensor.generateData();

        System.out.println("Environmental Data:");
        data.printData();
    }
}
