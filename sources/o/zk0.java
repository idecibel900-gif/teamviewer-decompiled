package o;

/* JADX INFO: loaded from: classes.dex */
public final class zk0 implements mq2 {
    public static final zk0 a = new zk0();
    public static Boolean b;

    @Override // o.mq2
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw ua5.r("canFocus is read before it is written");
    }

    @Override // o.mq2
    public final void d(boolean z) {
        b = Boolean.valueOf(z);
    }
}
