package member.model.vo;
// 5% 를 곱한값이 이자 포인트 메소드
public class Gold extends Member implements Buyable {


    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    double calculateInterest(){
        return 0;
    }

    int buy(int price){
        return 0;
    }

}
