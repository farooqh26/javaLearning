public class MinutesToYearsAndDaysCalculator {
    private static final String INVALID_VALUE_CHECK = "Invalid Value";

    public static void main(String[] args) {
        printYearsandDays(3600);

    }
    public static void printYearsandDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_CHECK);
        }
        long MinToYears = minutes / (60*24*365);
        long MinToDays = (minutes % (60*24*365))/(60*24);
        System.out.println(minutes + " min = " + MinToYears + " y and " + MinToDays + " d");
    }
}

