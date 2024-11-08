import java.util.List;

public class SocialMediaAggregatorClient {
    public static void main(String[] args) {
        SocialMediaAggregatorFacade aggregator = new SocialMediaAggregatorFacade();

        // Fetch all notifications
        List<Notification> notifications = aggregator.getAllNotifications();
        for (Notification notification : notifications) {
            System.out.println(notification.getContent());
        }

        // Mark a Twitter notification as read
        aggregator.markNotificationAsRead("notificationId123", "twitter");

        // Delete a Facebook notification
        aggregator.deleteNotification("notificationId456", "facebook");
    }
}
