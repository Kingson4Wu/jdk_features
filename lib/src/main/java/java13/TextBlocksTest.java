package java13;

public class TextBlocksTest {

    public static void main(String[] args) {

// With Text Blocks
        String html2 = """
            <html>
                <body>
                <p>Hello, %s</p>
                </body>
            </html>""";

        System.out.println(String.format(html2, "World"));

        String htmlWithNewLine = """
            <html>
                <body>
                <p>Hello World</p>
                </body>
            </html>
            """;
        System.out.print(htmlWithNewLine);
        System.out.println("a new line");

    }
}
