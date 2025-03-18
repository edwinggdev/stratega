/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sbStratega.Player;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    @Transactional()
    @Query(value="select * from player p where p.position_id = ?1", nativeQuery = true)
//    public Numero findByFreeNumero(Integer sorteoid,Integer numero);
    public List<Player> findByPosition(String position);
}
