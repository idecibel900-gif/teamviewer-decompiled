package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo/of;", "", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class of extends Throwable {
    public final String m;

    public of(boolean z, boolean z2, uj1 uj1Var, Object obj) {
        this.m = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + uj1Var + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.m;
    }
}
