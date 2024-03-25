package fpoly.huyndph40487.qlda_bantrsua.Manager;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import fpoly.huyndph40487.qlda_bantrsua.Adapter.ListTSAdapter;
import fpoly.huyndph40487.qlda_bantrsua.DAO.ProductDAO;
import fpoly.huyndph40487.qlda_bantrsua.MainActivity;
import fpoly.huyndph40487.qlda_bantrsua.ManagerProductViewModel;
import fpoly.huyndph40487.qlda_bantrsua.R;
import fpoly.huyndph40487.qlda_bantrsua.base.NavHelper;
import fpoly.huyndph40487.qlda_bantrsua.databinding.FragmentQLProductBinding;


public class Fragment_QL_Product extends Fragment {
    FragmentQLProductBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQLProductBinding.inflate(inflater, container, false);

        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new NavHelper((MainActivity) requireActivity(), R.id.navHost).navigate(R.id.navigation_home);
            }
        });
        return binding.getRoot();
    }

}