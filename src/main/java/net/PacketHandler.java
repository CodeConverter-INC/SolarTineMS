import java.util.logging.Level;
import java.util.logging.Logger;

public class PacketHandler {
    private static final Logger logger = Logger.getLogger(PacketHandler.class.getName());

    public void handle(String packet) {
        try {
            // Process packet
            logger.info("Processing packet: " + packet);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to process packet", e);
        }
    }
}
