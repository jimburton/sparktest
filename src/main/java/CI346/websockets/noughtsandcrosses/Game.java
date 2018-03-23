package CI346.websockets.noughtsandcrosses;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.eclipse.jetty.websocket.api.Session;

/**
 * Contains the state of a game in-progress. Using the Lombok annotations
 * to avoid writing getters and setters. Note that your IDE may complain about
 * the missing methods until you make it aware of Lombok, e.g. by installing
 * a plugin. If your IDE doesn't support Lombok, build and run the project on
 * the command line using Maven.
 */
@RequiredArgsConstructor
@Data
public class Game {
    @NonNull
    private final Player p1;
    @NonNull
    private final Player p2;
    @NonNull
    private final Session p1Session;
    @NonNull
    private final Session p2Session;
    private Player inPlay;

    public void takeTurn() {
        setInPlay((getInPlay().equals(getP1())) ? getP2() : getP1());
    }

    public Session getOpponentSession(Session session) {
        return (session.equals(p1Session) ? p2Session : p1Session);
    }

}
