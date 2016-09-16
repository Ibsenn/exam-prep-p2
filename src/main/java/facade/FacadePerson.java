/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author madsr
 */
public class FacadePerson
{

    EntityManagerFactory emf;

    public FacadePerson(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public Person getPerson(int id)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            return em.find(Person.class, id);
        } finally
        {
            em.close();
        }
    }

    public void addPerson(Person p)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.persist(p);

        } finally
        {
            em.close();
        }
    }

     public void deletePerson(int id)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            Person p = em.find(Person.class, id);
            em.remove(p);
            em.getTransaction().commit();
        }
        finally
        {
            em.close();
        }
    }
    
    public Person editPerson(Person pers)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            Person p = em.find(Person.class, pers.getId());
            if(p != null)
            {
                p = pers;
                em.merge(p);
                em.getTransaction().commit();
                return p;
            }
        }
        finally
        {
            em.close();
        }  
        
        return null;
    }
}
