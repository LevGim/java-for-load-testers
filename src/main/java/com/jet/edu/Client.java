package com.jet.edu;

/**
 * Created by ЛЕВ on 28.06.2017.
 */
public class Client {
    public static void start (String config) {
        /**
         * Run server with user config
         * Control messaging
         */

        connect(config);
    }

    private static void connect (String config) {
        /**
         * Connect to chat server with user config
         */

    }

    private static void sendMessage (String message) {
        /**
         * Send message to server
         */

    }

    private static String getMessages () {
        /**
         *Gets new messages from server
         */

        return "";
    }

    private static String[] getAnalytic () {
        /**
         * Get analytic from server
         */

        return "";
    }

    private static String[] getLog () {
        /**
         *Get log from server
         */

        return "";
    }

    private static String[] getHistory () {
        /**
         *Get history from server
         */

        return "";
    }

    private static void sendCommand (int number) {
        /**
         * Send command to server
         */
    }

    private static void getStatistic (int number, String[] Stat) {

        getAnalytic ();

        getLog ();

        getHistory ();
    }
}
