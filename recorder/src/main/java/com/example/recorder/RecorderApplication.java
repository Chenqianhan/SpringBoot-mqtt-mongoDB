package com.example.recorder;

import com.example.recorder.DAO.RecordDao;
import com.example.recorder.DAO.RecordDaoImpl;
import com.example.recorder.Entity.Record;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class RecorderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecorderApplication.class, args);
    }

}

