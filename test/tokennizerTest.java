package test;

import java.util.StringTokenizer;

/**
 * Created by 羊 on 2019/4/22.
 */
public class tokennizerTest {
    public static void main(String[] args) {
        String comment ="http://news.xinhuanet.com/world/2011-03/27/c_#121236180.htm";
        StringTokenizer tokenizer = new StringTokenizer(comment,"/.:");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
//            String cleanWord = tokenizer.nextToken().replaceAll("#", "")
//                    .replaceAll("[^a-zA-Z]", "");
            System.out.println(word);
            System.out.println(word.getBytes());
//            if (filter.membershipTest(new Key(word.getBytes()))) {
//                context.write(value, NullWritable.get());
//                break;
//            }
        }

    }
}
