package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class al2 implements i62, k30, sa1 {
    public final Path a;
    public final wz3 b;
    public final p30 c;
    public final boolean d;
    public final ArrayList e;
    public final uv0 f;
    public final uv0 g;
    public final ei4 h;
    public final uv0 i;
    public float j;

    public al2(ei4 ei4Var, p30 p30Var, ww6 ww6Var) {
        Path path = new Path();
        this.a = path;
        this.b = new wz3(1, (byte) 0);
        this.e = new ArrayList();
        this.c = p30Var;
        lm lmVar = ww6Var.d;
        lm lmVar2 = ww6Var.c;
        this.d = ww6Var.e;
        this.h = ei4Var;
        if (p30Var.j() != null) {
            uv0 uv0VarD = ((mm) p30Var.j().n).d();
            this.i = uv0VarD;
            uv0VarD.a(this);
            p30Var.d(uv0VarD);
        }
        if (lmVar2 == null) {
            this.f = null;
            this.g = null;
            return;
        }
        path.setFillType(ww6Var.b);
        o30 o30VarD = lmVar2.d();
        this.f = (uv0) o30VarD;
        o30VarD.a(this);
        p30Var.d(o30VarD);
        o30 o30VarD2 = lmVar.d();
        this.g = (uv0) o30VarD2;
        o30VarD2.a(this);
        p30Var.d(o30VarD2);
    }

    @Override // o.k30
    public final void a() {
        this.h.invalidateSelf();
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            sa1 sa1Var = (sa1) list2.get(i);
            if (sa1Var instanceof zg5) {
                this.e.add((zg5) sa1Var);
            }
        }
    }

    @Override // o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((zg5) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
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
    @Override // o.i62
    public final void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        MaskFilter maskFilter;
        if (this.d) {
            return;
        }
        uv0 uv0Var = this.f;
        int iK = uv0Var.k(uv0Var.c.e(), uv0Var.b());
        float fIntValue = ((Integer) this.g.d()).intValue() / 100.0f;
        int iC = (lr4.c((int) (i * fIntValue)) << 24) | (iK & 16777215);
        wz3 wz3Var = this.b;
        wz3Var.setColor(iC);
        uv0 uv0Var2 = this.i;
        if (uv0Var2 != null) {
            float fFloatValue = ((Float) uv0Var2.d()).floatValue();
            if (fFloatValue == 0.0f) {
                wz3Var.setMaskFilter(null);
            } else if (fFloatValue != this.j) {
                p30 p30Var = this.c;
                if (p30Var.y == fFloatValue) {
                    maskFilter = p30Var.z;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    p30Var.z = blurMaskFilter;
                    p30Var.y = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                wz3Var.setMaskFilter(maskFilter);
            }
            this.j = fFloatValue;
        }
        if (r62Var != null) {
            r62Var.a((int) (fIntValue * 255.0f), wz3Var);
        } else {
            wz3Var.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, wz3Var);
                return;
            } else {
                path.addPath(((zg5) arrayList.get(i2)).e(), matrix);
                i2++;
            }
        }
    }
}
