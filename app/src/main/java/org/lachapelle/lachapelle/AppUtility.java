package org.lachapelle.lachapelle;

import android.content.Context;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alejandraparedes on 3/25/18.
 */

public class AppUtility {
    private String [] itemsOnList;

    private Context context;

    private List<String> items;

    private static AppUtility appUtility;

    private AppUtility(Context ctx) {
        this.context = ctx;
        itemsOnList=context.getResources().getStringArray(R.array.productsToBuy);
        items= Arrays.asList(itemsOnList);
    }

    public static AppUtility getAppUtility(Context context) {
        if (appUtility == null) {
            appUtility = new AppUtility(context);
        }
        return appUtility;
    }

    public List<String> getItems(){
        return this.items;
    }

    public String[] getItemsOnList() {
        return this.itemsOnList;
    }
}
