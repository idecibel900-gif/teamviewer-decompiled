package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ll1 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public ll1(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final ll1 i(ViewGroup viewGroup, su2 su2Var) {
        viewGroup.getClass();
        su2Var.getClass();
        su2Var.K().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof ll1) {
            return (ll1) tag;
        }
        ll1 ll1Var = new ll1(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, ll1Var);
        return ll1Var;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z;
        p77 p77Var;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                q77 q77Var = (q77) it.next();
                if (!q77Var.k.isEmpty()) {
                    ArrayList arrayList2 = q77Var.k;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                            p77Var = (p77) it2.next();
                            p77Var.getClass();
                        } while (p77Var instanceof jl1);
                    } else {
                        break;
                    }
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                qv0.c0(arrayList3, ((q77) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(q77 q77Var) {
        q77Var.getClass();
        if (q77Var.i) {
            q77Var.a.a(q77Var.c.s0(), this.a);
            q77Var.i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        s77 s77Var;
        yi5 yi5Var;
        Object obj;
        Object next;
        if (su2.M(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            s77Var = s77.f1990o;
            yi5Var = s77.m;
            obj = null;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            q77 q77Var = (q77) next;
            View view = q77Var.c.U;
            view.getClass();
            yi5Var.getClass();
            if (yi5.a(view) == s77Var && q77Var.a != s77Var) {
                break;
            }
        }
        q77 q77Var2 = (q77) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            q77 q77Var3 = (q77) objPrevious;
            View view2 = q77Var3.c.U;
            view2.getClass();
            yi5Var.getClass();
            if (yi5.a(view2) != s77Var && q77Var3.a == s77Var) {
                obj = objPrevious;
                break;
            }
        }
        q77 q77Var4 = (q77) obj;
        if (su2.M(2)) {
            Log.v("FragmentManager", "Executing operations from " + q77Var2 + " to " + q77Var4);
        }
        ArrayList<hl1> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ut2 ut2Var = ((q77) lv0.v0(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            rt2 rt2Var = ((q77) it2.next()).c.X;
            rt2 rt2Var2 = ut2Var.X;
            rt2Var.b = rt2Var2.b;
            rt2Var.c = rt2Var2.c;
            rt2Var.d = rt2Var2.d;
            rt2Var.e = rt2Var2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            q77 q77Var5 = (q77) it3.next();
            arrayList2.add(new hl1(q77Var5, z));
            arrayList3.add(new kl1(q77Var5));
            q77Var5.d.add(new el1(this, q77Var5, (byte) 0));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((kl1) obj2).v0()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((kl1) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((kl1) it5.next()).getClass();
        }
        ArrayList<hl1> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            qv0.c0(arrayList7, ((q77) ((hl1) it6.next()).m).k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        boolean z2 = false;
        for (hl1 hl1Var : arrayList2) {
            Context context = this.a.getContext();
            q77 q77Var6 = (q77) hl1Var.m;
            context.getClass();
            yt2 yt2VarB0 = hl1Var.B0(context);
            if (yt2VarB0 != null) {
                if (((AnimatorSet) yt2VarB0.f2642o) == null) {
                    arrayList6.add(hl1Var);
                } else {
                    ut2 ut2Var2 = q77Var6.c;
                    if (q77Var6.k.isEmpty()) {
                        if (q77Var6.a == s77.p) {
                            q77Var6.i = false;
                        }
                        q77Var6.j.add(new jl1(hl1Var));
                        z2 = true;
                    } else if (su2.M(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + ut2Var2 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (hl1 hl1Var2 : arrayList6) {
            q77 q77Var7 = (q77) hl1Var2.m;
            ut2 ut2Var3 = q77Var7.c;
            if (zIsEmpty) {
                if (!z2) {
                    q77Var7.j.add(new gl1(hl1Var2));
                } else if (su2.M(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + ut2Var3 + " as Animations cannot run alongside Animators.");
                }
            } else if (su2.M(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + ut2Var3 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qv0.c0(arrayList2, ((q77) it.next()).k);
        }
        List listP0 = lv0.P0(lv0.T0(arrayList2));
        int size = listP0.size();
        for (int i = 0; i < size; i++) {
            ((p77) listP0.get(i)).b(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((q77) arrayList.get(i2));
        }
        List listP1 = lv0.P0(arrayList);
        int size3 = listP1.size();
        for (int i3 = 0; i3 < size3; i3++) {
            q77 q77Var = (q77) listP1.get(i3);
            if (q77Var.k.isEmpty()) {
                q77Var.b();
            }
        }
    }

    public final void d(s77 s77Var, r77 r77Var, av2 av2Var) {
        synchronized (this.b) {
            try {
                q77 q77VarF = f(av2Var.c);
                if (q77VarF == null) {
                    ut2 ut2Var = av2Var.c;
                    q77VarF = (ut2Var.y || ut2Var.x) ? g(ut2Var) : null;
                }
                if (q77VarF != null) {
                    q77VarF.d(s77Var, r77Var);
                    return;
                }
                q77 q77Var = new q77(s77Var, r77Var, av2Var);
                this.b.add(q77Var);
                q77Var.d.add(new el1(this, q77Var, (byte) 1));
                q77Var.d.add(new el1(this, q77Var, (byte) 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            h();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<q77> arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    q77 q77Var = (q77) it.next();
                    if (this.b.isEmpty() || !q77Var.c.y) {
                        z = false;
                    }
                    q77Var.g = z;
                }
                for (q77 q77Var2 : arrayList) {
                    if (this.d) {
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + q77Var2);
                        }
                        q77Var2.b();
                    } else {
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + q77Var2);
                        }
                        q77Var2.a(this.a);
                    }
                    this.d = false;
                    if (!q77Var2.f) {
                        this.c.add(q77Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    l();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayList2, this.e);
                    boolean zJ = j(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        if (!((q77) it2.next()).c.y) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zJ) {
                        z = false;
                    }
                    this.d = z;
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        k(arrayList2);
                        c(arrayList2);
                    } else if (zJ) {
                        k(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            a((q77) arrayList2.get(i));
                        }
                    }
                    this.e = false;
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q77 f(ut2 ut2Var) {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            q77 q77Var = (q77) next;
            if (q77Var.c.equals(ut2Var) && !q77Var.e) {
                return (q77) next;
            }
        }
        next = null;
        return (q77) next;
    }

    public final q77 g(ut2 ut2Var) {
        Object next;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            q77 q77Var = (q77) next;
            if (q77Var.c.equals(ut2Var) && !q77Var.e) {
                return (q77) next;
            }
        }
        next = null;
        return (q77) next;
    }

    public final void h() {
        if (su2.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                k(this.b);
                ArrayList<q77> arrayList = new ArrayList(this.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((q77) it.next()).g = false;
                }
                for (q77 q77Var : arrayList) {
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + q77Var);
                    }
                    q77Var.a(this.a);
                }
                ArrayList<q77> arrayList2 = new ArrayList(this.b);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((q77) it2.next()).g = false;
                }
                for (q77 q77Var2 : arrayList2) {
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + q77Var2);
                    }
                    q77Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q77 q77Var = (q77) arrayList.get(i);
            av2 av2Var = q77Var.l;
            ut2 ut2Var = av2Var.c;
            if (!q77Var.h) {
                q77Var.h = true;
                r77 r77Var = q77Var.b;
                if (r77Var == r77.n) {
                    View viewFindFocus = ut2Var.U.findFocus();
                    if (viewFindFocus != null) {
                        ut2Var.B().k = viewFindFocus;
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + ut2Var);
                        }
                    }
                    View viewS0 = q77Var.c.s0();
                    if (viewS0.getParent() == null) {
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "Adding fragment " + ut2Var + " view " + viewS0 + " to container in onStart");
                        }
                        av2Var.b();
                        viewS0.setAlpha(0.0f);
                    }
                    if (viewS0.getAlpha() == 0.0f && viewS0.getVisibility() == 0) {
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "Making view " + viewS0 + " INVISIBLE in onStart");
                        }
                        viewS0.setVisibility(4);
                    }
                    rt2 rt2Var = ut2Var.X;
                    viewS0.setAlpha(rt2Var == null ? 1.0f : rt2Var.j);
                    if (su2.M(2)) {
                        rt2 rt2Var2 = ut2Var.X;
                        Log.v("FragmentManager", "Setting view alpha to " + (rt2Var2 != null ? rt2Var2.j : 1.0f) + " in onStart");
                    }
                } else if (r77Var == r77.f1900o) {
                    View viewS1 = ut2Var.s0();
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewS1.findFocus() + " on view " + viewS1 + " for Fragment " + ut2Var);
                    }
                    viewS1.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qv0.c0(arrayList2, ((q77) it.next()).k);
        }
        List listP0 = lv0.P0(lv0.T0(arrayList2));
        int size2 = listP0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            p77 p77Var = (p77) listP0.get(i2);
            p77Var.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!p77Var.a) {
                p77Var.d(viewGroup);
            }
            p77Var.a = true;
        }
    }

    public final void l() {
        for (q77 q77Var : this.b) {
            if (q77Var.b == r77.n) {
                int visibility = q77Var.c.s0().getVisibility();
                s77.m.getClass();
                q77Var.d(yi5.g(visibility), r77.m);
            }
        }
    }
}
