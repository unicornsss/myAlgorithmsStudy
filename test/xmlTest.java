package test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by 羊 on 2019/4/23.
 */
public class xmlTest {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        SAXReader reader = new SAXReader();
        InputStream in = new FileInputStream("src\\test\\books.xml");
        //FileInputStream 中的路径要写对于本格像个的相对路径 或者全路径。
        Document dom = reader.read(in);
        Element root=dom.getRootElement();
        List<Element> childNodes = root.elements();
        for (int i = 0; i < childNodes.size(); i++) {
            Element node = childNodes.get(i);
            System.out.println(node.getStringValue());
        }
    }
}
