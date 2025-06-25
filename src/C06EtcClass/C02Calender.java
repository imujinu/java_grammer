package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calender {
    public static void main(String[] args) {
        // java.util 패키지의 Calender 클래스
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(Calendar.YEAR)); // 년
//        System.out.println(calendar.get(Calendar.MONTH)); // 월
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 요일
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 날짜
//        System.out.println(calendar.get(Calendar.HOUR)); // 12시 체계
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 24시
        // java.time LocalDateTime, LocalDate, LocalTime 클래스

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());

        //get 메서드와 ChronoField 매개변수로 다양한 형식의 날짜/시간 정보 조회 가능.
        System.out.println(localDateTime.get(ChronoField.YEAR));
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY)); // 0: 오전 1: 오후`
        System.out.println(localDateTime.get(ChronoField.HOUR_OF_DAY)); // 0: 오전 1: 오후

//        .of : 특정 시간 정보 객체를 만들어 내고 싶을 때 사용

        LocalDate birthDay = LocalDate.of(21,12,23);
        System.out.println(birthDay);

        LocalDateTime birthDayTime = LocalDateTime.of(2000,12,12,5,4,32);
        System.out.println(birthDayTime);


    }
}
