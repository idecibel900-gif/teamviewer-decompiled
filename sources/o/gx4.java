package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gx4 extends hx4 implements zu3 {
    public gx4(wt3 wt3Var, String str, String str2) {
        super(bj0.NO_RECEIVER, ((vr0) wt3Var).a(), str, str2, !Objects.nonNull(wt3Var) ? 1 : 0);
    }

    @Override // o.ev3
    public final av3 b() {
        return ((zu3) getReflected()).b();
    }

    @Override // o.bj0
    public final rt3 computeReflected() {
        return w86.a.e(this);
    }

    @Override // o.xv3
    public final Object get(Object obj) {
        return ((vt3) getGetter()).call(obj);
    }

    @Override // o.fw3
    public final wv3 getGetter() {
        return ((zu3) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.zu3
    public final void k(Object obj, Object obj2) throws vd3 {
        b().call(obj, obj2);
    }

    public gx4(int i, Class cls, String str, String str2) {
        super(bj0.NO_RECEIVER, cls, str, str2, i);
    }
}
