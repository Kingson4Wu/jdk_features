package java14;

public class Java14Test {

    public static void main(String[] args) {

        testTextBlockWithTwoNewEscapeSequences();
    }


    //JDK14引入了preview版本的针对instanceof的模式匹配
    /*public boolean isBadRequestError(Exception ex) {
        return (ex instanceof HttpClientErrorException rce) &&
                HttpStatus.BAD_REQUEST == rce.getStatusCode();
    }*/

    public void testSwitchWithArrowBlockAndYield() {
        int n = 3;
        String quantityString = switch (n) {
            case 1 -> "one";
            case 2 -> "two";
            default -> {
                System.out.println("default");
                yield "many";
            }
        };
        System.out.println(quantityString);
    }

    public static void testTextBlockWithTwoNewEscapeSequences() {
        String inOneLine = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;
        System.out.println(inOneLine);

        String singleSpace = """
                red  \s
                green\s
                blue \s
                """;
        System.out.println(singleSpace);
    }
}


