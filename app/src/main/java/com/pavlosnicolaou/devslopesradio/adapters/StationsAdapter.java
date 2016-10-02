package com.pavlosnicolaou.devslopesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.pavlosnicolaou.devslopesradio.holders.StationViewHolder;
import com.pavlosnicolaou.devslopesradio.model.Station;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by vl1s on 30/09/2016.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 0;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
}
