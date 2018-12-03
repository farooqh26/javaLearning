public class SecondsToMinutesChallenge {

    private static final String INVALID_VALUE_CHECK = "Invalid Values";
    public static void main(String[] args) {

        System.out.println (getDurationString(3600000));
        System.out.println (getDurationString(-13,9));
    }
    private static String   getDurationString(long minutes, long seconds){
        if((minutes >=0) && (seconds >=0 && seconds <=59)){
            long hours = minutes / 60;
            long remainMinutes = minutes % 60;

            String hoursString = hours + "h";
            if(hours<10){
                hoursString = "0" + hours + "h ";
            }
            String minString = remainMinutes + "m";
            if(remainMinutes<10){
                minString = "0" + remainMinutes + "m ";
            }
            String secString = seconds + "s";
            if(seconds<10){
                secString = "0" + seconds + "s ";
            }
           return hoursString +" " + minString + " " + secString;
        } else {
            return INVALID_VALUE_CHECK;
        }
    }

   private static String getDurationString(long seconds){
        if (seconds >=0){
            long secsToMin = seconds / 60;
            long remainSecs = seconds % 60;
            return getDurationString(secsToMin,remainSecs);
        } else {
            return INVALID_VALUE_CHECK;
        }
    }

}
