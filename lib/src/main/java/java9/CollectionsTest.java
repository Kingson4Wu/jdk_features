package java9;

import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {
        List.of("fff");

        /**
         * List 和 Set 接口, of(...) 方法重载了 0 ~ 10 个参数的不同方法 。
         *
         * Map 接口, of(...) 方法重载了 0 ~ 10 个参数的不同方法 。
         *
         * Map 接口如果超过 10 个参数, 可以使用 ofEntries(...) 方法。
         */
    }

}
