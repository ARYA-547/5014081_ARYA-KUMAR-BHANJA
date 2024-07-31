package com.example.test;

import com.example.notification.*;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();

        // Adding SMS Notification
        notifier = new SMSNotifierDecorator(notifier);

        // Adding Slack Notification
        notifier = new SlackNotifierDecorator(notifier);

        // Send notification
        notifier.send("Hello, Test notification by Arya!!");
    }
}
