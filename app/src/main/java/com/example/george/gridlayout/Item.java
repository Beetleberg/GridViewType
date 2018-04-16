package com.example.george.gridlayout;

/**
 * Created by George on 04.04.2018.
 */

public abstract class Item {

    public static final int HEADER_ITEM_TYPE = 0;
    public static final int GRID_ITEM_TYPE = 1;

    private String mItemTitle;

    public Item(String title) {
        mItemTitle = title;
    }

    public String getItemTitle() {
        return mItemTitle;
    }

    public abstract int getItemType();
}
