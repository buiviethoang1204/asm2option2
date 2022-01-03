package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class FragmentDetail extends Fragment {
    ImageView imgBg;
    TextView txtTen;
    TextView txtContent;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        initView(view);

        Bundle bundle = getArguments();
        if (bundle != null) {
            Animal animal = (Animal) bundle.get("objectAnimal");
            if (animal != null) {
                txtTen.setText(animal.getName());
                imgBg.setImageResource(animal.getPhotoBg());
                txtContent.setText(animal.getContent());
            }
        }


//        List<Animal> list = new ArrayList<>();
//        list.add(new Animal(R.drawable.ic_eagle, R.drawable.bg_eagle, "Eagle", getString(R.string.text_eagle), false));
//        list.add(new Animal(R.drawable.ic_eagle, R.drawable.bg_eagle, "Eagle", getString(R.string.text_eagle), false));
//
//        ViewPager viewPager = view.findViewById(R.id.view_pager);
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(),
//                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, list);
//        viewPager.setAdapter(viewPagerAdapter);


        return view;
    }

    private void initView(View view) {
        imgBg = (ImageView) view.findViewById(R.id.imageviewPhotoBg);
        txtTen = (TextView) view.findViewById(R.id.textviewTen);
        txtContent = (TextView) view.findViewById(R.id.textViewContent);

    }

    public void getDuLieu(Animal animal) {

    }
}
