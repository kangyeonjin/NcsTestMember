package member.model.vo;
// 2%(이자율 : 0.02) 를 곱한값이 이자 포인트 메소드
public class Silver extends Member implements Buyable{
    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }


    @Override
    public double calculatePoint() {
        return getPoint() * 0.02;
    }

//    private  static final double DISCOUNT=0.02;
    @Override
    public double buy(int price){
        double sale = price * 0.02;
        return price - sale;
    }

}




