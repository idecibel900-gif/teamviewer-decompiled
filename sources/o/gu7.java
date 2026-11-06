package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gu7 {
    public static final /* synthetic */ long b = defpackage.a.a.objectFieldOffset(gu7.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public ee2[] a;

    public final void a(ee2 ee2Var) {
        ee2Var.d((fe2) this);
        ee2[] ee2VarArr = this.a;
        if (ee2VarArr == null) {
            ee2VarArr = new ee2[4];
            this.a = ee2VarArr;
        } else if (b() >= ee2VarArr.length) {
            ee2VarArr = (ee2[]) Arrays.copyOf(ee2VarArr, b() * 2);
            this.a = ee2VarArr;
        }
        int iB = b();
        defpackage.a.a.putIntVolatile(this, b, iB + 1);
        ee2VarArr[iB] = ee2Var;
        ee2Var.n = iB;
        d(iB);
    }

    public final int b() {
        return defpackage.a.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final ee2 c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        defpackage.a.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                ee2 ee2Var = objArr2[i];
                ee2Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (ee2Var.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        ee2 ee2Var2 = objArr2[b()];
        ee2Var2.getClass();
        ee2Var2.d(null);
        ee2Var2.n = -1;
        objArr2[b()] = null;
        return ee2Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            ee2[] ee2VarArr = this.a;
            ee2VarArr.getClass();
            int i2 = (i - 1) / 2;
            ee2 ee2Var = ee2VarArr[i2];
            ee2Var.getClass();
            ee2 ee2Var2 = ee2VarArr[i];
            ee2Var2.getClass();
            if (ee2Var.compareTo(ee2Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        ee2[] ee2VarArr = this.a;
        ee2VarArr.getClass();
        ee2 ee2Var = ee2VarArr[i2];
        ee2Var.getClass();
        ee2 ee2Var2 = ee2VarArr[i];
        ee2Var2.getClass();
        ee2VarArr[i] = ee2Var;
        ee2VarArr[i2] = ee2Var2;
        ee2Var.n = i;
        ee2Var2.n = i2;
    }
}
