package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionFilter;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionFilterResponse;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wr6 extends og7 implements iw2 {
    public boolean m;
    public /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f2439o;
    public final /* synthetic */ xr6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr6(xr6 xr6Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.p = xr6Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        wr6 wr6Var = new wr6(this.p, (hc1) obj3);
        wr6Var.n = iIntValue;
        wr6Var.f2439o = iIntValue2;
        return wr6Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objD;
        int i = this.n;
        int i2 = this.f2439o;
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            l07 l07Var = this.p.n;
            SupportSessionFilter supportSessionFilter = new SupportSessionFilter(i2, i, null, qf0.K(SupportSessionState.Open), null, null, 52, null);
            this.n = i;
            this.f2439o = i2;
            this.m = true;
            objD = l07Var.D(supportSessionFilter, this);
            ne1 ne1Var = ne1.m;
            if (objD == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objD = ((tc6) obj).m;
        }
        if (!(objD instanceof sc6)) {
            SupportSessionFilterResponse supportSessionFilterResponse = (SupportSessionFilterResponse) objD;
            List<SupportSession> supportSessions = supportSessionFilterResponse.getSupportSessions();
            ArrayList arrayList = new ArrayList(mv0.Z(supportSessions, 10));
            Iterator<T> it = supportSessions.iterator();
            while (it.hasNext()) {
                arrayList.add(h57.E((SupportSession) it.next()));
            }
            objD = new rd5(arrayList, supportSessionFilterResponse.isLastPage());
        }
        return new tc6(objD);
    }
}
