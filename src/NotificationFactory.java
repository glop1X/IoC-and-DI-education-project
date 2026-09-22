public class NotificationFactory {
    public INotification createNotification(String typeNotification) {
        if (typeNotification.equals("Почта")) {
            return new EmailNotification();
        } else if (typeNotification.equals("Телеграмм")) {
            return new TelegramNotification();
        } else if (typeNotification.equals("Пуш")) {
            return new PushNotification();
        }
        return null;
    }
}
