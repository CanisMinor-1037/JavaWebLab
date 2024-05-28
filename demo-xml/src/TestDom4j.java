import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;
import org.xml.sax.helpers.AttributesImpl;

import java.io.InputStream;
import java.util.List;

public class TestDom4j {
    @Test
    public void testRead() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        // 通过类加载器获得指向字节码跟路径下的指定文件的输入流
        InputStream resourceAsStream = TestDom4j.class.getClassLoader().getResourceAsStream("jdbc.xml");
        // 通过输入流获得配置文件，解析为一个dom对象
        Document document = saxReader.read(resourceAsStream);
        // 从document对象获取配置文件的信息
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
        // 获取子元素
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println("\t" + element.getName());
            // 从元素中获取属性
            Attribute idAttribute = element.attribute("id");
            System.out.println("\t\t" + idAttribute.getName() + ": " + idAttribute.getValue());
            // 继续读取子元素
            List<Element> elements1 = element.elements();
            for (Element element1 : elements1) {
                System.out.println("\t\t" + element1.getName() + ": " + element1.getText());
            }
        }
    }
}
