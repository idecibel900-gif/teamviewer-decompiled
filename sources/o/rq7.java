package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rq7 implements jn2, qw2 {
    public final /* synthetic */ Function0 m;

    public rq7(Function0 function0) {
        this.m = function0;
    }

    @Override // o.jn2
    public final /* synthetic */ float a() {
        return ((Number) this.m.a()).floatValue();
    }

    @Override // o.qw2
    public final pw2 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jn2) && (obj instanceof qw2)) {
            return im3.n(b(), ((qw2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
