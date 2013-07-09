package com.survivalguide;

import java.util.List;
import java.util.Vector;
import Menu.*;
import android.annotation.TargetApi;
import android.app.*;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class Menu extends FragmentActivity{
	private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.menu);
		

	// Création de la liste de Fragments que fera défiler le PagerAdapter
	List fragments = new Vector();

	// Ajout des Fragments dans la liste
	fragments.add(Fragment.instantiate(this,ESN.class.getName()));
	fragments.add(Fragment.instantiate(this,University.class.getName()));
	fragments.add(Fragment.instantiate(this,YourArrival.class.getName()));
	fragments.add(Fragment.instantiate(this,LilleAndItsRegion.class.getName()));
	fragments.add(Fragment.instantiate(this,PracticalInfos.class.getName()));

	// Création de l'adapter qui s'occupera de l'affichage de la liste de
	// Fragments
	this.mPagerAdapter = new MenuAdapter(super.getSupportFragmentManager(), fragments);

	ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
	// Affectation de l'adapter au ViewPager
	pager.setAdapter(this.mPagerAdapter);
	}

}