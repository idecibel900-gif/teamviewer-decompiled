package o;

/* JADX INFO: loaded from: classes.dex */
public final class rv4 {
    public final jx4 a;

    public /* synthetic */ rv4(jx4 jx4Var) {
        this.a = jx4Var;
    }

    public static final Object a(jx4 jx4Var) {
        Object objG = jx4Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof zw4)) {
            jx4Var.k(null);
            return objG;
        }
        zw4 zw4Var = (zw4) objG;
        if (zw4Var.h()) {
            an4.j("List is empty.");
            return null;
        }
        int i = zw4Var.b - 1;
        Object objF = zw4Var.f(i);
        zw4Var.k(i);
        objF.getClass();
        if (zw4Var.h()) {
            jx4Var.k(null);
        }
        if (zw4Var.b == 1) {
            jx4Var.m(null, zw4Var.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final zw4 b(jx4 jx4Var) {
        if (jx4Var.i()) {
            zw4 zw4Var = i65.b;
            zw4Var.getClass();
            return zw4Var;
        }
        zw4 zw4Var2 = new zw4();
        Object[] objArr = jx4Var.c;
        long[] jArr = jx4Var.a;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof zw4) {
                                zw4Var2.c((zw4) obj);
                            } else {
                                obj.getClass();
                                zw4Var2.a(obj);
                            }
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
        return zw4Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rv4) {
            return this.a.equals(((rv4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
