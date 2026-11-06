package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vb2 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f2295o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb2(Function1 function1, byte b) {
        super(1);
        this.n = b;
        this.f2295o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        Function1 function1 = this.f2295o;
        switch (b) {
            case 0:
                break;
        }
        return new vk3(((long) ((Number) function1.invoke(Integer.valueOf((int) (((dl3) obj).a >> 32)))).intValue()) << 32);
    }
}
