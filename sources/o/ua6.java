package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ua6 implements i62, zg5, v03, k30, sa1 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final ei4 c;
    public final p30 d;
    public final boolean e;
    public final uv0 f;
    public final uv0 g;
    public final c18 h;
    public ya1 i;

    public ua6(ei4 ei4Var, p30 p30Var, z56 z56Var) {
        this.c = ei4Var;
        this.d = p30Var;
        this.e = z56Var.c;
        uv0 uv0VarD = z56Var.b.d();
        this.f = uv0VarD;
        p30Var.d(uv0VarD);
        uv0VarD.a(this);
        uv0 uv0VarD2 = ((mm) z56Var.d).d();
        this.g = uv0VarD2;
        p30Var.d(uv0VarD2);
        uv0VarD2.a(this);
        rm rmVar = (rm) z56Var.e;
        rmVar.getClass();
        c18 c18Var = new c18(rmVar);
        this.h = c18Var;
        c18Var.a(p30Var);
        c18Var.b(this);
    }

    @Override // o.k30
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
        this.i.b(list, list2);
    }

    @Override // o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.i.c(rectF, matrix, z);
    }

    @Override // o.v03
    public final void d(ListIterator listIterator) {
        if (this.i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((sa1) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.i = new ya1(this.c, this.d, this.e, arrayList, null);
    }

    @Override // o.zg5
    public final Path e() {
        Path pathE = this.i.e();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.f.d()).floatValue();
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixE = this.h.e(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixE);
            path.addPath(pathE, matrix);
        }
        return path;
    }

    @Override // o.i62
    public final void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        float fFloatValue = ((Float) this.f.d()).floatValue();
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        c18 c18Var = this.h;
        float fFloatValue3 = ((Float) c18Var.v.d()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) c18Var.w.d()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c18Var.e(f + fFloatValue2));
            this.i.f(canvas, matrix2, (int) (lr4.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i), r62Var);
        }
    }
}
