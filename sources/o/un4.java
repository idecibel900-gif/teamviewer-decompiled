package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class un4 {
    public static final h72 a;

    static {
        new kh7(new ti4((byte) 4));
        a = new h72(new ti4((byte) 5), (byte) 1);
    }

    public static final void a(zv0 zv0Var, cu4 cu4Var, tx6 tx6Var, h68 h68Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(904511636);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(zv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(cu4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(tx6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(h68Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 16384 : 8192;
        }
        byte b = 0;
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            rn4 rn4Var = new rn4(zv0Var, h68Var, tx6Var, cu4Var);
            androidx.compose.material3.c cVarA = zd6.a(false, 0.0f, 0L, null, 255);
            long j = zv0Var.a;
            boolean zE = ux2Var.e(j);
            Object objK = ux2Var.K();
            if (zE || objK == e01.a) {
                objK = new jt7(j, rv0.b(0.4f, j));
                ux2Var.g0(objK);
            }
            j51.m(new dx5[]{a.a(rn4Var), ug3.a.a(cVarA), kt7.a.a((jt7) objK)}, au8.O(-1750539308, new tn4(h68Var, yy0Var, b), ux2Var), ux2Var, 56);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a50((Object) zv0Var, (Object) cu4Var, tx6Var, h68Var, yy0Var, i, (byte) 2);
        }
    }

    public static final void b(zv0 zv0Var, tx6 tx6Var, h68 h68Var, yy0 yy0Var, ux2 ux2Var, int i) {
        ux2 ux2Var2;
        yy0 yy0Var2;
        h68 h68Var2;
        tx6 tx6Var2;
        zv0 zv0Var2;
        ux2Var.Y(-449719819);
        int i2 = (ux2Var.f(zv0Var) ? 4 : 2) | i | (ux2Var.f(tx6Var) ? 32 : 16) | (ux2Var.f(h68Var) ? 256 : 128) | (ux2Var.h(yy0Var) ? 2048 : 1024);
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            ux2Var2 = ux2Var;
            a(zv0Var, ((rn4) ux2Var.j(a)).d, tx6Var, h68Var, yy0Var, ux2Var2, i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
            zv0Var2 = zv0Var;
            tx6Var2 = tx6Var;
            h68Var2 = h68Var;
            yy0Var2 = yy0Var;
        } else {
            ux2Var2 = ux2Var;
            yy0Var2 = yy0Var;
            h68Var2 = h68Var;
            tx6Var2 = tx6Var;
            zv0Var2 = zv0Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new sn4(zv0Var2, tx6Var2, h68Var2, yy0Var2, i);
        }
    }
}
