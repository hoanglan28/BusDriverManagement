package entity;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Serializable;

public class BusLine implements AutoIdIncreasable, Serializable, NewDataCreatable {

    private static int AUTO_ID = 100;

    private int id;
    private float distance;
    private int stopStationNumber;

    public BusLine() {
        this.increaseId();
    }

    public BusLine(float distance, int stopStationNumber) {
        this.distance = distance;
        this.stopStationNumber = stopStationNumber;
        this.increaseId();
    }

    @Override
    public final void increaseId() {
        this.id = AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getStopStationNumber() {
        return stopStationNumber;
    }

    public void setStopStationNumber(int stopStationNumber) {
        this.stopStationNumber = stopStationNumber;
    }

    public void inputNewData(){
        System.out.println("Nhập khoảng cách của tuyến xe: ");
        float distance = 0;
        do {
            try {
                distance = new Scanner(System.in).nextFloat();
            } catch (InputMismatchException ex) {
                System.out.println("khoảng cách phải là số nguyên, yêu cầu nhập lại: ");
                continue;
            }
            if (distance > 0){
                this.setDistance(distance);
                break;
            }
            System.out.println("Khoảng cách của tuyến mới không được là số âm, yêu cầu nhập lại");
        } while (true);

        System.out.println("Nhập số điểm dừng của tuyến xe: ");
        int stopStationNumber = 0;
        do {
            try {
                stopStationNumber = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Số điểm dừng của tuyến phải là số nguyên, yêu cầu nhập lại");
                continue;
            }
            if (stopStationNumber > 0) {
                this.setStopStationNumber(stopStationNumber);
                break;
            }
            System.out.println("Số điểm dừng của tuyến mới không được là số âm, xin mời nhập lại");
        } while (true);
    }
}
