package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements  MemberService{

    private final MemberRepository memberRepository;

    @Autowired // ac.getBean(MemberRepository.class)코드가 들어가있다고 생각하면 됨
    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


    //테스트 용
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
