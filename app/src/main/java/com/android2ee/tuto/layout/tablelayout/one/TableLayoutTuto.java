package com.android2ee.tuto.layout.tablelayout.one;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TableLayoutTuto extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout_tuto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_table_layout_tuto, menu);
        return true;
    }
}
