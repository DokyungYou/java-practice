package mid2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private final Map<String, Member> memberRepository = new HashMap<>();


    public void addMember(Member member){
        if(memberRepository.containsKey(member.getId())){
            System.out.println("이미 존재하는 아이디 입니다: " + member.getId());
            return;
        }
        if(findByNickname(member.getNickname()) != null){
            System.out.println("이미 존재하는 닉네임입니다: " + member.getNickname());
            return;
        }
        if(save(member)) System.out.println("회원 추가 성공: " + member.getId());
    }

    private boolean save(Member member){
        memberRepository.put(member.getId(),member);
        return true;
    }

    public void removeMember(String id){
        Member removedMember = memberRepository.remove(id);
        if(removedMember == null){
            System.out.println("회원삭제실패: 존재하지 않는 회원");
            return;
        }
        System.out.println("회원 삭제 성공: " + removedMember.getId());
    }

    public Member findById(String id){
        Member member = memberRepository.get(id);
        if(member == null){
            System.out.println("존재하지 않는 아이디: " + id);
            return null;
        }
        return member;
    }

    public Member findByNickname(String nickname){
        for (Member member : memberRepository.values()) {
            if(nickname.equals(member.getNickname())){
                return member;
            }
        }
        System.out.println("존재하지 않는 닉네임: " + nickname);
        return null;
    }
}
