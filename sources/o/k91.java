package o;

import com.teamviewer.apidefinitions.contacts.models.DetailedPersonalContact;

/* JADX INFO: loaded from: classes.dex */
public final class k91 extends jc1 {
    public int m;
    public DetailedPersonalContact n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1240o;
    public /* synthetic */ Object p;
    public final /* synthetic */ xc0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objC = this.q.C(0, null, this);
        return objC == ne1.m ? objC : new tc6(objC);
    }
}
