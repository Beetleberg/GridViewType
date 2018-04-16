package com.example.george.gridlayout;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by George on 07.04.2018.
 */

public class GridListAdapter extends RecyclerView.Adapter<GridHolder> {

    private int mDefaultSpanCount;
    private List<Item> itemList;
    private List<Item> outList = new ArrayList<>();
    private HashMap<Integer, Integer> useMap;

    private Context c;

    public GridListAdapter(List<Item> mItemList, GridLayoutManager gridLayoutManager, int defaultSpanCount, Context context) {
        c = context;
        itemList = mItemList;
        mDefaultSpanCount = defaultSpanCount;


        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return isHeaderType(position) ? mDefaultSpanCount : 1;
            }
        });
    }

    private boolean isHeaderType(int position) {
        return itemList.get(position).getItemType() == Item.HEADER_ITEM_TYPE ? true : false;
    }


    private void bindSocialItem(GridHolder holder, final int position) {
        final View container = holder.itemView;

        final CheckBox title = (CheckBox) container.findViewById(R.id.checkbox_d);


        final GridItem item = (GridItem) itemList.get(position);


        title.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int i = 0;
                if (isChecked == true) {

                    outList.add(itemList.get(i));
                    i++;
                    Toast.makeText(c, String.valueOf(outList.size()), Toast.LENGTH_SHORT).show();

                } else {

                    outList.remove(i);
                    i--;
                    Toast.makeText(c, String.valueOf(outList.size()), Toast.LENGTH_SHORT).show();

                }

            }
        });
    }


    private void bindHeaderItem(GridHolder holder, int position) {

        TextView title = (TextView) holder.itemView.findViewById(R.id.headerTitle);
        title.setText(itemList.get(position).getItemTitle());
    }


    @Override
    public GridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        if (viewType == 0) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_type_layout, parent, false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, parent, false);
        }

        return new GridHolder(view);
    }

    @Override
    public void onBindViewHolder(GridHolder holder, int position) {
        if (isHeaderType(position)) {
            bindHeaderItem(holder, position);
        } else {
            bindSocialItem(holder, position);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getItemType() == Item.HEADER_ITEM_TYPE ? 0 : 1;
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void addItem(Item item) {
        itemList.add(item);
        notifyDataSetChanged();
    }
}
