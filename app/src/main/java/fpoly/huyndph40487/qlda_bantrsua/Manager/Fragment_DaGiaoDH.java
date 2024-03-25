package fpoly.huyndph40487.qlda_bantrsua.Manager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fpoly.huyndph40487.qlda_bantrsua.R;


public class Fragment_DaGiaoDH extends Fragment {

    public Fragment_DaGiaoDH() {
        // Required empty public constructor
    }
Fragment_DaGiaoDH newInstance(String param1, String param2) {
        Fragment_DaGiaoDH fragment = new Fragment_DaGiaoDH();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__da_giao_d_h, container, false);
    }
}