package CI346.websockets.noughtsandcrosses;
/**
 * A POJO for messages. Using Lombok for getters and setters and
 * a custom toString method.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Collection;

@Data
@ToString(exclude = "userList")
@AllArgsConstructor
public class Message {
    private NACWebSocket.MsgType msgType;
    private String userMessage;
    private Collection<String> userList;
}
