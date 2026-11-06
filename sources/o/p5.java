package o;

import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1706o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ p5(Function0 function0, Function0 function1, fs4 fs4Var, yr1 yr1Var, int i) {
        this.m = (byte) 15;
        this.n = function0;
        this.q = function1;
        this.f1706o = fs4Var;
        this.r = yr1Var;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        Object obj3 = this.n;
        Object obj4 = this.r;
        Object obj5 = this.f1706o;
        f88 f88Var = f88.a;
        int i = this.p;
        Object obj6 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                xk0.a((iv6) obj6, (Function0) obj3, (fs4) obj5, (j6) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                au8.e((ib) obj6, (Function0) obj3, (Function0) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                kh.g((ob) obj6, (ja) obj3, (l33) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                kh.d((ob) obj6, (Function0) obj3, (Function0) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                yd.d((Function0) obj3, (fs4) obj5, (a12) obj6, (yy0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                di1.l((k08) obj6, (px4) obj3, (fs4) obj5, (yy0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i) | 1;
                ((yy0) obj6).g(this.n, this.f1706o, this.r, (ux2) obj, iY);
                break;
            case 7:
                ((Integer) obj2).getClass();
                vn4.M((a06) obj6, (p31) obj3, (i31) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                xs1.a((ns1) obj6, (fs4) obj5, (Function0) obj3, (Function0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case ep1.b /* 9 */:
                ((Integer) obj2).getClass();
                ct1.a((wt1) obj6, (ns1) obj3, (List) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case ep1.c /* 10 */:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                ds1.s((Boolean) obj6, this.n, (LifecycleOwner) obj5, (Function1) obj4, (ux2) obj, iY2);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ct1.n((yl6) obj6, (nl6) obj3, (ql6) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case ep1.d /* 12 */:
                ((Integer) obj2).getClass();
                it1.h((String) obj6, (Function1) obj3, (String) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                xs1.l((SupportSession) obj6, (lt6) obj3, (fs4) obj5, (String) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                r47.d((ge7) obj6, (Function0) obj3, (Function0) obj4, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                b77.c((Function0) obj3, (Function0) obj6, (fs4) obj5, (yr1) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                n67.g((o37) obj6, (fs4) obj5, (String) obj3, (String) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ p5(Object obj, Object obj2, Object obj3, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.q = obj;
        this.n = obj2;
        this.r = obj3;
        this.f1706o = fs4Var;
        this.p = i;
    }

    public /* synthetic */ p5(Object obj, fs4 fs4Var, Object obj2, Object obj3, int i, byte b) {
        this.m = b;
        this.q = obj;
        this.f1706o = fs4Var;
        this.n = obj2;
        this.r = obj3;
        this.p = i;
    }

    public /* synthetic */ p5(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.m = b;
        this.q = obj;
        this.n = obj2;
        this.f1706o = obj3;
        this.r = obj4;
        this.p = i;
    }

    public /* synthetic */ p5(Function0 function0, fs4 fs4Var, a12 a12Var, yy0 yy0Var, int i) {
        this.m = (byte) 4;
        this.n = function0;
        this.f1706o = fs4Var;
        this.q = a12Var;
        this.r = yy0Var;
        this.p = i;
    }
}
