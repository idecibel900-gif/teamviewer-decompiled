package o;

import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class xg0 extends jc1 {
    public RemoteControlApplication m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ky4 f2513o;
    public /* synthetic */ Object p;
    public final /* synthetic */ yg0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(yg0 yg0Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = yg0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, this);
    }
}
