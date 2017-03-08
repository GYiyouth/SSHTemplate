package tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by GR on 2017/2/27.
 */
public class Time {

    /**
     * 获取当前时间
     * 格式：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getCurrentTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    public static String getYear(){
        Date date = new Date();
        String year = String.format("%tY", date);
        return year;
    }

    public static String getMonth() {
        Date date = new Date();
        String month = String.format("%tm", date);
        return month;
    }

    public static String getDay() {
        Date date = new Date();
        String day = String.format("%td", date);
        return day;
    }

    public static String getHour() {
        Date date = new Date();
        String hour = String.format("%tH", date);
        return hour;
    }

    public static String getMinute() {
        Date date = new Date();
        String minute = String.format("%tM", date);
        return minute;
    }

    public static String getDateStr() {

        Time time = new Time();
        return (time.getYear()+time.getMonth()+ time.getDay());

    }

    public static Date getDate() {
        return new Date();
    }

    public static String getDeadTime() {
        String year = getYear();
        int deadYear = Integer.parseInt(year) + 10;
        return (deadYear + "-" + getMonth() + "-" + getDay() + " " +  getHour() + ":" + getMinute() + ":" + getSecond());
    }

    public static String getSecond() {
        Date date = new Date();
        String second = String.format("%tS", date);
        return second;
    }

    public static String getTime() {
        return (getYear() + "-" + getMonth() + "-" + getDay() + " " +  getHour() + ":" + getMinute() + ":" + getSecond());
    }

    public static String getGrade(){
        Integer year = Integer.parseInt(getYear());
        int month = Integer.parseInt(getMonth());
        if (month<9)
            year--;
        return year.toString();
    }
}
