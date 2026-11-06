package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class v87 implements Function0 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ v87(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return f57.p((d58) ((w87) obj).b);
            case 1:
                return new m58(((m58) obj).a);
            case 2:
                je7 je7Var = (je7) obj;
                return je7Var.h(qs1.N(je7Var.b, null, 3));
            case 3:
                return hd2.c(gd2.K, ((lh7) obj).toString());
            case 4:
                return (List) ((pb8) obj).x.getValue();
            default:
                return new y61[((go2[]) obj).length];
        }
    }
}
