package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ d0 n;

    public /* synthetic */ c0(d0 d0Var, byte b) {
        this.m = b;
        this.n = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        d0 d0Var = this.n;
        switch (b) {
            case 0:
                zo4 zo4VarS0 = d0Var.s0();
                t tVar = new t(this, (byte) 1);
                ed2 ed2Var = p58.a;
                if (hd2.f(d0Var)) {
                    return hd2.c(gd2.w, d0Var.toString());
                }
                k48 k48VarQ = d0Var.q();
                if (k48VarQ == null) {
                    p58.a(12);
                    throw null;
                }
                if (zo4VarS0 == null) {
                    p58.a(13);
                    throw null;
                }
                List listD = p58.d(k48VarQ.getParameters());
                g48.n.getClass();
                return bt1.R(g48.f858o, k48VarQ, listD, false, zo4VarS0, tVar);
            case 1:
                return new ri3(d0Var.s0());
            default:
                return new v14(d0Var);
        }
    }
}
