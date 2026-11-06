package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hn extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ in f991o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn(in inVar, byte b) {
        super(1);
        this.n = b;
        this.f991o = inVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c;
        long j;
        byte b = this.n;
        f88 f88Var = f88.a;
        int i = 0;
        in inVar = this.f991o;
        char c2 = ' ';
        long j2 = 4294967295L;
        switch (b) {
            case 0:
                il5 il5Var = (il5) obj;
                jl5[] jl5VarArr = inVar.c;
                jl5VarArr.getClass();
                int i2 = inVar.e;
                int i3 = inVar.g;
                int length = jl5VarArr.length;
                while (i < length) {
                    jl5 jl5Var = jl5VarArr[i];
                    if (jl5Var != null) {
                        long j3 = (((long) jl5Var.m) << 32) | (((long) jl5Var.n) & 4294967295L);
                        long j4 = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        long jRound = (((long) Math.round((1.0f - 1.0f) * ((((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f))) & 4294967295L);
                        il5Var.g(jl5Var, (int) (jRound >> 32), (int) (jRound & 4294967295L), 0.0f);
                    }
                    i++;
                }
                break;
            default:
                il5 il5Var2 = (il5) obj;
                jl5[] jl5VarArr2 = inVar.b;
                jl5VarArr2.getClass();
                int i4 = inVar.d;
                int i5 = inVar.f;
                int length2 = jl5VarArr2.length;
                while (i < length2) {
                    jl5 jl5Var2 = jl5VarArr2[i];
                    if (jl5Var2 != null) {
                        long j5 = (((long) jl5Var2.m) << c2) | (((long) jl5Var2.n) & j2);
                        c = c2;
                        j = j2;
                        long j6 = (((long) i5) & j) | (((long) i4) << c2);
                        float f = (((int) (j6 >> c)) - ((int) (j5 >> c))) / 2.0f;
                        float f2 = (1.0f - 1.0f) * ((((int) (j6 & j)) - ((int) (j5 & j))) / 2.0f);
                        int iRound = Math.round((1.0f - 1.0f) * f);
                        long jRound2 = (((long) Math.round(f2)) & j) | (((long) iRound) << c);
                        il5Var2.g(jl5Var2, (int) (jRound2 >> c), (int) (jRound2 & j), 0.0f);
                    } else {
                        c = c2;
                        j = j2;
                    }
                    i++;
                    c2 = c;
                    j2 = j;
                }
                break;
        }
        return f88Var;
    }
}
