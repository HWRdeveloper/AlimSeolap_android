package com.example.alimseolap1.databases;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.alimseolap1.DataTransformer;
import com.example.alimseolap1.daos.WordDao;
import com.example.alimseolap1.entities.WordEntity;

@Database(entities = {WordEntity.class}, version = 1)
@TypeConverters({DataTransformer.class})
public abstract class  WordDatabase extends RoomDatabase {
    private static WordDatabase wordDatabase;

    public abstract WordDao wordDao();

    public static WordDatabase getWordDatabase(Context context) {
        if (wordDatabase == null) {
            wordDatabase = Room.databaseBuilder(context.getApplicationContext(), WordDatabase.class, "word-db")
                    .allowMainThreadQueries()
                    .build();
        }
        return wordDatabase;
    }

    public static void destroyInstance() {
        wordDatabase = null;
    }
}