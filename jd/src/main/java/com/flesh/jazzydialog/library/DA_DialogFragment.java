package com.flesh.jazzydialog.library;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by aaronfleshner on 6/2/14.
 */
public class DA_DialogFragment extends DialogFragment {

    public static DA_DialogFragment fragmentInstance(int animationStyle, int ContentView) {
        DA_DialogFragment frag = new DA_DialogFragment();
        Bundle args = new Bundle();
        args.putInt("Animation", animationStyle);
        args.putInt("ContentView", ContentView);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int style = getArguments().getInt("Animation");
        int resId = getArguments().getInt("ContentView");
        final JazzyDialog dialog = new JazzyDialog(getActivity());
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        dialog.setCustomAnimationViaStyle(style);
        dialog.setContentView(resId);

        return dialog;
    }


}
