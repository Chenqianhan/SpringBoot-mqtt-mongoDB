package com.example.recorder;

import org.springframework.context.annotation.Bean;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.stereotype.Component;

@Component
public class GenerateSequenceUtil {

    /** .log */
    //private static final Logger logger = Logger.getLogger(GenerateSequenceUtil.class);

    /** The FieldPosition. */
    private static final FieldPosition HELPER_POSITION = new FieldPosition(0);

    /** This Format for format the data to special format. */
    //private final static Format dateFormat = new SimpleDateFormat("MMddHHmmssS");
    private final static SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMddHHmmss");

    /** This Format for format the number to special format. */
    private final static NumberFormat numberFormat = new DecimalFormat("00");

    /** This int is the sequence number ,the default value is 0. */
    private static int seq = 0;
//每秒20个id应该顶天了把。。。。
    private static final int MAX = 20;

    /**
     * 时间格式生成序列
     * @return String
     */
    @Bean
    public static synchronized String generateSequenceNo() {

        Calendar rightNow = Calendar.getInstance();

        StringBuffer sb = new StringBuffer();

        dateFormat.format(rightNow.getTime(), sb, HELPER_POSITION);

        numberFormat.format(seq, sb, HELPER_POSITION);

        if (seq == MAX) {
            seq = 0;
        } else {
            seq++;
        }

        //logger.info("THE SQUENCE IS :" + sb.toString());

        return sb.toString();
    }
}