package C07ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
        // 일반적인 예외 처리 : 예외가 발생시에 프로그램이 종료되지 않도록
//        System.out.println("나눗셈 프로그램입니다.");
//        Scanner sc = new Scanner(System.in);
//        //예외가 발생할 것으로 예상되는 코드를 try로 감싼다.
//        try{
//
//        System.out.println("분자를 입력해주세요");
//        int head = Integer.parseInt(sc.nextLine());
//        System.out.println("분모를 입력해주세요");
//        int tail = Integer.parseInt(sc.nextLine());
//        int result=head/tail;
//        System.out.println("두 수를 나눈 결과 값은" + result);
//        // catch를 통해 예상되는 예외클래스를 분기처리한다.
//        }catch (ArithmeticException e){
//            System.out.println("숫자 에러");
//            e.printStackTrace(); // 시스템 로그를 기록
//        }catch (NumberFormatException e){
//            System.out.println("포맷 에러");
//            e.printStackTrace();
//        }catch (Exception e){
//            //Exception은 모든 에러의 조상
//            System.out.println("예상치 못한 에러가 발생했습니다.");
//            e.printStackTrace();
//        }finally {
//            System.out.println("프로그램 종료");
//        }
        // 의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지.
//        System.out.println("로그인을 위한 비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
////        login(input);
//        System.out.println("환영합니다.");
//        try{
//        login2(input);
//
//        }catch (SQLException e ){
//            e.printStackTrace();
//        }
//
        String result= null;
        try {
        result =fileRead("C:\\Users\\Playdata\\Desktop\\16기\\java_grammer\\src\\C07ExceptionFileParsing\\test.txt");

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(result);

    }

    //throws 키워드를 통해 예외를 위임한다.
    //다만, unchecked 예외에서는 예외처리가 강제가 아니므로,throws가 큰 의미는 없음.
    // 그러나 checked에서는 예외처리가 강제되므로, throws가 의미가 있음
    static boolean login(String password) throws IllegalArgumentException, NoSuchElementException{
        if(password=="1234")
            return true;
        else if(password == null){
            //예외를 발생시켜 해당 메서드 강제 종료
            // 예외는 해당 메서드를 호출한 곳으로 전파된다.
            throw new IllegalArgumentException("비밀번호를 잘못 입력하셨습니다.");
        } else{
            throw new NoSuchElementException("예상치 못한 예외가 발생했습니다.");
        }



    } static boolean login2(String password) throws SQLException{
        if(password.equals("1234"))
            return true;
        else {
            //checked exception 은 예외처리가 강제
            // 해당 메서드 내에 처리하든 throws를 통해 던져주어야함.
            throw new SQLException();


        }

    }
    static String fileRead(String path) throws RuntimeException {
        Path filePath = Paths.get(path);
        // checked Exception의 경우 예외처리가 강제
        // 방법 1. checked를 try catch한 이후에 unchecked예외를 다시 throw
        String text = null;
        try{

        text = Files.readString(filePath);
        } catch (IOException e) {
            //보통은 코드 중지 목적으로 unchecked exception 다시 throw
            throw new RuntimeException(e);
        }
        //방법 2. 현재 메서드를 호출하는 쪽으로 예외를 위임(throws)
//        String text = Files.readString(filePath);
        return text;
    }
}
