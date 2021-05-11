package com.example.sibchicken;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LifeCycle implements LifecycleObserver, LifecycleOwner {

    static FirebaseDatabase mDataBase;
    static DatabaseReference ref;

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void initViewModel() {

        MainActivity.fragmentManager.beginTransaction()
                .add(R.id.fragment_container, new MenuFragment())
                .commit();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void savePref() {

    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return null;
    }

    public static DatabaseReference getRef() {
        return ref;
    }
}
