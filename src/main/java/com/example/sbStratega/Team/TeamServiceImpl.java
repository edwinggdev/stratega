/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Service.java to edit this template
 */
package com.example.sbStratega.Team;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author edwin
 */
@Service
public class TeamServiceImpl implements ITeamService {
   @Autowired
    private TeamRepository teamRepository;
   
   @Override
    public List<Team> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return teamRepository.findAll();
    }
    @Override
    public Team save(Team team) {
//         Team savedTeam = teamService.save(input); // Call the service to save the team
//        return teamRepository.save(savedTeam);
        return teamRepository.save(team);
    }
}
