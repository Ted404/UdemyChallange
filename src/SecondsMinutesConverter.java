public class SecondsMinutesConverter {

    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>59){
            return "Invalid Value";
        }
        int hour = minutes/60;
        int minute = minutes%60;

        return (String)(hour + "h " + minute + "m " + seconds + "s");
    }

    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid Value";
        }
        int minutes = seconds/60;
        int second = seconds%60;

        return getDurationString(minutes, second);
    }
}
