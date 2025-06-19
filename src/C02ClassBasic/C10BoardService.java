package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : id, title, contents, 작성자Email ->(author 객체 가능)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회(id로 조회) : id(post), title, contents, 작성자email(이름으로도 조회)
//        7.서비스 종료
public class C10BoardService {
    static List<Author> authorList;
    static List<Post> postList;
    static Author author;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        authorList = new ArrayList<>();
        postList = new ArrayList<>();

        while(true){
            int order = sc.nextInt();
        sc.nextLine();
        switch(order){
            case 1:
                System.out.println("회원가입을 시작합니다");
                System.out.println("이름, 이메일, 비밀번호를 순서대로 입력해주세요 ");
                String name = sc.nextLine();
                String email = sc.nextLine();
                String password = sc.nextLine();
                authorList.add(new Author(name,email,password));
                System.out.println("회원가입이 완료되었습니다.");
                break;
            case 2:
                System.out.println("회원 전체 목록을 조회합니다.");
                for(Author author : authorList){
                    System.out.println("회원 번호 : " + author.getId());
                    System.out.println("회원 이름 : " + author.getName());
                    System.out.println("회원 이메일 : " + author.getEmail());
                }
                break;
            case 3:
                System.out.println("회원 상세조회를 시작합니다. id를 입력해주세요");
                int id = sc.nextInt();
                sc.nextLine();
                CheckResult checkResult = check(id);
                boolean check = checkResult.getCheck();

                if(check){
                    Author author = checkResult.getAuthor();
                    System.out.println("회원 id: " + author.getId());
                    System.out.println("회원 이름 : " + author.getName());
                    System.out.println("회원 이메일 : "+ author.getEmail());
                    System.out.println("작성글 수 : " + (author.getAuthorPost()!=null?author.getAuthorPost().size() : "0" ));
                }
                else{
                    System.out.println("존재하지 않는 회원입니다.");
                }
                break;
            case 4:
                System.out.println("게시글 작성을 시작합니다.");
                if(author==null){
                    System.out.println("로그인이 필요합니다.");
                    System.out.println("아이디와 비밀번호를 입력해주세요");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    String password2= sc.nextLine();
                    CheckResult checkResult2 = check(id2);
                    if(!checkResult2.getCheck()) {
                        System.out.println("존재하지 않는 회원입니다.");
                        break;
                    }
                    Author author2 = checkResult2.getAuthor();
                    if(password2.equals(author2.getPassword()) ){
                        author = author2;
                        System.out.println("로그인 성공!");
                    }else{
                        System.out.println("비밀번호가 일치하지 않습니다.");
                        break;
                    }
                }

                System.out.println("게시글 제목을 입력해주세요");
                String title = sc.nextLine();
                System.out.println("게시글 내용을 입력해주세요");
                String contents = sc.nextLine();
                Post post1 = new Post(title,contents,author);
                author.getAuthorPost().add(post1);
                System.out.println("게시글 작성이 완료되었습니다.");
                break;
            case 5:
                System.out.println("게시글 목록을 조회합니다.");
                for (Post post : author.getAuthorPost()){
                    System.out.println(post.getId());
                    System.out.println(post.getTitle());
                }
                break;
            case 6:
                System.out.println("게시물 상세 조회를 시작합니다.");
                System.out.println("게시글 번호를 입력해주세요");
                int postNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("작성자 이름을 입력해주세요");
                String authorName = sc.nextLine();
                boolean check3 = false;
                Post searchResult =null;

                for(Author searchAuthor : authorList){
                    if(searchAuthor.getName().equals(authorName)){
                        searchResult = searchAuthor.getAuthorPost().get(postNumber);
                        check3= true;
                    }
                }
                if(check3){
                    System.out.println("게시글 번호 : " + searchResult.getId());
                    System.out.println("게시글 제목 : " + searchResult.getTitle());
                    System.out.println("게시글 내용 : " + searchResult.getContents());
                }else{
                    System.out.println("게시글이 존재하지 않습니다.");
                }

                break;
            case 7:
                System.out.println("서비스를 종료합니다.");
                return;
            case 8:
                System.out.println("로그아웃 하시겠습니까?(Y/N)");
                String answer = sc.nextLine();
                if(answer.equals("Y")){
                    author=null;
                    System.out.println("로그아웃 성공");
                }else{
                    System.out.println("시스템으로 돌아갑니다.");
                }
                break;

        }
        }
    }

    static CheckResult check(int id){
        boolean isCheck = false;
        Author checkAuthor = null;
        for(Author author : authorList){
            int authorId = author.getId();
            if(authorId==id) {
                return new CheckResult(true,author);
            };
        }
        return new CheckResult(false,null);
    }
}
class Author{
    static int authorId;
    private int id;
    private String name;
    private String email;
    private String password;
    private List<Post> authorPost;

    public Author(String name,String email, String password){
        this.id = authorId++;
        this.name =name;
        this.email=email;
        this.password = password;
        this.authorPost = new ArrayList<>();
    }

    public static int getAuthorId() {
        return authorId;
    }

    public static void setAuthorId(int authorId) {
        Author.authorId = authorId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getAuthorPost() {
        return authorPost;
    }

    public void setAuthorPost(List<Post> authorPost) {
        this.authorPost = authorPost;
    }

}

class Post{
    static int postId;
    private int id;
    private String title;
    private String contents;
    private Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    Post(String title, String contents, Author author){
        this.id = postId++;
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public static int getPostId() {
        return postId;
    }

    public static void setPostId(int postId) {
        Post.postId = postId;
    }
}


class CheckResult {
    private boolean Check;
    private Author author;

    public CheckResult(boolean isCheck, Author author) {
        this.Check = isCheck;
        this.author = author;
    }


    public boolean getCheck() {
        return this.Check;
    }

    public Author getAuthor() {
        return this.author;
    }
}
