package mid2.collection.map.test.member;

public class MemberRepositoryMain {
    public static void main(String[] args) {
        MemberRepository repository = new MemberRepository();
        repository.addMember(new Member("id-01","녹차"));
        repository.addMember(new Member("id-01","녹차"));

        repository.findByNickname("우롱차");
        System.out.println("녹차: " + repository.findByNickname("녹차"));

        Member byId = repository.findById("id-01");
        Member byId2 = repository.findById("id-02");

        repository.removeMember("wrongId");
        repository.removeMember("id-01");
    }
}
