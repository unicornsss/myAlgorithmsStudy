package myTry;

import java.util.HashMap;

/**
 * Created by 羊 on 2019/3/17.
 */
public class M13 {
//    Roman to Integer
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public int romanToInt(String s) {

        char []chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'M'){
                if(chars[i-1] == 'C'){
                    sum = sum + 900 - 100;
                    i++;
                }else {
                    sum += 1000;
                }
            }else if (chars[i] == 'D'){
                sum+= 500;
            }else if (chars[i] == 'C'){
                if(chars[i-1] == 'X'){
                    sum = sum + 100 - 10;
                    i++;
                }else {
                    sum += 100;
                }
            }else  if(chars[i] == 'L' ){
                sum+=50;
            }else if(chars[i] == 'X'){
                if(chars[i-1] == 'I'){
                    sum = sum + 10 - 1;
                    i++;
                }else {
                    sum += 10;
                }
            }
        }
        return sum;
    }

    public int romanToInt1(String s){
        //这个思路是借鉴过的 ，将数据放入map中，正常顺序从前往后，数字从大到小，从左往后相加。、
        // 如果左边的小于右边的，则表示这两个是一组数据，大的减去小的 即为这组数据的值。
        HashMap<Character ,Integer>map = new HashMap<Character, Integer>(){
            {
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }
        };
        int sum = 0;
        int pre = 0;
        char[] input = s.toCharArray();
        //此步可以省略，后面采取   s.charAt(i)来取出里面的内容
        for (int i = input.length - 1; i >= 0 ; i--) {
            if(pre > map.get(input[i])){
                sum = sum - map.get(input[i]);
            }else{
                sum = sum + map.get(input[i]);
            }
            pre = map.get(input[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        M13 m = new M13();
        int x = m.romanToInt1("III");
        System.out.println(x);
    }
}
