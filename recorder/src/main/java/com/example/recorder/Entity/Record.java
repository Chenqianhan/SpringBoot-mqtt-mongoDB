package com.example.recorder.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

//collection实际上是mongodb的表，db.XXX.find()是根据表来查询的
@Document(collection="demo_collection")
public class Record implements Serializable{
    @Id
    private String id;
    private String content;

    public Record(String id,String content){
        this.id=id;
        this.content=content;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }

    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
}
