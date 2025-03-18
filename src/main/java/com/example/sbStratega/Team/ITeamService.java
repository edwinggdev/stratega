/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.sbStratega.Team;

import java.util.List;

/**
 *
 * @author edwin
 */
public interface ITeamService {
    public List<Team> findAll();
    Team save(Team team); // Add a save method
}
