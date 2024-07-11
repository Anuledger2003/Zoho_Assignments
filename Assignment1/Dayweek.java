package assignment1;
import java.util.Scanner;
public class Dayweek{
    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 for Monday \n2 for Tuesday \n3 for Wednesday \n4 for Thursday \n5 for Friday \n6 for Saturday \n7 for Sunday \nEnter a number : ");
        int dayNumber = scanner.nextInt();
        Weekday weekday = getWeekday(dayNumber);

        if (weekday != null) {
            System.out.println("The day of the week is: " + weekday);
        } else {
            System.out.println("Invalid number. Please enter a number between 1 and 7.");
        }
        scanner.close();
    }
public static Weekday getWeekday(int dayNumber) {
switch (dayNumber) {
            case 1:
                return Weekday.MONDAY;
            case 2:
                return Weekday.TUESDAY;
            case 3:
                return Weekday.WEDNESDAY;
            case 4:
                return Weekday.THURSDAY;
            case 5:
                return Weekday.FRIDAY;
            case 6:
                return Weekday.SATURDAY;
            case 7:
                return Weekday.SUNDAY;
            default:
                return null;
        }
    }
}