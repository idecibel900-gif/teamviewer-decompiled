package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yn1 n;

    public /* synthetic */ xn1(yn1 yn1Var, byte b) {
        this.m = b;
        this.n = yn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                long j = ((vk3) this.n.a().invoke((qo) obj)).a;
                int i = (int) (j >> 32);
                int i2 = (int) (j & 4294967295L);
                return new zk3(i, i2, i, i2);
            case 1:
                return (qo) this.n.b().invoke(new vk3(((zk3) obj).e()));
            default:
                return (qo) this.n.b().invoke(new dl3(((zk3) obj).d()));
        }
    }
}
