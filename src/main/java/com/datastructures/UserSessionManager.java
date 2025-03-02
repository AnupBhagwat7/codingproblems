package com.datastructures;

/*
Real-World Use Case 1: HashMap for Caching User Sessions
📌 Scenario:
You are building a web application where users log in, and you need to store session data.
Solution: Use HashMap<String, Session> to map user IDs to their session objects.
 */
import java.util.HashMap;

class Session {
    private String userId;
    private long lastActiveTime;

    public Session(String userId) {
        this.userId = userId;
        this.lastActiveTime = System.currentTimeMillis();
    }

    public void updateLastActiveTime() {
        this.lastActiveTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "UserID: " + userId + ", Last Active: " + lastActiveTime;
    }
}

public class UserSessionManager {
    private static HashMap<String, Session> sessionCache = new HashMap<>();

    public static void addSession(String userId) {
        sessionCache.put(userId, new Session(userId));
    }

    public static Session getSession(String userId) {
        return sessionCache.get(userId);
    }

    public static void removeSession(String userId) {
        sessionCache.remove(userId);
    }

    public static void main(String[] args) {
        addSession("user123");
        addSession("user456");

        System.out.println("Active Sessions:");
        System.out.println(getSession("user123"));
        System.out.println(getSession("user456"));

        removeSession("user123");
        System.out.println("\nAfter Removing user123:");
        System.out.println(getSession("user123")); // Returns null
    }
}


