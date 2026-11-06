package o;

import com.teamviewer.apidefinitions.manageddevices.models.GroupDetailModel;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class tl4 extends jc1 {
    public UUID m;
    public GroupDetailModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2122o;
    public /* synthetic */ Object p;
    public final /* synthetic */ xl4 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objL = this.q.l(null, null, this);
        return objL == ne1.m ? objL : new tc6(objL);
    }
}
