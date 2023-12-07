package com.example.democricket.controller;

import com.example.democricket.model.Player;
import com.example.democricket.service.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class pColtroller {

    @Autowired
    private playerService ps;

    @PostMapping("/n/p")
    public String save(@RequestBody Player p){

        ps.save(p);
        return "success";
    }

    @GetMapping("/op")
    @ResponseBody
    public List<Player> getp(@PathVariable Long p){
        List<Player> res = ps.getp(p) ;
        return res;
    }
}
