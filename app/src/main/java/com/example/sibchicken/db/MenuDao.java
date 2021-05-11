package com.example.sibchicken.db;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.sibchicken.tables.Menu1Week;
import com.example.sibchicken.tables.Menu2Week;

import java.util.List;

public interface MenuDao {

    @Query("SELECT * FROM Menu1Week")
    List<Menu1Week> LoadAllMenu1Week();

    @Query("DELETE FROM Menu1Week")
    void deleteMenu1Week();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMenu1Week(Menu1Week menu1Week);

    @Query("SELECT * FROM Menu2Week")
    List<Menu2Week> LoadAllMenu2Week();

    @Query("DELETE FROM Menu2Week")
    void deleteMenu2Week();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMenu2Week(Menu2Week menu2Week);

}
