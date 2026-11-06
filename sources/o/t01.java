package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t01 extends p30 {
    public final uv0 B;
    public final ArrayList C;
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public final s65 G;
    public final nd H;
    public float I;
    public boolean J;
    public final t62 K;

    public t01(ei4 ei4Var, c04 c04Var, List list, qh4 qh4Var) {
        p30 p30Var;
        p30 t01Var;
        String str;
        super(ei4Var, c04Var);
        this.C = new ArrayList();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new s65();
        this.H = new nd((byte) 10);
        this.J = true;
        mm mmVar = c04Var.s;
        if (mmVar != null) {
            uv0 uv0VarD = mmVar.d();
            this.B = uv0VarD;
            d(uv0VarD);
            uv0VarD.a(this);
        } else {
            this.B = null;
        }
        mg4 mg4Var = new mg4(qh4Var.j.size());
        int size = list.size() - 1;
        p30 p30Var2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < mg4Var.h(); i++) {
                    p30 p30Var3 = (p30) mg4Var.b(mg4Var.d(i));
                    if (p30Var3 != null && (p30Var = (p30) mg4Var.b(p30Var3.p.f)) != null) {
                        p30Var3.t = p30Var;
                    }
                }
                yc4 yc4Var = this.p.x;
                if (yc4Var != null) {
                    this.K = new t62(this, this, yc4Var);
                    return;
                }
                return;
            }
            c04 c04Var2 = (c04) list.get(size);
            int iB = ua5.B(c04Var2.e);
            if (iB == 0) {
                t01Var = new t01(ei4Var, c04Var2, (List) qh4Var.c.get(c04Var2.g), qh4Var);
            } else if (iB == 1) {
                t01Var = new u57(ei4Var, c04Var2);
            } else if (iB == 2) {
                t01Var = new ee3(ei4Var, c04Var2);
            } else if (iB == 3) {
                t01Var = new s55(ei4Var, c04Var2);
            } else if (iB == 4) {
                t01Var = new cx6(ei4Var, c04Var2, this, qh4Var);
            } else if (iB != 5) {
                switch (c04Var2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                xe4.a("Unknown layer type ".concat(str));
                t01Var = null;
            } else {
                t01Var = new ss7(ei4Var, c04Var2);
            }
            if (t01Var != null) {
                mg4Var.e(t01Var.p.d, t01Var);
                if (p30Var2 != null) {
                    p30Var2.s = t01Var;
                    p30Var2 = null;
                } else {
                    this.C.add(0, t01Var);
                    int iB2 = ua5.B(c04Var2.u);
                    if (iB2 == 1 || iB2 == 2) {
                        p30Var2 = t01Var;
                    }
                }
            }
            size--;
        }
    }

    @Override // o.p30, o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.D;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((p30) arrayList.get(size)).c(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // o.p30
    public final void i(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        Canvas canvasE;
        boolean z = false;
        t62 t62Var = this.K;
        boolean z2 = (r62Var == null && t62Var == null) ? false : true;
        ei4 ei4Var = this.f1698o;
        ei4Var.getClass();
        if (z2 && ei4Var.w) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (t62Var != null) {
            r62Var = t62Var.b(matrix, i2);
        }
        boolean z3 = this.J;
        c04 c04Var = this.p;
        ArrayList<p30> arrayList = this.C;
        RectF rectF = this.E;
        if (z3 || !"__container".equals(c04Var.c)) {
            rectF.set(0.0f, 0.0f, c04Var.f473o, c04Var.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (p30 p30Var : arrayList) {
                RectF rectF2 = this.F;
                p30Var.c(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        s65 s65Var = this.G;
        if (z) {
            nd ndVar = this.H;
            ndVar.f1562o = null;
            ndVar.n = i;
            if (r62Var != null) {
                if (Color.alpha(r62Var.d) > 0) {
                    ndVar.f1562o = r62Var;
                } else {
                    ndVar.f1562o = null;
                }
                r62Var = null;
            }
            canvasE = s65Var.e(canvas, rectF, ndVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p30) arrayList.get(size)).f(canvasE, matrix, i2, r62Var);
            }
        }
        if (z) {
            s65Var.c();
        }
        canvas.restore();
    }

    @Override // o.p30
    public final void m(float f) {
        this.I = f;
        super.m(f);
        c04 c04Var = this.p;
        uv0 uv0Var = this.B;
        if (uv0Var != null) {
            qh4 qh4Var = this.f1698o.m;
            f = ((((Float) uv0Var.d()).floatValue() * c04Var.b.n) - c04Var.b.l) / ((qh4Var.m - qh4Var.l) + 0.01f);
        }
        if (uv0Var == null) {
            float f2 = c04Var.n;
            qh4 qh4Var2 = c04Var.b;
            f -= f2 / (qh4Var2.m - qh4Var2.l);
        }
        if (c04Var.m != 0.0f && !"__container".equals(c04Var.c)) {
            f /= c04Var.m;
        }
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((p30) arrayList.get(size)).m(f);
        }
    }
}
