package fpoly.huyndph40487.qlda_bantrsua.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import fpoly.huyndph40487.qlda_bantrsua.Adapter.ProductCartAdapter;
import fpoly.huyndph40487.qlda_bantrsua.DAO.ProductCartDAO;
import fpoly.huyndph40487.qlda_bantrsua.MainActivity;
import fpoly.huyndph40487.qlda_bantrsua.R;
import fpoly.huyndph40487.qlda_bantrsua.base.NavHelper;
import fpoly.huyndph40487.qlda_bantrsua.databinding.FragmentProductCartBinding;

public class ProductCartFragment extends Fragment {

    ProductCartDAO productCartDAO;
    ProductCartAdapter productCartAdapter;
    FragmentProductCartBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProductCartBinding.inflate(inflater, container, false);

        productCartDAO = new ProductCartDAO(getContext());
        productCartAdapter = new ProductCartAdapter(getContext(), productCartDAO.getAll());
        binding.recyclerTotal.setAdapter(productCartAdapter);

        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new NavHelper((MainActivity) requireActivity(), R.id.navHost).navigate(R.id.navigation_home);
            }
        });


        return binding.getRoot();
    }
}