package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vg7 extends es4 implements nn5, in1, ln5 {
    public Object A;
    public Object B;
    public PointerInputEventHandler C;
    public n87 D;
    public bn5 E = qg7.a;
    public final xx4 F;
    public final xx4 G;
    public final xx4 H;
    public bn5 I;
    public long J;

    public vg7(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.A = obj;
        this.B = obj2;
        this.C = pointerInputEventHandler;
        xx4 xx4Var = new xx4(new ug7[16]);
        this.F = xx4Var;
        this.G = xx4Var;
        this.H = new xx4(new ug7[16]);
        this.J = 0L;
    }

    @Override // o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        this.J = j;
        if (cn5Var == cn5.m) {
            this.E = bn5Var;
        }
        hc1 hc1Var = null;
        if (this.D == null) {
            this.D = im3.R(I0(), null, pe1.p, new xr1(this, hc1Var, (byte) 2), 1);
        }
        V0(bn5Var, cn5Var);
        List list = bn5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qs1.F((in5) list.get(i))) {
                this.I = bn5Var;
            }
        }
        bn5Var = null;
        this.I = bn5Var;
    }

    @Override // o.ln5
    public final void E() {
        bn5 bn5Var = this.I;
        if (bn5Var == null) {
            return;
        }
        List list = bn5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((in5) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    in5 in5Var = (in5) list.get(i2);
                    long j = in5Var.a;
                    long j2 = in5Var.c;
                    long j3 = in5Var.b;
                    float f = in5Var.e;
                    boolean z = in5Var.d;
                    arrayList.add(new in5(j, j3, j2, false, f, j3, j2, z, z, in5Var.i, 0L, 1.0f, 0L));
                }
                bn5 bn5Var2 = new bn5(arrayList, null);
                this.E = bn5Var2;
                V0(bn5Var2, cn5.m);
                V0(bn5Var2, cn5.n);
                V0(bn5Var2, cn5.f544o);
                this.I = null;
                return;
            }
        }
    }

    @Override // o.es4
    public final void N0() {
        W0();
    }

    public final Object U0(hw2 hw2Var, hc1 hc1Var) {
        gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
        gl0Var.t();
        ug7 ug7Var = new ug7(this, gl0Var);
        synchronized (this.G) {
            this.F.b(ug7Var);
            new yg6(vt1.A(vt1.p(ug7Var, ug7Var, hw2Var))).resumeWith(f88.a);
        }
        gl0Var.v(new h16(ug7Var, (byte) 11));
        return gl0Var.q();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void V0(bn5 bn5Var, cn5 cn5Var) {
        Object[] objArr;
        int i;
        int i2;
        ug7 ug7Var;
        gl0 gl0Var;
        gl0 gl0Var2;
        synchronized (this.G) {
            xx4 xx4Var = this.H;
            xx4Var.d(xx4Var.f2559o, this.F);
        }
        try {
            int iOrdinal = cn5Var.ordinal();
            if (iOrdinal == 0) {
                xx4 xx4Var2 = this.H;
                objArr = xx4Var2.m;
                i = xx4Var2.f2559o;
                for (i2 = 0; i2 < i; i2++) {
                    ug7Var = (ug7) objArr[i2];
                    if (cn5Var != ug7Var.p && (gl0Var = ug7Var.f2213o) != null) {
                        ug7Var.f2213o = null;
                        gl0Var.resumeWith(bn5Var);
                    }
                }
            } else if (iOrdinal == 1) {
                xx4 xx4Var3 = this.H;
                int i3 = xx4Var3.f2559o - 1;
                Object[] objArr2 = xx4Var3.m;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        ug7 ug7Var2 = (ug7) objArr2[i3];
                        if (cn5Var == ug7Var2.p && (gl0Var2 = ug7Var2.f2213o) != null) {
                            ug7Var2.f2213o = null;
                            gl0Var2.resumeWith(bn5Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new w35();
                }
                xx4 xx4Var4 = this.H;
                objArr = xx4Var4.m;
                i = xx4Var4.f2559o;
                while (i2 < i) {
                    ug7Var = (ug7) objArr[i2];
                    if (cn5Var != ug7Var.p) {
                    }
                }
            }
            this.H.g();
        } catch (Throwable th) {
            this.H.g();
            throw th;
        }
    }

    public final void W0() {
        n87 n87Var = this.D;
        if (n87Var != null) {
            n87Var.p(new mn5("Pointer input was reset"));
            this.D = null;
        }
    }

    @Override // o.in1
    public final float Z() {
        return vn4.p0(this).L.Z();
    }

    @Override // o.um1, o.ln5
    public final void c() {
        W0();
    }

    @Override // o.in1
    public final float getDensity() {
        return vn4.p0(this).L.getDensity();
    }

    @Override // o.ln5
    public final void z0() {
        W0();
    }
}
