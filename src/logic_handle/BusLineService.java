package logic_handle;

import entity.BusLine;
import main.MainRun;
import util.FileUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BusLineService {
    public static final String BUS_LINE_FILE_NAME = "bus_line.dat";

    public static boolean isEmptyBusLine() {
        return MainRun.BUS_LINE.isEmpty();
    }

    public static void createNewBusLine() {
        System.out.print("Bạn muốn nhập thêm mấy tuyến xe mới: ");
        int newBusLineNumber = 0;
        do {
            try {
                newBusLineNumber = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ex) {
                System.out.print("Số lượng tuyến mới phải là số nguyên, yêu cầu nhập lại: ");
                continue;
            }
            if (newBusLineNumber > 0) {
                break;
            }
            System.out.print("Số lượng tuyến mới KHÔNG được là số âm, yêu cầu nhập lại: ");
        } while (true);
        for (int i = 0; i < newBusLineNumber; i++) {
            BusLine busLine = new BusLine();
            busLine.inputNewData();
            MainRun.BUS_LINE.add(busLine);
        }


        FileUtil.writeDataToFile(MainRun.BUS_LINE, BUS_LINE_FILE_NAME);
    }

    public static void showBusLine() {
        MainRun.BUS_LINE.forEach(System.out::println);
    }

    public static BusLine findById(int busLineId) {
        return MainRun.BUS_LINE
                .stream()
                .filter(driver -> driver.getId() == busLineId)
                .findFirst()
                .orElse(null);
    }
}