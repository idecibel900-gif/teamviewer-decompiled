package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lo/z12;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z12 extends Exception {
    public final Throwable m;

    public z12(Throwable th, fe1 fe1Var, de1 de1Var) {
        super("Coroutine dispatcher " + fe1Var + " threw an exception, context = " + de1Var, th);
        this.m = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.m;
    }
}
