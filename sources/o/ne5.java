package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ne5 {
    public static final h72 a = new h72(new x85((byte) 8), (byte) 0);

    public static final void a(xu7 xu7Var, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, rl2 rl2Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        Object obj;
        fs4 fs4Var2;
        bc2 bc2Var2;
        hf2 hf2Var2;
        rl2 rl2Var2;
        bc2 bc2VarE;
        hf2 hf2VarF;
        final yu7 yu7Var = xu7Var.n;
        zu7 zu7Var = xu7Var.m;
        w50 w50Var = xz2.B;
        ux2Var.Y(-1101649866);
        final byte b = 4;
        final byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(xu7Var) : ux2Var.h(xu7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        int i4 = 196608 | i3;
        if ((1572864 & i) == 0) {
            obj = yy0Var;
            i4 |= ux2Var.h(obj) ? 1048576 : 524288;
        } else {
            obj = yy0Var;
        }
        final byte b3 = 0;
        final byte b4 = 1;
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                final vu7 vu7VarF = zu7Var.f();
                qe5 qe5VarA = vu7VarF.b(yu7Var).a();
                if (im3.n(qe5VarA, yl7.I)) {
                    final byte b5 = 5;
                    bc2VarE = wb2.k(new Function1() { // from class: o.ve5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iE;
                            byte b6 = b5;
                            int i5 = 0;
                            se5 se5Var = null;
                            vu7 vu7Var = vu7VarF;
                            ((Integer) obj2).getClass();
                            switch (b6) {
                                case 0:
                                    iE = qf0.E(vu7Var);
                                    break;
                                case 1:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 2:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 3:
                                    for (int i6 = vu7Var.h - 1; -1 < i6; i6--) {
                                        vu7Var.c(i6);
                                        se5 se5VarA = vu7Var.a(i6);
                                        if (im3.n(se5VarA.a(), yl7.M)) {
                                            i5 = -(se5Var != null ? (int) (se5Var.c >> 32) : ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32)));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                            se5Var = se5VarA;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                case 4:
                                    byte b7 = vu7Var.h;
                                    for (int i7 = 0; i7 < b7; i7++) {
                                        vu7Var.c(i7);
                                        se5 se5VarA2 = vu7Var.a(i7);
                                        if (im3.n(se5VarA2.a(), yl7.N)) {
                                            i5 = ((int) (vu7Var.g >> 32)) - (se5Var != null ? ((int) (se5Var.c >> 32)) + ((int) (se5Var.b >> 32)) : (int) (se5VarA2.c >> 32));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA2.a().b == 3 || se5VarA2.a().b == 1) {
                                            se5Var = se5VarA2;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                default:
                                    iE = qf0.E(vu7Var);
                                    break;
                            }
                            return Integer.valueOf(iE);
                        }
                    }, te5.c);
                } else if (im3.n(qe5VarA, yl7.K)) {
                    bc2VarE = wb2.k(new Function1() { // from class: o.ve5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iE;
                            byte b6 = b3;
                            int i5 = 0;
                            se5 se5Var = null;
                            vu7 vu7Var = vu7VarF;
                            ((Integer) obj2).getClass();
                            switch (b6) {
                                case 0:
                                    iE = qf0.E(vu7Var);
                                    break;
                                case 1:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 2:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 3:
                                    for (int i6 = vu7Var.h - 1; -1 < i6; i6--) {
                                        vu7Var.c(i6);
                                        se5 se5VarA = vu7Var.a(i6);
                                        if (im3.n(se5VarA.a(), yl7.M)) {
                                            i5 = -(se5Var != null ? (int) (se5Var.c >> 32) : ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32)));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                            se5Var = se5VarA;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                case 4:
                                    byte b7 = vu7Var.h;
                                    for (int i7 = 0; i7 < b7; i7++) {
                                        vu7Var.c(i7);
                                        se5 se5VarA2 = vu7Var.a(i7);
                                        if (im3.n(se5VarA2.a(), yl7.N)) {
                                            i5 = ((int) (vu7Var.g >> 32)) - (se5Var != null ? ((int) (se5Var.c >> 32)) + ((int) (se5Var.b >> 32)) : (int) (se5VarA2.c >> 32));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA2.a().b == 3 || se5VarA2.a().b == 1) {
                                            se5Var = se5VarA2;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                default:
                                    iE = qf0.E(vu7Var);
                                    break;
                            }
                            return Integer.valueOf(iE);
                        }
                    }, te5.e);
                } else if (im3.n(qe5VarA, yl7.J)) {
                    bc2VarE = wb2.k(new Function1() { // from class: o.ve5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iE;
                            byte b6 = b4;
                            int i5 = 0;
                            se5 se5Var = null;
                            vu7 vu7Var = vu7VarF;
                            ((Integer) obj2).getClass();
                            switch (b6) {
                                case 0:
                                    iE = qf0.E(vu7Var);
                                    break;
                                case 1:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 2:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 3:
                                    for (int i6 = vu7Var.h - 1; -1 < i6; i6--) {
                                        vu7Var.c(i6);
                                        se5 se5VarA = vu7Var.a(i6);
                                        if (im3.n(se5VarA.a(), yl7.M)) {
                                            i5 = -(se5Var != null ? (int) (se5Var.c >> 32) : ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32)));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                            se5Var = se5VarA;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                case 4:
                                    byte b7 = vu7Var.h;
                                    for (int i7 = 0; i7 < b7; i7++) {
                                        vu7Var.c(i7);
                                        se5 se5VarA2 = vu7Var.a(i7);
                                        if (im3.n(se5VarA2.a(), yl7.N)) {
                                            i5 = ((int) (vu7Var.g >> 32)) - (se5Var != null ? ((int) (se5Var.c >> 32)) + ((int) (se5Var.b >> 32)) : (int) (se5VarA2.c >> 32));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA2.a().b == 3 || se5VarA2.a().b == 1) {
                                            se5Var = se5VarA2;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                default:
                                    iE = qf0.E(vu7Var);
                                    break;
                            }
                            return Integer.valueOf(iE);
                        }
                    }, te5.c);
                } else if (im3.n(qe5VarA, yl7.L)) {
                    bc2VarE = wb2.k(new Function1() { // from class: o.ve5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iE;
                            byte b6 = b2;
                            int i5 = 0;
                            se5 se5Var = null;
                            vu7 vu7Var = vu7VarF;
                            ((Integer) obj2).getClass();
                            switch (b6) {
                                case 0:
                                    iE = qf0.E(vu7Var);
                                    break;
                                case 1:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 2:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 3:
                                    for (int i6 = vu7Var.h - 1; -1 < i6; i6--) {
                                        vu7Var.c(i6);
                                        se5 se5VarA = vu7Var.a(i6);
                                        if (im3.n(se5VarA.a(), yl7.M)) {
                                            i5 = -(se5Var != null ? (int) (se5Var.c >> 32) : ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32)));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                            se5Var = se5VarA;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                case 4:
                                    byte b7 = vu7Var.h;
                                    for (int i7 = 0; i7 < b7; i7++) {
                                        vu7Var.c(i7);
                                        se5 se5VarA2 = vu7Var.a(i7);
                                        if (im3.n(se5VarA2.a(), yl7.N)) {
                                            i5 = ((int) (vu7Var.g >> 32)) - (se5Var != null ? ((int) (se5Var.c >> 32)) + ((int) (se5Var.b >> 32)) : (int) (se5VarA2.c >> 32));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA2.a().b == 3 || se5VarA2.a().b == 1) {
                                            se5Var = se5VarA2;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                default:
                                    iE = qf0.E(vu7Var);
                                    break;
                            }
                            return Integer.valueOf(iE);
                        }
                    }, te5.e);
                } else if (im3.n(qe5VarA, yl7.O)) {
                    bc2VarE = wb2.b(te5.d, w50Var, 12).a(wb2.k(new Function1() { // from class: o.we5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iG;
                            long j;
                            byte b6 = b3;
                            int i5 = 0;
                            yu7 yu7Var2 = yu7Var;
                            vu7 vu7Var = vu7VarF;
                            ((Integer) obj2).getClass();
                            switch (b6) {
                                case 0:
                                    byte b7 = vu7Var.h;
                                    iG = 0;
                                    while (i5 < b7) {
                                        yu7 yu7VarC = vu7Var.c(i5);
                                        se5 se5VarA = vu7Var.a(i5);
                                        if (im3.n(yu7VarC, yu7Var2)) {
                                            j = vu7Var.b(yu7Var2).e;
                                        } else {
                                            if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                                iG = ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32));
                                            }
                                            i5++;
                                        }
                                        break;
                                    }
                                    j = vu7Var.b(yu7Var2).e;
                                    break;
                                default:
                                    byte b8 = vu7Var.h;
                                    iG = 0;
                                    while (i5 < b8) {
                                        yu7 yu7VarC2 = vu7Var.c(i5);
                                        se5 se5VarA2 = vu7Var.a(i5);
                                        if (im3.n(yu7VarC2, yu7Var2)) {
                                            j = vu7Var.b(yu7Var2).c;
                                        } else {
                                            if (se5VarA2.a().b == 3 || se5VarA2.a().b == 2) {
                                                iG = qf0.G(se5VarA2);
                                            }
                                            i5++;
                                        }
                                        break;
                                    }
                                    j = vu7Var.b(yu7Var2).c;
                                    break;
                            }
                            return Integer.valueOf(iG - ((int) (j >> 32)));
                        }
                    }, te5.c));
                } else {
                    bc2VarE = im3.n(qe5VarA, yl7.Q) ? wb2.e(te5.b, 2) : bc2.b;
                }
                final vu7 vu7VarF2 = zu7Var.f();
                qe5 qe5VarA2 = vu7VarF2.b(yu7Var).a();
                if (im3.n(qe5VarA2, yl7.M)) {
                    final byte b6 = 3;
                    hf2VarF = wb2.l(new Function1() { // from class: o.ve5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iE;
                            byte b7 = b6;
                            int i5 = 0;
                            se5 se5Var = null;
                            vu7 vu7Var = vu7VarF2;
                            ((Integer) obj2).getClass();
                            switch (b7) {
                                case 0:
                                    iE = qf0.E(vu7Var);
                                    break;
                                case 1:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 2:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 3:
                                    for (int i6 = vu7Var.h - 1; -1 < i6; i6--) {
                                        vu7Var.c(i6);
                                        se5 se5VarA = vu7Var.a(i6);
                                        if (im3.n(se5VarA.a(), yl7.M)) {
                                            i5 = -(se5Var != null ? (int) (se5Var.c >> 32) : ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32)));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                            se5Var = se5VarA;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                case 4:
                                    byte b8 = vu7Var.h;
                                    for (int i7 = 0; i7 < b8; i7++) {
                                        vu7Var.c(i7);
                                        se5 se5VarA2 = vu7Var.a(i7);
                                        if (im3.n(se5VarA2.a(), yl7.N)) {
                                            i5 = ((int) (vu7Var.g >> 32)) - (se5Var != null ? ((int) (se5Var.c >> 32)) + ((int) (se5Var.b >> 32)) : (int) (se5VarA2.c >> 32));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA2.a().b == 3 || se5VarA2.a().b == 1) {
                                            se5Var = se5VarA2;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                default:
                                    iE = qf0.E(vu7Var);
                                    break;
                            }
                            return Integer.valueOf(iE);
                        }
                    }, te5.c);
                } else if (im3.n(qe5VarA2, yl7.N)) {
                    hf2VarF = wb2.l(new Function1() { // from class: o.ve5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iE;
                            byte b7 = b;
                            int i5 = 0;
                            se5 se5Var = null;
                            vu7 vu7Var = vu7VarF2;
                            ((Integer) obj2).getClass();
                            switch (b7) {
                                case 0:
                                    iE = qf0.E(vu7Var);
                                    break;
                                case 1:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 2:
                                    iE = qf0.F(vu7Var);
                                    break;
                                case 3:
                                    for (int i6 = vu7Var.h - 1; -1 < i6; i6--) {
                                        vu7Var.c(i6);
                                        se5 se5VarA = vu7Var.a(i6);
                                        if (im3.n(se5VarA.a(), yl7.M)) {
                                            i5 = -(se5Var != null ? (int) (se5Var.c >> 32) : ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32)));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                            se5Var = se5VarA;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                case 4:
                                    byte b8 = vu7Var.h;
                                    for (int i7 = 0; i7 < b8; i7++) {
                                        vu7Var.c(i7);
                                        se5 se5VarA2 = vu7Var.a(i7);
                                        if (im3.n(se5VarA2.a(), yl7.N)) {
                                            i5 = ((int) (vu7Var.g >> 32)) - (se5Var != null ? ((int) (se5Var.c >> 32)) + ((int) (se5Var.b >> 32)) : (int) (se5VarA2.c >> 32));
                                            return Integer.valueOf(i5);
                                        }
                                        if (se5VarA2.a().b == 3 || se5VarA2.a().b == 1) {
                                            se5Var = se5VarA2;
                                        }
                                    }
                                    return Integer.valueOf(i5);
                                default:
                                    iE = qf0.E(vu7Var);
                                    break;
                            }
                            return Integer.valueOf(iE);
                        }
                    }, te5.c);
                } else if (im3.n(qe5VarA2, yl7.P)) {
                    hf2VarF = wb2.h(te5.d, w50Var, 12).a(wb2.l(new Function1() { // from class: o.we5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int iG;
                            long j;
                            byte b7 = b4;
                            int i5 = 0;
                            yu7 yu7Var2 = yu7Var;
                            vu7 vu7Var = vu7VarF2;
                            ((Integer) obj2).getClass();
                            switch (b7) {
                                case 0:
                                    byte b8 = vu7Var.h;
                                    iG = 0;
                                    while (i5 < b8) {
                                        yu7 yu7VarC = vu7Var.c(i5);
                                        se5 se5VarA = vu7Var.a(i5);
                                        if (im3.n(yu7VarC, yu7Var2)) {
                                            j = vu7Var.b(yu7Var2).e;
                                        } else {
                                            if (se5VarA.a().b == 3 || se5VarA.a().b == 1) {
                                                iG = ((int) (se5VarA.c >> 32)) + ((int) (se5VarA.b >> 32));
                                            }
                                            i5++;
                                        }
                                        break;
                                    }
                                    j = vu7Var.b(yu7Var2).e;
                                    break;
                                default:
                                    byte b9 = vu7Var.h;
                                    iG = 0;
                                    while (i5 < b9) {
                                        yu7 yu7VarC2 = vu7Var.c(i5);
                                        se5 se5VarA2 = vu7Var.a(i5);
                                        if (im3.n(yu7VarC2, yu7Var2)) {
                                            j = vu7Var.b(yu7Var2).c;
                                        } else {
                                            if (se5VarA2.a().b == 3 || se5VarA2.a().b == 2) {
                                                iG = qf0.G(se5VarA2);
                                            }
                                            i5++;
                                        }
                                        break;
                                    }
                                    j = vu7Var.b(yu7Var2).c;
                                    break;
                            }
                            return Integer.valueOf(iG - ((int) (j >> 32)));
                        }
                    }, te5.c));
                } else {
                    hf2VarF = im3.n(qe5VarA2, yl7.R) ? wb2.f(te5.b, 2) : hf2.b;
                }
                rl2Var2 = te5.a;
                fs4Var2 = cs4.b;
                bc2Var2 = bc2VarE;
                hf2Var2 = hf2VarF;
            } else {
                ux2Var.Q();
                fs4Var2 = fs4Var;
                bc2Var2 = bc2Var;
                hf2Var2 = hf2Var;
                rl2Var2 = rl2Var;
            }
            ux2Var.q();
            ((mj1) ux2Var.j(a)).a(new d11(xu7Var, fs4Var2, bc2Var2, hf2Var2, rl2Var2, obj), ux2Var, 0);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            bc2Var2 = bc2Var;
            hf2Var2 = hf2Var;
            rl2Var2 = rl2Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new nx(xu7Var, fs4Var2, bc2Var2, hf2Var2, rl2Var2, yy0Var, i);
        }
    }
}
