import java.util.Scanner;

public class SwitchExercisesRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(determineNameOfDay(5));
    }

    public static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber){
            case 0 : return "Sunday";
            case 1 : return "Monday";
            case 2 : return "Tuesday";
            case 3 : return "Wednesday";
            case 4 : return "Thursday";
            case 5 : return"Friday";
            case 6 : return"Saturday";
        }
        return "Invalid";
    }
}


