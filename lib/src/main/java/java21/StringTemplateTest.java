package java21;

import java.io.File;
import java.util.List;

import static java.lang.StringTemplate.RAW;

public class StringTemplateTest {
    public static void main(String[] args) {
        String name = "Joan";
        String info = STR."My name is \{name}";
        System.out.println(info);


        String filePath = "tmp.dat";
        File file = new File(filePath);
        String msg = STR. "The file \{ filePath } \{ file.exists() ? "does" : "does not" } exist" ;
        System.out.println(msg);
    }
}
