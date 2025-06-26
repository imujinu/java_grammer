package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.Scanner;

//사용자의 입출력을 받아 처리하는 계층
public class MemberController {
    private MemberService memberService;
    public static void main(String[] args) {
        MemberController controller = new MemberController();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("서비스를 시작합니다.");
            System.out.println("===== 1. 회원가입 // 2.회원 상세 조회 // 3. 회원 전체 조회 // 4. 로그인 // 5. 프로그램 종료 =====");
            System.out.println("원하는 서비스 번호를 입력해주세요");
            int N = Integer.parseInt(sc.nextLine());
            if(N==1){
                System.out.println("1.회원가입을 시작합니다.");
                System.out.println("이름과 이메일 패스워드를 입력해주세요");
                String name = sc.nextLine();
                String email = sc.nextLine();
                String password = sc.nextLine();
                if(password.length()<6){
                    throw new Exception.InvalidPasswordException("비밀번호는 6글자 이상입니다.");
                }
                try{
                controller.memberService.register(name,email,password);
                    System.out.println("회원가입에 성공하였습니다.");
                }catch (Exception.DuplicateEmailException e){
                    System.out.println(e.getMessage());
                    System.out.println("회원가입에 실패하였습니다.");
                }

            }
            if(N==2){
                System.out.println("2.회원 상세 조회를 시작합니다.");
                System.out.println("찾고자 하는 회원의 id를 입력해주세요");
                Long id = Long.parseLong(sc.nextLine());
                Member member=null;
                try{
                member = controller.memberService.findById(id);
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Id:" + member.getId());
                System.out.println("이름:" +member.getName());
                System.out.println("이메일:" +member.getEmail());
                System.out.println("회원 상세 조회 완료");
            }
            if(N==3){
                System.out.println("3. 회원 전체 목록을 조회합니다.");
                List<Member> list = controller.memberService.findAll();
                if(list.isEmpty()){
                    System.out.println("회원 목록이 존재하지 않습니다.");
                }
                else{

                for(Member member:list){
                    System.out.println("회원명 : " + member.getName());
                }
                }
                System.out.println("회원 전체 조회 완료");
            }
            if(N==4){
                System.out.println("4. 로그인 하시겠습니까?");
                System.out.println("아이디와 비밀번호를 입력해주세요");
                Long id = Long.parseLong(sc.nextLine());
                String password = sc.nextLine();
                String name = "";
                try{
                name = controller.memberService.login(id,password);
                System.out.println("환영합니다 "+name+"님");

                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
            if(N==5){
                System.out.println("프로그램을 종료합니다.");
                return;
            }

        }

    }

    public MemberController(){
        this.memberService = new MemberService();
    }




}
