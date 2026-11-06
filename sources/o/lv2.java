package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lo/lv2;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class lv2 extends RuntimeException {
    public final mv2 m;
    public final Throwable n;

    public lv2(mv2 mv2Var, Throwable th) {
        super(th);
        this.m = mv2Var;
        this.n = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.n;
    }
}
