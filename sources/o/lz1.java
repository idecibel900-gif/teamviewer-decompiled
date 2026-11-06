package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lz1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    public /* synthetic */ lz1(String str, byte b) {
        this.m = b;
        this.n = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        String str = this.n;
        switch (b) {
            case 0:
                int length = str.length();
                return h57.p(new zr7(4, h57.a(length, length), str));
            case 1:
                return h57.p(str);
            case 2:
                return h57.p(str);
            case 3:
                return h57.p(str);
            case 4:
                return h57.p(str);
            case 5:
                return h57.p(str);
            case 6:
                return h57.p(new zr7(6, 0L, str));
            default:
                return h57.p(str);
        }
    }
}
