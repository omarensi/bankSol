/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BankSolution.repositories;

import com.example.BankSolution.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nasri
 */

 @Repository 
public interface AccountRepository extends JpaRepository<Account, Long> {
    
}

