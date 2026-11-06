package o;

/* JADX INFO: loaded from: classes2.dex */
public class xx0 {
    public static final /* synthetic */ long b = defpackage.a.a.objectFieldOffset(xx0.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public xx0(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
