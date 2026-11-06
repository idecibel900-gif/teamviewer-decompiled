package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s18 implements Cloneable {
    public static final int[] F = {2, 1, 3, 4};
    public static final el5 G = new el5(14);
    public static final ThreadLocal H = new ThreadLocal();
    public ArrayList w;
    public ArrayList x;
    public final String m = getClass().getName();
    public long n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1972o = -1;
    public TimeInterpolator p = null;
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public pn5 s = new pn5((byte) 10);
    public pn5 t = new pn5((byte) 10);
    public c00 u = null;
    public final int[] v = F;
    public final ArrayList y = new ArrayList();
    public int z = 0;
    public boolean A = false;
    public boolean B = false;
    public ArrayList C = null;
    public ArrayList D = new ArrayList();
    public el5 E = G;

    public static void b(pn5 pn5Var, View view, d28 d28Var) {
        vw vwVar = (vw) pn5Var.m;
        vw vwVar2 = (vw) pn5Var.p;
        SparseArray sparseArray = (SparseArray) pn5Var.n;
        mg4 mg4Var = (mg4) pn5Var.f1752o;
        vwVar.put(view, d28Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = be8.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (vwVar2.containsKey(transitionName)) {
                vwVar2.put(transitionName, null);
            } else {
                vwVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (mg4Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    mg4Var.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) mg4Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    mg4Var.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static vw o() {
        ThreadLocal threadLocal = H;
        vw vwVar = (vw) threadLocal.get();
        if (vwVar != null) {
            return vwVar;
        }
        vw vwVar2 = new vw(0);
        threadLocal.set(vwVar2);
        return vwVar2;
    }

    public static boolean t(d28 d28Var, d28 d28Var2, String str) {
        Object obj = d28Var.a.get(str);
        Object obj2 = d28Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(TimeInterpolator timeInterpolator) {
        this.p = timeInterpolator;
    }

    public void B(el5 el5Var) {
        if (el5Var == null) {
            this.E = G;
        } else {
            this.E = el5Var;
        }
    }

    public void C() {
    }

    public void D(long j) {
        this.n = j;
    }

    public final void E() {
        if (this.z == 0) {
            ArrayList arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((r18) arrayList2.get(i)).e(this);
                }
            }
            this.B = false;
        }
        this.z++;
    }

    public String F(String str) {
        String strK = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1972o != -1) {
            StringBuilder sb = new StringBuilder(strK);
            sb.append("dur(");
            strK = e41.k(sb, this.f1972o, ") ");
        }
        if (this.n != -1) {
            StringBuilder sb2 = new StringBuilder(strK);
            sb2.append("dly(");
            strK = e41.k(sb2, this.n, ") ");
        }
        if (this.p != null) {
            strK = strK + "interp(" + this.p + ") ";
        }
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.r;
        if (size <= 0 && arrayList2.size() <= 0) {
            return strK;
        }
        String strConcat = strK.concat("tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strConcat = strConcat.concat(", ");
                }
                strConcat = strConcat + arrayList.get(i);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strConcat = strConcat.concat(", ");
                }
                strConcat = strConcat + arrayList2.get(i2);
            }
        }
        return strConcat.concat(")");
    }

    public void a(r18 r18Var) {
        ArrayList arrayList = this.C;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.C = arrayList;
        }
        arrayList.add(r18Var);
    }

    public void c(d28 d28Var) {
        sm0.H(d28Var);
    }

    public void cancel() {
        ArrayList arrayList = this.y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.C;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.C.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((r18) arrayList3.get(i)).b();
        }
    }

    public final void d(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            d28 d28Var = new d28(view);
            if (z) {
                g(d28Var);
            } else {
                c(d28Var);
            }
            d28Var.c.add(this);
            e(d28Var);
            if (z) {
                b(this.s, view, d28Var);
            } else {
                b(this.t, view, d28Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void e(d28 d28Var) {
    }

    public void g(d28 d28Var) {
        sm0.H(d28Var);
    }

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.r;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                d28 d28Var = new d28(viewFindViewById);
                if (z) {
                    g(d28Var);
                } else {
                    c(d28Var);
                }
                d28Var.c.add(this);
                e(d28Var);
                if (z) {
                    b(this.s, viewFindViewById, d28Var);
                } else {
                    b(this.t, viewFindViewById, d28Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            d28 d28Var2 = new d28(view);
            if (z) {
                g(d28Var2);
            } else {
                c(d28Var2);
            }
            d28Var2.c.add(this);
            e(d28Var2);
            if (z) {
                b(this.s, view, d28Var2);
            } else {
                b(this.t, view, d28Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((vw) this.s.m).clear();
            ((SparseArray) this.s.n).clear();
            ((mg4) this.s.f1752o).a();
        } else {
            ((vw) this.t.m).clear();
            ((SparseArray) this.t.n).clear();
            ((mg4) this.t.f1752o).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s18 clone() {
        try {
            s18 s18Var = (s18) super.clone();
            s18Var.D = new ArrayList();
            s18Var.s = new pn5((byte) 10);
            s18Var.t = new pn5((byte) 10);
            s18Var.w = null;
            s18Var.x = null;
            return s18Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, d28 d28Var, d28 d28Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, pn5 pn5Var, pn5 pn5Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i;
        int i2;
        View view;
        d28 d28Var;
        Animator animator;
        d28 d28Var2;
        vw vwVarO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            d28 d28Var3 = (d28) arrayList.get(i3);
            d28 d28Var4 = (d28) arrayList2.get(i3);
            if (d28Var3 != null && !d28Var3.c.contains(this)) {
                d28Var3 = null;
            }
            if (d28Var4 != null && !d28Var4.c.contains(this)) {
                d28Var4 = null;
            }
            if (!(d28Var3 == null && d28Var4 == null) && ((d28Var3 == null || d28Var4 == null || r(d28Var3, d28Var4)) && (animatorK = k(viewGroup, d28Var3, d28Var4)) != null)) {
                String str = this.m;
                if (d28Var4 != null) {
                    view = d28Var4.b;
                    String[] strArrP = p();
                    if (strArrP != null && strArrP.length > 0) {
                        d28Var2 = new d28(view);
                        d28 d28Var5 = (d28) ((vw) pn5Var2.m).get(view);
                        i = size;
                        if (d28Var5 != null) {
                            int i4 = 0;
                            while (i4 < strArrP.length) {
                                String str2 = strArrP[i4];
                                d28Var2.a.put(str2, d28Var5.a.get(str2));
                                i4++;
                                i3 = i3;
                                d28Var5 = d28Var5;
                            }
                        }
                        i2 = i3;
                        int i5 = vwVarO.f278o;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                animator = animatorK;
                                break;
                            }
                            l18 l18Var = (l18) vwVarO.get((Animator) vwVarO.f(i6));
                            if (l18Var.c != null && l18Var.a == view && l18Var.b.equals(str) && l18Var.c.equals(d28Var2)) {
                                animator = null;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        i = size;
                        i2 = i3;
                        animator = animatorK;
                        d28Var2 = null;
                    }
                    animatorK = animator;
                    d28Var = d28Var2;
                } else {
                    i = size;
                    i2 = i3;
                    view = d28Var3.b;
                    d28Var = null;
                }
                if (animatorK != null) {
                    qf8 qf8Var = of8.a;
                    lj8 lj8Var = new lj8(viewGroup);
                    l18 l18Var2 = new l18();
                    l18Var2.a = view;
                    l18Var2.b = str;
                    l18Var2.c = d28Var;
                    l18Var2.d = lj8Var;
                    l18Var2.e = this;
                    vwVarO.put(animatorK, l18Var2);
                    this.D.add(animatorK);
                }
            } else {
                i = size;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator2 = (Animator) this.D.get(sparseIntArray.keyAt(i7));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.z - 1;
        this.z = i;
        if (i == 0) {
            ArrayList arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((r18) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < ((mg4) this.s.f1752o).h(); i3++) {
                View view = (View) ((mg4) this.s.f1752o).i(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = be8.a;
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((mg4) this.t.f1752o).h(); i4++) {
                View view2 = (View) ((mg4) this.t.f1752o).i(i4);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = be8.a;
                    view2.setHasTransientState(false);
                }
            }
            this.B = true;
        }
    }

    public final d28 n(View view, boolean z) {
        c00 c00Var = this.u;
        if (c00Var != null) {
            return c00Var.n(view, z);
        }
        ArrayList arrayList = z ? this.w : this.x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            d28 d28Var = (d28) arrayList.get(i);
            if (d28Var == null) {
                return null;
            }
            if (d28Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (d28) (z ? this.x : this.w).get(i);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final d28 q(View view, boolean z) {
        c00 c00Var = this.u;
        if (c00Var != null) {
            return c00Var.q(view, z);
        }
        return (d28) ((vw) (z ? this.s : this.t).m).get(view);
    }

    public boolean r(d28 d28Var, d28 d28Var2) {
        if (d28Var != null && d28Var2 != null) {
            String[] strArrP = p();
            if (strArrP != null) {
                for (String str : strArrP) {
                    if (t(d28Var, d28Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = d28Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (t(d28Var, d28Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.r;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return F("");
    }

    public void u(ViewGroup viewGroup) {
        if (this.B) {
            return;
        }
        ArrayList arrayList = this.y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.C;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.C.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((r18) arrayList3.get(i)).a();
            }
        }
        this.A = true;
    }

    public void v(r18 r18Var) {
        ArrayList arrayList = this.C;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(r18Var);
        if (this.C.size() == 0) {
            this.C = null;
        }
    }

    public void w(View view) {
        if (this.A) {
            if (!this.B) {
                ArrayList arrayList = this.y;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.C;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.C.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((r18) arrayList3.get(i)).d();
                    }
                }
            }
            this.A = false;
        }
    }

    public void x() {
        E();
        vw vwVarO = o();
        for (Animator animator : this.D) {
            if (vwVarO.containsKey(animator)) {
                E();
                if (animator != null) {
                    animator.addListener(new k18(this, vwVarO));
                    long j = this.f1972o;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.n;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.p;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new p6(this, (byte) 5));
                    animator.start();
                }
            }
        }
        this.D.clear();
        m();
    }

    public void y(long j) {
        this.f1972o = j;
    }

    public void z(f57 f57Var) {
    }
}
