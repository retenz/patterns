package com.example.patterns.observer;

public interface Agency {
    public void addChannel(Channel channel);
    public void removeChannel(Channel channel);
    public void updateChannels(String news);
}
