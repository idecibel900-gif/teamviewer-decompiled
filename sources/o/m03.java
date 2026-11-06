package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/m03;", "Lo/ls4;", "Lo/d07;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class m03 extends ls4 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final long g;
    public final pw6 h;
    public final boolean i;
    public final long j;
    public final long k;
    public final d04 l;

    public m03(float f, float f2, float f3, float f4, float f5, long j, pw6 pw6Var, boolean z, long j2, long j3, d04 d04Var) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = j;
        this.h = pw6Var;
        this.i = z;
        this.j = j2;
        this.k = j3;
        this.l = d04Var;
    }

    @Override // o.ls4
    public final es4 create() {
        d07 d07Var = new d07();
        d07Var.A = this.b;
        d07Var.B = this.c;
        d07Var.C = this.d;
        d07Var.D = this.e;
        d07Var.E = this.f;
        d07Var.F = 8.0f;
        d07Var.G = this.g;
        d07Var.H = this.h;
        d07Var.I = this.i;
        d07Var.J = this.j;
        d07Var.K = this.k;
        d07Var.L = (byte) 3;
        d07Var.M = this.l;
        d07Var.N = new y46(d07Var, (byte) 17);
        return d07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m03)) {
            return false;
        }
        m03 m03Var = (m03) obj;
        if (Float.compare(this.b, m03Var.b) != 0 || Float.compare(this.c, m03Var.c) != 0 || Float.compare(this.d, m03Var.d) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.e, m03Var.e) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.f, m03Var.f) != 0 || Float.compare(8.0f, 8.0f) != 0 || !d18.a(this.g, m03Var.g) || !im3.n(this.h, m03Var.h) || this.i != m03Var.i) {
            return false;
        }
        long j = m03Var.j;
        int i = rv0.i;
        return z68.a(this.j, j) && z68.a(this.k, m03Var.k) && im3.n(this.l, m03Var.l);
    }

    public final int hashCode() {
        int iE = e41.e(8.0f, e41.e(this.f, e41.e(0.0f, e41.e(0.0f, e41.e(this.e, e41.e(0.0f, e41.e(0.0f, e41.e(this.d, e41.e(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = d18.c;
        int iF = to7.f((this.h.hashCode() + fx3.c(iE, 31, this.g)) * 31, 961, this.i);
        int i2 = rv0.i;
        return this.l.hashCode() + fx3.a(3, fx3.a(0, fx3.c(fx3.c(iF, 31, this.j), 31, this.k), 31), 961);
    }

    public final String toString() {
        String strD = d18.d(this.g);
        String strH = rv0.h(this.j);
        String strH2 = rv0.h(this.k);
        String strF = iq8.F(3);
        StringBuilder sbN = e41.n("GraphicsLayerElement(scaleX=", this.b, ", scaleY=", this.c, ", alpha=");
        sbN.append(this.d);
        sbN.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sbN.append(this.e);
        sbN.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sbN.append(this.f);
        sbN.append(", cameraDistance=8.0, transformOrigin=");
        sbN.append(strD);
        sbN.append(", shape=");
        sbN.append(this.h);
        sbN.append(", clip=");
        sbN.append(this.i);
        sbN.append(", renderEffect=null, ambientShadowColor=");
        e41.t(sbN, strH, ", spotShadowColor=", strH2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sbN.append(strF);
        sbN.append(", colorFilter=null, outsets=");
        sbN.append(this.l);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        d07 d07Var = (d07) es4Var;
        d07Var.A = this.b;
        d07Var.B = this.c;
        d07Var.C = this.d;
        d07Var.D = this.e;
        d07Var.E = this.f;
        d07Var.F = 8.0f;
        d07Var.G = this.g;
        d07Var.H = this.h;
        d07Var.I = this.i;
        d07Var.J = this.j;
        d07Var.K = this.k;
        d07Var.L = (byte) 3;
        d07Var.M = this.l;
        nv1.N(d07Var, d07Var.N);
    }
}
