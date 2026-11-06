package o;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class eu {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final a07 h = new a07(0);
    public final Object[] a = new Object[2];

    public yr a(Context context, AttributeSet attributeSet) {
        return new yr(context, attributeSet);
    }

    public as b(Context context, AttributeSet attributeSet) {
        return new as(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.buttonStyle);
    }

    public cs c(Context context, AttributeSet attributeSet) {
        return new cs(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.checkboxStyle);
    }

    public at d(Context context, AttributeSet attributeSet) {
        return new at(context, attributeSet);
    }

    public yt e(Context context, AttributeSet attributeSet) {
        return new yt(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        a07 a07Var = h;
        Constructor constructor = (Constructor) a07Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            a07Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
