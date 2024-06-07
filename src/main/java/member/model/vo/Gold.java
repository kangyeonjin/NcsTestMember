package member.model.vo;

import java.util.List;

// 5%(이자율 : 0.05) 를 곱한값이 이자 포인트 메소드
public class Gold extends Member implements Buyable {

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }


//get으로 가져와서
//set을해서 저장한다
    double calculateInterest(){
        List<Integer> points = memberRepository
                .getMembers()
                .stream()
                .map(Member::getPoint)
                .collect(Collectors.toList());
        return 0;
    }

    int buy(int price){
        return 0;
    }

}
