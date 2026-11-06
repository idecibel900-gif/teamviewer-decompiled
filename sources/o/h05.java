package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class h05 implements gq4 {
    public g90 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f936o;

    @Override // o.gq4
    public final void b(jp4 jp4Var, boolean z) {
    }

    @Override // o.gq4
    public final void c(boolean z) {
        if (this.n) {
            return;
        }
        g90 g90Var = this.m;
        if (z) {
            g90Var.a();
            return;
        }
        jp4 jp4Var = g90Var.E;
        if (jp4Var == null || g90Var.r == null) {
            return;
        }
        int size = jp4Var.f.size();
        if (size != g90Var.r.length) {
            g90Var.a();
            return;
        }
        int i = g90Var.s;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = g90Var.E.getItem(i2);
            if (item.isChecked()) {
                g90Var.s = item.getItemId();
                g90Var.t = i2;
            }
        }
        if (i != g90Var.s) {
            b28.a(g90Var, g90Var.m);
        }
        int i3 = g90Var.q;
        boolean z2 = i3 != -1 ? i3 == 0 : g90Var.E.n().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            g90Var.D.n = true;
            g90Var.r[i4].setLabelVisibilityMode(g90Var.q);
            g90Var.r[i4].setShifting(z2);
            g90Var.r[i4].a((pp4) g90Var.E.getItem(i4));
            g90Var.D.n = false;
        }
    }

    @Override // o.gq4
    public final void d(Context context, jp4 jp4Var) {
        this.m.E = jp4Var;
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
        return this.f936o ? 1 : 0;
    }

    @Override // o.gq4
    public final void h(Parcelable parcelable) {
        int iMax;
        if (parcelable instanceof g05) {
            g90 g90Var = this.m;
            g05 g05Var = (g05) parcelable;
            int i = g05Var.m;
            int size = g90Var.E.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = g90Var.E.getItem(i2);
                if (i == item.getItemId()) {
                    g90Var.s = i;
                    g90Var.t = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.m.getContext();
            cg5 cg5Var = g05Var.n;
            SparseArray<o20> sparseArray = new SparseArray<>(cg5Var.size());
            for (int i3 = 0; i3 < cg5Var.size(); i3++) {
                int iKeyAt = cg5Var.keyAt(i3);
                n20 n20Var = (n20) cg5Var.valueAt(i3);
                if (n20Var == null) {
                    hk0.g("BadgeDrawable's savedState cannot be null");
                    return;
                }
                o20 o20Var = new o20(context);
                o20Var.g(n20Var.q);
                int i4 = n20Var.p;
                bq7 bq7Var = o20Var.f1621o;
                n20 n20Var2 = o20Var.t;
                if (i4 != -1 && n20Var2.p != (iMax = Math.max(0, i4))) {
                    n20Var2.p = iMax;
                    bq7Var.d = true;
                    o20Var.i();
                    o20Var.invalidateSelf();
                }
                int i5 = n20Var.m;
                n20Var2.m = i5;
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(i5);
                qn4 qn4Var = o20Var.n;
                if (qn4Var.m.c != colorStateListValueOf) {
                    qn4Var.l(colorStateListValueOf);
                    o20Var.invalidateSelf();
                }
                int i6 = n20Var.n;
                n20Var2.n = i6;
                if (bq7Var.a.getColor() != i6) {
                    bq7Var.a.setColor(i6);
                    o20Var.invalidateSelf();
                }
                o20Var.f(n20Var.u);
                n20Var2.w = n20Var.w;
                o20Var.i();
                n20Var2.x = n20Var.x;
                o20Var.i();
                n20Var2.y = n20Var.y;
                o20Var.i();
                n20Var2.z = n20Var.z;
                o20Var.i();
                boolean z = n20Var.v;
                o20Var.setVisible(z, false);
                n20Var2.v = z;
                sparseArray.put(iKeyAt, o20Var);
            }
            this.m.setBadgeDrawables(sparseArray);
        }
    }

    @Override // o.gq4
    public final boolean j(pp4 pp4Var) {
        return false;
    }

    @Override // o.gq4
    public final Parcelable l() {
        g05 g05Var = new g05();
        g05Var.m = this.m.getSelectedItemId();
        SparseArray<o20> badgeDrawables = this.m.getBadgeDrawables();
        cg5 cg5Var = new cg5();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            o20 o20VarValueAt = badgeDrawables.valueAt(i);
            if (o20VarValueAt == null) {
                hk0.g("badgeDrawable cannot be null");
                return null;
            }
            cg5Var.put(iKeyAt, o20VarValueAt.t);
        }
        g05Var.n = cg5Var;
        return g05Var;
    }

    @Override // o.gq4
    public final boolean m(pp4 pp4Var) {
        return false;
    }
}
