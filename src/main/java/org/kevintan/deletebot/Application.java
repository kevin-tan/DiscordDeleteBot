package org.kevintan.deletebot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

/**
 * Created by Kevin Tan 2019-04-16
 */

public class Application {

    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder().setToken("").login().join();
        System.out.println("Discord Bot Joined");
    }
}