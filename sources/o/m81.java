package o;

import com.teamviewer.apidefinitions.contacts.models.DetailedPersonalContact;

/* JADX INFO: loaded from: classes.dex */
public final class m81 extends jc1 {
    public DetailedPersonalContact m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n81 f1444o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m81(n81 n81Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1444o = n81Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1444o.b1(0, null, this);
    }
}
