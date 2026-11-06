package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ck6 implements oc5 {
    public final int m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f536o = null;
    public Float p = null;
    public rj6 q = null;
    public rj6 r = null;

    public ck6(int i, ArrayList arrayList) {
        this.m = i;
        this.n = arrayList;
    }

    @Override // o.oc5
    public final boolean s() {
        return this.n.contains(this);
    }
}
