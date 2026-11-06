package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class we7 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ xe7 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2406o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public qp4 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public we7(xe7 xe7Var, Menu menu) {
        this.E = xe7Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            io.sentry.android.core.v0.l("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        xe7 xe7Var = this.E;
        Context context = xe7Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                hk0.l("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = xe7Var.d;
            if (objA == null) {
                objA = xe7.a(context);
                xe7Var.d = objA;
            }
            String str = this.y;
            ve7 ve7Var = new ve7();
            ve7Var.n = objA;
            Class<?> cls = objA.getClass();
            try {
                ve7Var.f2303o = cls.getMethod(str, ve7.p);
                menuItem.setOnMenuItemClickListener(ve7Var);
            } catch (Exception e) {
                StringBuilder sbP = ua5.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbP.append(cls.getName());
                InflateException inflateException = new InflateException(sbP.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof pp4) {
                ((pp4) menuItem).f(true);
            } else if (menuItem instanceof tp4) {
                tp4 tp4Var = (tp4) menuItem;
                ye7 ye7Var = tp4Var.c;
                try {
                    Method declaredMethod = tp4Var.d;
                    if (declaredMethod == null) {
                        declaredMethod = ye7Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        tp4Var.d = declaredMethod;
                    }
                    declaredMethod.invoke(ye7Var, Boolean.TRUE);
                } catch (Exception e2) {
                    io.sentry.android.core.v0.l("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, xe7.e, xe7Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                io.sentry.android.core.v0.j("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        qp4 qp4Var = this.z;
        if (qp4Var != null) {
            if (menuItem instanceof ye7) {
                ((ye7) menuItem).b(qp4Var);
            } else {
                io.sentry.android.core.v0.j("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof ye7;
        if (z2) {
            ((ye7) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((ye7) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.f2406o;
        if (z2) {
            ((ye7) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((ye7) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((ye7) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((ye7) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
