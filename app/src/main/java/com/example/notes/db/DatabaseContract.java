package com.example.notes.db;

import android.provider.BaseColumns;

/**
 * Created by ACER on 06-08-2018.
 */

public class DatabaseContract {

    static String TABLE_NOTE = "note";

    static final class NoteColumns implements BaseColumns {
        static String TITLE = "title";
        static String DESCRIPTION = "description";
        static String DATE = "date";
    }
}
