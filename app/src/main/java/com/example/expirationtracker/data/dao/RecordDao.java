package com.example.expirationtracker.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.expirationtracker.data.entity.RecordEntity;

import java.util.List;

@Dao
public interface RecordDao {
    @Insert
    void insertRecord(RecordEntity recordEntity);
    @Update
    void updateRecord(RecordEntity recordEntity);
    @Delete
    // 參數應該代id?
    void deleteRecord(RecordEntity recordEntity);
    @Query("SELECT * FROM record ORDER BY expiredDate ASC")
    LiveData<List<RecordEntity>> getAllRecords();
}
