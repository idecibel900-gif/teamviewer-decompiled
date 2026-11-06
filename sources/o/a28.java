package o;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a28 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public s18 m;
    public ViewGroup n;

    /* JADX WARN: Code duplicated, block: B:100:0x0209  */
    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e1 A[EDGE_INSN: B:134:0x01e1->B:90:0x01e1 BREAK  A[LOOP:1: B:19:0x0085->B:89:0x01da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        pn5 pn5Var;
        pn5 pn5Var2;
        vw vwVar;
        vw vwVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        vw vwVarO;
        int i5;
        Animator animator;
        l18 l18Var;
        View view;
        d28 d28Var;
        d28 d28Var2;
        int i6;
        boolean z2;
        int i7;
        View view2;
        d28 d28Var3;
        vw vwVar3;
        int i8;
        int i9;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i10;
        View view5;
        View view6;
        mg4 mg4Var;
        int iH;
        int i11;
        View view7;
        boolean z3;
        Iterator it;
        s18 s18Var = this.m;
        ViewGroup viewGroup = this.n;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!b28.c.remove(viewGroup)) {
            return true;
        }
        vw vwVarB = b28.b();
        ArrayList arrayList2 = (ArrayList) vwVarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(s18Var);
            s18Var.a(new z18(this, vwVarB));
            i = 0;
            s18Var.h(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s18) it.next()).w(viewGroup);
                }
            }
            s18Var.w = new ArrayList();
            s18Var.x = new ArrayList();
            pn5Var = s18Var.s;
            pn5Var2 = s18Var.t;
            vwVar = new vw((vw) pn5Var.m);
            vwVar2 = new vw((vw) pn5Var2.m);
            i2 = 0;
            while (true) {
                iArr = s18Var.v;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = vwVar.f278o - 1; i7 >= 0; i7--) {
                        view2 = (View) vwVar.f(i7);
                        if (view2 == null && s18Var.s(view2) && (d28Var3 = (d28) vwVar2.remove(view2)) != null && s18Var.s(d28Var3.b)) {
                            s18Var.w.add((d28) vwVar.g(i7));
                            s18Var.x.add(d28Var3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    vwVar3 = (vw) pn5Var.p;
                    vw vwVar4 = (vw) pn5Var2.p;
                    i8 = vwVar3.f278o;
                    for (i9 = 0; i9 < i8; i9++) {
                        view3 = (View) vwVar3.i(i9);
                        if (view3 == null && s18Var.s(view3) && (view4 = (View) vwVar4.get(vwVar3.f(i9))) != null && s18Var.s(view4)) {
                            d28 d28Var4 = (d28) vwVar.get(view3);
                            d28 d28Var5 = (d28) vwVar2.get(view4);
                            if (d28Var4 != null && d28Var5 != null) {
                                s18Var.w.add(d28Var4);
                                s18Var.x.add(d28Var5);
                                vwVar.remove(view3);
                                vwVar2.remove(view4);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        mg4Var = (mg4) pn5Var.f1752o;
                        mg4 mg4Var2 = (mg4) pn5Var2.f1752o;
                        iH = mg4Var.h();
                        i11 = i;
                        while (i11 < iH) {
                            view7 = (View) mg4Var.i(i11);
                            if (view7 == null && s18Var.s(view7)) {
                                boolean z5 = z4;
                                View view8 = (View) mg4Var2.b(mg4Var.d(i11));
                                if (view8 == null || !s18Var.s(view8)) {
                                    z3 = z5;
                                } else {
                                    d28 d28Var6 = (d28) vwVar.get(view7);
                                    d28 d28Var7 = (d28) vwVar2.get(view8);
                                    if (d28Var6 == null || d28Var7 == null) {
                                        z3 = z5;
                                    } else {
                                        z3 = z5;
                                        s18Var.w.add(d28Var6);
                                        s18Var.x.add(d28Var7);
                                        vwVar.remove(view7);
                                        vwVar2.remove(view8);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) pn5Var.n;
                    SparseArray sparseArray2 = (SparseArray) pn5Var2.n;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view5 = (View) sparseArray.valueAt(i10);
                        if (view5 == null && s18Var.s(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && s18Var.s(view6)) {
                            d28 d28Var8 = (d28) vwVar.get(view5);
                            d28 d28Var9 = (d28) vwVar2.get(view6);
                            if (d28Var8 != null && d28Var9 != null) {
                                s18Var.w.add(d28Var8);
                                s18Var.x.add(d28Var9);
                                vwVar.remove(view5);
                                vwVar2.remove(view6);
                            }
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
            }
            z = z4;
            for (i3 = 0; i3 < vwVar.f278o; i3++) {
                d28Var2 = (d28) vwVar.i(i3);
                if (s18Var.s(d28Var2.b)) {
                    s18Var.w.add(d28Var2);
                    s18Var.x.add(null);
                }
            }
            for (i4 = 0; i4 < vwVar2.f278o; i4++) {
                d28Var = (d28) vwVar2.i(i4);
                if (s18Var.s(d28Var.b)) {
                    s18Var.x.add(d28Var);
                    s18Var.w.add(null);
                }
            }
            vwVarO = s18.o();
            int i12 = vwVarO.f278o;
            qf8 qf8Var = of8.a;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) vwVarO.f(i5);
                if (animator == null && (l18Var = (l18) vwVarO.get(animator)) != null && (view = l18Var.a) != null && l18Var.d.a.equals(windowId)) {
                    d28 d28Var10 = l18Var.c;
                    boolean z6 = z;
                    d28 d28VarQ = s18Var.q(view, z6);
                    d28 d28VarN = s18Var.n(view, z6);
                    if (d28VarQ == null && d28VarN == null) {
                        d28VarN = (d28) ((vw) s18Var.t.m).get(view);
                    }
                    if ((d28VarQ != null || d28VarN != null) && l18Var.e.r(d28Var10, d28VarN)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            vwVarO.remove(animator);
                        }
                    }
                }
                i5--;
                z = true;
            }
            s18Var.l(viewGroup, s18Var.s, s18Var.t, s18Var.w, s18Var.x);
            s18Var.x();
            return true;
        }
        arrayList2 = new ArrayList();
        vwVarB.put(viewGroup, arrayList2);
        arrayList2.add(s18Var);
        s18Var.a(new z18(this, vwVarB));
        i = 0;
        s18Var.h(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((s18) it.next()).w(viewGroup);
            }
        }
        s18Var.w = new ArrayList();
        s18Var.x = new ArrayList();
        pn5Var = s18Var.s;
        pn5Var2 = s18Var.t;
        vwVar = new vw((vw) pn5Var.m);
        vwVar2 = new vw((vw) pn5Var2.m);
        i2 = 0;
        while (true) {
            iArr = s18Var.v;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view2 = (View) vwVar.f(i7);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                vwVar3 = (vw) pn5Var.p;
                vw vwVar5 = (vw) pn5Var2.p;
                i8 = vwVar3.f278o;
                while (i9 < i8) {
                    view3 = (View) vwVar3.i(i9);
                    if (view3 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    mg4Var = (mg4) pn5Var.f1752o;
                    mg4 mg4Var3 = (mg4) pn5Var2.f1752o;
                    iH = mg4Var.h();
                    i11 = i;
                    while (i11 < iH) {
                        view7 = (View) mg4Var.i(i11);
                        if (view7 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) pn5Var.n;
                SparseArray sparseArray3 = (SparseArray) pn5Var2.n;
                size = sparseArray.size();
                while (i10 < size) {
                    view5 = (View) sparseArray.valueAt(i10);
                    if (view5 == null) {
                    }
                }
            }
            i2++;
            z4 = z2;
            i = 0;
        }
        z = z4;
        while (i3 < vwVar.f278o) {
            d28Var2 = (d28) vwVar.i(i3);
            if (s18Var.s(d28Var2.b)) {
                s18Var.w.add(d28Var2);
                s18Var.x.add(null);
            }
        }
        while (i4 < vwVar2.f278o) {
            d28Var = (d28) vwVar2.i(i4);
            if (s18Var.s(d28Var.b)) {
                s18Var.x.add(d28Var);
                s18Var.w.add(null);
            }
        }
        vwVarO = s18.o();
        int i13 = vwVarO.f278o;
        qf8 qf8Var2 = of8.a;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) vwVarO.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        s18Var.l(viewGroup, s18Var.s, s18Var.t, s18Var.w, s18Var.x);
        s18Var.x();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.n;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        b28.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) b28.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((s18) it.next()).w(viewGroup);
            }
        }
        this.m.i(true);
    }
}
