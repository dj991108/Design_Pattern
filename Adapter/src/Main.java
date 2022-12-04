public class Main {
    // Adapter
    public static void main(String[] args) {
        Adder adder = new MyAdder(); // 기본 adder ( adder : 연걸자, MyAdder : 제공자 )
        UseAdder use = new UseAdder(); // 실 사용 클래스 (사용자)
        System.out.println(use.add(adder, 10, 20));  // 사용자가 연결자를 사용
        Adder adder1 = new YourAdderAdapter(new YourAdder()); // Adapter 패턴을 통해 제공자를 YourAdder로 변경
        // adder1 : 연결자   ,  YourAdder : 제공자
        System.out.println(use.add(adder1, 10, 20)); // 사용자가 연결자를 사용
    }
}
