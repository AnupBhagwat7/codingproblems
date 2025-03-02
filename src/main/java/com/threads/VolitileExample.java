package com.threads;

// Secure API - https://chatgpt.com/share/67c3a18e-3d78-8003-9995-7a1604ad3c0b
class VolatileExample {
    // private static boolean flag = false;

    //Make this variable volatile
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            while (!flag) {
                // Looping indefinitely if flag change is not visible
            }
            System.out.println("Flag changed!"+ Thread.currentThread().getName());
        }).start();

        try {
            Thread.sleep(1000);
            System.out.println("Flag to be changed!"+ Thread.currentThread().getName());
        } catch (InterruptedException ignored) {}
        flag = true; // May not be visible to the thread
    }
}

