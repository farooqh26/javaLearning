public class BarkingDog {
    public static void main(String[] args) {

        boolean dog = bark(true, 1);
        System.out.println(dog);

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking){
            if (hourOfDay < 0 || hourOfDay > 24){
                return false;
        }
        else if (hourOfDay < 8 || hourOfDay > 22){
            return true;
        }
        }
        return false;
    }
}