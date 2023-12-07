package com.example.democricket.repo;

import com.example.democricket.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface playerRepository extends CrudRepository<Player,Long> {
    Player findById(Long id);
    List<Player> findPlayersByTTeamId(Long teamId);
    Player findPlayersById(Long id);

    d

}
