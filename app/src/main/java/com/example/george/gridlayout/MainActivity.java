package com.example.george.gridlayout;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridListAdapter mAdapter;
    private List<Item> mItemList = new ArrayList<>();
    private RecyclerView recycler;
    private static final int DEFAULT_SPAN_COUNT = 6;
    private int mHeaderCounter = 0;
    private int mGridCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }


    private void bindView() {
        recycler = (RecyclerView) findViewById(R.id.recycler_items);
        recycler.setRecycledViewPool(new RecyclerView.RecycledViewPool());
        recycler.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, DEFAULT_SPAN_COUNT);

        recycler.setLayoutManager(gridLayoutManager);
        mAdapter = new GridListAdapter(mItemList, gridLayoutManager, DEFAULT_SPAN_COUNT, MainActivity.this);
        recycler.setAdapter(mAdapter);

        addList();

    }

    private void addList() {
        mAdapter.addItem(new HeaderItem("Раздел 1"));


        mAdapter.addItem(new GridItem("vk", mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("vk" + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("vk" + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("vk" + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new HeaderItem("Раздел 2 "));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("vk" + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("vk" + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new HeaderItem("Раздел 3"));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("vk" + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("tw " + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("vk" + getGridCounter(), mGridCounter));
        mAdapter.addItem(new GridItem("fb " + getGridCounter(), mGridCounter));
        mAdapter.notifyDataSetChanged();


    }

    public int getHeaderCounter() {
        mGridCounter = 0;
        return ++mHeaderCounter;
    }

    public int getGridCounter() {
        return ++mGridCounter;
    }
}
