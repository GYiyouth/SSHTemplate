package tool;

import java.util.regex.Pattern;

/**
 * Created by geyao on 2017/3/2.
 */
public class StringCheck {
    /**
     *利用正则表达式，判断邮箱是否符合标准
     * @param email
     * @return
     */
    public static boolean emailCheck(String email){
        String format = "\\w+@\\w+(\\.\\w+)+"; // 邮箱的格式
        if (email.matches(format))
            return true;
        return false;
    }
    public static boolean phoneCheck(String phone){
        String format = "(\\+\\d{0,2})?1\\d{10}";
        if (phone.matches(format))
            return true;
        return false;
    }
    public static void main(String[] args){
        String phone = "18306213738";
        System.out.println(phoneCheck(phone));
        String email = "gy2016@edu._";
        System.out.println(emailCheck(email));
    }

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
}
