package com.example.democricket.service;

import com.example.democricket.model.Player;

import java.util.List;

public interface playerService {
    void save(Player p);

    List<Player> getp(Long id);
}
