/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Repository.java to edit this template
 */
package com.example.sbStratega.Team;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author edwin
 */
public interface TeamRepository extends JpaRepository<Team, Long> {
//    @Transactional()
//    @Query(value="select * from teamuser tu where tu. estaus = 1", nativeQuery = true)
////    public Numero findByFreeNumero(Integer sorteoid,Integer numero);
//    @Override
//    public List<Team> findAll();
}
