package hello.core.member;

public interface MemberRepository {
    void save(Member memebr);

    Member findById(Long memberId);

}
