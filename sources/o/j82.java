package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class j82 extends wj5 {
    @Override // o.wj5
    public final void k(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        RectF rectFD = wj5.d(tabLayout, view);
        RectF rectFD2 = wj5.d(tabLayout, view2);
        if (rectFD.left < rectFD2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
        }
        int i = (int) rectFD.left;
        int i2 = (int) rectFD2.left;
        LinearInterpolator linearInterpolator = lo.a;
        int iRound = Math.round(fSin * (i2 - i)) + i;
        int i3 = drawable.getBounds().top;
        int i4 = (int) rectFD.right;
        drawable.setBounds(iRound, i3, Math.round(fCos * (((int) rectFD2.right) - i4)) + i4, drawable.getBounds().bottom);
    }
}
