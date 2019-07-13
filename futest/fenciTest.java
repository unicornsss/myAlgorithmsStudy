package futest;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by 羊 on 2019/7/9.
 */
public class fenciTest {
    public static void main(String[] args) throws IOException {
//        String text="我是一个大学生";
//        String text="只有社会主义才能救中国";
        String text="这是一个粗糙的栅栏，浪费钱，我想要一堵巨大的墙!";
        //创建分词对象
        Analyzer anal=new IKAnalyzer();
        StringReader reader=new StringReader(text);
        //分词
        TokenStream ts=anal.tokenStream("1", reader);
        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);
        //遍历分词数据
        while(ts.incrementToken()){
            System.out.print(term.toString()+"|");
        }
        reader.close();
        System.out.println();
    }
}
