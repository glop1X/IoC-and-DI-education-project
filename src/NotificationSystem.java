void main() {

    NotificationFactory factory = new NotificationFactory();

    INotification notification = factory.createNotification("Телеграмм");

    NotificationService service = new NotificationService(notification);

    service.makeNotification();
}
