package gvava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("guava实现观察者");
    }
}
