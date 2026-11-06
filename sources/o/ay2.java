package o;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ay2 implements Runnable {
    public static final ThreadLocal q = new ThreadLocal();
    public static final gj2 r = new gj2((byte) 15);
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f373o;
    public final ArrayList m = new ArrayList();
    public final ArrayList p = new ArrayList();

    public static c76 c(RecyclerView recyclerView, int i, long j) {
        int iK = recyclerView.r.k();
        for (int i2 = 0; i2 < iK; i2++) {
            c76 c76VarM = RecyclerView.M(recyclerView.r.j(i2));
            if (c76VarM.f498o == i && !c76VarM.g()) {
                return null;
            }
        }
        s66 s66Var = recyclerView.f23o;
        if (j == Long.MAX_VALUE) {
            try {
                if (r08.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.V(false);
                Trace.endSection();
            }
        }
        recyclerView.U();
        c76 c76VarK = s66Var.k(i, j);
        if (c76VarK != null) {
            if (!c76VarK.f() || c76VarK.g()) {
                s66Var.a(c76VarK, false);
            } else {
                s66Var.h(c76VarK.m);
            }
        }
        return c76VarK;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.E) {
            if (RecyclerView.N0 && !this.m.contains(recyclerView)) {
                hk0.l("attempting to post unregistered view!");
                return;
            } else if (this.n == 0) {
                this.n = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        rr0 rr0Var = recyclerView.r0;
        rr0Var.b = i;
        rr0Var.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void b(long j) {
        zx2 zx2Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        zx2 zx2Var2;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            rr0 rr0Var = recyclerView3.r0;
            if (windowVisibility == 0) {
                rr0Var.e(recyclerView3, false);
                i += rr0Var.d;
            }
        }
        ArrayList arrayList2 = this.p;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                rr0 rr0Var2 = recyclerView4.r0;
                int iAbs = Math.abs(rr0Var2.c) + Math.abs(rr0Var2.b);
                for (?? r11 = z; r11 < rr0Var2.d * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        zx2Var2 = new zx2();
                        arrayList2.add(zx2Var2);
                    } else {
                        zx2Var2 = (zx2) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) rr0Var2.e;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    zx2Var2.a = z;
                    zx2Var2.b = iAbs;
                    zx2Var2.c = i5;
                    zx2Var2.d = recyclerView4;
                    zx2Var2.e = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, r);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (zx2Var = (zx2) arrayList2.get(i6)).d) != null; i6++) {
            c76 c76VarC = c(recyclerView, zx2Var.e, zx2Var.a ? Long.MAX_VALUE : j);
            if (c76VarC != null && c76VarC.n != null && c76VarC.f() && !c76VarC.g() && (recyclerView2 = (RecyclerView) c76VarC.n.get()) != null) {
                if (recyclerView2.P && recyclerView2.r.k() != 0) {
                    s66 s66Var = recyclerView2.f23o;
                    i66 i66Var = recyclerView2.b0;
                    if (i66Var != null) {
                        i66Var.e();
                    }
                    androidx.recyclerview.widget.a aVar = recyclerView2.z;
                    if (aVar != null) {
                        aVar.t0(s66Var);
                        recyclerView2.z.u0(s66Var);
                    }
                    s66Var.a.clear();
                    s66Var.f();
                }
                rr0 rr0Var3 = recyclerView2.r0;
                rr0Var3.e(recyclerView2, true);
                if (rr0Var3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        y66 y66Var = recyclerView2.s0;
                        d66 d66Var = recyclerView2.y;
                        y66Var.d = (byte) 1;
                        y66Var.e = d66Var.a();
                        y66Var.g = false;
                        y66Var.h = false;
                        y66Var.i = false;
                        for (int i7 = 0; i7 < rr0Var3.d * 2; i7 += 2) {
                            c(recyclerView2, ((int[]) rr0Var3.e)[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            zx2Var.a = false;
            zx2Var.b = 0;
            zx2Var.c = 0;
            zx2Var.d = null;
            zx2Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.m;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f373o);
                }
            }
        } finally {
            this.n = 0L;
            Trace.endSection();
        }
    }
}
