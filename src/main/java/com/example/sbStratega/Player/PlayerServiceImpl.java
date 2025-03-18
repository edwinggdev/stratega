/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sbStratega.Player;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class PlayerServiceImpl implements IPlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    
    @Override
    public List<Player> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return playerRepository.findAll();
    }
    
    @Override
    public List<Player> findByPosition(String position) {
        return playerRepository.findByPosition(position);
    }
    
}
