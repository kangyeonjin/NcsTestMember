package member.run;

import member.controller.MemberRepository;
import member.controller.OverMembersException;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import java.lang.reflect.Member;

public class Run {
//try-catch 구문을 추가하여 알맞게 작성
    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insertMember(new Silver("홍길동", "Silver", 1000));
        memberRepository.insertMember(new Silver("고길동", "Silver", 2000));
        memberRepository.insertMember(new Silver("홍동민", "Silver", 3000));
        memberRepository.insertMember(new Gold("김회장", "Gold", 1000));
        memberRepository.insertMember(new Gold("이회장", "Gold", 2000));
        memberRepository.insertMember(new Gold("오회장", "Gold", 3000));
        memberRepository.insertMember(new Vip("이순신", "Vip", 10000));

        System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
        memberRepository.printData();

        System.out.println("=========================== 회원 물품 금액 정보 ===========================");
        int price = 10000;
        memberRepository.printBuyInfo(price);

    }

//Exception 발생시 "Member List is full" 라는 메시지 출력
// OverMemberException 발생할 경우를 대비해
// 실행클래스(Run)에서 try catch로 처리 할 것

    MemberRepository memberRepository = new MemberRepository();

//    try{
//        memberRepository.memberList(
//        for(int i=0; i <8; i++){
//               memberRepository.insertMember();
//            }
//    }catch(OverMembersException e){
//        System.out.println(e.getMessage());
//    }

    public void OverMemberExeption (){


    }


}
