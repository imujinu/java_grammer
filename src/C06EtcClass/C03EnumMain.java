package C06EtcClass;

public class C03EnumMain {
    public static void main(String[] args) {

        Student s1 = new Student("hong",ClassGrade.FIRST_GRADE);
        Student s2 = new Student("hong",ClassGrade.SECOND_GRADE);
        Student s3 = new Student("hong",ClassGrade.THIRD_GRADE);
        //enum에는 생성순서대로 index값을 갖고 있다.
        System.out.println(s1.getClassGrade().ordinal());
    }
}

class Student{
    private String name;
    private ClassGrade classGrade;

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    //classGrade를 일반 문자열로 세팅할 경우 -> 정해진 문자열이 아닌, 개별적으로 생성된 문자열 삽입
    //static final을 통해 변수값 관리하는 방법 => 타입이 String이므로 얼마든지 자유롭게 세팅이 가능한 문제점 존재
    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classGrade=" + classGrade +
                '}';
    }
}

enum ClassGrade{
    FIRST_GRADE,
    SECOND_GRADE,
    THIRD_GRADE;


}