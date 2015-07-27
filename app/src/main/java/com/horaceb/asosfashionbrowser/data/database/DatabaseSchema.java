package com.horaceb.asosfashionbrowser.data.database;

import com.horaceb.asosfashionbrowser.data.provider.FashionBrowserContract;

public interface DatabaseSchema {

    String DATABASE_NAME = "fashionbrowser.db";

    String TABLE_CATEGORY = "category";

    String CREATE_TABLE_CATEGORY = "CREATE TABLE category (" +
            FashionBrowserContract.CategoryColumns.ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            FashionBrowserContract.CategoryColumns.CATEGORY_ID + " TEXT," +
            FashionBrowserContract.CategoryColumns.NAME + " TEXT," +
            FashionBrowserContract.CategoryColumns.PRODUCT_COUNT + " INTEGER NOT NULL, " +
            FashionBrowserContract.CategoryColumns.GENDER + " TEXT, " +
            "UNIQUE (" + FashionBrowserContract.CategoryColumns.CATEGORY_ID + ") ON CONFLICT REPLACE" +
            ")";

    String DROP_TABLE_CATEGORY = "DROP TABLE IF EXISTS " + TABLE_CATEGORY;
}
