package member.model.vo;
//이자포인트를 구하는 메소드는 자식클래스에서의 구현을 강제화 할것
public abstract class Member {

    private String name;
    private String grade;
    private int point;

    public Member(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", point=" + point +
                '}';
    }


}
