/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author madsr
 */
public class Structure
{

    public static void main(String[] args)
    {
        HashMap<String, Object> puproperties = new HashMap<>();

        puproperties.put("javax.persistence.schema-generation.database.action", "drop-and-create");

        Persistence.generateSchema("exam_p2PU", puproperties);

        Persistence.generateSchema("exam_p2PU", null);
    }
}
