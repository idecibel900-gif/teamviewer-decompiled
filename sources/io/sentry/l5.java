package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public abstract class l5 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l5 l5Var) {
        return Long.compare(d(), l5Var.d());
    }

    public long b(l5 l5Var) {
        return d() - l5Var.d();
    }

    public long c(l5 l5Var) {
        return (l5Var == null || compareTo(l5Var) >= 0) ? d() : l5Var.d();
    }

    public abstract long d();
}
