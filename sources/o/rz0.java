package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lo/rz0;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rz0 extends IllegalStateException {
    public final String m;

    public rz0(String str) {
        this.m = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.m;
    }
}
