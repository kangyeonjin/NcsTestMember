package member.model.vo;

import java.util.List;

// 5%(이자율 : 0.05) 를 곱한값이 이자 포인트 메소드
public class Gold extends Member implements Buyable {

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }


//get으로 가져와서
//set을해서 저장한다
public double calculateInterest2(){
        double interest = 0.05;
        return getPoint() * interest;
    }

    int buy(int price){
        return 0;
    }

}
