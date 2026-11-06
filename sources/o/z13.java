package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z13 extends og7 implements jw2 {
    public /* synthetic */ List m;
    public /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f2661o;

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        z13 z13Var = new z13(4, (hc1) obj4);
        z13Var.m = (List) obj;
        z13Var.n = zBooleanValue;
        z13Var.f2661o = zBooleanValue2;
        return z13Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        List list = this.m;
        boolean z = this.n;
        boolean z2 = this.f2661o;
        ct1.a0(obj);
        return new x13(list, z, z2);
    }
}
