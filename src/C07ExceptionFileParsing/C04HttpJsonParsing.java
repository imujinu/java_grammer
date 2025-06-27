package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C04HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
        //외부데이터(api)요청 : 서버간의 통ㅊ신
        //RestTemplate, RestClient : 스프링에서 갖아 많이 사용하는 라이브러리
        // HttpClient 는 자바의 내장클래스로서 별도의 역직렬화, 직렬화 작업이 필요.
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();

        ObjectMapper o1 = new ObjectMapper();

        List<Board> boardList = new ArrayList<>();
        JsonNode jsonNode = o1.readTree(postString);

        for(JsonNode jsonNode1 : jsonNode){
            boardList.add(o1.readValue(jsonNode1.toString(), Board.class));
        }

        System.out.println(boardList);



    }

    }
    class Board{
        private int userId;
        private int id;
        private String title;
        private String body;

        public Board(int userId, int id, String title, String body) {
            this.userId = userId;
            this.id = id;
            this.title = title;
            this.body = body;
        }



        public Board(){

        }
        public int getUserId() {
            return userId;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getBody() {
            return body;
        }

        @Override
        public String toString() {
            return "Board{" +
                    "userId=" + userId +
                    ", id=" + id +
                    ", title='" + title + '\'' +
                    ", body='" + body + '\'' +
                    '}';
        }
}
