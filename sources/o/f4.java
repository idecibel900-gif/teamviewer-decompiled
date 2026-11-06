package o;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f4 implements ex5, i20 {
    public Object m;

    public /* synthetic */ f4(Object obj) {
        this.m = obj;
    }

    public static f4 b(int i, int i2, int i3) {
        return new f4(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public static f4 c(boolean z, int i, int i2, int i3, int i4) {
        return new f4(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public void a(jl3 jl3Var) {
        Object obj = this.m;
        if (obj == null) {
            this.m = jl3Var;
            return;
        }
        if (obj instanceof kx4) {
            ((kx4) obj).a(jl3Var);
            return;
        }
        if (obj.equals(jl3Var)) {
            return;
        }
        kx4 kx4Var = ui6.a;
        kx4 kx4Var2 = new kx4(2);
        kx4Var2.j((jl3) obj);
        kx4Var2.j(jl3Var);
        this.m = kx4Var2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[LOOP:0: B:16:0x0028->B:27:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[SYNTHETIC] */
    public void d(jl3 jl3Var) {
        Object obj = this.m;
        if (im3.n(obj, jl3Var)) {
            this.m = null;
            return;
        }
        if (obj instanceof kx4) {
            kx4 kx4Var = (kx4) obj;
            kx4Var.l(jl3Var);
            int i = kx4Var.d;
            if (i == 0) {
                this.m = null;
                return;
            }
            if (i != 1) {
                return;
            }
            Object[] objArr = kx4Var.b;
            long[] jArr = kx4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                this.m = objArr[(i2 << 3) + i4];
                                return;
                            }
                            j >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
            an4.j("The ScatterSet is empty");
        }
    }

    @Override // o.ex5
    public Object get() {
        return this.m;
    }

    @Override // o.i20
    public void j(Enum r1, bb5 bb5Var) {
        if (w05.Partnerlist == ((w05) r1) && (bb5Var instanceof rc0)) {
            ((rc0) bb5Var).T0();
        }
    }
}
