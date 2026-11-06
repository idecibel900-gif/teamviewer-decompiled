package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ pr7 n;

    public /* synthetic */ kd1(pr7 pr7Var, byte b) {
        this.m = b;
        this.n = pr7Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v56 v56Var;
        i04 i04VarC;
        char c;
        float fIntBitsToFloat;
        i04 i04VarC2;
        i04 i04VarC3;
        i04 i04VarC4;
        i04 i04VarC5;
        byte b = this.m;
        pr7 pr7Var = this.n;
        switch (b) {
            case 0:
                return new m8(pr7Var, (byte) 6);
            case 1:
                pr7Var.s();
                return f88.a;
            default:
                i04 i04Var = (i04) obj;
                j64 j64Var = pr7Var.d;
                v56 v56Var2 = v56.e;
                if (j64Var == null) {
                    v56Var = v56Var2;
                } else {
                    if (j64Var.p) {
                        j64Var = null;
                    }
                    if (j64Var != null) {
                        v65 v65Var = pr7Var.b;
                        long j = pr7Var.l().b;
                        int i = gt7.c;
                        int iQ = v65Var.q((int) (j >> 32));
                        int iQ2 = pr7Var.b.q((int) (pr7Var.l().b & 4294967295L));
                        j64 j64Var2 = pr7Var.d;
                        long jP = 0;
                        long jP2 = (j64Var2 == null || (i04VarC5 = j64Var2.c()) == null) ? 0L : i04VarC5.P(pr7Var.j(true));
                        j64 j64Var3 = pr7Var.d;
                        if (j64Var3 != null && (i04VarC4 = j64Var3.c()) != null) {
                            jP = i04VarC4.P(pr7Var.j(false));
                        }
                        j64 j64Var4 = pr7Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (j64Var4 == null || (i04VarC3 = j64Var4.c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            ws7 ws7VarD = j64Var.d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (i04VarC3.P((((long) Float.floatToRawIntBits(ws7VarD != null ? ws7VarD.a.c(iQ).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        j64 j64Var5 = pr7Var.d;
                        if (j64Var5 != null && (i04VarC2 = j64Var5.c()) != null) {
                            ws7 ws7VarD2 = j64Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (i04VarC2.P((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(ws7VarD2 != null ? ws7VarD2.a.c(iQ2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i2 = (int) (jP2 >> c);
                        int i3 = (int) (jP >> c);
                        v56Var = new v56(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), (((in1) j64Var.a.d).getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jP2 & 4294967295L)), Float.intBitsToFloat((int) (jP & 4294967295L))));
                    } else {
                        v56Var = v56Var2;
                    }
                }
                j64 j64Var6 = pr7Var.d;
                if (j64Var6 == null || (i04VarC = j64Var6.c()) == null) {
                    return null;
                }
                return (i04VarC.m() && i04Var.m()) ? qs1.v(i04Var.N(vt1.s(i04VarC).A(v56Var.d())), v56Var.c()) : v56Var2;
        }
    }
}
