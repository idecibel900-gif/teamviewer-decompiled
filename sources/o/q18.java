package o;

/* JADX INFO: loaded from: classes.dex */
public final class q18 implements i97 {
    public final /* synthetic */ u18 A;
    public final yn1 m;
    public final bg5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f1797o;
    public final bg5 p;
    public mn6 q;
    public wn7 r;
    public final bg5 s;
    public final wf5 t;
    public boolean u;
    public final bg5 v;
    public qo w;
    public final zf5 x;
    public boolean y;
    public final e87 z;

    public q18(u18 u18Var, Object obj, qo qoVar, yn1 yn1Var) {
        this.A = u18Var;
        this.m = yn1Var;
        bg5 bg5VarP = h57.p(obj);
        this.n = bg5VarP;
        Object objInvoke = null;
        bg5 bg5VarP2 = h57.p(db8.A0(0.0f, 0.0f, null, 7));
        this.f1797o = bg5VarP2;
        this.p = h57.p(new wn7((rl2) bg5VarP2.getValue(), yn1Var, obj, bg5VarP.getValue(), qoVar));
        this.s = h57.p(Boolean.TRUE);
        this.t = new wf5(-1.0f);
        this.v = h57.p(obj);
        this.w = qoVar;
        this.x = new zf5(a().b());
        Float f = (Float) sg8.a.get(yn1Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            qo qoVar2 = (qo) yn1Var.b().invoke(obj);
            int iB = qoVar2.b();
            for (int i = 0; i < iB; i++) {
                qoVar2.e(i, fFloatValue);
            }
            objInvoke = this.m.a().invoke(qoVar2);
        }
        this.z = db8.A0(0.0f, 0.0f, objInvoke, 3);
    }

    public final wn7 a() {
        return (wn7) this.p.getValue();
    }

    public final void b(long j) {
        if (this.t.z() == -1.0f) {
            this.y = true;
            if (im3.n(a().f2432o, a().p)) {
                d(a().f2432o);
            } else {
                d(a().g(j));
                this.w = a().d(j);
            }
        }
    }

    public final void d(Object obj) {
        this.v.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        wn7 wn7Var = this.r;
        Object obj2 = wn7Var != null ? wn7Var.f2432o : null;
        bg5 bg5Var = this.n;
        boolean zN = im3.n(obj2, bg5Var.getValue());
        zf5 zf5Var = this.x;
        bg5 bg5Var2 = this.p;
        rl2 rl2Var = this.z;
        if (zN) {
            bg5Var2.setValue(new wn7(rl2Var, this.m, obj, obj, this.w.c()));
            this.u = true;
            zf5Var.A(a().b());
            return;
        }
        bg5 bg5Var3 = this.f1797o;
        if (!z || this.y || (((rl2) bg5Var3.getValue()) instanceof e87)) {
            rl2Var = (rl2) bg5Var3.getValue();
        }
        u18 u18Var = this.A;
        bg5Var2.setValue(new wn7(u18Var.e() <= 0 ? rl2Var : new z87(rl2Var, u18Var.e()), this.m, obj, bg5Var.getValue(), this.w));
        zf5Var.A(a().b());
        this.u = false;
        u18Var.m(true);
        if (u18Var.g()) {
            j57 j57Var = u18Var.j;
            int size = j57Var.size();
            for (int i = 0; i < size; i++) {
                q18 q18Var = (q18) j57Var.get(i);
                q18Var.x.z();
                q18Var.b(0L);
            }
            u18Var.m(false);
        }
    }

    public final void g(Object obj, Object obj2, rl2 rl2Var) {
        this.n.setValue(obj2);
        this.f1797o.setValue(rl2Var);
        if (im3.n(a().p, obj) && im3.n(a().f2432o, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // o.i97
    public final Object getValue() {
        return this.v.getValue();
    }

    public final void h(Object obj, rl2 rl2Var, Object obj2, qo qoVar) {
        Object value;
        if (this.u) {
            wn7 wn7Var = this.r;
            if (im3.n(obj, wn7Var != null ? wn7Var.f2432o : null)) {
                return;
            }
        }
        bg5 bg5Var = this.n;
        boolean zN = im3.n(bg5Var.getValue(), obj);
        wf5 wf5Var = this.t;
        if (zN && wf5Var.z() == -1.0f && (obj2 == null || obj2.equals(a().p))) {
            return;
        }
        bg5Var.setValue(obj);
        this.f1797o.setValue(rl2Var);
        if (obj2 == null) {
            value = wf5Var.z() == -3.0f ? obj : this.v.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            d(value);
            if (qoVar != null) {
                this.w = qoVar;
            }
        }
        bg5 bg5Var2 = this.s;
        f(value, !((Boolean) bg5Var2.getValue()).booleanValue());
        bg5Var2.setValue(Boolean.valueOf(wf5Var.z() == -3.0f));
        if (wf5Var.z() >= 0.0f) {
            d(a().g((long) (wf5Var.z() * a().b())));
        } else if (wf5Var.z() == -3.0f) {
            d(obj);
        }
        this.u = false;
        wf5Var.A(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.v.getValue() + ", target: " + this.n.getValue() + ", spec: " + ((rl2) this.f1797o.getValue());
    }
}
