package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pq2 implements qw2 {
    public final /* synthetic */ Function1 m;

    public pq2(Function1 function1) {
        this.m = function1;
    }

    @Override // o.qw2
    public final pw2 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pq2) {
            return im3.n(b(), ((qw2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
