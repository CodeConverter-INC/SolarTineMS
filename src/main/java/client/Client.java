import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    private static final Logger logger = Logger.getLogger(Client.class.getName());
    private Socket socket;

    public Client(Socket socket) {
        this.socket = socket;
    }

    public void send(String message) {
        try {
            socket.getOutputStream().write(message.getBytes());
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to send message", e);
        }
    }

    public String receive() {
        try {
            byte[] buffer = new byte[1024];
            int read = socket.getInputStream().read(buffer);
            return new String(buffer, 0, read);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to receive message", e);
            return null;
        }
    }
}
