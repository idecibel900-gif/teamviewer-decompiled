package o;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b66 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ RecyclerView n;

    public /* synthetic */ b66(RecyclerView recyclerView, byte b) {
        this.m = b;
        this.n = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.m;
        RecyclerView recyclerView = this.n;
        switch (b) {
            case 0:
                if (recyclerView.G && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.E) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.J) {
                        recyclerView.I = true;
                    } else {
                        recyclerView.o();
                    }
                    break;
                }
                break;
            default:
                i66 i66Var = recyclerView.b0;
                if (i66Var != null) {
                    nk1 nk1Var = (nk1) i66Var;
                    long j = nk1Var.d;
                    ArrayList<c76> arrayList = nk1Var.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = nk1Var.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = nk1Var.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = nk1Var.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (c76 c76Var : arrayList) {
                            View view = c76Var.m;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            nk1Var.q.add(c76Var);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new ik1(nk1Var, c76Var, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            nk1Var.m.add(arrayList5);
                            arrayList2.clear();
                            hk1 hk1Var = new hk1(nk1Var, arrayList5, (byte) 0);
                            if (z2) {
                                hk1Var.run();
                            } else {
                                View view2 = ((mk1) arrayList5.get(0)).a.m;
                                WeakHashMap weakHashMap = be8.a;
                                view2.postOnAnimationDelayed(hk1Var, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            nk1Var.n.add(arrayList6);
                            arrayList3.clear();
                            hk1 hk1Var2 = new hk1(nk1Var, arrayList6, (byte) 1);
                            if (z2) {
                                hk1Var2.run();
                            } else {
                                View view3 = ((lk1) arrayList6.get(0)).a.m;
                                WeakHashMap weakHashMap2 = be8.a;
                                view3.postOnAnimationDelayed(hk1Var2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            nk1Var.l.add(arrayList7);
                            arrayList4.clear();
                            hk1 hk1Var3 = new hk1(nk1Var, arrayList7, (byte) 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                hk1Var3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? nk1Var.e : 0L, zIsEmpty3 ? 0L : nk1Var.f) + j;
                                z = false;
                                View view4 = ((c76) arrayList7.get(0)).m;
                                WeakHashMap weakHashMap3 = be8.a;
                                view4.postOnAnimationDelayed(hk1Var3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.y0 = z;
                break;
        }
    }
}
