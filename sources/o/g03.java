package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class g03 extends t30 {
    public final boolean p;
    public final mg4 q;
    public final mg4 r;
    public final RectF s;
    public final int t;
    public final int u;
    public final zz2 v;
    public final zz2 w;
    public final zz2 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public g03(ei4 ei4Var, p30 p30Var, f03 f03Var) {
        Paint.Join join;
        Paint.Join join2;
        int iB = ua5.B(f03Var.g);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = ua5.B(f03Var.h);
        Object obj = null;
        if (iB2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iB2 != 1) {
                if (iB2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(ei4Var, p30Var, cap, join2, f03Var.i, f03Var.c, f03Var.f, f03Var.j, f03Var.k);
                this.q = new mg4(obj);
                this.r = new mg4(obj);
                this.s = new RectF();
                this.t = f03Var.a;
                this.p = f03Var.l;
                this.u = (int) (ei4Var.m.b() / 32.0f);
                o30 o30VarD = f03Var.b.d();
                this.v = (zz2) o30VarD;
                o30VarD.a(this);
                p30Var.d(o30VarD);
                o30 o30VarD2 = f03Var.d.d();
                this.w = (zz2) o30VarD2;
                o30VarD2.a(this);
                p30Var.d(o30VarD2);
                o30 o30VarD3 = f03Var.e.d();
                this.x = (zz2) o30VarD3;
                o30VarD3.a(this);
                p30Var.d(o30VarD3);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(ei4Var, p30Var, cap, join2, f03Var.i, f03Var.c, f03Var.f, f03Var.j, f03Var.k);
        this.q = new mg4(obj);
        this.r = new mg4(obj);
        this.s = new RectF();
        this.t = f03Var.a;
        this.p = f03Var.l;
        this.u = (int) (ei4Var.m.b() / 32.0f);
        o30 o30VarD4 = f03Var.b.d();
        this.v = (zz2) o30VarD4;
        o30VarD4.a(this);
        p30Var.d(o30VarD4);
        o30 o30VarD5 = f03Var.d.d();
        this.w = (zz2) o30VarD5;
        o30VarD5.a(this);
        p30Var.d(o30VarD5);
        o30 o30VarD6 = f03Var.e.d();
        this.x = (zz2) o30VarD6;
        o30VarD6.a(this);
        p30Var.d(o30VarD6);
    }

    public final int d() {
        float f = this.w.d;
        float f2 = this.u;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.x.d * f2);
        int iRound3 = Math.round(this.v.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.t30, o.i62
    public final void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        Shader radialGradient;
        if (this.p) {
            return;
        }
        c(this.s, matrix, false);
        int i2 = this.t;
        zz2 zz2Var = this.v;
        zz2 zz2Var2 = this.x;
        zz2 zz2Var3 = this.w;
        if (i2 == 1) {
            long jD = d();
            mg4 mg4Var = this.q;
            radialGradient = (LinearGradient) mg4Var.b(jD);
            if (radialGradient == null) {
                PointF pointF = (PointF) zz2Var3.d();
                PointF pointF2 = (PointF) zz2Var2.d();
                yz2 yz2Var = (yz2) zz2Var.d();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, yz2Var.b, yz2Var.a, Shader.TileMode.CLAMP);
                mg4Var.e(jD, radialGradient);
            }
        } else {
            long jD2 = d();
            mg4 mg4Var2 = this.r;
            radialGradient = (RadialGradient) mg4Var2.b(jD2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) zz2Var3.d();
                PointF pointF4 = (PointF) zz2Var2.d();
                yz2 yz2Var2 = (yz2) zz2Var.d();
                int[] iArr = yz2Var2.b;
                float[] fArr = yz2Var2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArr, fArr, Shader.TileMode.CLAMP);
                mg4Var2.e(jD2, radialGradient);
            }
        }
        this.i.setShader(radialGradient);
        super.f(canvas, matrix, i, r62Var);
    }
}
