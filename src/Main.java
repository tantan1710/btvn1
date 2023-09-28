import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String name = scanner.nextLine();
        System.out.println("Tên hàng nhập kho của bạn là: " + name);

        System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
        String dateDate = scanner.nextLine();
        LocalDate lcd = LocalDate.parse(dateDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Ngày tháng năm sinh của bạn là: " + lcd);

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Mời bạn nhập thời gian nhập hàng: ");
        String timeString = scanner2.nextLine();
        LocalDateTime lcd2 = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Thời gian nhập hàng là: " + lcd2);

        Scanner scanner3 = new Scanner(System.in);


        System.out.println("Mời bạn nhập thời gian");
        String dateTime = scanner3.nextLine();
        LocalTime lcd3 = LocalTime.parse(dateTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Thời gian của bạn là: " + lcd3);










    }
}
