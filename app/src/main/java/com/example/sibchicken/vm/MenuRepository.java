package com.example.sibchicken.vm;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.sibchicken.R;
import com.example.sibchicken.db.MenuDao;
import com.example.sibchicken.db.MenuDatabase;
import com.example.sibchicken.tables.Menu1Week;
import com.example.sibchicken.tables.Menu2Week;

import java.util.List;

public class MenuRepository {

    MenuDao menuDao;
    LiveData<List<Menu1Week>> menu1Week;
    LiveData<List<Menu2Week>> menu2Week;

    public MenuRepository(Application application) {
        menuDao = MenuDatabase.getDatabase(application.getApplicationContext()).menuDao();
//        menu1Week = menuDao.LoadAllMenu1Week();
//        menu2Week = menuDao.LoadAllMenu2Week();
    }

    public LiveData<List<Menu1Week>> getMenu1Week() {
        return menu1Week;
    }

    public LiveData<List<Menu2Week>> getMenu2Week() {
        return menu2Week;
    }

    void insertMenu1(final Menu1Week menu1Week) {
        MenuDatabase.dbWriteExecutor.execute(() -> menuDao.insertMenu1Week(menu1Week));
    }

    void insertMenu2(final Menu2Week menu2Week) {
        MenuDatabase.dbWriteExecutor.execute(() -> menuDao.insertMenu2Week(menu2Week));
    }

    void deleteMenu1() {
        menuDao.deleteMenu1Week();
    }

    void deleteMenu2() {
        menuDao.deleteMenu2Week();
    }

}
