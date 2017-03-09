package log4j;

import org.apache.log4j.*;

/**
 * 删除本文件，会导致lo4j.properties工作异常
 * Created by GR on 2017/2/20.
 */
public class MyDailyRollingFileAppender extends DailyRollingFileAppender{
    public boolean isAsSevereAsThreshold(Priority priority) {
        //只判断相同的范围（层级）
        return this.getThreshold().equals(priority);
    }
}
