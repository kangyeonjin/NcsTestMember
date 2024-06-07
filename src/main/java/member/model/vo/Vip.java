package member.model.vo;
//10% 를 곱한값이 이자포인트를 구하는 메소드
public class Vip extends Member implements Buyable{

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

}
