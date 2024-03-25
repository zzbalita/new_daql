package fpoly.huyndph40487.qlda_bantrsua.Manager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fpoly.huyndph40487.qlda_bantrsua.R;

public class Fragment_ChoDH extends Fragment {

    public Fragment_ChoDH() {
        // Required empty public constructor
    }


    public static Fragment_ChoDH newInstance(String param1, String param2) {
        Fragment_ChoDH fragment = new Fragment_ChoDH();
        Bundle args = new Bundle();

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
        return inflater.inflate(R.layout.fragment__cho_d_h, container, false);
    }
}