package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wk1 implements tk6 {
    public final Function1 a;
    public final vk1 b = new vk1(this, 0);
    public final iy4 c = new iy4();
    public final bg5 d;
    public final bg5 e;
    public final bg5 f;

    public wk1(Function1 function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = h57.p(bool);
        this.e = h57.p(bool);
        this.f = h57.p(bool);
    }

    @Override // o.tk6
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // o.tk6
    public final float d(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // o.tk6
    public final Object e(ay4 ay4Var, hw2 hw2Var, jc1 jc1Var) {
        Object objJ = hm3.j(new j0((Object) this, (Object) ay4Var, (Object) hw2Var, (hc1) null, (byte) 22), jc1Var);
        return objJ == ne1.m ? objJ : f88.a;
    }
}
