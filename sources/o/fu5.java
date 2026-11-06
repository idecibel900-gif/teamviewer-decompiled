package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fu5 extends iu5 implements xv3 {
    @Override // o.bj0
    public rt3 computeReflected() {
        return w86.a.g(this);
    }

    @Override // o.fw3
    public wv3 getGetter() {
        return ((xv3) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }
}
