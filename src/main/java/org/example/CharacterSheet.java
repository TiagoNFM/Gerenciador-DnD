package org.example;
import java.util.HashMap;

public class characterSheet {
    private String name;
    private String clas;
    private int level;
    private HashMap<String,Integer> attributes = new HashMap<String,Integer>();

    public characterSheet(String name, String clas, int level){
        this.name = name;
        this.clas = clas;
        this.level = level;
    }

}
