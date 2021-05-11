package com.example.sibchicken.vm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.sibchicken.db.MenuDatabase;
import com.example.sibchicken.tables.Menu1Week;
import com.example.sibchicken.tables.Menu2Week;

import java.util.List;

public class MenuViewModel extends AndroidViewModel {

    LiveData<List<Menu1Week>> menu1Week;
    LiveData<List<Menu2Week>> menu2Week;

    MenuRepository repository;

    public MenuViewModel(@NonNull Application application) {
        super(application);
        repository = new MenuRepository(application);
        menu1Week = repository.getMenu1Week();
        menu2Week = repository.getMenu2Week();
    }

    public LiveData<List<Menu1Week>> getMenu1Week() {
        return menu1Week;
    }

    public LiveData<List<Menu2Week>> getMenu2Week() {
        return menu2Week;
    }

    void insertMenu1(final Menu1Week menu1Week) {
        MenuDatabase.dbWriteExecutor.execute(() -> repository.insertMenu1(menu1Week));
    }

    void insertMenu2(final Menu2Week menu2Week) {
        MenuDatabase.dbWriteExecutor.execute(() -> repository.insertMenu2(menu2Week));
    }

    void deleteMenu1() {
        repository.deleteMenu1();
    }

    void deleteMenu2() {
        repository.deleteMenu2();
    }

}
