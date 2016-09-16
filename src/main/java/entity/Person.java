package entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

@Entity

//Jeg har valgt at bruge JOINED fordi det giver mest mening i forhold til både student og employee
//Skal have forskellige variable, hvis jeg havde valgt at køre SINGLE havde jeg været ude i at det hele
//lå under person og derfor vil der være data hos nogle personer der ikke giver mening eller ville være
//tomt. 

@Inheritance (strategy = InheritanceType.JOINED)

public class Person
{
    String firstName; 
    String lastName; 
    @Temporal(javax.persistence.TemporalType.DATE)
    Date birthDate;
    int age; 
    boolean isMarried; 
    
    @Id
    private Long id;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    
}
