package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us6 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ SupportSession n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f2246o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;

    public /* synthetic */ us6(SupportSession supportSession, String str, fs4 fs4Var, int i) {
        this.n = supportSession;
        this.p = str;
        this.f2246o = fs4Var;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        String str = this.p;
        fs4 fs4Var = this.f2246o;
        SupportSession supportSession = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qs1.x(yo1.Y(i | 1), supportSession, str, ux2Var, fs4Var);
                break;
            default:
                xs1.m(yo1.Y(i | 1), supportSession, str, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ us6(SupportSession supportSession, fs4 fs4Var, String str, int i) {
        this.n = supportSession;
        this.f2246o = fs4Var;
        this.p = str;
        this.q = i;
    }
}
