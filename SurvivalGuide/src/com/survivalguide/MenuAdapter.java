package com.survivalguide;

import java.util.List;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MenuAdapter extends FragmentPagerAdapter{
	private final List fragments;

	//On fournit � l'adapter la liste des fragments � afficher
	public MenuAdapter(FragmentManager fm, List fragments) {
		super(fm);
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		return (Fragment) this.fragments.get(position);
	}

	@Override
	public int getCount() {
		return this.fragments.size();
	}
}
