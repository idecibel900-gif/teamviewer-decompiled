package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends yz3 implements Function0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hm1 f986o;
    public static final hm1 p;
    public final /* synthetic */ byte n;

    static {
        int i = 0;
        f986o = new hm1(i, (byte) 0);
        p = new hm1(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm1(int i, byte b) {
        super(i);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        switch (this.n) {
            case 0:
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
