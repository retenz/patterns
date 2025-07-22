package com.example.patterns.observer;

import java.util.LinkedList;
import java.util.List;

public class NewsAgency implements Agency {
    List<Channel> channels = new LinkedList<>();


    @Override
    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public void updateChannels(String news) {
        channels.forEach(channel -> channel.update(news));
    }
}
