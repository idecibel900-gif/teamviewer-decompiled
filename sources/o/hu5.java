package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hu5 extends iu5 implements bw3 {
    @Override // o.bj0
    public final rt3 computeReflected() {
        return w86.a.h(this);
    }

    @Override // o.fw3
    public final dw3 getGetter() {
        return ((bw3) getReflected()).getGetter();
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
