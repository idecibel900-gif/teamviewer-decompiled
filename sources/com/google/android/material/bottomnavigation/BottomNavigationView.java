package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ep3;
import o.g90;
import o.h90;
import o.hz5;
import o.i90;
import o.l05;
import o.xk0;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends l05 {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ep3 ep3VarF = xk0.F(getContext(), attributeSet, hz5.d, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        setItemHorizontalTranslationEnabled(((TypedArray) ep3VarF.f733o).getBoolean(0, true));
        ep3VarF.B();
    }

    @Override // o.l05
    public int getMaxItemCount() {
        return 5;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        g90 g90Var = (g90) getMenuView();
        if (g90Var.M != z) {
            g90Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().c(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(h90 h90Var) {
        setOnItemReselectedListener(h90Var);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(i90 i90Var) {
        setOnItemSelectedListener(i90Var);
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }
}
