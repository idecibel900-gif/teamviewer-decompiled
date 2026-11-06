package o;

/* JADX INFO: loaded from: classes.dex */
public final class aj2 {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public aj2(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public static aj2 a(int i) {
        return new aj2(i, false);
    }

    public static aj2 b(int i) {
        return new aj2(i, true);
    }
}
