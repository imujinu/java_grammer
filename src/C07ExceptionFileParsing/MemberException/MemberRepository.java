package C07ExceptionFileParsing.MemberException;

import com.sun.jdi.request.DuplicateRequestException;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.List;
import java.util.Optional;

//저장소 역할을 하는 계층
public class MemberRepository {
    private List<Member> memberList = new ArrayList<>();
    private static Member loginUser;
    //회원가입
    public void register(Member member){
        checkEmail(member);
        memberList.add(member);
    }
    //회원 상세조회
    public Optional<Member> findById(Long id) {
        return memberList.stream().filter(a->a.getId()==id).findFirst();
    }
    // 회원 목록 조회
    public List<Member> findAll(){
        return memberList;
    }
    public String login(Long id, String password){
        Member member = checkId(id);
        if(member.getPassword().equals(password)){
            loginUser=member;
            return member.getName();
        }
        return null;
    }
    public void checkEmail(Member member){
        memberList.stream().filter(a -> a.getEmail().equals(member)).findFirst();
    }

    public Member checkId(Long id){
        for(Member member1 : memberList){
            if(member1.getId()==id){
                return member1;
            }
        }

        return null;
    }



}
