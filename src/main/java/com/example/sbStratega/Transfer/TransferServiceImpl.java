/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sbStratega.Transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class TransferServiceImpl implements ITransferService{
    @Autowired
    private TransferRepository transferRepository;
    @Override
    public Transfer transferSave(Transfer transfer) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return transferRepository.save(transfer);
    }
    
}
