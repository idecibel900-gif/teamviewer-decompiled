package o;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x87 extends m48 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x87(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // o.k58
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // o.k58
    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // o.m48
    public final h58 g(k48 k48Var) {
        byte b = this.c;
        Object obj = this.d;
        k48Var.getClass();
        switch (b) {
            case 0:
                if (!((ArrayList) obj).contains(k48Var)) {
                    return null;
                }
                ys0 ys0VarA = k48Var.a();
                ys0VarA.getClass();
                return p58.k((d58) ys0VarA);
            default:
                return (h58) ((Map) obj).get(k48Var);
        }
    }
}
