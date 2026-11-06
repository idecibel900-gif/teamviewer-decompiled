package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k44 extends iu5 implements sv3 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k44(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        return get();
    }

    @Override // o.bj0
    public final rt3 computeReflected() {
        return w86.a.f(this);
    }

    @Override // o.sv3
    public final Object get() {
        switch (this.m) {
            case 0:
                return ((i97) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // o.fw3
    public final uv3 getGetter() {
        return ((sv3) getReflected()).getGetter();
    }
}
