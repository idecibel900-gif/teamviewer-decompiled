package o;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class c66 implements f12 {
    public final /* synthetic */ RecyclerView m;

    public /* synthetic */ c66(RecyclerView recyclerView) {
        this.m = recyclerView;
    }

    public void a(q8 q8Var) {
        byte b = q8Var.a;
        RecyclerView recyclerView = this.m;
        if (b == 1) {
            recyclerView.z.g0(q8Var.b, q8Var.d);
            return;
        }
        if (b == 2) {
            recyclerView.z.j0(q8Var.b, q8Var.d);
        } else if (b == 4) {
            recyclerView.z.l0(recyclerView, q8Var.b, q8Var.d);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.z.i0(q8Var.b, q8Var.d);
        }
    }

    public c76 b(int i) {
        RecyclerView recyclerView = this.m;
        int iK = recyclerView.r.k();
        c76 c76Var = null;
        for (int i2 = 0; i2 < iK; i2++) {
            c76 c76VarM = RecyclerView.M(recyclerView.r.j(i2));
            if (c76VarM != null && !c76VarM.i() && c76VarM.f498o == i) {
                if (!((ArrayList) recyclerView.r.e).contains(c76VarM.m)) {
                    c76Var = c76VarM;
                    break;
                }
                c76Var = c76VarM;
            }
        }
        if (c76Var != null) {
            if (!((ArrayList) recyclerView.r.e).contains(c76Var.m)) {
                return c76Var;
            }
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.m;
        int iK = recyclerView.r.k();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iK; i6++) {
            View viewJ = recyclerView.r.j(i6);
            c76 c76VarM = RecyclerView.M(viewJ);
            if (c76VarM != null && !c76VarM.p() && (i4 = c76VarM.f498o) >= i && i4 < i5) {
                c76VarM.a(2);
                if (obj == null) {
                    c76VarM.a(1024);
                } else if ((1024 & c76VarM.v) == 0) {
                    if (c76VarM.w == null) {
                        ArrayList arrayList = new ArrayList();
                        c76VarM.w = arrayList;
                        c76VarM.x = Collections.unmodifiableList(arrayList);
                    }
                    c76VarM.w.add(obj);
                }
                ((m66) viewJ.getLayoutParams()).f1441o = true;
            }
        }
        s66 s66Var = recyclerView.f23o;
        ArrayList arrayList2 = s66Var.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c76 c76Var = (c76) arrayList2.get(size);
            if (c76Var != null && (i3 = c76Var.f498o) >= i && i3 < i5) {
                c76Var.a(2);
                s66Var.g(size);
            }
        }
        recyclerView.w0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.m;
        int iK = recyclerView.r.k();
        for (int i3 = 0; i3 < iK; i3++) {
            c76 c76VarM = RecyclerView.M(recyclerView.r.j(i3));
            if (c76VarM != null && !c76VarM.p() && c76VarM.f498o >= i) {
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + c76VarM + " now at position " + (c76VarM.f498o + i2));
                }
                c76VarM.m(i2, false);
                recyclerView.s0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f23o.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c76 c76Var = (c76) arrayList.get(i4);
            if (c76Var != null && c76Var.f498o >= i) {
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + c76Var + " now at position " + (c76Var.f498o + i2));
                }
                c76Var.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.v0 = true;
    }

    @Override // o.f12
    public boolean e(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.m;
        if (recyclerView.z.p()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.z.o()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.q0();
        return recyclerView.I(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // o.f12
    public float f() {
        float f;
        RecyclerView recyclerView = this.m;
        if (recyclerView.z.p()) {
            f = recyclerView.n0;
        } else {
            if (!recyclerView.z.o()) {
                return 0.0f;
            }
            f = recyclerView.m0;
        }
        return -f;
    }

    public void g(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.m;
        int iK = recyclerView.r.k();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iK; i11++) {
            c76 c76VarM = RecyclerView.M(recyclerView.r.j(i11));
            if (c76VarM != null && (i9 = c76VarM.f498o) >= i4 && i9 <= i3) {
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + c76VarM);
                }
                if (c76VarM.f498o == i) {
                    c76VarM.m(i2 - i, false);
                } else {
                    c76VarM.m(i5, false);
                }
                recyclerView.s0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f23o.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            c76 c76Var = (c76) arrayList.get(i12);
            if (c76Var != null && (i8 = c76Var.f498o) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    c76Var.m(i2 - i, false);
                } else {
                    c76Var.m(i10, false);
                }
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + c76Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.v0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public void h(c76 c76Var, lf1 lf1Var, lf1 lf1Var2) {
        boolean zG;
        c76Var.o(false);
        RecyclerView recyclerView = this.m;
        nk1 nk1Var = (nk1) recyclerView.b0;
        if (lf1Var != null) {
            nk1Var.getClass();
            int i = lf1Var.b;
            int i2 = lf1Var2.b;
            if (i == i2 && lf1Var.c == lf1Var2.c) {
                nk1Var.l(c76Var);
                c76Var.m.setAlpha(0.0f);
                nk1Var.i.add(c76Var);
                zG = true;
            } else {
                zG = nk1Var.g(c76Var, i, lf1Var.c, i2, lf1Var2.c);
            }
        } else {
            nk1Var.l(c76Var);
            c76Var.m.setAlpha(0.0f);
            nk1Var.i.add(c76Var);
            zG = true;
        }
        if (zG) {
            recyclerView.X();
        }
    }

    @Override // o.f12
    public void i() {
        this.m.q0();
    }

    public void j(c76 c76Var, lf1 lf1Var, lf1 lf1Var2) {
        boolean zG;
        RecyclerView recyclerView = this.m;
        recyclerView.f23o.l(c76Var);
        recyclerView.h(c76Var);
        c76Var.o(false);
        nk1 nk1Var = (nk1) recyclerView.b0;
        nk1Var.getClass();
        int i = lf1Var.b;
        int i2 = lf1Var.c;
        View view = c76Var.m;
        int left = lf1Var2 == null ? view.getLeft() : lf1Var2.b;
        int top = lf1Var2 == null ? view.getTop() : lf1Var2.c;
        if (c76Var.i() || (i == left && i2 == top)) {
            nk1Var.l(c76Var);
            nk1Var.h.add(c76Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = nk1Var.g(c76Var, i, i2, left, top);
        }
        if (zG) {
            recyclerView.X();
        }
    }

    public void k(int i) {
        RecyclerView recyclerView = this.m;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
