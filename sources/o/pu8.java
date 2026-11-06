package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class pu8 extends eq8 {
    public final /* synthetic */ com.google.android.gms.common.internal.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu8(com.google.android.gms.common.internal.a aVar, int i, Bundle bundle) {
        super(aVar, i, bundle);
        this.g = aVar;
    }

    @Override // o.eq8
    public final boolean a() {
        this.g.i.c(w41.r);
        return true;
    }

    @Override // o.eq8
    public final void b(w41 w41Var) {
        this.g.i.c(w41Var);
        System.currentTimeMillis();
    }
}
