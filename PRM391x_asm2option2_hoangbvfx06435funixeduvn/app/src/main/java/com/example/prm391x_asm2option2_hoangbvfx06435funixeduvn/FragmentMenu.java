package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentMenu extends Fragment {
    private Context mContext;
    private RecyclerView rvAnimal;
    private List<Animal> animalList;
    private DrawerLayout mDrawer;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mDrawer = (DrawerLayout) view.findViewById(R.id.drawer);
        rvAnimal = (RecyclerView) view.findViewById(R.id.rv_animal);

        //Xu ly mo menu trai

        view.findViewById(R.id.drawer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(GravityCompat.START);
            }
        });

        //Hien thi anh dong vat bien
        view.findViewById(R.id.iv_sea).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));
                showAnimals("sea");
            }
        });

        //dong vat co vu
        view.findViewById(R.id.iv_mammal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));
                showAnimals("mammal");
            }
        });

        //chim
        view.findViewById(R.id.iv_bird).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));
                showAnimals("bird");
            }
        });
    }


    //////show animal
    public void showAnimals(String animalType) {
        animalList = new ArrayList<>();
        if (animalType.equals("sea")) {
            animalList.add(new Animal(R.drawable.ic_crab, R.drawable.bg_crab, "Crab", getString(R.string.text_crab), false));
            animalList.add(new Animal(R.drawable.ic_red_snapper, R.drawable.bg_red_snapper, "Snapper", getString(R.string.text_snapper), false));
            animalList.add(new Animal(R.drawable.ic_jellyfish, R.drawable.bg_jellyfish, "Jellyfish", getString(R.string.text_jellyfish), false));
            animalList.add(new Animal(R.drawable.ic_octopus, R.drawable.bg_octopus, "Octopus", getString(R.string.text_octopus), false));
            animalList.add(new Animal(R.drawable.ic_shark, R.drawable.bg_shark, "Shark", getString(R.string.text_shark), false));
            animalList.add(new Animal(R.drawable.ic_squid, R.drawable.bg_squid, "Squid", getString(R.string.text_squid), false));
            animalList.add(new Animal(R.drawable.ic_swordfish, R.drawable.bg_swordfish, "Swordfish", getString(R.string.text_swordfish), false));
            animalList.add(new Animal(R.drawable.ic_turtle, R.drawable.bg_turtle, "Turtle", getString(R.string.text_turtle), false));
            animalList.add(new Animal(R.drawable.ic_whale, R.drawable.bg_whale, "Whale", getString(R.string.text_whale), false));
        } else if (animalType.equals("mammal")) {
            animalList.add(new Animal(R.drawable.ic_cat, R.drawable.bg_cat, "Cat", getString(R.string.text_cat), false));
            animalList.add(new Animal(R.drawable.ic_dog, R.drawable.bg_dog, "Dog", getString(R.string.text_dog), false));
            animalList.add(new Animal(R.drawable.ic_hippotamus, R.drawable.bg_hippotamus, "Hippotamus", getString(R.string.text_hippotamus), false));
            animalList.add(new Animal(R.drawable.ic_lion, R.drawable.bg_lion, "Lion", getString(R.string.text_lion), false));
            animalList.add(new Animal(R.drawable.ic_monkey, R.drawable.bg_monkey, "Monkey", getString(R.string.text_monkey), false));
            animalList.add(new Animal(R.drawable.ic_rabbit, R.drawable.bg_rabbit, "Rabbit", getString(R.string.text_rabbit), false));
            animalList.add(new Animal(R.drawable.ic_tiger, R.drawable.bg_tiger, "Tiger", getString(R.string.text_tiger), false));
            animalList.add(new Animal(R.drawable.ic_zibra, R.drawable.bg_zibra, "Zebra", getString(R.string.text_zebra), false));
            animalList.add(new Animal(R.drawable.ic_dolphin, R.drawable.bg_dolphin, "Dolphin", getString(R.string.text_dolphin), false));
        } else {
            animalList.add(new Animal(R.drawable.ic_eagle, R.drawable.bg_eagle, "Eagle", getString(R.string.text_eagle), false));
            animalList.add(new Animal(R.drawable.ic_falcon, R.drawable.bg_falcon, "Falcon", getString(R.string.text_falcon), false));
            animalList.add(new Animal(R.drawable.ic_hawk, R.drawable.bg_hawk, "Hawk", getString(R.string.text_hawk), false));
            animalList.add(new Animal(R.drawable.ic_parrot, R.drawable.bg_parrot, "Parrot", getString(R.string.text_parrot), false));
            animalList.add(new Animal(R.drawable.ic_peacock, R.drawable.bg_peacock, "Peacock", getString(R.string.text_peacock), false));
            animalList.add(new Animal(R.drawable.ic_peguin, R.drawable.bg_penguin, "Penguin", getString(R.string.text_penguin), false));
            animalList.add(new Animal(R.drawable.ic_raven, R.drawable.bg_raven, "Raven", getString(R.string.text_raven), false));
            animalList.add(new Animal(R.drawable.ic_sparrow, R.drawable.bg_sparrow, "Sparrow", getString(R.string.text_sparrow), false));
            animalList.add(new Animal(R.drawable.ic_woodpecker, R.drawable.bg_woodpecker, "Woodpecker", getString(R.string.text_woodpecker), false));
        }

        ////////////
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList, new IClickItemAnimalListener() {
            @Override
            public void onClickItemAnimal(Animal animal) {

                MainActivity mMainActivity = (MainActivity) getActivity();
                mMainActivity.gotoFragmentDetail(animal);
            }
        });
        rvAnimal.setAdapter(animalAdapter);
        mDrawer.closeDrawers();
    }

    //


}
