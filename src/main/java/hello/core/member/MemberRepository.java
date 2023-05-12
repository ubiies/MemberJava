package hello.core.member;

public interface MemberRepository {
    // 회원을 저장한다.
    void save(Member member);

    // 회원을 찾는다.
    Member findByID(Long memberId);
}
