package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ub2 extends yz3 implements Function1 {
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2195o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub2(boolean z, Function0 function0) {
        super(1);
        this.n = z;
        this.f2195o = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((jd6) obj).e(!this.n && ((Boolean) this.f2195o.a()).booleanValue());
        return f88.a;
    }
}
