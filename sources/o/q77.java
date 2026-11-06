package o;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q77 {
    public s77 a;
    public r77 b;
    public final ut2 c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final av2 l;

    public q77(s77 s77Var, r77 r77Var, av2 av2Var) {
        ut2 ut2Var = av2Var.c;
        this.a = s77Var;
        this.b = r77Var;
        this.c = ut2Var;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = av2Var;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (p77 p77Var : lv0.P0(this.k)) {
            p77Var.getClass();
            if (!p77Var.b) {
                p77Var.a(viewGroup);
            }
            p77Var.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (su2.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.y = false;
        this.l.k();
    }

    public final void c(p77 p77Var) {
        p77Var.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(p77Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(s77 s77Var, r77 r77Var) {
        int iOrdinal = r77Var.ordinal();
        s77 s77Var2 = s77.n;
        ut2 ut2Var = this.c;
        if (iOrdinal == 0) {
            if (this.a != s77Var2) {
                if (su2.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + ut2Var + " mFinalState = " + this.a + " -> " + s77Var + ".");
                }
                this.a = s77Var;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.a == s77Var2) {
                if (su2.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + ut2Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = s77.f1990o;
                this.b = r77.n;
                this.i = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            gk0.s();
            return;
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + ut2Var + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
        }
        this.a = s77Var2;
        this.b = r77.f1900o;
        this.i = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + "}";
    }
}
