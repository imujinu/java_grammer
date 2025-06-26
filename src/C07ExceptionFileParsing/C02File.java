package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C02File {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);
        //파일에서 읽기 : IO 패키지
//        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Playdata\\Desktop\\16기\\java_grammer\\src\\C07ExceptionFileParsing\\test.txt"));
//        String line = br2.readLine();
//        while(line!=null){
//            System.out.println(line);
//            line = br2.readLine();
//        }
        // 파일에서 읽기 : NIO 패키지



        // readString : 문자열 전체를 통째로 read

        //readAllLines : 문자열을 라인별ㄹ split하여 list형태로 저장
//        String st1 = Files.readString(filePath);
//        List<String> st2 = Files.readAllLines(filePath);
//        System.out.println(st2);

        Path filePath = Paths.get("C:\\Users\\Playdata\\Desktop\\16기\\java_grammer\\src\\C07ExceptionFileParsing\\test.txt");
        Files.write(filePath, "홍길동0".getBytes(), StandardOpenOption.CREATE_NEW); // tofh dlqfur
        Files.write(filePath, "홍길동1".getBytes(), StandardOpenOption.WRITE); // 덮어쓰기
        Files.write(filePath, "홍길동1".getBytes(), StandardOpenOption.APPEND); // 추가
        System.out.println(filePath);
    }
}
