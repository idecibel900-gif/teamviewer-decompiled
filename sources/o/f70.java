package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f70 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ xy6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f773o;
    public final /* synthetic */ me1 p;

    public /* synthetic */ f70(xy6 xy6Var, Function0 function0, me1 me1Var) {
        this.m = (byte) 1;
        this.n = xy6Var;
        this.f773o = function0;
        this.p = me1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        byte b2 = 1;
        byte b3 = 5;
        yy6 yy6Var = yy6.m;
        byte b4 = 2;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        Function0 function0 = this.f773o;
        me1 me1Var = this.p;
        xy6 xy6Var = this.n;
        switch (b) {
            case 0:
                im3.R(me1Var, null, null, new gy(xy6Var, hc1Var, b4), 3).o0(new cy(xy6Var, function0, (byte) 2));
                break;
            case 1:
                int iOrdinal = xy6Var.c().ordinal();
                if (iOrdinal == 1) {
                    function0.a();
                } else if (iOrdinal == 2) {
                    im3.R(me1Var, null, null, new gy(xy6Var, hc1Var, b3), 3);
                } else {
                    im3.R(me1Var, null, null, new gy(xy6Var, hc1Var, (byte) 6), 3);
                }
                break;
            case 2:
                if (((Boolean) xy6Var.d.invoke(yy6Var)).booleanValue()) {
                    im3.R(me1Var, null, null, new gy(xy6Var, hc1Var, (byte) 9), 3).o0(new cy(xy6Var, function0, (byte) 4));
                }
                break;
            case 3:
                im3.R(me1Var, null, null, new hx0(xy6Var, function0, hc1Var, (byte) 0), 3);
                break;
            case 4:
                im3.R(me1Var, null, null, new hx0(xy6Var, function0, hc1Var, b2), 3);
                break;
            case 5:
                if (((Boolean) xy6Var.d.invoke(yy6Var)).booleanValue()) {
                    im3.R(me1Var, null, null, new gy(xy6Var, hc1Var, (byte) 12), 3).o0(new cy(xy6Var, function0, (byte) 5));
                }
                break;
            default:
                if (xy6Var.c() == yy6.n && xy6Var.g.e().c(yy6.f2656o)) {
                    im3.R(me1Var, null, null, new gy(xy6Var, hc1Var, (byte) 13), 3);
                } else {
                    im3.R(me1Var, null, null, new gy(xy6Var, hc1Var, (byte) 14), 3).o0(new or(function0, (byte) 2));
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ f70(me1 me1Var, xy6 xy6Var, Function0 function0, byte b) {
        this.m = b;
        this.p = me1Var;
        this.n = xy6Var;
        this.f773o = function0;
    }

    public /* synthetic */ f70(xy6 xy6Var, me1 me1Var, Function0 function0, byte b) {
        this.m = b;
        this.n = xy6Var;
        this.p = me1Var;
        this.f773o = function0;
    }
}
