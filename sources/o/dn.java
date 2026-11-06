package o;

/* JADX INFO: loaded from: classes.dex */
public final class dn extends yz3 implements hw2 {
    public final /* synthetic */ hf2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(hf2 hf2Var) {
        super(2);
        this.n = hf2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        mb2 mb2Var = (mb2) obj;
        mb2 mb2Var2 = (mb2) obj2;
        mb2 mb2Var3 = mb2.f1456o;
        return Boolean.valueOf(mb2Var == mb2Var3 && mb2Var2 == mb2Var3 && !this.n.a.e);
    }
}
