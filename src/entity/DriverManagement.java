package entity;

import java.io.Serializable;
import java.util.Map;

public class DriverManagement implements Serializable {

    private Driver driver;
    private Map<BusLine, Integer> busLines;
    private int totalRound;

    public DriverManagement() {

    }

    public DriverManagement(Driver driver, Map<BusLine, Integer> busLines, int totalRound) {
        this.driver = driver;
        this.busLines = busLines;
        this.totalRound = totalRound;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Map<BusLine, Integer> getBusLines() {
        return busLines;
    }

    public void setBusLines(Map<BusLine, Integer> busLines) {
        this.busLines = busLines;
    }

    public int getTotalRound() {
        return totalRound;
    }

    public void setTotalRound(int totalRound) {
        this.totalRound = totalRound;
    }

    @Override
    public String toString() {
        return "DiverManagement{" +
                "driver=" + driver +
                ", busLines=" + busLines +
                ", totalRound=" + totalRound +
                '}';
    }


}
