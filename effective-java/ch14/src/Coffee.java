public class Coffee {

    private double x;
    private double y;


    //선언된 패키지 밖에서도 사용 가능한 클래스에는 접근자 메서드를 제공
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
