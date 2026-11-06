package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f297o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ a5(l71 l71Var, fs4 fs4Var, boolean z, Function1 function1, Function0 function0, xy6 xy6Var, int i) {
        this.q = l71Var;
        this.n = fs4Var;
        this.f297o = z;
        this.r = function1;
        this.p = function0;
        this.s = xy6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.s;
        Object obj4 = this.q;
        Object obj5 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                qf0.a(this.f297o, this.p, (Function0) obj4, this.n, (String) obj5, (f5) obj3, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                hm3.b((l71) obj4, this.n, this.f297o, (Function1) obj5, this.p, (xy6) obj3, (ux2) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(1);
                im3.j(this.f297o, (l71) obj5, (a91) obj3, this.p, (Function0) obj4, this.n, (ux2) obj, iY3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(1);
                lv1.e(this.f297o, this.p, (Function0) obj4, (Function0) obj5, (Function0) obj3, this.n, (ux2) obj, iY4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY5 = yo1.Y(1);
                of7.b(this.f297o, (SupportSession) obj5, this.p, (Function0) obj4, this.n, (xy6) obj3, (ux2) obj, iY5);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ a5(boolean z, SupportSession supportSession, Function0 function0, Function0 function1, fs4 fs4Var, xy6 xy6Var, int i) {
        this.f297o = z;
        this.r = supportSession;
        this.p = function0;
        this.q = function1;
        this.n = fs4Var;
        this.s = xy6Var;
    }

    public /* synthetic */ a5(boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fs4 fs4Var, int i) {
        this.f297o = z;
        this.p = function0;
        this.q = function1;
        this.r = function2;
        this.s = function3;
        this.n = fs4Var;
    }

    public /* synthetic */ a5(boolean z, Function0 function0, Function0 function1, fs4 fs4Var, String str, f5 f5Var, int i) {
        this.f297o = z;
        this.p = function0;
        this.q = function1;
        this.n = fs4Var;
        this.r = str;
        this.s = f5Var;
    }

    public /* synthetic */ a5(boolean z, l71 l71Var, a91 a91Var, Function0 function0, Function0 function1, fs4 fs4Var, int i) {
        this.f297o = z;
        this.r = l71Var;
        this.s = a91Var;
        this.p = function0;
        this.q = function1;
        this.n = fs4Var;
    }
}
