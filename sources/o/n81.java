package o;

import com.teamviewer.apidefinitions.contacts.models.DetailedPersonalContact;

/* JADX INFO: loaded from: classes.dex */
public final class n81 extends oe8 {
    public boolean A;
    public boolean B;
    public Integer C;
    public final xc0 D;
    public final yx6 E;
    public final r36 F;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f41 f1551o;
    public final xc0 p;
    public final fe1 q;
    public final l97 r;
    public final t36 s;
    public final yx6 t;
    public final r36 u;
    public final yx6 v;
    public final r36 w;
    public final yx6 x;
    public final r36 y;
    public Integer z;

    public n81(int i, f41 f41Var) {
        xc0 xc0Var = new xc0((byte) 18);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        f41Var.getClass();
        gk1Var.getClass();
        this.n = i;
        this.f1551o = f41Var;
        this.p = xc0Var;
        this.q = gk1Var;
        l97 l97VarK = im3.k(new i81(null, null, false, false, 2047));
        this.r = l97VarK;
        this.s = yo1.u(l97VarK);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.t = yx6VarL;
        this.u = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.v = yx6VarL2;
        this.w = new r36(yx6VarL2);
        yx6 yx6VarL3 = au8.l(0, 7, null);
        this.x = yx6VarL3;
        this.y = new r36(yx6VarL3);
        this.D = new xc0((Object) this, (byte) 17);
        yx6 yx6VarL4 = au8.l(0, 7, null);
        this.E = yx6VarL4;
        this.F = new r36(yx6VarL4);
    }

    public final void V0() {
        l97 l97Var;
        Object value;
        this.z = null;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
        } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, ea2.m, false, false, false, false, 1599)));
    }

    public final void W0() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
        } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, false, 1023)));
    }

    public final void X0(boolean z) {
        im3.R(e8.n(this), null, null, new g6(this, z, null, (byte) 1), 3);
    }

    public final void Y0(d37 d37Var) {
        im3.R(e8.n(this), null, null, new h0((Object) this, (Object) d37Var, (hc1) null, (byte) 27), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(int i, jc1 jc1Var) {
        k81 k81Var;
        Object objM;
        if (jc1Var instanceof k81) {
            k81Var = (k81) jc1Var;
            int i2 = k81Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k81Var.p = i2 - Integer.MIN_VALUE;
            } else {
                k81Var = new k81(this, jc1Var);
            }
        } else {
            k81Var = new k81(this, jc1Var);
        }
        Object obj = k81Var.n;
        int i3 = k81Var.p;
        if (i3 == 0) {
            ct1.a0(obj);
            k81Var.m = i;
            k81Var.p = 1;
            objM = this.p.M(i, k81Var);
            ne1 ne1Var = ne1.m;
            if (objM == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = k81Var.m;
            ct1.a0(obj);
            objM = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objM);
        if (thA == null) {
            return (DetailedPersonalContact) objM;
        }
        ye4.c("ContactInfoScreenViewModel", "Failed to get personal contact details for contactId: " + i + " with error: " + thA.getMessage());
        X0(false);
        return null;
    }

    public final boolean a1() {
        i81 i81Var = (i81) this.s.m.getValue();
        h71 h71Var = i81Var.a;
        String str = i81Var.c;
        String str2 = h71Var != null ? h71Var.q : null;
        if (str2 == null) {
            str2 = "";
        }
        if (i81Var.b || str.length() <= 0 || !i81Var.e || !i81Var.f) {
            return false;
        }
        return (im3.n(h71Var != null ? h71Var.f954o : null, str) && str2.equals(i81Var.d)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b1(int i, DetailedPersonalContact detailedPersonalContact, jc1 jc1Var) {
        m81 m81Var;
        Object objC;
        l97 l97Var;
        Object value;
        i81 i81Var;
        h71 h71VarC;
        DetailedPersonalContact detailedPersonalContact2 = detailedPersonalContact;
        if (jc1Var instanceof m81) {
            m81Var = (m81) jc1Var;
            int i2 = m81Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m81Var.p = i2 - Integer.MIN_VALUE;
            } else {
                m81Var = new m81(this, jc1Var);
            }
        } else {
            m81Var = new m81(this, jc1Var);
        }
        Object obj = m81Var.n;
        int i3 = m81Var.p;
        if (i3 == 0) {
            ct1.a0(obj);
            m81Var.m = detailedPersonalContact2;
            m81Var.p = 1;
            objC = this.p.C(i, detailedPersonalContact2, m81Var);
            ne1 ne1Var = ne1.m;
            if (objC == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            detailedPersonalContact2 = m81Var.m;
            ct1.a0(obj);
            objC = ((tc6) obj).m;
        }
        if (tc6.a(objC) == null) {
            do {
                l97Var = this.r;
                value = l97Var.getValue();
                i81Var = (i81) value;
                h71 h71Var = i81Var.a;
                if (h71Var != null) {
                    String name = detailedPersonalContact2.getName();
                    String note = detailedPersonalContact2.getNote();
                    if (note == null || note.length() == 0) {
                        note = null;
                    }
                    h71VarC = h71.c(h71Var, name, note, 235);
                } else {
                    h71VarC = null;
                }
            } while (!l97Var.j(value, i81.a(i81Var, h71VarC, false, null, null, false, false, null, false, false, false, false, 2046)));
            X0(true);
        } else {
            X0(false);
        }
        return f88.a;
    }

    public final void c1() {
        l97 l97Var;
        Object value;
        this.C = null;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
        } while (!l97Var.j(value, i81.a((i81) value, null, false, "", "", true, true, null, false, false, false, false, 1987)));
    }
}
