package com.example.george.gridlayout;

/**
 * Created by George on 07.04.2018.
 */

public class HeaderItem extends Item {

    public HeaderItem(String title) {
        super(title);
    }

    @Override
    public int getItemType() {
        return HEADER_ITEM_TYPE;
    }
}
