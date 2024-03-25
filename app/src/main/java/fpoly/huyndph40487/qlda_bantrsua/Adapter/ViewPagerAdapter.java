package fpoly.huyndph40487.qlda_bantrsua.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import fpoly.huyndph40487.qlda_bantrsua.Manager.Fragment_ChoDH;
import fpoly.huyndph40487.qlda_bantrsua.Manager.Fragment_DaGiaoDH;
import fpoly.huyndph40487.qlda_bantrsua.Manager.Fragment_XacNhanDH;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment_ChoDH();
            case 1:
                return new Fragment_XacNhanDH();
            default:
                return new Fragment_DaGiaoDH();


        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){
            case 0:
                title="Chờ Xác Nhận";
                break;
            case 1:
                title="Đã Xác Nhận";
                break;
            case 2:
                title="Đã Giao Hàng";
                break;
        }
        return title;
    }
}
