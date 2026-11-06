package o;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final ai0 a;
    public static final ai0 b;
    public static final ai0 c;
    public static final ai0 d;
    public static final ai0 e;

    static {
        ai0 ai0Var = ai0.p;
        a = ju.s("/");
        b = ju.s("\\");
        c = ju.s("/\\");
        d = ju.s(".");
        e = ju.s("..");
    }

    public static final wg5 a(wg5 wg5Var, wg5 wg5Var2, boolean z) {
        wg5Var2.getClass();
        if (c(wg5Var2) != -1 || wg5Var2.f() != null) {
            return wg5Var2;
        }
        ai0 ai0VarB = b(wg5Var);
        if (ai0VarB == null && (ai0VarB = b(wg5Var2)) == null) {
            ai0VarB = f(wg5.n);
        }
        bf0 bf0Var = new bf0();
        bf0Var.R0(wg5Var.m);
        if (bf0Var.n > 0) {
            bf0Var.R0(ai0VarB);
        }
        bf0Var.R0(wg5Var2.m);
        return d(bf0Var, z);
    }

    public static final ai0 b(wg5 wg5Var) {
        ai0 ai0Var = wg5Var.m;
        ai0 ai0Var2 = a;
        if (ai0.g(ai0Var, ai0Var2) != -1) {
            return ai0Var2;
        }
        ai0 ai0Var3 = wg5Var.m;
        ai0 ai0Var4 = b;
        if (ai0.g(ai0Var3, ai0Var4) != -1) {
            return ai0Var4;
        }
        return null;
    }

    public static final int c(wg5 wg5Var) {
        ai0 ai0Var = wg5Var.m;
        if (ai0Var.d() != 0) {
            if (ai0Var.i(0) != 47) {
                if (ai0Var.i(0) == 92) {
                    if (ai0Var.d() > 2 && ai0Var.i(1) == 92) {
                        ai0 ai0Var2 = b;
                        ai0Var2.getClass();
                        int iF = ai0Var.f(ai0Var2.h(), 2);
                        return iF == -1 ? ai0Var.d() : iF;
                    }
                } else if (ai0Var.d() > 2 && ai0Var.i(1) == 58 && ai0Var.i(2) == 92) {
                    char cI = (char) ai0Var.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    public static final wg5 d(bf0 bf0Var, boolean z) throws EOFException {
        ai0 ai0Var;
        long j;
        char cF;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        ai0 ai0Var2;
        int size;
        int i;
        long jT;
        ai0 ai0VarO0;
        ai0 ai0Var3;
        bf0 bf0Var2 = new bf0();
        ai0 ai0VarE = null;
        int i2 = 0;
        while (true) {
            if (!bf0Var.C0(a)) {
                ai0Var = b;
                if (!bf0Var.C0(ai0Var)) {
                    break;
                }
            }
            byte bC0 = bf0Var.c0();
            if (ai0VarE == null) {
                ai0VarE = e(bC0);
            }
            i2++;
        }
        boolean z4 = i2 >= 2 && im3.n(ai0VarE, ai0Var);
        ai0 ai0Var4 = c;
        if (z4) {
            ai0VarE.getClass();
            bf0Var2.R0(ai0VarE);
            bf0Var2.R0(ai0VarE);
        } else {
            if (i2 <= 0) {
                long jT2 = bf0Var.T(ai0Var4);
                if (ai0VarE == null) {
                    ai0VarE = jT2 == -1 ? f(wg5.n) : e(bf0Var.F(jT2));
                }
                if (im3.n(ai0VarE, ai0Var) && bf0Var.n >= 2) {
                    j = -1;
                    if (bf0Var.F(1L) == 58 && (('a' <= (cF = (char) bf0Var.F(0L)) && cF < '{') || ('A' <= cF && cF < '['))) {
                        if (jT2 == 2) {
                            bf0Var2.W(bf0Var, 3L);
                        } else {
                            bf0Var2.W(bf0Var, 2L);
                        }
                    }
                }
                if (bf0Var2.n > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    z3 = bf0Var.z();
                    ai0Var2 = d;
                    if (!z3) {
                        break;
                    }
                    jT = bf0Var.T(ai0Var4);
                    if (jT == j) {
                        ai0VarO0 = bf0Var.o0(bf0Var.n);
                    } else {
                        ai0VarO0 = bf0Var.o0(jT);
                        bf0Var.c0();
                    }
                    ai0Var3 = e;
                    if (im3.n(ai0VarO0, ai0Var3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || im3.n(lv0.v0(arrayList), ai0Var3)))) {
                                arrayList.add(ai0VarO0);
                            } else if (!z4 || arrayList.size() != 1) {
                                qv0.f0(arrayList);
                            }
                        }
                    } else if (im3.n(ai0VarO0, ai0Var2) && !im3.n(ai0VarO0, ai0.p)) {
                        arrayList.add(ai0VarO0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        bf0Var2.R0(ai0VarE);
                    }
                    bf0Var2.R0((ai0) arrayList.get(i));
                }
                if (bf0Var2.n == 0) {
                    bf0Var2.R0(ai0Var2);
                }
                return new wg5(bf0Var2.o0(bf0Var2.n));
            }
            ai0VarE.getClass();
            bf0Var2.R0(ai0VarE);
        }
        j = -1;
        if (bf0Var2.n > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            z3 = bf0Var.z();
            ai0Var2 = d;
            if (!z3) {
                break;
                break;
            }
            jT = bf0Var.T(ai0Var4);
            if (jT == j) {
                ai0VarO0 = bf0Var.o0(bf0Var.n);
            } else {
                ai0VarO0 = bf0Var.o0(jT);
                bf0Var.c0();
            }
            ai0Var3 = e;
            if (im3.n(ai0VarO0, ai0Var3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(ai0VarO0);
            } else if (im3.n(ai0VarO0, ai0Var2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                bf0Var2.R0(ai0VarE);
            }
            bf0Var2.R0((ai0) arrayList.get(i));
        }
        if (bf0Var2.n == 0) {
            bf0Var2.R0(ai0Var2);
        }
        return new wg5(bf0Var2.o0(bf0Var2.n));
    }

    public static final ai0 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        hk0.g(fx3.e(b2, "not a directory separator: "));
        return null;
    }

    public static final ai0 f(String str) {
        if (im3.n(str, "/")) {
            return a;
        }
        if (im3.n(str, "\\")) {
            return b;
        }
        hk0.g(ua5.m("not a directory separator: ", str));
        return null;
    }
}
