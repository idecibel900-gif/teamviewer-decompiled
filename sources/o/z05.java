package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z05 extends d66 {
    public final ArrayList c = new ArrayList();
    public pp4 d;
    public boolean e;
    public final /* synthetic */ h15 f;

    public z05(h15 h15Var) {
        this.f = h15Var;
        h();
    }

    @Override // o.d66
    public final int a() {
        return this.c.size();
    }

    @Override // o.d66
    public final long b(int i) {
        return i;
    }

    @Override // o.d66
    public final int c(int i) {
        b15 b15Var = (b15) this.c.get(i);
        if (b15Var instanceof c15) {
            return 2;
        }
        if (b15Var instanceof a15) {
            return 3;
        }
        if (b15Var instanceof d15) {
            return ((d15) b15Var).a.hasSubMenu() ? 1 : 0;
        }
        hk0.o("Unknown item type.");
        return 0;
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        View view = ((g15) c76Var).m;
        int iC = c(i);
        ArrayList arrayList = this.c;
        if (iC != 0) {
            if (iC == 1) {
                ((TextView) view).setText(((d15) arrayList.get(i)).a.e);
                return;
            } else {
                if (iC != 2) {
                    return;
                }
                c15 c15Var = (c15) arrayList.get(i);
                view.setPadding(0, c15Var.a, 0, c15Var.b);
                return;
            }
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        h15 h15Var = this.f;
        navigationMenuItemView.setIconTintList(h15Var.v);
        if (h15Var.t) {
            navigationMenuItemView.setTextAppearance(h15Var.s);
        }
        ColorStateList colorStateList = h15Var.u;
        if (colorStateList != null) {
            navigationMenuItemView.setTextColor(colorStateList);
        }
        Drawable drawable = h15Var.w;
        Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = be8.a;
        navigationMenuItemView.setBackground(drawableNewDrawable);
        d15 d15Var = (d15) arrayList.get(i);
        navigationMenuItemView.setNeedsEmptyIcon(d15Var.b);
        navigationMenuItemView.setHorizontalPadding(h15Var.x);
        navigationMenuItemView.setIconPadding(h15Var.y);
        if (h15Var.A) {
            navigationMenuItemView.setIconSize(h15Var.z);
        }
        navigationMenuItemView.setMaxLines(h15Var.C);
        navigationMenuItemView.a(d15Var.a);
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        h15 h15Var = this.f;
        if (i == 0) {
            LayoutInflater layoutInflater = h15Var.r;
            o6 o6Var = h15Var.G;
            View viewInflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            f15 f15Var = new f15(viewInflate);
            viewInflate.setOnClickListener(o6Var);
            return f15Var;
        }
        if (i == 1) {
            return new y05(h15Var.r.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new y05(h15Var.r.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new y05(h15Var.n);
    }

    @Override // o.d66
    public final void g(c76 c76Var) {
        g15 g15Var = (g15) c76Var;
        if (g15Var instanceof f15) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) g15Var.m;
            FrameLayout frameLayout = navigationMenuItemView.L;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.K.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h() {
        boolean z;
        if (this.e) {
            return;
        }
        this.e = true;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(new a15());
        h15 h15Var = this.f;
        int size = h15Var.f941o.n().size();
        boolean z2 = false;
        int i = -1;
        int i2 = 0;
        boolean z3 = false;
        int size2 = 0;
        while (i2 < size) {
            pp4 pp4Var = (pp4) h15Var.f941o.n().get(i2);
            if (pp4Var.isChecked()) {
                i(pp4Var);
            }
            if (pp4Var.isCheckable()) {
                pp4Var.f(z2);
            }
            if (pp4Var.hasSubMenu()) {
                gd7 gd7Var = pp4Var.f1761o;
                if (gd7Var.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new c15(h15Var.E, z2 ? 1 : 0));
                    }
                    arrayList.add(new d15(pp4Var));
                    int size3 = gd7Var.f.size();
                    int i3 = z2 ? 1 : 0;
                    int i4 = i3;
                    while (i3 < size3) {
                        pp4 pp4Var2 = (pp4) gd7Var.getItem(i3);
                        if (pp4Var2.isVisible()) {
                            if (i4 == 0 && pp4Var2.getIcon() != null) {
                                i4 = 1;
                            }
                            if (pp4Var2.isCheckable()) {
                                pp4Var2.f(z2);
                            }
                            if (pp4Var.isChecked()) {
                                i(pp4Var);
                            }
                            arrayList.add(new d15(pp4Var2));
                        }
                        i3++;
                        z2 = false;
                    }
                    if (i4 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((d15) arrayList.get(size5)).b = true;
                        }
                    }
                }
                z = true;
            } else {
                int i5 = pp4Var.b;
                if (i5 != i) {
                    size2 = arrayList.size();
                    z3 = pp4Var.getIcon() != null;
                    if (i2 != 0) {
                        size2++;
                        int i6 = h15Var.E;
                        arrayList.add(new c15(i6, i6));
                    }
                } else {
                    if (!z3 && pp4Var.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i7 = size2; i7 < size6; i7++) {
                            ((d15) arrayList.get(i7)).b = true;
                        }
                        z = true;
                        z3 = true;
                    }
                    d15 d15Var = new d15(pp4Var);
                    d15Var.b = z3;
                    arrayList.add(d15Var);
                    i = i5;
                }
                z = true;
                d15 d15Var2 = new d15(pp4Var);
                d15Var2.b = z3;
                arrayList.add(d15Var2);
                i = i5;
            }
            i2++;
            z2 = false;
        }
        this.e = z2 ? 1 : 0;
    }

    public final void i(pp4 pp4Var) {
        if (this.d == pp4Var || !pp4Var.isCheckable()) {
            return;
        }
        pp4 pp4Var2 = this.d;
        if (pp4Var2 != null) {
            pp4Var2.setChecked(false);
        }
        this.d = pp4Var;
        pp4Var.setChecked(true);
    }
}
