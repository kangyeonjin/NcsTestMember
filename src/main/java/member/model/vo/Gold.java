package member.model.vo;

// 5%(이자율 : 0.05) 를 곱한값이 이자 포인트 메소드
public class Gold extends Member implements Buyable {

    public Gold(String name, String grade, int point) {

        super(name, grade, point);
    }


    @Override
    public double calculatePoint() {
        return getPoint() * 0.05;
    }


//    private static double DISCOUNT = 0.05;
    @Override
    public double buy(int price){
        double sale = price * 0.05;

        return price - sale;
    }

}
