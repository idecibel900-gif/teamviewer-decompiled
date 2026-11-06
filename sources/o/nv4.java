package o;

import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class nv4 implements zb3 {
    public final PointF A;
    public final PointF B;
    public final PointF C;
    public float D;
    public float E;
    public mv4 F;
    public mv4 G;
    public boolean H;
    public na3 m;
    public c1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j97 f1605o;
    public final float p;
    public final float q;
    public final float r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public yb3 x;
    public final PointF y;
    public final PointF z;

    public nv4(j93 j93Var) {
        j93Var.getClass();
        this.p = j93Var.R() / 5.0f;
        float fR = j93Var.R() / 10.0f;
        this.q = fR;
        this.r = fR;
        this.x = yb3.m;
        this.y = new PointF(0.0f, 0.0f);
        this.z = new PointF(0.0f, 0.0f);
        this.A = new PointF(0.0f, 0.0f);
        this.B = new PointF(-1.0f, -1.0f);
        this.C = new PointF(0.0f, 0.0f);
        this.F = new mv4(this, (byte) 0);
        this.G = new mv4(this, (byte) 1);
    }

    @Override // o.zb3
    public final void a(c1 c1Var) {
        this.n = c1Var;
    }

    @Override // o.zb3
    public final void b(na3 na3Var) {
        this.m = na3Var;
    }

    @Override // o.zb3
    public final void c(j97 j97Var) {
        j97Var.getClass();
        this.f1605o = j97Var;
    }

    @Override // o.zb3
    public final void destroy() {
        this.H = true;
        mv4 mv4Var = this.F;
        if (mv4Var != null) {
            mv4Var.cancel();
            this.F = null;
        }
        mv4 mv4Var2 = this.G;
        if (mv4Var2 != null) {
            mv4Var2.cancel();
            this.G = null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j97 j97Var;
        i12 i12Var;
        na3 na3Var;
        l97 l97Var;
        v97 v97Var;
        PointF pointF;
        boolean z;
        ub3 ub3Var;
        ub3 ub3Var2;
        boolean z2;
        i12 i12Var2;
        na3 na3Var2;
        motionEvent.getClass();
        if (this.H) {
            ye4.c("MultiTouchListenerRCDirectTouch", "onTouch: ignore touch event");
            return true;
        }
        float x = motionEvent.getX();
        PointF pointF2 = this.y;
        pointF2.x = x;
        pointF2.y = motionEvent.getY();
        int action = motionEvent.getAction();
        int pointerCount = motionEvent.getPointerCount();
        yb3 yb3Var = yb3.t;
        yb3 yb3Var2 = yb3.m;
        PointF pointF3 = this.z;
        if (pointerCount != 2) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            na3 na3Var3 = this.m;
            if (na3Var3 != null && (j97Var = ((a1) na3Var3).g) != null && (i12Var = (i12) j97Var.getValue()) != null && (na3Var = this.m) != null && (l97Var = ((a1) na3Var).e) != null && (v97Var = (v97) l97Var.getValue()) != null) {
                float f = v97Var.d;
                float f2 = v97Var.e;
                float f3 = i12Var.a;
                float f4 = v97Var.a;
                float f5 = f3 * f4;
                float f6 = f2 + y;
                if (f6 < i12Var.b * f4 && f6 > 0.0f) {
                    float f7 = f + x2;
                    if (f7 < f5 && f7 > 0.0f) {
                        yb3 yb3Var3 = yb3.n;
                        yb3 yb3Var4 = yb3.p;
                        PointF pointF4 = this.C;
                        if (action != 0) {
                            yb3 yb3Var5 = yb3.q;
                            yb3 yb3Var6 = yb3.u;
                            yb3 yb3Var7 = yb3.r;
                            if (action == 1) {
                                pointF = pointF2;
                                mv4 mv4Var = this.G;
                                if (mv4Var != null) {
                                    mv4Var.cancel();
                                }
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                this.t = jUptimeMillis;
                                long j = jUptimeMillis - this.s;
                                yb3 yb3Var8 = this.x;
                                if (yb3Var8 == yb3Var5 || yb3Var8 == yb3Var) {
                                    c1 c1Var = this.n;
                                    if (c1Var != null) {
                                        c1Var.e(0);
                                    }
                                    this.x = yb3Var2;
                                    this.w = SystemClock.uptimeMillis();
                                } else if (yb3Var8 == yb3Var6) {
                                    this.x = yb3Var2;
                                } else if (j < 500) {
                                    PointF pointF5 = new PointF(pointF.x - pointF4.x, pointF.y - pointF4.y);
                                    float f8 = pointF5.x;
                                    float f9 = pointF5.y;
                                    if (((float) Math.sqrt((f9 * f9) + (f8 * f8))) < this.r) {
                                        yb3 yb3Var9 = this.x;
                                        if (yb3Var9 == yb3Var4) {
                                            c1 c1Var2 = this.n;
                                            if (c1Var2 != null) {
                                                c1Var2.e(0);
                                            }
                                            c1 c1Var3 = this.n;
                                            if (c1Var3 != null) {
                                                c1Var3.d(1);
                                            }
                                            c1 c1Var4 = this.n;
                                            if (c1Var4 != null) {
                                                c1Var4.e(0);
                                            }
                                            c1 c1Var5 = this.n;
                                            if (c1Var5 != null) {
                                                c1Var5.d(1);
                                            }
                                            this.x = yb3Var2;
                                        } else if (yb3Var9 != yb3Var6) {
                                            mv4 mv4Var2 = this.F;
                                            if (mv4Var2 != null) {
                                                mv4Var2.cancel();
                                            }
                                            mv4 mv4Var3 = new mv4(this, (byte) 0);
                                            p53.a.schedule(mv4Var3, 350L);
                                            this.F = mv4Var3;
                                            this.x = yb3Var3;
                                        } else {
                                            this.x = yb3Var2;
                                        }
                                        this.w = SystemClock.uptimeMillis();
                                    }
                                } else if (yb3Var8 == yb3.f2595o) {
                                    c1 c1Var6 = this.n;
                                    if (c1Var6 != null) {
                                        c1Var6.e(0);
                                    }
                                    c1 c1Var7 = this.n;
                                    if (c1Var7 != null) {
                                        c1Var7.d(2);
                                    }
                                    this.x = yb3Var2;
                                }
                                if (this.x == yb3Var7) {
                                    this.x = yb3Var2;
                                }
                            } else if (action == 2) {
                                long jUptimeMillis2 = SystemClock.uptimeMillis();
                                long j2 = jUptimeMillis2 - this.v;
                                long j3 = jUptimeMillis2 - this.w;
                                long j4 = jUptimeMillis2 - this.u;
                                pointF = pointF2;
                                float f10 = pointF4.x - pointF.x;
                                float f11 = pointF4.y - pointF.y;
                                float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                                yb3 yb3Var10 = this.x;
                                float f12 = this.q;
                                if ((yb3Var10 == yb3Var4 || yb3Var10 == yb3Var6) && fSqrt > f12) {
                                    mv4 mv4Var4 = this.F;
                                    if (mv4Var4 != null) {
                                        mv4Var4.cancel();
                                    }
                                    mv4 mv4Var5 = this.G;
                                    if (mv4Var5 != null) {
                                        mv4Var5.cancel();
                                    }
                                    c1 c1Var8 = this.n;
                                    if (c1Var8 != null) {
                                        c1Var8.l(pointF.x, pointF.y);
                                    }
                                    this.x = yb3Var6;
                                    this.w = jUptimeMillis2;
                                } else if ((j4 < 450 || yb3Var10 == yb3Var7) && fSqrt > f12) {
                                    c1 c1Var9 = this.n;
                                    if (c1Var9 != null) {
                                        c1Var9.e(0);
                                    }
                                    if (this.x != yb3Var7) {
                                        this.x = yb3Var7;
                                        mv4 mv4Var6 = this.G;
                                        if (mv4Var6 != null) {
                                            mv4Var6.cancel();
                                        }
                                    }
                                    int i = (int) ((pointF.x - pointF3.x) * (-0.3f));
                                    int i2 = (int) ((pointF.y - pointF3.y) * 0.9f);
                                    int iAbs = Math.abs(i);
                                    int iAbs2 = Math.abs(i2);
                                    c1 c1Var10 = this.n;
                                    if (iAbs > iAbs2) {
                                        if (c1Var10 != null && (ub3Var2 = c1Var10.i) != null) {
                                            ub3Var2.a(i, true);
                                        }
                                    } else if (c1Var10 != null && (ub3Var = c1Var10.i) != null) {
                                        ub3Var.a(i2, false);
                                    }
                                } else if (fSqrt > f12 && j2 > 250 && j3 > 100 && yb3Var10 != yb3Var7) {
                                    mv4 mv4Var7 = this.G;
                                    if (mv4Var7 != null) {
                                        mv4Var7.cancel();
                                    }
                                    c1 c1Var11 = this.n;
                                    if (c1Var11 != null) {
                                        c1Var11.e(1);
                                    }
                                    this.x = yb3Var5;
                                    c1 c1Var12 = this.n;
                                    if (c1Var12 != null) {
                                        c1Var12.l(pointF.x, pointF.y);
                                    }
                                }
                            } else if (action == 3) {
                                pointF = pointF2;
                                z2 = false;
                            }
                        } else {
                            pointF = pointF2;
                            long jUptimeMillis3 = SystemClock.uptimeMillis();
                            this.u = jUptimeMillis3;
                            if (jUptimeMillis3 - this.t < 350) {
                                yb3 yb3Var11 = this.x;
                                if (yb3Var11 == yb3Var3) {
                                    mv4 mv4Var8 = this.F;
                                    if (mv4Var8 != null) {
                                        mv4Var8.cancel();
                                    }
                                    this.x = yb3Var4;
                                    c1 c1Var13 = this.n;
                                    if (c1Var13 != null) {
                                        c1Var13.l(pointF.x, pointF.y);
                                    }
                                } else {
                                    ye4.a.b("MultiTouchListenerRCDirectTouch", "onDown with gesture = " + yb3Var11.name());
                                }
                            }
                            this.s = jUptimeMillis3;
                            pointF4.x = pointF.x;
                            pointF4.y = pointF.y;
                            c1 c1Var14 = this.n;
                            if (c1Var14 != null) {
                                c1Var14.l(pointF.x, pointF.y);
                            }
                            mv4 mv4Var9 = this.G;
                            if (mv4Var9 != null) {
                                mv4Var9.cancel();
                            }
                            if (this.x != yb3Var4) {
                                z = true;
                                mv4 mv4Var10 = new mv4(this, (byte) 1);
                                this.G = mv4Var10;
                                p53.a.schedule(mv4Var10, 450L);
                            }
                            z2 = z;
                        }
                        z = true;
                        z2 = z;
                    }
                }
            }
            pointF3.x = pointF.x;
            pointF3.y = pointF.y;
            return z2;
        }
        int i3 = action & 255;
        float x3 = motionEvent.getX(1);
        PointF pointF6 = this.A;
        pointF6.x = x3;
        pointF6.y = motionEvent.getY(1);
        PointF pointF7 = this.B;
        if (i3 != 2) {
            if (i3 == 5) {
                mv4 mv4Var11 = this.F;
                if (mv4Var11 != null) {
                    mv4Var11.cancel();
                }
                mv4 mv4Var12 = this.G;
                if (mv4Var12 != null) {
                    mv4Var12.cancel();
                }
                this.u = SystemClock.uptimeMillis();
                float f13 = pointF2.x - pointF6.x;
                float f14 = pointF2.y - pointF6.y;
                float fSqrt2 = (float) Math.sqrt((f14 * f14) + (f13 * f13));
                this.D = fSqrt2;
                this.E = fSqrt2;
            } else if (i3 == 6) {
                this.v = SystemClock.uptimeMillis();
                this.x = yb3Var2;
                pointF7.x = -1.0f;
                pointF7.y = -1.0f;
            }
        } else if (this.x != yb3Var) {
            long jUptimeMillis4 = SystemClock.uptimeMillis();
            long j5 = jUptimeMillis4 - this.u;
            float f15 = pointF2.x - pointF6.x;
            float f16 = pointF2.y - pointF6.y;
            float fSqrt3 = (float) Math.sqrt((f16 * f16) + (f15 * f15));
            j97 j97Var2 = this.f1605o;
            if (j97Var2 != null && (i12Var2 = (i12) j97Var2.getValue()) != null) {
                float f17 = (fSqrt3 - this.E) / i12Var2.a;
                this.E = fSqrt3;
                if (j5 > 50) {
                    float fAbs = Math.abs(fSqrt3 - this.D);
                    PointF pointF8 = new PointF((pointF6.x + pointF2.x) / 2.0f, (pointF6.y + pointF2.y) / 2.0f);
                    if (fAbs <= this.p) {
                        float f18 = pointF7.x;
                        if (f18 > 0.0f) {
                            float f19 = pointF7.y;
                            if (f19 > 0.0f) {
                                float f20 = pointF8.x - f18;
                                float f21 = pointF8.y - f19;
                                if ((f20 != 0.0f || f21 != 0.0f) && (na3Var2 = this.m) != null) {
                                    v97 v97Var2 = (v97) ((a1) na3Var2).e.getValue();
                                    na3Var2.c(v97Var2.d - f20, v97Var2.e - f21);
                                }
                            }
                        }
                        pointF7.x = (pointF2.x + pointF6.x) / 2.0f;
                        pointF7.y = (pointF2.y + pointF6.y) / 2.0f;
                    } else if (jUptimeMillis4 - this.v > 250) {
                        na3 na3Var4 = this.m;
                        if (na3Var4 != null) {
                            na3Var4.f((float) Math.pow(20.0d, f17), pointF8.x, pointF8.y);
                        }
                        this.x = yb3.s;
                        this.w = SystemClock.uptimeMillis();
                    }
                }
            }
        }
        z = true;
        pointF = pointF2;
        z2 = z;
        pointF3.x = pointF.x;
        pointF3.y = pointF.y;
        return z2;
    }
}
