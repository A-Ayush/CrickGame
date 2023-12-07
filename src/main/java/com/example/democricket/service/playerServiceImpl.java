package com.example.democricket.service;

import com.example.democricket.model.Player;
import com.example.democricket.repo.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class playerServiceImpl implements playerService {

    @Autowired
    private playerRepository pr;
    @Override
    public void save(Player p){
        pr.save(p);
    }

    @Override
    public List<Player> getp(Long id){
        return pr.findPlayersByTTeamId(id);
    }

//    public List<Player> getTeamPla(team teamId){
//        List<Player> res = pr.;
//        return res;
//    }
}
