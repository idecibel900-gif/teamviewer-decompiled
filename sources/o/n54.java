package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class n54 implements mj8 {
    public Function0 a;
    public bg5 b;
    public final bg5 c = h57.p(Boolean.FALSE);

    public final long a() {
        ao1 ao1Var;
        bg5 bg5VarP = this.b;
        if (bg5VarP == null) {
            Function0 function0 = this.a;
            if (function0 == null || (ao1Var = (ao1) function0.a()) == null) {
                ao1Var = ao1.c;
            }
            bg5VarP = h57.p(ao1Var);
            this.b = bg5VarP;
            this.a = null;
        }
        return ((ao1) bg5VarP.getValue()).a;
    }

    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
