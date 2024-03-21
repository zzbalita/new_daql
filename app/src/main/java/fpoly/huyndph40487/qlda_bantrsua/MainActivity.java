package fpoly.huyndph40487.qlda_bantrsua;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.List;

import fpoly.huyndph40487.qlda_bantrsua.Adapter.ListTSAdapter;
import fpoly.huyndph40487.qlda_bantrsua.DAO.ProductDAO;
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

    ProductDAO productDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productDAO = new ProductDAO(this);

        toolbar = findViewById(R.id.toolbarMain);
        viewFlipper = findViewById(R.id.viewflipper);
        navigationView = findViewById(R.id.nav);
//        recyclerView=findViewById(R.id.recyvlerview);
        listView = findViewById(R.id.listviewMain);
//        String imagea  = "R.drawable.ic_launcher_background";
//        image.setImageResource(Integer.parseInt(imagea));

        listProduct = productDAO.getAll();
        listTSAdapter = new ListTSAdapter(MainActivity.this, R.layout.item_list_trasua, listProduct);
        listView.setAdapter(listTSAdapter);

    }
}