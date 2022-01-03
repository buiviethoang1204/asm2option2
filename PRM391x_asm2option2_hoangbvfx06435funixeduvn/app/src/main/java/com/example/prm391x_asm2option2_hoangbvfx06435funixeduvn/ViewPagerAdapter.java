package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Animal> mListAnimal;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Animal> mListAnimal) {
        super(fm, behavior);
        this.mListAnimal = mListAnimal;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (mListAnimal == null || mListAnimal.isEmpty()) {
            return null;
        }

        return new FragmentDetail();

    }

    @Override
    public int getCount() {
        if (mListAnimal != null) {
            return mListAnimal.size();
        }
        return 0;
    }
}
