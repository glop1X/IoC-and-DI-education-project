public class NotificationService {
    private INotification notification;

    public NotificationService(INotification notification){
        this.notification = notification;
    }

    public void makeNotification(){
        notification.send();
    }

}
