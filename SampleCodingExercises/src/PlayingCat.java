public class PlayingCat {
    public static void main(String[] args) {

        isCatPlaying(true,10);
    }
    public static boolean  isCatPlaying(boolean summer, int temperature){
        if (temperature>=25 && temperature<=35){
            return true;
        } else if(summer && (temperature>=25 && temperature<=45)){
            return true;
        }
        return false;
    }
}
