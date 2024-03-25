package fpoly.huyndph40487.qlda_bantrsua.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import fpoly.huyndph40487.qlda_bantrsua.Model.ProductCart;
import fpoly.huyndph40487.qlda_bantrsua.R;

public class ProductCartAdapter extends BaseAdapter {
    ProductCart product;
    private Context context;
    private int layout;
    private List<ProductCart> list;

    public ProductCartAdapter(Context context, List<ProductCart> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.item_productcartadapter, null);

        product = list.get(i);

        TextView view1 = view.findViewById(R.id.tv_name_product);
        TextView view2 = view.findViewById(R.id.tv_price);
        TextView view5 = view.findViewById(R.id.tv_soLuong);
        TextView view3 = view.findViewById(R.id.tv_sold);
        ImageView view4 = view.findViewById(R.id.img_product);
        view3.setText(getSize() + getTopping() + getIce() + getSugar());

        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        view5.setText("Số lượng: " + String.valueOf(product.getSoLuong()));
        view1.setText(product.getName());
        view2.setText(String.valueOf(product.getGia()));
        Glide.with(context).load(product.getAnh()).fitCenter().apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background) // Placeholder image
                .error(R.drawable.ic_ttdg) // Error image in case of loading failure
        ).into(view4);


        return view;
    }

    private String getTopping() {
        switch (product.getTopping()) {
            case 1:
                return "Trân châu đen, ";
            case 2:
                return "Trân châu trắngk,";
            default:
                return "Kem Cheese, ";
        }
    }

    private String getIce() {
        if (product.getIce() == 1) {
            return "Không đá, ";
        } else {
            return "50% đá, ";
        }
    }

    private String getSugar() {
        if (product.getSugar() == 1) {
            return "Không đường";
        } else {
            return "50% đường";
        }
    }

    private String getSize() {
        if (product.getSize() == 1) {
            return "M,";
        } else {
            return "L,";
        }
    }

}

