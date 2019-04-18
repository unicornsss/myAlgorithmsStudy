package test;

/**
 * Created by 羊 on 2019/4/18.
 */
public class MyException extends Exception {
    private int details;

    public MyException(int details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "details=" + details +
                '}';
    }
}
