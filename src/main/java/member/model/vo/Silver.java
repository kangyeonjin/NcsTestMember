package member.model.vo;
// 2% 를 곱한값이 이자 포인트 메소드
public class Silver extends Member implements Buyable{
    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

//    public Silver(String name, String grade, int point){
//
//    }

public double calculatelnterest(){

        return 0;
}

public int buy(int price){

        return 0;
}

}
