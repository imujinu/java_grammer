package C01Basic;

public class C06String {
    public static void main(String[] args) {
//          참조 자료형의 비교는 기본적응로 메모리주소값끼리의 비교
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1==str2);

        // WrapperClass : 기본형 타입을 Wrapping한 클래스
        int i1 = 10;
        Integer ig1 = 10;
        System.out.println(i1==ig1);
    }
}
