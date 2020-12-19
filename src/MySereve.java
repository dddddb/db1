import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySereve {
    public static void main(String[] args) throws IOException {
        ServerSocket sereve = new ServerSocket(8888);
        Socket socket = sereve.accept();

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream os = socket.getOutputStream();
        os.write("HelloWord!".getBytes());

        socket.close();
        sereve.close();
    }
}
