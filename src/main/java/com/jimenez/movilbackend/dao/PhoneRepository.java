/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jimenez.movilbackend.dao;

import com.jimenez.movilbackend.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SANTIAGO
 */
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{
    
}
