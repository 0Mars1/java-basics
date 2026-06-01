package Lab8;
/**
 * Lab Day 8: Notification System Abstraction
 * Purpose: Implement pure abstraction using interfaces and execute dynamic dispatch.
 * Author: Ahmad Ali
 */

interface Notification {
    void send();
}

class EmailNotification implements Notification {
    String to, message;

    public EmailNotification(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public void send() {
        System.out.println("Email sent to " + to + " with content: \"" + message + "\"");
    }
}

class WhatsAppNotification implements Notification {
    String to, message;

    public WhatsAppNotification(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public void send() {
        System.out.println("WhatsApp ping sent to " + to + " containing: \"" + message + "\"");
    }
}

class NotificationManager {
    // Static method taking polymorphic reference variable interface type
    public static void alertNotification(Notification service) {
        service.send();
    }
}

public class LabDay8 {
    public static void main(String[] args) {
        // Instantiating both implementations
        Notification email = new EmailNotification("user@domain.com", "Your statement is ready.");
        Notification whatsApp = new WhatsAppNotification("+919876543210", "OTP is 4321");

        // Executing static manager utility routing
        System.out.println("--- Dispatching Notifications ---");
        NotificationManager.alertNotification(email);
        NotificationManager.alertNotification(whatsApp);
    }
}