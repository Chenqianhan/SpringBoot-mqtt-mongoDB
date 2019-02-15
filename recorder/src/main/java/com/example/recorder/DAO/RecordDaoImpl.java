package com.example.recorder.DAO;

import com.example.recorder.Entity.Record;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RecordDaoImpl implements RecordDao {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void saveRecord(Record record){
        mongoTemplate.save(record);
    }

    @Override
    public Record findRecordById(String id){
        Query query=new Query(Criteria.where("id").is(id));
        Record record=mongoTemplate.findOne(query,Record.class);
        return record;
    }
}
