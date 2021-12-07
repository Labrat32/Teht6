package com.example.teht6;
import java.util.*;
public class President {
    private String name;
    private int termStart;
    private int termEnd;
    private String title;


    public President(String name, int termStart, int termEnd, String title){
        this.name = name;
        this.termStart = termStart;
        this.termEnd = termEnd;
        this.title = title;
    }
    public String getName(){
        return name;
    }
    public String getStart(){
        return Integer.toString(termStart);
    }
    public String getEnd(){
        return Integer.toString(termEnd);
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return name;
    }
}

