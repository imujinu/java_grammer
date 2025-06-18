package C02ClassBasic;

public class C07Constructor {
    public static void main(String[] args) {
        Calender calender = new Calender();
        calender.setYear("2025");
        calender.setMonth("06");
        calender.setDay("18");
        String year = calender.getYear();
        String month= calender.getMonth();
        String day = calender.getDay();
        System.out.printf("오늘은 : %s 연도 %s월 %s 일 입니다 ",year,month,day);
        System.out.println(calender);
        //toString이 구현되어 있다면 객체를 곧바로 출력할 수 있다.
    }
}

class Calender{
    private String year;
    private String month;
    private String day;
    public Calender(String year, String month, String day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    //별도 생성자를 추가할 경우, 초기(기본) 생성자는 무시가 되므로, 필요시 별도 생상자를 추가해야 한다.
    public Calender(){};
    @Override
    public String toString() {
        return "Calender{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}