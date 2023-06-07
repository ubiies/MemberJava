package hello.core.member;

// 구현체가 하나만 있을 경우에는 인터페이스 이름+Impl
public class MemberServiceImpl implements MemberService {
    // 가입을 하고 회원을 찾기 위해서는 MemberRepository 인터페이스가 필요함
    // 추상화에도 의존, 구체화에도 의존 -> DIP 위반
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findByID(memberId);
    }
}
