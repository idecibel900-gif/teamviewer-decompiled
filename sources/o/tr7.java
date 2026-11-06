package o;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr7 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ in1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f2137o;

    public /* synthetic */ tr7(in1 in1Var, px4 px4Var, byte b) {
        this.m = b;
        this.n = in1Var;
        this.f2137o = px4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        px4 px4Var = this.f2137o;
        in1 in1Var = this.n;
        switch (b) {
            case 0:
                or orVar = new or((Function0) obj, (byte) 8);
                tr7 tr7Var = new tr7(in1Var, px4Var, (byte) 1);
                if (rj4.a()) {
                    return rj4.a() ? new oj4(orVar, tr7Var, Build.VERSION.SDK_INT == 28 ? zl5.a : bm5.a) : cs4.b;
                }
                yq4.r("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                a42 a42Var = (a42) obj;
                px4Var.setValue(new dl3((((long) in1Var.q0(a42.a(a42Var.a))) & 4294967295L) | (((long) in1Var.q0(a42.b(a42Var.a))) << 32)));
                return f88.a;
        }
    }
}
