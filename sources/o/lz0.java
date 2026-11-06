package o;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lz0 extends View.DragShadowBuilder {
    public final ln1 a;
    public final long b;
    public final Function1 c;

    public lz0(ln1 ln1Var, long j, Function1 function1) {
        this.a = ln1Var;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        nl0 nl0Var = new nl0();
        Canvas canvas2 = dg.a;
        cg cgVar = new cg();
        cgVar.a = canvas;
        ml0 ml0Var = nl0Var.m;
        in1 in1Var = ml0Var.a;
        j04 j04Var = ml0Var.b;
        ll0 ll0Var = ml0Var.c;
        long j = ml0Var.d;
        ml0Var.a = this.a;
        ml0Var.b = j04.m;
        ml0Var.c = cgVar;
        ml0Var.d = this.b;
        cgVar.g();
        this.c.invoke(nl0Var);
        cgVar.p();
        ml0Var.a = in1Var;
        ml0Var.b = j04Var;
        ml0Var.c = ll0Var;
        ml0Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        ln1 ln1Var = this.a;
        point.set(ln1Var.q0(fIntBitsToFloat / ln1Var.getDensity()), ln1Var.q0(Float.intBitsToFloat((int) (j & 4294967295L)) / ln1Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
