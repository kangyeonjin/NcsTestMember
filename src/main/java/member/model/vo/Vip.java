package member.model.vo;

import member.run.Run;

//10%(이자율 : 0.1) 를 곱한값이 이자포인트를 구하는 메소드
public class Vip extends Member implements Buyable{

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }



    Run run = new Run();


    @Override
    public double calculatePoint() {
        return getPoint() * 0.1;
    }

//    private static final double DISCOUNT = 0.1;

    @Override
    public double buy(int price) {
        double sale = price * 0.1;
        return price - sale;
    }
}
