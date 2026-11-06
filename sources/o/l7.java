package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l7 implements gq4 {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public h7 F;
    public h7 G;
    public it8 H;
    public i7 I;
    public int K;
    public final Context m;
    public Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jp4 f1334o;
    public final LayoutInflater p;
    public fq4 q;
    public jq4 t;
    public int u;
    public j7 v;
    public Drawable w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final int r = R.layout.abc_action_menu_layout;
    public final int s = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray E = new SparseBooleanArray();
    public final df6 J = new df6((Object) this, (byte) 7);

    public l7(Context context) {
        this.m = context;
        this.p = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(pp4 pp4Var, View view, ViewGroup viewGroup) {
        View actionView = pp4Var.getActionView();
        if (actionView == null || pp4Var.e()) {
            iq4 iq4Var = view instanceof iq4 ? (iq4) view : (iq4) this.p.inflate(this.s, viewGroup, false);
            iq4Var.a(pp4Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) iq4Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.t);
            i7 i7Var = this.I;
            if (i7Var == null) {
                i7Var = new i7(this);
                this.I = i7Var;
            }
            actionMenuItemView.setPopupCallback(i7Var);
            actionView = (View) iq4Var;
        }
        actionView.setVisibility(pp4Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof n7)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // o.gq4
    public final void b(jp4 jp4Var, boolean z) {
        g();
        h7 h7Var = this.G;
        if (h7Var != null && h7Var.b()) {
            h7Var.i.dismiss();
        }
        fq4 fq4Var = this.q;
        if (fq4Var != null) {
            fq4Var.b(jp4Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.gq4
    public final void c(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.t;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            jp4 jp4Var = this.f1334o;
            if (jp4Var != null) {
                jp4Var.k();
                ArrayList arrayListN = this.f1334o.n();
                int size = arrayListN.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    pp4 pp4Var = (pp4) arrayListN.get(i2);
                    if ((pp4Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        pp4 itemData = childAt instanceof iq4 ? ((iq4) childAt).getItemData() : null;
                        View viewA = a(pp4Var, childAt, viewGroup);
                        if (pp4Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.t).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.v) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.t).requestLayout();
        jp4 jp4Var2 = this.f1334o;
        if (jp4Var2 != null) {
            jp4Var2.k();
            ArrayList arrayList2 = jp4Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                qp4 qp4Var = ((pp4) arrayList2.get(i3)).A;
            }
        }
        jp4 jp4Var3 = this.f1334o;
        if (jp4Var3 != null) {
            jp4Var3.k();
            arrayList = jp4Var3.j;
        }
        if (this.y && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((pp4) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        j7 j7Var = this.v;
        if (z2) {
            if (j7Var == null) {
                j7Var = new j7(this, this.m);
                this.v = j7Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) j7Var.getParent();
            if (viewGroup3 != this.t) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.v);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.t;
                j7 j7Var2 = this.v;
                actionMenuView.getClass();
                n7 n7VarJ = ActionMenuView.j();
                n7VarJ.a = true;
                actionMenuView.addView(j7Var2, n7VarJ);
            }
        } else if (j7Var != null) {
            Object parent = j7Var.getParent();
            Object obj = this.t;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.v);
            }
        }
        ((ActionMenuView) this.t).setOverflowReserved(this.y);
    }

    @Override // o.gq4
    public final void d(Context context, jp4 jp4Var) {
        this.n = context;
        LayoutInflater.from(context);
        this.f1334o = jp4Var;
        Resources resources = context.getResources();
        if (!this.z) {
            this.y = true;
        }
        int i = 2;
        this.A = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.C = i;
        int measuredWidth = this.A;
        if (this.y) {
            if (this.v == null) {
                j7 j7Var = new j7(this, this.m);
                this.v = j7Var;
                if (this.x) {
                    j7Var.setImageDrawable(this.w);
                    this.w = null;
                    this.x = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.v.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.v.getMeasuredWidth();
        } else {
            this.v = null;
        }
        this.B = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // o.gq4
    public final boolean e() {
        int size;
        ArrayList arrayListN;
        int i;
        boolean z;
        l7 l7Var = this;
        jp4 jp4Var = l7Var.f1334o;
        if (jp4Var != null) {
            arrayListN = jp4Var.n();
            size = arrayListN.size();
        } else {
            size = 0;
            arrayListN = null;
        }
        int i2 = l7Var.C;
        int i3 = l7Var.B;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) l7Var.t;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            pp4 pp4Var = (pp4) arrayListN.get(i4);
            int i7 = pp4Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (l7Var.D && pp4Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (l7Var.y && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = l7Var.E;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            pp4 pp4Var2 = (pp4) arrayListN.get(i9);
            int i11 = pp4Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = pp4Var2.b;
            if (z3) {
                View viewA = l7Var.a(pp4Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                pp4Var2.g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = l7Var.a(pp4Var2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            pp4 pp4Var3 = (pp4) arrayListN.get(i13);
                            if (pp4Var3.b == i12) {
                                if ((pp4Var3.x & 32) == 32) {
                                    i8++;
                                }
                                pp4Var3.g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    pp4Var2.g(z5);
                } else {
                    pp4Var2.g(false);
                }
                i9++;
                i = 2;
                l7Var = this;
                z = true;
            }
            i9++;
            i = 2;
            l7Var = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.gq4
    public final boolean f(gd7 gd7Var) {
        boolean z;
        if (gd7Var.hasVisibleItems()) {
            gd7 gd7Var2 = gd7Var;
            while (true) {
                jp4 jp4Var = gd7Var2.z;
                if (jp4Var == this.f1334o) {
                    break;
                }
                gd7Var2 = (gd7) jp4Var;
            }
            pp4 pp4Var = gd7Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.t;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof iq4) && ((iq4) childAt).getItemData() == pp4Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.K = gd7Var.A.a;
                int size = gd7Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = gd7Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                h7 h7Var = new h7(this, this.n, gd7Var, view);
                this.G = h7Var;
                h7Var.g = z;
                wp4 wp4Var = h7Var.i;
                if (wp4Var != null) {
                    wp4Var.q(z);
                }
                h7 h7Var2 = this.G;
                if (!h7Var2.b()) {
                    if (h7Var2.e == null) {
                        hk0.l("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    h7Var2.d(0, 0, false, false);
                }
                fq4 fq4Var = this.q;
                if (fq4Var != null) {
                    fq4Var.m0(gd7Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        Object obj;
        it8 it8Var = this.H;
        if (it8Var != null && (obj = this.t) != null) {
            ((View) obj).removeCallbacks(it8Var);
            this.H = null;
            return true;
        }
        h7 h7Var = this.F;
        if (h7Var == null) {
            return false;
        }
        if (h7Var.b()) {
            h7Var.i.dismiss();
        }
        return true;
    }

    @Override // o.gq4
    public final int getId() {
        return this.u;
    }

    @Override // o.gq4
    public final void h(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof k7) && (i = ((k7) parcelable).m) > 0 && (menuItemFindItem = this.f1334o.findItem(i)) != null) {
            f((gd7) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean i() {
        h7 h7Var = this.F;
        return h7Var != null && h7Var.b();
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
        k7 k7Var = new k7();
        k7Var.m = this.K;
        return k7Var;
    }

    @Override // o.gq4
    public final boolean m(pp4 pp4Var) {
        return false;
    }

    public final boolean n() {
        jp4 jp4Var;
        boolean z = false;
        if (this.y && !i() && (jp4Var = this.f1334o) != null && this.t != null && this.H == null) {
            jp4Var.k();
            if (!jp4Var.j.isEmpty()) {
                it8 it8Var = new it8((byte) 1, this, new h7(this, this.n, this.f1334o, this.v), z);
                this.H = it8Var;
                ((View) this.t).post(it8Var);
                return true;
            }
        }
        return false;
    }
}
