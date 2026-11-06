package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn8 implements z84, qw2 {
    public final /* synthetic */ n01 m;

    public vn8(n01 n01Var) {
        this.m = n01Var;
    }

    @Override // o.qw2
    public final pw2 b() {
        return new cx2(1, this.m, n01.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z84) && (obj instanceof qw2)) {
            return im3.n(b(), ((qw2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
