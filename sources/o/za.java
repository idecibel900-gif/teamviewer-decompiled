package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class za implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ea0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l33 f2683o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ fs4 q;
    public final /* synthetic */ List r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ za(ea0 ea0Var, l33 l33Var, List list, Object obj, Object obj2, Function0 function0, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = ea0Var;
        this.f2683o = l33Var;
        this.r = list;
        this.s = obj;
        this.t = obj2;
        this.p = function0;
        this.q = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.t;
        Object obj4 = this.s;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                au8.a(this.n, this.f2683o, this.r, (ib) obj4, (hb) obj3, this.p, this.q, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                kh.a(this.n, this.f2683o, (ArrayList) this.r, (ob) obj4, (ja) obj3, this.p, this.q, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }
}
