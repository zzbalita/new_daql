package fpoly.huyndph40487.qlda_bantrsua;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import fpoly.huyndph40487.qlda_bantrsua.Adapter.ListTSAdapter;
import fpoly.huyndph40487.qlda_bantrsua.Adapter.PhotoAdapter;
import fpoly.huyndph40487.qlda_bantrsua.DAO.ProductDAO;
import fpoly.huyndph40487.qlda_bantrsua.Model.Photo;
import fpoly.huyndph40487.qlda_bantrsua.Model.Product;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    NavigationView navigationView;
    RecyclerView recyclerView;
    ListView listView;
    ImageView image;
    ListTSAdapter listTSAdapter;
    List<Product> listProduct;
    ViewPager viewPager;
    PhotoAdapter photoAdapter;

    ProductDAO productDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productDAO = new ProductDAO(this);

        toolbar = findViewById(R.id.toolbarMain);
        viewPager = findViewById(R.id.viewPager);
        navigationView = findViewById(R.id.nav);
        listView = findViewById(R.id.listviewMain);

        listProduct = productDAO.getAll();
        listTSAdapter = new ListTSAdapter(MainActivity.this, R.layout.item_list_trasua, listProduct);
        listView.setAdapter(listTSAdapter);

        photoAdapter = new PhotoAdapter(this, getListPhoto());
        viewPager.setAdapter(photoAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Ok" +
                        "", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private List<Photo> getListPhoto() {
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.ic_ttdg));
        list.add(new Photo(R.drawable.ic_tradau));
        list.add(new Photo(R.drawable.ic_trakem));
        return list;
    }
}