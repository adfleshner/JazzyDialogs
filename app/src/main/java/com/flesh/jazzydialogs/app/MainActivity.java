package com.flesh.jazzydialogs.app;

import android.app.Activity;
import android.app.ActionBar;
import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

       private Button btnFade, btnSIFTWB, btnSIFTWOB,btnInRightOutLeft;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            btnFade = (Button) rootView.findViewById(R.id.btnFade);
            btnSIFTWB = (Button) rootView.findViewById(R.id.btnSIFTWB);
            btnSIFTWOB = (Button) rootView.findViewById(R.id.btnSIFRTWOB);
            btnInRightOutLeft = (Button) rootView.findViewById(R.id.btnInRightOutLeft);
            return rootView;
        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            btnFade.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DA_DialogFragment mDialogFragment = DA_DialogFragment.fragmentInstance(R.style.DA_Fade);
                    mDialogFragment.show(getFragmentManager(),"TAG");
                }
            });

            btnSIFTWB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DA_DialogFragment mDialogFragment = DA_DialogFragment.fragmentInstance(R.style.DA_SlideInFromTopWithBounce);
                    mDialogFragment.show(getFragmentManager(),"TAG");
                }
            });
            btnSIFTWOB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DA_DialogFragment mDialogFragment = DA_DialogFragment.fragmentInstance(R.style.DA_SlideInFromTop);
                    mDialogFragment.show(getFragmentManager(),"TAG");
                }
            });

            btnInRightOutLeft.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DA_DialogFragment mDialogFragment = DA_DialogFragment.fragmentInstance(R.style.DA_SlideInFromLeftOutRight);
                    mDialogFragment.show(getFragmentManager(),"TAG");
                }
            });



        }
    }
}
