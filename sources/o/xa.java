package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xa implements hw2 {
    public final /* synthetic */ byte m = 5;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2497o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ xa(String str, boolean z, Function0 function0, hw2 hw2Var, fs4 fs4Var, int i) {
        this.f2497o = str;
        this.n = z;
        this.q = function0;
        this.p = hw2Var;
        this.r = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.f2497o;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                au8.o(this.n, (String) obj6, (Function1) obj5, (Function0) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ak3 ak3Var = (ak3) obj6;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((px4) obj5).setValue(bool);
                ((px4) obj4).setValue((hv) obj2);
                ((px4) obj3).setValue(Boolean.TRUE);
                kh7 kh7Var = ev.a;
                ak3Var.getClass();
                ev.a(new dv(zBooleanValue ? cv.n : cv.m, ak3Var, null, this.n, 4));
                break;
            case 2:
                ((Integer) obj2).getClass();
                it1.b((ks1) obj5, (fs4) obj3, this.n, (String) obj6, (Function0) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 3:
                i97 i97Var = (i97) obj6;
                i97 i97Var2 = (i97) obj5;
                hz1 hz1Var = (hz1) obj4;
                px4 px4Var = (px4) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else if (((Boolean) px4Var.getValue()).booleanValue() || this.n || !((ch2) i97Var.getValue()).a) {
                    ux2Var.W(-147583282);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-147952306);
                    ov1 ov1Var = ((lr0) i97Var2.getValue()).b;
                    boolean zH = ux2Var.h(hz1Var);
                    Object objK = ux2Var.K();
                    if (zH || objK == e01.a) {
                        objK = new aw1(hz1Var, (byte) 4);
                        ux2Var.g0(objK);
                    }
                    xo1.d(ov1Var, (Function0) objK, null, ux2Var, 0);
                    ux2Var.p(false);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                et1.a((z31) obj6, (yl6) obj4, this.n, (Function1) obj5, (fs4) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                vt1.e((String) obj6, this.n, (Function0) obj4, (hw2) obj5, (fs4) obj3, (ux2) obj, yo1.Y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((jk0) obj6).b(this.n, (mw4) obj5, (cq7) obj4, (pw6) obj3, (ux2) obj, yo1.Y(114822145));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ xa(jk0 jk0Var, boolean z, mw4 mw4Var, cq7 cq7Var, pw6 pw6Var, int i) {
        this.f2497o = jk0Var;
        this.n = z;
        this.p = mw4Var;
        this.q = cq7Var;
        this.r = pw6Var;
    }

    public /* synthetic */ xa(z31 z31Var, yl6 yl6Var, boolean z, Function1 function1, fs4 fs4Var, int i) {
        this.f2497o = z31Var;
        this.q = yl6Var;
        this.n = z;
        this.p = function1;
        this.r = fs4Var;
    }

    public /* synthetic */ xa(ks1 ks1Var, fs4 fs4Var, boolean z, String str, Function0 function0, int i) {
        this.p = ks1Var;
        this.r = fs4Var;
        this.n = z;
        this.f2497o = str;
        this.q = function0;
    }

    public /* synthetic */ xa(ak3 ak3Var, boolean z, px4 px4Var, px4 px4Var2, px4 px4Var3) {
        this.f2497o = ak3Var;
        this.n = z;
        this.p = px4Var;
        this.q = px4Var2;
        this.r = px4Var3;
    }

    public /* synthetic */ xa(boolean z, String str, Function1 function1, Function0 function0, fs4 fs4Var, int i) {
        this.n = z;
        this.f2497o = str;
        this.p = function1;
        this.q = function0;
        this.r = fs4Var;
    }

    public /* synthetic */ xa(boolean z, i97 i97Var, i97 i97Var2, hz1 hz1Var, px4 px4Var) {
        this.n = z;
        this.f2497o = i97Var;
        this.p = i97Var2;
        this.q = hz1Var;
        this.r = px4Var;
    }
}
