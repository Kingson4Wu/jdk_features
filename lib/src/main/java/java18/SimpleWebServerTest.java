package java18;

import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;

public class SimpleWebServerTest {

    public static void main(String[] args) {

        var server = SimpleFileServer.createFileServer(new InetSocketAddress(8080),
    Path.of("/some/path"), SimpleFileServer.OutputLevel.VERBOSE);
      server.start();
    }

}
