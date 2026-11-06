package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class xb4 implements gq4, AdapterView.OnItemClickListener {
    public Context m;
    public LayoutInflater n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jp4 f2503o;
    public ExpandedMenuView p;
    public fq4 q;
    public wb4 r;

    public xb4(ContextWrapper contextWrapper) {
        this.m = contextWrapper;
        this.n = LayoutInflater.from(contextWrapper);
    }

    @Override // o.gq4
    public final void b(jp4 jp4Var, boolean z) {
        fq4 fq4Var = this.q;
        if (fq4Var != null) {
            fq4Var.b(jp4Var, z);
        }
    }

    @Override // o.gq4
    public final void c(boolean z) {
        wb4 wb4Var = this.r;
        if (wb4Var != null) {
            wb4Var.notifyDataSetChanged();
        }
    }

    @Override // o.gq4
    public final void d(Context context, jp4 jp4Var) {
        if (this.m != null) {
            this.m = context;
            if (this.n == null) {
                this.n = LayoutInflater.from(context);
            }
        }
        this.f2503o = jp4Var;
        wb4 wb4Var = this.r;
        if (wb4Var != null) {
            wb4Var.notifyDataSetChanged();
        }
    }

    @Override // o.gq4
    public final boolean e() {
        return false;
    }

    @Override // o.gq4
    public final boolean f(gd7 gd7Var) {
        boolean zHasVisibleItems = gd7Var.hasVisibleItems();
        Context context = gd7Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        lp4 lp4Var = new lp4();
        lp4Var.m = gd7Var;
        nd ndVar = new nd(context);
        jd jdVar = (jd) ndVar.f1562o;
        xb4 xb4Var = new xb4(jdVar.a);
        lp4Var.f1391o = xb4Var;
        xb4Var.q = lp4Var;
        gd7Var.b(xb4Var, context);
        xb4 xb4Var2 = lp4Var.f1391o;
        wb4 wb4Var = xb4Var2.r;
        if (wb4Var == null) {
            wb4Var = new wb4(xb4Var2);
            xb4Var2.r = wb4Var;
        }
        jdVar.p = wb4Var;
        jdVar.q = lp4Var;
        View view = gd7Var.f1189o;
        if (view != null) {
            jdVar.e = view;
        } else {
            jdVar.c = gd7Var.n;
            jdVar.d = gd7Var.m;
        }
        jdVar.n = lp4Var;
        od odVarE = ndVar.e();
        lp4Var.n = odVarE;
        odVarE.setOnDismissListener(lp4Var);
        WindowManager.LayoutParams attributes = lp4Var.n.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lp4Var.n.show();
        fq4 fq4Var = this.q;
        if (fq4Var == null) {
            return true;
        }
        fq4Var.m0(gd7Var);
        return true;
    }

    @Override // o.gq4
    public final int getId() {
        return 0;
    }

    @Override // o.gq4
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.p.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.gq4
    public final boolean j(pp4 pp4Var) {
        return false;
    }

    @Override // o.gq4
    public final void k(fq4 fq4Var) {
        throw null;
    }

    @Override // o.gq4
    public final Parcelable l() {
        if (this.p == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.p;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // o.gq4
    public final boolean m(pp4 pp4Var) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f2503o.s(this.r.getItem(i), this, 0);
    }
}
