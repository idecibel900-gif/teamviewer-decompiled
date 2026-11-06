package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ap6 implements op6, Iterable, su3 {
    public final jx4 m;
    public wm4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f346o;
    public boolean p;

    public ap6() {
        long[] jArr = ti6.a;
        this.m = new jx4();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    public final ap6 a() {
        ap6 ap6Var = new ap6();
        ap6Var.f346o = this.f346o;
        ap6Var.p = this.p;
        jx4 jx4Var = this.m;
        Object[] objArr = jx4Var.b;
        Object[] objArr2 = jx4Var.c;
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
                            int i4 = (i << 3) + i3;
                            ap6Var.m.m(objArr[i4], objArr2[i4]);
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
        return ap6Var;
    }

    public final Object b(np6 np6Var) {
        Object objG = this.m.g(np6Var);
        if (objG != null) {
            return objG;
        }
        hk0.m(np6Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void c(ap6 ap6Var) {
        jx4 jx4Var = ap6Var.m;
        Object[] objArr = jx4Var.b;
        Object[] objArr2 = jx4Var.c;
        long[] jArr = jx4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        np6 np6Var = (np6) obj;
                        jx4 jx4Var2 = this.m;
                        Object objG = jx4Var2.g(np6Var);
                        np6Var.getClass();
                        Object objInvoke = np6Var.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            jx4Var2.m(np6Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // o.op6
    public final void d(np6 np6Var, Object obj) {
        boolean z = obj instanceof m3;
        jx4 jx4Var = this.m;
        if (z && jx4Var.c(np6Var)) {
            Object objG = jx4Var.g(np6Var);
            objG.getClass();
            m3 m3Var = (m3) objG;
            m3 m3Var2 = (m3) obj;
            String str = m3Var2.a;
            if (str == null) {
                str = m3Var.a;
            }
            pw2 pw2Var = m3Var2.b;
            if (pw2Var == null) {
                pw2Var = m3Var.b;
            }
            jx4Var.m(np6Var, new m3(str, pw2Var));
        } else {
            jx4Var.m(np6Var, obj);
        }
        np6Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap6)) {
            return false;
        }
        ap6 ap6Var = (ap6) obj;
        return this.m.equals(ap6Var.m) && this.f346o == ap6Var.f346o && this.p == ap6Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + to7.f(this.m.hashCode() * 31, 31, this.f346o);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        wm4 wm4Var = this.n;
        if (wm4Var == null) {
            jx4 jx4Var = this.m;
            wm4 wm4Var2 = jx4Var.f;
            if (wm4Var2 == null) {
                wm4Var2 = new wm4(jx4Var);
                jx4Var.f = wm4Var2;
            }
            wm4Var = wm4Var2;
            this.n = wm4Var;
        }
        return ((fc2) wm4Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f346o) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.p) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        jx4 jx4Var = this.m;
        Object[] objArr = jx4Var.b;
        Object[] objArr2 = jx4Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((np6) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return ct1.U(this) + "{ " + ((Object) sb) + " }";
    }
}
