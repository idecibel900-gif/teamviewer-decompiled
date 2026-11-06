package o;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hk1 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nk1 f982o;

    public /* synthetic */ hk1(nk1 nk1Var, ArrayList arrayList, byte b) {
        this.m = b;
        this.f982o = nk1Var;
        this.n = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        ArrayList arrayList = this.n;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    nk1 nk1Var = this.f982o;
                    if (!zHasNext) {
                        arrayList.clear();
                        nk1Var.m.remove(arrayList);
                    } else {
                        mk1 mk1Var = (mk1) it.next();
                        c76 c76Var = mk1Var.a;
                        int i = mk1Var.b;
                        int i2 = mk1Var.c;
                        int i3 = mk1Var.d;
                        int i4 = mk1Var.e;
                        nk1Var.getClass();
                        View view = c76Var.m;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        nk1Var.p.add(c76Var);
                        viewPropertyAnimatorAnimate.setDuration(nk1Var.e).setListener(new jk1(nk1Var, c76Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    nk1 nk1Var2 = this.f982o;
                    if (!zHasNext2) {
                        arrayList.clear();
                        nk1Var2.n.remove(arrayList);
                        break;
                    } else {
                        lk1 lk1Var = (lk1) it2.next();
                        ArrayList arrayList2 = nk1Var2.r;
                        c76 c76Var2 = lk1Var.a;
                        View view2 = c76Var2 == null ? null : c76Var2.m;
                        c76 c76Var3 = lk1Var.b;
                        View view3 = c76Var3 != null ? c76Var3.m : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(nk1Var2.f);
                            arrayList2.add(lk1Var.a);
                            duration.translationX(lk1Var.e - lk1Var.c);
                            duration.translationY(lk1Var.f - lk1Var.d);
                            duration.alpha(0.0f).setListener(new kk1(nk1Var2, lk1Var, duration, view2, (byte) 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(lk1Var.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(nk1Var2.f).alpha(1.0f).setListener(new kk1(nk1Var2, lk1Var, viewPropertyAnimatorAnimate2, view3, (byte) 1)).start();
                        }
                    }
                }
                break;
            default:
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    nk1 nk1Var3 = this.f982o;
                    if (!zHasNext3) {
                        arrayList.clear();
                        nk1Var3.l.remove(arrayList);
                    } else {
                        c76 c76Var4 = (c76) it3.next();
                        nk1Var3.getClass();
                        View view4 = c76Var4.m;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        nk1Var3.f1572o.add(c76Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(nk1Var3.c).setListener(new ik1(nk1Var3, c76Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
