package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C03JsonParsing {
    public static void main(String[] args)throws IOException {
        // ObjectMapper : jso,
        ObjectMapper o1 = new ObjectMapper();
        // 사용법 1, 객체 생성 : 클래스명 객체명 = o1.readValue(스트링, 클래스명.class);
        Path filePath = Paths.get("C:\\Users\\Playdata\\Desktop\\16기\\java_grammer\\src\\C07ExceptionFileParsing\\myjson1.json");
        String st1 = Files.readString(filePath);
//        Map<String, String> myMap = o1.readValue(st1, Map.class);
//        System.out.println(myMap.get("name"));
//        System.out.println(String.valueOf(myMap.get("id")));
//        System.out.println(myMap);
//
//        Student s1 = o1.readValue(st1, Student.class);
//        System.out.println(s1);

        //사용법 2: 트리구조의 JsonNode 객체명 = o1.readTree(문자열)
        // 복잡한 json 자료구조일 경우 트리구조의 jsonNode를 사용한다.
//        JsonNode jsonNode = o1.readTree(st1);
//        Map<String, String> myMap2 = new HashMap<>();
//        myMap2.put("id",jsonNode.get("id").asText());
//        myMap2.put("name",jsonNode.get("name").asText());
//        myMap2.put("classNumber",jsonNode.get("classNumber").asText());
//        myMap2.put("city",jsonNode.get("city").asText());
//        System.out.println(myMap2);
        Path filePath2 = Paths.get("C:\\Users\\Playdata\\Desktop\\16기\\java_grammer\\src\\C07ExceptionFileParsing\\myjson2.json");
        String st2 = Files.readString(filePath2);
        JsonNode jsonNode1 = o1.readTree(st2);
        System.out.println(jsonNode1);
        List<Student> studentList = new ArrayList<>();
        for(JsonNode node1 : jsonNode1){

               Student s1 =  o1.readValue(node1.toString(), Student.class);

                studentList.add(s1);

        }
        System.out.println(studentList);

        //json 직렬화 객체 -> json 변환 writeValueAsString(객체)

        String returnSt = o1.writeValueAsString(studentList);
        System.out.println(returnSt);
    }
    // 실제 값의 setting은 직접 접근하여 setting(reflection 기술 활용하여 접근)
    // reflection : 런타임시점에서 클래스에 접근할 수 있는 기능. 반드시 getter와 기본생성자는 있어야 함.(objectMapper가 getter로 필드값 추측)
    static class Student{
        private int id;
        private String name;
        private String classNumber;
        private String city;

        public Student(int id, String name, String classNumber, String city) {
            this.id = id;
            this.name = name;
            this.classNumber = classNumber;
            this.city = city;
        }

        public Student() {

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getClassNumber() {
            return classNumber;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", classNumber='" + classNumber + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
