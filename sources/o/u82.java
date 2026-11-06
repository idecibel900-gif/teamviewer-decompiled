package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u82 implements zg5, k30, sa1 {
    public final ei4 b;
    public final zz2 c;
    public final o30 d;
    public final or0 e;
    public boolean g;
    public final Path a = new Path();
    public final nm f = new nm((byte) 2);

    public u82(ei4 ei4Var, p30 p30Var, or0 or0Var) {
        this.b = ei4Var;
        o30 o30VarD = or0Var.b.d();
        this.c = (zz2) o30VarD;
        o30 o30VarD2 = or0Var.a.d();
        this.d = o30VarD2;
        this.e = or0Var;
        p30Var.d(o30VarD);
        p30Var.d(o30VarD2);
        o30VarD.a(this);
        o30VarD2.a(this);
    }

    @Override // o.k30
    public final void a() {
        this.g = false;
        this.b.invalidateSelf();
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            sa1 sa1Var = (sa1) arrayList.get(i);
            if (sa1Var instanceof f38) {
                f38 f38Var = (f38) sa1Var;
                if (f38Var.c == 1) {
                    this.f.a.add(f38Var);
                    f38Var.d(this);
                }
            }
            i++;
        }
    }

    @Override // o.zg5
    public final Path e() {
        boolean z = this.g;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        or0 or0Var = this.e;
        if (or0Var.d) {
            this.g = true;
            return path;
        }
        PointF pointF = (PointF) this.c.d();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (or0Var.c) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.d.d();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f.j(path);
        this.g = true;
        return path;
    }
}
