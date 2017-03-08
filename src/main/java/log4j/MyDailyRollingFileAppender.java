package log4j;

import org.apache.log4j.*;

/**
 * Created by GR on 2017/2/20.
 */
public class MyDailyRollingFileAppender extends DailyRollingFileAppender{
    public boolean isAsSevereAsThreshold(Priority priority) {
        //只判断相同的范围（层级）
        return this.getThreshold().equals(priority);
    }
}
