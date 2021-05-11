package com.example.sibchicken.tables;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "Categories")
public class Categories {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private List<Integer> nextCategories;
}
