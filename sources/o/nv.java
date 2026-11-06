package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nv implements ov, lv {
    public final /* synthetic */ lv m;
    public final j04 n;

    public nv(lv lvVar, j04 j04Var) {
        this.m = lvVar;
        this.n = j04Var;
    }

    @Override // o.in1
    public final float A0(long j) {
        return this.m.A0(j);
    }

    @Override // o.in1
    public final long I(float f) {
        return this.m.I(f);
    }

    @Override // o.in1
    public final float O(int i) {
        return this.m.O(i);
    }

    @Override // o.in1
    public final float R(float f) {
        return this.m.R(f);
    }

    @Override // o.in1
    public final float Z() {
        return this.m.Z();
    }

    @Override // o.bm3
    public final boolean b0() {
        return this.m.b0();
    }

    @Override // o.in1
    public final float d0(float f) {
        return this.m.d0(f);
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.getDensity();
    }

    @Override // o.bm3
    public final j04 getLayoutDirection() {
        return this.n;
    }

    @Override // o.in1
    public final int l0(long j) {
        return this.m.l0(j);
    }

    @Override // o.fo4
    public final eo4 o0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            ki3.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new mv(i3, i4, map, function1, (byte) 0);
    }

    @Override // o.in1
    public final long q(float f) {
        return this.m.q(f);
    }

    @Override // o.in1
    public final int q0(float f) {
        return this.m.q0(f);
    }

    @Override // o.in1
    public final long r(long j) {
        return this.m.r(j);
    }

    @Override // o.in1
    public final float v(long j) {
        return this.m.v(j);
    }

    @Override // o.in1
    public final long w0(long j) {
        return this.m.w0(j);
    }
}
