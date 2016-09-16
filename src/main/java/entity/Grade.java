package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grade
{
    String name; 
    int gradeValue; 
    
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
