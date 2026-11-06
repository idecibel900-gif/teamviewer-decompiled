package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class nj6 {
    public static final rk5 d;
    public static final /* synthetic */ fw3[] e;
    public final d0 a;
    public final Function1 b;
    public final vd4 c;

    static {
        x86 x86Var = w86.a;
        e = new fw3[]{x86Var.g(new gu5(x86Var.b(nj6.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        d = new rk5((byte) 7);
    }

    public nj6(d0 d0Var, xd4 xd4Var, Function1 function1) {
        this.a = d0Var;
        this.b = function1;
        this.c = new vd4(xd4Var, new a3(this, (byte) 29));
    }
}
