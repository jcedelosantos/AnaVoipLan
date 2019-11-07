package com.example.icg_dominicana.anavoip.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.icg_dominicana.anavoip.Adapters.PagerAdapter;
import com.example.icg_dominicana.anavoip.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TabLayout tabLayout =  (TabLayout) findViewById( R.id.id_tapLayout );
        tabLayout.addTab( tabLayout.newTab().setText( "Gestion" ) );
        tabLayout.addTab( tabLayout.newTab().setText( "Reports" ) );
        tabLayout.addTab( tabLayout.newTab().setText( "Entities" ) );
        tabLayout.setTabGravity( TabLayout.GRAVITY_FILL );


        final ViewPager viewPager = (ViewPager) findViewById( R.id.id_viewPager );
        PagerAdapter pagerAdapter = new PagerAdapter( getSupportFragmentManager(), tabLayout.getTabCount() );

        viewPager.setAdapter( pagerAdapter );
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener( tabLayout ) );

        tabLayout.addOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem( position );
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        } );
    }
}
