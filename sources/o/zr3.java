package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class zr3 implements Function0 {
    public final /* synthetic */ byte m;
    public final bs3 n;

    public /* synthetic */ zr3(bs3 bs3Var, byte b) {
        this.m = b;
        this.n = bs3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        bs3 bs3Var = this.n;
        switch (b) {
            case 0:
                List listK = qf0.K(rp.a(bs3Var.m.p, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listK.isEmpty() ? yl7.p : new wp(listK, (byte) 0);
            default:
                return bs3Var.m.p.e();
        }
    }
}
