package o;

/* JADX INFO: loaded from: classes.dex */
public final class fc1 implements me1 {
    public final de1 m;

    public fc1(de1 de1Var) {
        this.m = de1Var;
    }

    @Override // o.me1
    public final de1 getCoroutineContext() {
        return this.m;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.m + ')';
    }
}
