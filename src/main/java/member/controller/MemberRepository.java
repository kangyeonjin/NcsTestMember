package member.controller;
//멤버변수 : Silver 등급, Gold 등급, Vip 등급 등
// 회원을 최대 10명 관리할수 있는  ArrayList

import member.model.vo.Member;
import java.util.ArrayList;
import java.util.List;

//멤버메소드 :
public class MemberRepository {

    List<Member> memberList = new ArrayList<>();  //배열
    private int MAX_MEMBERS =10;  //최대 열명

    //회원을 추가할때 사용하는 메서드,
    // 만약 10명이 넘어가면 OverMemberException 발생
    public void insertMember(Member m) throws OverMemberException {
        if(memberList.size() >= MAX_MEMBERS){
            throw new OverMemberException("Member List is full");
        }
        memberList.add(m);

    }

// 모든 회원이 가지고 있는 포인트의
// 이자 포인트를 계산하여 출력하는 메소드
//반복문을 통해 memberList안의 모든 Member 객체를 하나씩
// 회원등급, 포인트, 해당 member의 calculateInterest() 메소드로 이자를 출력하는 기능
    public void printData(){



    }
    public void printBuyInfo(int price){

    }

}
