package com.example.george.gridlayout;



/**
 * Created by George on 04.04.2018.
 */

public class GridItem extends Item {

    private String mSubTitle;
    private boolean isChecked;

    public boolean isChecked() {

        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public GridItem(String title, int mPosition, String mSubTitle, boolean isChecked) {
        super(title);

        this.mSubTitle = mSubTitle;
        this.isChecked = isChecked;
    }

    public GridItem(String title, int position) {
        super(title);

    }

    public String getSubTitle() {
        return mSubTitle;
    }

    public void setSubTitle(String subTitle) {
        mSubTitle = subTitle;
    }



    @Override
    public int getItemType() {
        return GRID_ITEM_TYPE;
    }
}

