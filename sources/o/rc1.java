package o;

import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class rc1 implements oa3 {
    public final float m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1913o;
    public Object p;
    public Object q;

    public rc1(ha6 ha6Var, EventHub eventHub, j93 j93Var) {
        ha6Var.getClass();
        eventHub.getClass();
        j93Var.getClass();
        this.n = ha6Var;
        this.f1913o = eventHub;
        pq6 pq6Var = ha6Var.c;
        this.p = im3.k(new vd5(Float.valueOf(pq6Var.a), Float.valueOf(pq6Var.a)));
        mu muVar = new mu(this, (byte) 2);
        this.q = muVar;
        this.m = j93Var.R();
        eventHub.c(EventType.EVENT_SCALING_FACTOR_CHANGED, muVar);
    }

    @Override // o.oa3
    public l97 a() {
        return (l97) this.p;
    }

    @Override // o.oa3
    public j22 b() {
        return ((ha6) this.n).f;
    }

    @Override // o.oa3
    public int c() {
        return ((ha6) this.n).i;
    }

    public qo d(long j, qo qoVar, qo qoVar2) {
        qo qoVarC = (qo) this.p;
        if (qoVarC == null) {
            qoVarC = qoVar.c();
            this.p = qoVarC;
        }
        int iB = qoVarC.b();
        int i = 0;
        while (true) {
            qo qoVar3 = (qo) this.p;
            if (i >= iB) {
                if (qoVar3 != null) {
                    return qoVar3;
                }
                im3.e0("velocityVector");
                throw null;
            }
            if (qoVar3 == null) {
                im3.e0("velocityVector");
                throw null;
            }
            in2 in2Var = (in2) this.n;
            qoVar.getClass();
            qoVar3.e(i, in2Var.f(qoVar2.a(i), j));
            i++;
        }
    }

    @Override // o.oa3
    public void destroy() {
        ((EventHub) this.f1913o).f((mu) this.q);
    }

    @Override // o.oa3
    public float g() {
        return this.m;
    }

    public rc1(in2 in2Var) {
        this.n = in2Var;
        this.m = in2Var.e();
    }
}
