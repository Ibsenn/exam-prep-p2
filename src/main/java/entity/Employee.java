/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;

/**
 *
 * @author madsr
 */
@Entity
public class Employee extends Person
{
    int soSecNr; 
    float wage; 
    String taxClass;
}
