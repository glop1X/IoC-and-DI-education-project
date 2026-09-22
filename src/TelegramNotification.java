public class TelegramNotification implements INotification{
    @Override
    public void send(){
        System.out.println("Сообщение из телеграмма");
    }
}
