/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sbStratega.Player;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface IPlayerService {
    public List<Player> findAll();
    public List<Player> findByPosition(String position);
}
