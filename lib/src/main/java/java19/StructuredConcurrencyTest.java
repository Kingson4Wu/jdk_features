package java19;


import java.util.concurrent.Callable;

public class StructuredConcurrencyTest {
    public static void main(String[] args) {

    }

    /*Response handle() throws ExecutionException, InterruptedException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<String>  user  = scope.fork(() -> findUser());
            Future<Integer> order = scope.fork(() -> fetchOrder());

            scope.fork(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return null;
                }
            });

            scope.join();           // Join both forks
            scope.throwIfFailed();  // ... and propagate errors

            // Here, both forks have succeeded, so compose their results
            return new Response(user.resultNow(), order.resultNow());
        }
    }*/

    public static Callable<String> findUser() {
       return new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "";
            }
        };
    }
    public static Integer fetchOrder() throws Exception{
        return 0;
    }

    class Response{

        public Response(String r, Integer i){

        }
    }

}
