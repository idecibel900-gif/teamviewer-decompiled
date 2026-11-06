package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v90 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ xy6 n;

    public /* synthetic */ v90(xy6 xy6Var, byte b) {
        this.m = b;
        this.n = xy6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        xy6 xy6Var = this.n;
        switch (b) {
            case 0:
                ((Float) obj).getClass();
                return Float.valueOf(((Number) xy6Var.b.a()).floatValue());
            case 1:
                jd6 jd6Var = (jd6) obj;
                nf nfVar = xy6Var.g;
                float fZ = ((wf5) nfVar.i).z();
                float fE = nfVar.e().e();
                float f = fZ < fE ? fE - fZ : 0.0f;
                jd6Var.l(f > 0.0f ? (Float.intBitsToFloat((int) (jd6Var.C & 4294967295L)) + f) / Float.intBitsToFloat((int) (jd6Var.C & 4294967295L)) : 1.0f);
                jd6Var.z(u47.c(0.5f, 0.0f));
                return f88Var;
            default:
                jd6 jd6Var2 = (jd6) obj;
                nf nfVar2 = xy6Var.g;
                float fZ2 = ((wf5) nfVar2.i).z();
                float fE2 = nfVar2.e().e();
                float f2 = fZ2 < fE2 ? fE2 - fZ2 : 0.0f;
                jd6Var2.l(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (jd6Var2.C & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & jd6Var2.C))) : 1.0f);
                jd6Var2.z(u47.c(0.5f, 0.0f));
                return f88Var;
        }
    }
}
