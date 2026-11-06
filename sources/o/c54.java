package o;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c54 implements nh6, kh6 {
    public final oh6 m;
    public final kh6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kx4 f491o;

    public c54(nh6 nh6Var, Map map, kh6 kh6Var) {
        fj3 fj3Var = new fj3((Object) nh6Var, (byte) 5);
        h72 h72Var = ph6.a;
        this.m = new oh6(map, fj3Var);
        this.n = kh6Var;
        kx4 kx4Var = ui6.a;
        this.f491o = new kx4();
    }

    @Override // o.nh6
    public final boolean a(Object obj) {
        return this.m.a(obj);
    }

    @Override // o.kh6
    public final void b(Object obj) {
        this.n.b(obj);
    }

    @Override // o.kh6
    public final void c(Object obj, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-858296452);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(this) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            this.n.c(obj, yy0Var, ux2Var, i2 & 126);
            boolean zH = ux2Var.h(this) | ux2Var.h(obj);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new o43(this, obj, (byte) 5);
                ux2Var.g0(objK);
            }
            ck3.e(obj, (Function1) objK, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) this, obj, (Object) yy0Var, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // o.nh6
    public final Map e() {
        kx4 kx4Var = this.f491o;
        Object[] objArr = kx4Var.b;
        long[] jArr = kx4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.n.b(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.m.e();
    }

    @Override // o.nh6
    public final Object f(String str) {
        return this.m.f(str);
    }

    @Override // o.nh6
    public final mh6 g(String str, Function0 function0) {
        return this.m.g(str, function0);
    }
}
