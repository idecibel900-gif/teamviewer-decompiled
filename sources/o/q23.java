package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q23 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1798o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ q23(w44 w44Var, k33 k33Var, Long l, boolean z, String str, int i) {
        this.m = (byte) 0;
        this.p = w44Var;
        this.q = k33Var;
        this.r = l;
        this.n = z;
        this.s = str;
        this.f1798o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f1798o;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                int iY = yo1.Y(i | 1);
                t23.d((w44) obj6, (k33) obj5, (Long) obj4, this.n, (String) obj3, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                io1.s(this.n, (nr6) obj6, (or6) obj5, (fs4) obj4, (SupportSession) obj3, (ux2) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                f57.c(this.n, (yy0) obj6, (fs4) obj5, (vk7) obj4, (gw) obj3, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ q23(boolean z, Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.m = b;
        this.n = z;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = obj4;
        this.f1798o = i;
    }
}
