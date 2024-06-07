package member.controller;
//멤버변수 : Silver 등급, Gold 등급, Vip 등급 등
// 회원을 최대 10명 관리할수 있는  ArrayList

import member.model.vo.Member;

import java.util.List;

//멤버메소드 :
public class MemberRepository {

    List<Member> memberList;

    //회원을 추가할때 사용하는 메서드,
    // 만약 10명이 넘어가면 OverMemberException 발생
    public void insertMember(Member m){

    }


//    모든 회원이 가지고 있는 포인트의
//    이자 포인트를 계산하여 출력하는 메소드
    public void printData(){

    }
    public void printBuyInfo(int price){

    }

}
