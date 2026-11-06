package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class c87 extends o30 {
    public final PointF h;
    public final PointF i;
    public final uv0 j;
    public final uv0 k;

    public c87(uv0 uv0Var, uv0 uv0Var2) {
        super(Collections.EMPTY_LIST);
        this.h = new PointF();
        this.i = new PointF();
        this.j = uv0Var;
        this.k = uv0Var2;
        g(this.d);
    }

    @Override // o.o30
    public final Object d() {
        PointF pointF = this.h;
        float f = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // o.o30
    public final Object e(dy3 dy3Var, float f) {
        PointF pointF = this.h;
        float f2 = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f2, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // o.o30
    public final void g(float f) {
        uv0 uv0Var = this.j;
        uv0Var.g(f);
        uv0 uv0Var2 = this.k;
        uv0Var2.g(f);
        this.h.set(((Float) uv0Var.d()).floatValue(), ((Float) uv0Var2.d()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((k30) arrayList.get(i)).a();
            i++;
        }
    }
}
