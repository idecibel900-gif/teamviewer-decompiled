package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1248o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ kb(String str, boolean z, boolean z2, Function1 function1, fs4 fs4Var, int i) {
        this.q = str;
        this.n = z;
        this.f1248o = z2;
        this.r = function1;
        this.p = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kh.i((String) obj3, this.n, this.f1248o, (Function1) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ox1.b(this.n, this.f1248o, (ov1) obj3, (Function0) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lv1.l(this.n, this.f1248o, (Function0) obj3, (fs4) obj4, (hb3) obj5, (ux2) obj, yo1.Y(1572865));
                break;
            case 3:
                String str = (String) obj3;
                String str2 = (String) obj4;
                Function1 function1 = (Function1) obj5;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    bt1.e(str, function1, null, false, false, null, null, null, null, null, new yy0(181462369, true, new mb(str2, this.f1248o, (byte) 3)), !this.n && str.length() > 0, null, null, null, true, 0, 0, null, null, ux2Var, 0, 12582912, 8245244);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hh7.a(this.n, (Function1) obj5, (fs4) obj4, this.f1248o, (fh7) obj3, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ kb(boolean z, String str, boolean z2, String str2, Function1 function1) {
        this.n = z;
        this.q = str;
        this.f1248o = z2;
        this.p = str2;
        this.r = function1;
    }

    public /* synthetic */ kb(boolean z, Function1 function1, fs4 fs4Var, boolean z2, fh7 fh7Var, int i) {
        this.n = z;
        this.r = function1;
        this.p = fs4Var;
        this.f1248o = z2;
        this.q = fh7Var;
    }

    public /* synthetic */ kb(boolean z, boolean z2, Function0 function0, fs4 fs4Var, hb3 hb3Var, int i) {
        this.n = z;
        this.f1248o = z2;
        this.q = function0;
        this.p = fs4Var;
        this.r = hb3Var;
    }

    public /* synthetic */ kb(boolean z, boolean z2, ov1 ov1Var, Function0 function0, fs4 fs4Var, int i) {
        this.n = z;
        this.f1248o = z2;
        this.q = ov1Var;
        this.r = function0;
        this.p = fs4Var;
    }
}
