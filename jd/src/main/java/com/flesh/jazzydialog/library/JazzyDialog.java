package com.flesh.jazzydialog.library;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by aaronfleshner on 6/1/14.
 */
public class JazzyDialog extends Dialog {

    public JazzyDialog(Context context) {
        super(context);
    }

    public JazzyDialog(Context context, int theme) {
        super(context, theme);
    }

    protected JazzyDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public void setCustomAnimationViaStyle(int style) {
        this.getWindow().getAttributes().windowAnimations = style;
    }


}
