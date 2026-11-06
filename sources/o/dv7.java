package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dv7 {
    public final int a;
    public final byte b;
    public final byte c;
    public final es4 d;
    public final Function1 e;
    public dv7 f;
    public long g;
    public long h;
    public long i = Long.MIN_VALUE;
    public long j = -1;
    public final /* synthetic */ ev7 k;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte, int] */
    public dv7(ev7 ev7Var, int i, long j, long j2, es4 es4Var, Function1 function1) {
        this.k = ev7Var;
        this.a = i;
        this.b = (int) j;
        this.c = (int) j2;
        this.d = es4Var;
        this.e = function1;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        o96 o96Var;
        o96 o96Var2;
        long j5 = this.k.f;
        es4 es4Var = this.d;
        e45 e45VarN0 = vn4.n0(es4Var, 2);
        LayoutNode layoutNodeP0 = vn4.p0(es4Var);
        if (layoutNodeP0.X()) {
            if (layoutNodeP0.getOuterCoordinator$ui() != e45VarN0) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = e45VarN0.f1179o;
                e45 outerCoordinator$ui = layoutNodeP0.getOuterCoordinator$ui();
                outerCoordinator$ui.getClass();
                long jO = us1.O(outerCoordinator$ui.z(e45VarN0, jFloatToRawIntBits));
                o96Var = new o96(jO, (4294967295L & ((long) (((int) (jO & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jO >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, es4Var);
            } else {
                o96Var = new o96(j, j2, j3, j4, j5, fArr, es4Var);
            }
            o96Var2 = o96Var;
        } else {
            o96Var2 = null;
        }
        if (o96Var2 == null) {
            return;
        }
        this.e.invoke(o96Var2);
    }

    public final void b() {
        ev7 ev7Var = this.k;
        kw4 kw4Var = ev7Var.a;
        int i = this.a;
        dv7 dv7Var = (dv7) kw4Var.g(i);
        if (dv7Var != null) {
            if (dv7Var == this) {
                dv7 dv7Var2 = this.f;
                this.f = null;
                if (dv7Var2 != null) {
                    int iD = kw4Var.d(i);
                    Object[] objArr = kw4Var.c;
                    Object obj = objArr[iD];
                    kw4Var.b[iD] = i;
                    objArr[iD] = dv7Var2;
                    return;
                }
                LayoutNode layoutNodeP0 = vn4.p0(this.d.m);
                if (layoutNodeP0.W()) {
                    x56 rectManager = e14.a(layoutNodeP0).getRectManager();
                    rectManager.getClass();
                    if (layoutNodeP0.s != -4) {
                        ae aeVar = rectManager.c;
                        int iD2 = rectManager.d(layoutNodeP0);
                        long[] jArr = (long[]) aeVar.c;
                        int i2 = iD2 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD3 = kw4Var.d(i);
            Object[] objArr2 = kw4Var.c;
            Object obj2 = objArr2[iD3];
            kw4Var.b[iD3] = i;
            objArr2[iD3] = dv7Var;
            while (true) {
                dv7 dv7Var3 = dv7Var.f;
                if (dv7Var3 == null) {
                    break;
                }
                if (dv7Var3 == this) {
                    dv7Var.f = this.f;
                    this.f = null;
                    return;
                }
                dv7Var = dv7Var3;
            }
        }
        dv7 dv7Var4 = ev7Var.b;
        if (dv7Var4 == this) {
            ev7Var.b = dv7Var4.f;
            this.f = null;
            return;
        }
        dv7 dv7Var5 = dv7Var4 != null ? dv7Var4.f : null;
        while (true) {
            dv7 dv7Var6 = dv7Var4;
            dv7Var4 = dv7Var5;
            if (dv7Var4 == null) {
                return;
            }
            if (dv7Var4 == this) {
                if (dv7Var6 != null) {
                    dv7Var6.f = dv7Var4.f;
                }
                this.f = null;
                return;
            }
            dv7Var5 = dv7Var4.f;
        }
    }
}
