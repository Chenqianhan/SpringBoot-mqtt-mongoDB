package com.example.recorder.DAO;

import com.example.recorder.Entity.Record;

public interface RecordDao {
    void saveRecord(Record record);
    //void removeRecord(String id);
    //void updateRecord(Record record);
    Record findRecordById(String id);
}
