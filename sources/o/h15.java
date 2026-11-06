package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h15 implements gq4 {
    public boolean A;
    public int C;
    public int D;
    public int E;
    public NavigationMenuView m;
    public LinearLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jp4 f941o;
    public boolean p;
    public z05 q;
    public LayoutInflater r;
    public int s;
    public boolean t;
    public ColorStateList u;
    public ColorStateList v;
    public Drawable w;
    public int x;
    public int y;
    public int z;
    public boolean B = true;
    public int F = -1;
    public final o6 G = new o6(this, 7);

    @Override // o.gq4
    public final void b(jp4 jp4Var, boolean z) {
    }

    @Override // o.gq4
    public final void c(boolean z) {
        z05 z05Var = this.q;
        if (z05Var != null) {
            z05Var.h();
            z05Var.d();
        }
    }

    @Override // o.gq4
    public final void d(Context context, jp4 jp4Var) {
        this.r = LayoutInflater.from(context);
        this.f941o = jp4Var;
        this.E = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // o.gq4
    public final boolean e() {
        return false;
    }

    @Override // o.gq4
    public final boolean f(gd7 gd7Var) {
        return false;
    }

    @Override // o.gq4
    public final int getId() {
        return this.p ? 1 : 0;
    }

    @Override // o.gq4
    public final void h(Parcelable parcelable) {
        pp4 pp4Var;
        View actionView;
        cg5 cg5Var;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.m.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                z05 z05Var = this.q;
                ArrayList arrayList = z05Var.c;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    z05Var.e = true;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        b15 b15Var = (b15) arrayList.get(i2);
                        if (b15Var instanceof d15) {
                            pp4 pp4Var2 = ((d15) b15Var).a;
                            if (pp4Var2.a == i) {
                                z05Var.i(pp4Var2);
                                break;
                            }
                        }
                    }
                    z05Var.e = false;
                    z05Var.h();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        b15 b15Var2 = (b15) arrayList.get(i3);
                        if ((b15Var2 instanceof d15) && (actionView = (pp4Var = ((d15) b15Var2).a).getActionView()) != null && (cg5Var = (cg5) sparseParcelableArray2.get(pp4Var.a)) != null) {
                            actionView.restoreHierarchyState(cg5Var);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.n.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // o.gq4
    public final boolean j(pp4 pp4Var) {
        return false;
    }

    @Override // o.gq4
    public final Parcelable l() {
        pp4 pp4Var;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.m != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.m.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        z05 z05Var = this.q;
        if (z05Var != null) {
            ArrayList arrayList = z05Var.c;
            Bundle bundle2 = new Bundle();
            pp4 pp4Var2 = z05Var.d;
            if (pp4Var2 != null) {
                bundle2.putInt("android:menu:checked", pp4Var2.a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b15 b15Var = (b15) arrayList.get(i);
                if ((b15Var instanceof d15) && (actionView = (pp4Var = ((d15) b15Var).a).getActionView()) != null) {
                    cg5 cg5Var = new cg5();
                    actionView.saveHierarchyState(cg5Var);
                    sparseArray2.put(pp4Var.a, cg5Var);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.n != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.n.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // o.gq4
    public final boolean m(pp4 pp4Var) {
        return false;
    }
}
