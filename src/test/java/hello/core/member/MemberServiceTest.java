package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //주어진 환경
        //given
        Member member = new Member(1L,"memberA",Grade.VIP);

        //이렇게 했을 때
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //이렇게 된디.
        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
