package o;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f543o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cn1(fs4 fs4Var, hw2 hw2Var, int i, int i2) {
        this.m = (byte) 8;
        this.f543o = fs4Var;
        this.q = hw2Var;
        this.p = i;
        this.n = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        int i = this.p;
        boolean z = this.n;
        f88 f88Var = f88.a;
        Object obj3 = this.q;
        Object obj4 = this.f543o;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                pm8.f(z, (Function0) obj4, (Function0) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ox1.c(z, (ov1) obj3, (Function0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                yo1.g(z, (Function1) obj3, (Function0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                zu1.i(z, (Context) obj4, (fs4) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                zu1.h(z, (r64) obj4, (Context) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                yo1.t(z, (String) obj4, (dm7) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                wo1.l(this.p, (String) obj4, this.n, (fs4) obj3, (ux2) obj, iY);
                break;
            case 7:
                ((Integer) obj2).getClass();
                vt1.h(z, (fs4) obj4, (yy0) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                g68.e((fs4) obj4, (hw2) obj3, (ux2) obj, yo1.Y(i | 1), z ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                l47.e(z, (rb6) obj4, (pr7) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ cn1(int i, String str, boolean z, fs4 fs4Var, int i2) {
        this.m = (byte) 6;
        this.p = i;
        this.f543o = str;
        this.n = z;
        this.q = fs4Var;
    }

    public /* synthetic */ cn1(boolean z, Object obj, Object obj2, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f543o = obj;
        this.q = obj2;
        this.p = i;
    }

    public /* synthetic */ cn1(boolean z, Object obj, Function0 function0, int i, byte b) {
        this.m = b;
        this.n = z;
        this.q = obj;
        this.f543o = function0;
        this.p = i;
    }

    public /* synthetic */ cn1(boolean z, String str, dm7 dm7Var, int i) {
        this.m = (byte) 5;
        this.n = z;
        this.f543o = str;
        this.q = dm7Var;
        this.p = i;
    }
}
