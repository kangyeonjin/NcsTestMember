package member.controller;
//멤버변수 : Silver 등급, Gold 등급, Vip 등급 등
// 회원을 최대 10명 관리할수 있는  ArrayList

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.Vip;

import java.util.ArrayList;
import java.util.List;


public class MemberRepository {

    List<Member> memberList = new ArrayList<>();  //배열
    private int MAX_MEMBERS =10;  //최대 열명

    public void insertMember(Member m) throws OverMemberException {
        if(memberList.size() >= MAX_MEMBERS){   //10명이 넘어가면
            throw new OverMemberException("Member List is full"); //OverMemberException발생
        }
        memberList.add(m);  //회원추가

    }

    public void printData(){
        for(Member member: memberList){ // 멤버 리스트를 반복함

            String grade = member.getGrade();  //멤버의 grade가져와서 저장함
            int points = member.getPoint();  //point가져와서 저장함
//            double interest1 = Vip.calculateInterest1();  //이자율가져와서 저장함
//            double interest2 = Gold.calculateInterest2();  //이자율가져와서 저장함
//            double interest3 = Silver.calculateInterest3();  //이자율가져와서 저장함


        }

//        for(int i=0; i <8; i++){
//               memberRepository.insertMember();
//            }



    }
    public void printBuyInfo(int price){

    }

}
