package mejia.sam.free_eventbus;

/**
 * Created by User on 2/6/2017.
 */

public class MyEvent {

    private String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
