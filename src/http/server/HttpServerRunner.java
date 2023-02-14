package http.server;

import com.sun.net.httpserver.HttpServer;

public class HttpServerRunner {
    public static void main(String[] args) {
        var httpServer =  new httpServer(9000, 100);
        httpServer.run();

    }
}
