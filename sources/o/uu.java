package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uu implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2248o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public /* synthetic */ uu(String str, boolean z, f74 f74Var, Function0 function0, int i) {
        this.m = (byte) 4;
        this.r = str;
        this.n = z;
        this.p = f74Var;
        this.f2248o = function0;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        Object obj3 = this.p;
        Object obj4 = this.f2248o;
        Object obj5 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                int iY = yo1.Y(i | 1);
                j51.c((String) obj5, this.n, (Function0) obj4, (Function0) obj3, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                ex1.a((ul1) obj5, this.n, (Function0) obj4, (Function0) obj3, (ux2) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                yo1.f(this.n, (String) obj5, (String) obj4, (fs4) obj3, (ux2) obj, iY3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(i | 1);
                zu1.a(this.n, (v64) obj5, (hw2) obj4, (fs4) obj3, (ux2) obj, iY4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iY5 = yo1.Y(i | 1);
                wo1.b((String) obj5, this.n, (f74) obj3, (Function0) obj4, (ux2) obj, iY5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY6 = yo1.Y(i | 1);
                u47.b((yy0) obj5, this.n, (fs4) obj4, (vk7) obj3, (ux2) obj, iY6);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ uu(byte b, int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.m = b;
        this.r = obj;
        this.n = z;
        this.f2248o = obj2;
        this.p = obj3;
        this.q = i;
    }

    public /* synthetic */ uu(boolean z, Object obj, Object obj2, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.r = obj;
        this.f2248o = obj2;
        this.p = fs4Var;
        this.q = i;
    }
}
