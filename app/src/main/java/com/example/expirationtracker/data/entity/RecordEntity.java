package com.example.expirationtracker.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;

@Entity(tableName = "record")
public class RecordEntity {
    @PrimaryKey(autoGenerate = true)
    public int rid;
    public int cid;
    public String title;
    public String note;
    public LocalDate expiredDate;
    public String createdAt;
    public String updatedAt;

}
