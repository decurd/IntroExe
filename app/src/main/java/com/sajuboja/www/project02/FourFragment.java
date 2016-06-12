package com.sajuboja.www.project02;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by decur on 2016-05-19..
 */
public class FourFragment extends Fragment {

    public FourFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_four, container, false);
    }
}
