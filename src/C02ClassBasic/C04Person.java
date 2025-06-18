package C02ClassBasic;

public class C04Person {
    // private 접근 제어자는 해당 클래스 내에서만 접근 가능하다.
    // 클래스에서 객체 변수는 일반적으로 변수의 안정성을 위해 private으로 설정한다.
    private String name;
    private String email;
    private int age;
    //메서드는 public 하게 만들어서 의도를 명확히 하여 변수의 안정성을 향상시킨다.
    public void updateName(String name, String email, int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String print(){
        return "이름: "+this.name+ " 이메일 : "+this.email+" 나이 : "+age;
    }

    //객체 메서드들 끼리의 호출은 객체가 만들어져있다는 걸 가정하고 있으므로 문제 없다.
    public String printPerson2(){
        String temp = this.print();
        return temp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
//클래스메서드는 기본적으로 객체 생성을 가정하지 않으므로 클래스 메서드 내에서 객체 메서드를 호출하는 것은 논리적 오류

    public static void printPerson(){
//        String temp = this.print();
    }
}
