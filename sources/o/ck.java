package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f533o;
    public final /* synthetic */ byte p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ck(String str, String str2, fs4 fs4Var, Function0 function0, int i, int i2) {
        this.m = (byte) 1;
        this.q = str;
        this.r = str2;
        this.s = fs4Var;
        this.n = function0;
        this.f533o = i;
        this.p = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f533o;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.n;
        Object obj6 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gk.a((bp5) obj6, (Function0) obj5, (cp5) obj4, (yy0) obj3, (ux2) obj, yo1.Y(i | 1), this.p);
                break;
            case 1:
                ((Integer) obj2).getClass();
                jx0.a((String) obj6, (String) obj4, (fs4) obj3, (Function0) obj5, (ux2) obj, yo1.Y(i | 1), this.p);
                break;
            default:
                ((Integer) obj2).getClass();
                m77.j((SupportSession) obj6, (a06) obj5, (xg8) obj4, (fs4) obj3, (ux2) obj, yo1.Y(i | 1), this.p);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ck(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, byte b) {
        this.m = b;
        this.q = obj;
        this.n = obj2;
        this.r = obj3;
        this.s = obj4;
        this.f533o = i;
        this.p = i2;
    }
}
