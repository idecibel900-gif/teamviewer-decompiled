package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k13 extends bb8 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = rv0.h;
    public List f;
    public boolean g;
    public rj h;
    public Function1 i;
    public final a81 j;
    public String k;
    public float l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1220o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public k13() {
        int i = bc8.a;
        this.f = ea2.m;
        this.g = true;
        this.j = new a81(this, (byte) 22);
        this.k = "";
        this.f1220o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // o.bb8
    public final void a(u52 u52Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = wn4.a();
                this.b = fArrA;
            } else {
                wn4.d(fArrA);
            }
            wn4.g(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f1220o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            wn4.g(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                rj rjVarA = this.h;
                if (rjVarA == null) {
                    rjVarA = tj.a();
                    this.h = rjVarA;
                }
                vs1.V(this.f, rjVarA);
            }
            this.g = false;
        }
        iu iuVarH0 = u52Var.h0();
        long jD = iuVarH0.D();
        iuVarH0.x().g();
        try {
            iu iuVar = (iu) ((xc0) iuVarH0.f1103o).n;
            float[] fArr = this.b;
            if (fArr != null) {
                iuVar.x().i(fArr);
            }
            rj rjVar = this.h;
            if (!this.f.isEmpty() && rjVar != null) {
                iuVar.x().d(rjVar, 1);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bb8) arrayList.get(i)).a(u52Var);
            }
        } finally {
            ua5.x(iuVarH0, jD);
        }
    }

    @Override // o.bb8
    public final Function1 b() {
        return this.i;
    }

    @Override // o.bb8
    public final void d(a81 a81Var) {
        this.i = a81Var;
    }

    public final void e(int i, bb8 bb8Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, bb8Var);
        } else {
            arrayList.add(bb8Var);
        }
        g(bb8Var);
        bb8Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = bc8.a;
            if (rv0.g(j2) == rv0.g(j) && rv0.f(j2) == rv0.f(j) && rv0.d(j2) == rv0.d(j)) {
                return;
            }
            this.d = false;
            this.e = rv0.h;
        }
    }

    public final void g(bb8 bb8Var) {
        if (!(bb8Var instanceof yg5)) {
            if (bb8Var instanceof k13) {
                k13 k13Var = (k13) bb8Var;
                if (k13Var.d && this.d) {
                    f(k13Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = rv0.h;
                    return;
                }
            }
            return;
        }
        yg5 yg5Var = (yg5) bb8Var;
        sb0 sb0Var = yg5Var.b;
        if (this.d && sb0Var != null) {
            if (sb0Var instanceof t57) {
                f(((t57) sb0Var).a);
            } else {
                this.d = false;
                this.e = rv0.h;
            }
        }
        sb0 sb0Var2 = yg5Var.g;
        if (this.d && sb0Var2 != null) {
            if (sb0Var2 instanceof t57) {
                f(((t57) sb0Var2).a);
            } else {
                this.d = false;
                this.e = rv0.h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bb8 bb8Var = (bb8) arrayList.get(i);
            sb.append("\t");
            sb.append(bb8Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
