package member.controller;

public class OverMemberException extends Exception {

    //메세지 받는 생성자 만들기
    public OverMemberException(String message){

        //부모클래스인 Exception의 생성자에 메세지를 전달함
        super(message);

    }

}
