public class Super {
    // 생성자가 재정의 가능 메서드를 호출하는 잘못된 사례
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
    }
}