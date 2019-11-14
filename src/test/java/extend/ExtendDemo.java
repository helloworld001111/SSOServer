package extend;


public class ExtendDemo {
    public static void main(String[] args) {
        //子类不重写show方法，打印结果5,5. 子类重写show方法，打印结果0，10
        Zi zi = new Zi();
        zi.show();
        System.out.println("helo");
         int num =10;
        num =12;
        System.out.println(num);
    }
}
