package o;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gc2 implements Function0 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f881o;
    public final /* synthetic */ Object p;

    public /* synthetic */ gc2(int i, String str, hc2 hc2Var) {
        this.n = i;
        this.f881o = str;
        this.p = hc2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        Object obj = this.p;
        int i = this.n;
        Object obj2 = this.f881o;
        switch (b) {
            case 0:
                String str = (String) obj2;
                hc2 hc2Var = (hc2) obj;
                fq6[] fq6VarArr = new fq6[i];
                for (int i2 = 0; i2 < i; i2++) {
                    fq6VarArr[i2] = et1.s(str + '.' + hc2Var.e[i2], lc7.g, new fq6[0]);
                }
                return fq6VarArr;
            default:
                i83 i83Var = (i83) obj2;
                try {
                    i83Var.I.G(i, (tc2) obj);
                    break;
                } catch (IOException e) {
                    tc2 tc2Var = tc2.PROTOCOL_ERROR;
                    i83Var.e(tc2Var, tc2Var, e);
                }
                return f88.a;
        }
    }

    public /* synthetic */ gc2(i83 i83Var, int i, tc2 tc2Var) {
        this.f881o = i83Var;
        this.n = i;
        this.p = tc2Var;
    }
}
