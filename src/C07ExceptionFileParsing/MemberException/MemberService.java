package C07ExceptionFileParsing.MemberException;

//핵심로직을 구현하는 계층

import java.util.List;
import java.util.Optional;

public class MemberService {
    private MemberRepository memberRepository;
    public MemberService(){
        this.memberRepository = new MemberRepository();
    }

    public void register(String name, String email, String password){
        //객체를 조립 후 repository를 통해 register
        //이메일이 중복일 경우 예외 발생.
        //비밀번호가 너무 짧은 경우 예외 발생.
        Member member = new Member(name,email,password);
        memberRepository.register(member);

    }
    public Member findById(Long id){
        // Optional 객체에 값이 없을 경우 예외 발생, 있으면 member를 꺼내서 return
       return memberRepository.findById(id).orElseThrow(()->new IllegalArgumentException("존재하지 않는 회원입니다."));
    }

    // 회원 목록 조회
    public List<Member> findAll(){
        return memberRepository.findAll();

    }

    public String login(Long id, String password){
        return Optional.ofNullable(memberRepository.login(id, password)).orElseThrow(()->new IllegalArgumentException("아이디 또는 비밀번호가 일치하지 않습니다."));
    }

}
