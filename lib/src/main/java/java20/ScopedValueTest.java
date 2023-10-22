package java20;

public class ScopedValueTest {

    public static void main(String[] args) {

    }

    /*class Server {
        public final static ScopedValue<User> LOGGED_IN_USER = ScopedValue.newInstance();

        private void serve(Request request) {
            // ...
            User loggedInUser =  authenticateUser(request);
            ScopedValue.where(LOGGED_IN_USER, loggedInUser)
                    .run(() -> restAdapter.processRequest(request));
            // ...
        }*/
}
