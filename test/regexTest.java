package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 羊 on 2019/4/14.
 */
public class regexTest {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        [a-zA-z]+://[^\s]*
        String mapRegex = "[a-zA-z]+://[^\\s]*";
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mapRegex);
        while(true){
            String string = br.readLine();
            System.out.println(string);
            if (string.matches(mapRegex)){
                System.out.println("网址："+string);
            }
        }
    }
}



//---------------------
//        作者：qq_38228532
//        来源：CSDN
//        原文：https://blog.csdn.net/qq_38228532/article/details/84869644
//        版权声明：本文为博主原创文章，转载请附上博文链接！