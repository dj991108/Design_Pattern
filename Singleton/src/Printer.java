public class Printer {
    private static Printer instance;
    private Printer() {}
    public void print(String msg) {
        System.out.println("+++++++++++");
        System.out.println(msg);
        System.out.println("+++++++++++");
    }
    public static Printer getInstance(){ //getInstance 라는 고정된 메소드? ,정적메소드, 인스턴스메소드 복습, 클래스메소드?
        if(instance == null)
            instance = new Printer();
        return instance;
    }
}
