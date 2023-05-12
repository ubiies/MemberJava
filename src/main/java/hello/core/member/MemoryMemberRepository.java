package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// 구현체
// 빨간 줄이 뜨면 option+enter
public class MemoryMemberRepository implements MemberRepository{

    // 저장소
    // 실무에서는.. 다른 걸 쓴다. con..? 뭐..?
    // 동시성 이슈가 생길 수 있으나 간단하게 해쉬맵으로 구현!
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Member findByID(Long memberId) {
        return store.get(memberId);
    }
}
