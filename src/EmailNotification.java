public class EmailNotification implements INotification{
    @Override
    public void send() {
        System.out.println("Новое сообщение на почте");
    }
}
