package test;

/**
 * Created by 羊 on 2019/4/18.
 */
public class TestMyException {
    public static void compute (int a)throws MyException{
        System.out.println("Called compute(" + a + ")");
        if(a > 10){
            throw new MyException(a);
        }
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
//            e.printStackTrace();
            System.out.println("Caught "+e);
        }
    }
}
