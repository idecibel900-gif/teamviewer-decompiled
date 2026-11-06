package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends i66 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f1572o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c76) arrayList.get(size)).m.animate().cancel();
        }
    }

    @Override // o.i66
    public final boolean a(c76 c76Var, c76 c76Var2, lf1 lf1Var, lf1 lf1Var2) {
        int i;
        int i2;
        int i3 = lf1Var.b;
        int i4 = lf1Var.c;
        if (c76Var2.p()) {
            int i5 = lf1Var.b;
            i2 = lf1Var.c;
            i = i5;
        } else {
            i = lf1Var2.b;
            i2 = lf1Var2.c;
        }
        if (c76Var == c76Var2) {
            return g(c76Var, i3, i4, i, i2);
        }
        View view = c76Var.m;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(c76Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c76Var2.m;
        l(c76Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        lk1 lk1Var = new lk1();
        lk1Var.a = c76Var;
        lk1Var.b = c76Var2;
        lk1Var.c = i3;
        lk1Var.d = i4;
        lk1Var.e = i;
        lk1Var.f = i2;
        arrayList.add(lk1Var);
        return true;
    }

    @Override // o.i66
    public final void d(c76 c76Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = c76Var.m;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((mk1) arrayList4.get(size)).a == c76Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c76Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, c76Var);
        if (this.h.remove(c76Var)) {
            view.setAlpha(1.0f);
            c(c76Var);
        }
        if (this.i.remove(c76Var)) {
            view.setAlpha(1.0f);
            c(c76Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, c76Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((mk1) arrayList6.get(size4)).a == c76Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c76Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(c76Var)) {
                view.setAlpha(1.0f);
                c(c76Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(c76Var);
        this.f1572o.remove(c76Var);
        this.r.remove(c76Var);
        this.p.remove(c76Var);
        i();
    }

    @Override // o.i66
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            mk1 mk1Var = (mk1) arrayList7.get(size);
            View view = mk1Var.a.m;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(mk1Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((c76) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c76 c76Var = (c76) arrayList5.get(size3);
            c76Var.m.setAlpha(1.0f);
            c(c76Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            lk1 lk1Var = (lk1) arrayList.get(size4);
            c76 c76Var2 = lk1Var.a;
            if (c76Var2 != null) {
                k(lk1Var, c76Var2);
            }
            c76 c76Var3 = lk1Var.b;
            if (c76Var3 != null) {
                k(lk1Var, c76Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    mk1 mk1Var2 = (mk1) arrayList8.get(size6);
                    View view2 = mk1Var2.a.m;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(mk1Var2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    c76 c76Var4 = (c76) arrayList9.get(size8);
                    c76Var4.m.setAlpha(1.0f);
                    c(c76Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    lk1 lk1Var2 = (lk1) arrayList10.get(size10);
                    c76 c76Var5 = lk1Var2.a;
                    if (c76Var5 != null) {
                        k(lk1Var2, c76Var5);
                    }
                    c76 c76Var6 = lk1Var2.b;
                    if (c76Var6 != null) {
                        k(lk1Var2, c76Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.f1572o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                io.sentry.h2.f();
            }
        }
    }

    @Override // o.i66
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.f1572o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(c76 c76Var, int i, int i2, int i3, int i4) {
        View view = c76Var.m;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c76Var.m.getTranslationY());
        l(c76Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(c76Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        mk1 mk1Var = new mk1();
        mk1Var.a = c76Var;
        mk1Var.b = translationX;
        mk1Var.c = translationY;
        mk1Var.d = i3;
        mk1Var.e = i4;
        arrayList.add(mk1Var);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            io.sentry.h2.f();
        }
    }

    public final void j(ArrayList arrayList, c76 c76Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lk1 lk1Var = (lk1) arrayList.get(size);
            if (k(lk1Var, c76Var) && lk1Var.a == null && lk1Var.b == null) {
                arrayList.remove(lk1Var);
            }
        }
    }

    public final boolean k(lk1 lk1Var, c76 c76Var) {
        if (lk1Var.b == c76Var) {
            lk1Var.b = null;
        } else {
            if (lk1Var.a != c76Var) {
                return false;
            }
            lk1Var.a = null;
        }
        View view = c76Var.m;
        View view2 = c76Var.m;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(c76Var);
        return true;
    }

    public final void l(c76 c76Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        c76Var.m.animate().setInterpolator(s);
        d(c76Var);
    }
}
