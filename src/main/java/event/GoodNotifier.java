package event;

/**
 * @Package: event
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/5/16 上午9:47
 */
public class GoodNotifier extends Notifier {
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同学委托尽职尽责的放哨人!");
        EventHandler handler = this.getEventHandler();
        handler.addLister(object, methodName, args);
    }

    @Override
    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了");
        try {
            EventHandler handler = this.getEventHandler();
            handler.notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
