package o;

import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class qv4 implements zb3 {
    public final PointF A;
    public final PointF B;
    public final PointF C;
    public final PointF D;
    public final PointF E;
    public final PointF F;
    public float G;
    public float H;
    public float I;
    public float J;
    public j97 K;
    public pv4 L;
    public pv4 M;
    public boolean N;
    public final yt2 O;
    public final float m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f1870o;
    public final float p;
    public final float q;
    public na3 r;
    public c1 s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public yb3 y;
    public final PointF z;

    public qv4(j93 j93Var) {
        j93Var.getClass();
        this.m = j93Var.R() / 5.0f;
        this.n = j93Var.R() / 10.0f;
        this.f1870o = j93Var.R() / 5.0f;
        float fR = j93Var.R() / 10.0f;
        this.p = fR;
        this.q = fR;
        this.y = yb3.m;
        this.z = new PointF(0.0f, 0.0f);
        this.A = new PointF(0.0f, 0.0f);
        this.B = new PointF(0.0f, 0.0f);
        this.C = new PointF(0.0f, 0.0f);
        this.D = new PointF(0.0f, 0.0f);
        this.E = new PointF(0.0f, 0.0f);
        this.F = new PointF(0.0f, 0.0f);
        this.L = new pv4(this, (byte) 0);
        this.M = new pv4(this, (byte) 1);
        this.O = new yt2(new nx3(this, (byte) 23));
    }

    @Override // o.zb3
    public final void a(c1 c1Var) {
        this.s = c1Var;
    }

    @Override // o.zb3
    public final void b(na3 na3Var) {
        this.r = na3Var;
    }

    @Override // o.zb3
    public final void c(j97 j97Var) {
        j97Var.getClass();
        this.K = j97Var;
    }

    @Override // o.zb3
    public final void destroy() {
        this.N = true;
        this.K = null;
        pv4 pv4Var = this.L;
        if (pv4Var != null) {
            pv4Var.cancel();
            this.L = null;
        }
        pv4 pv4Var2 = this.M;
        if (pv4Var2 != null) {
            pv4Var2.cancel();
            this.M = null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        i12 i12Var;
        ub3 ub3Var;
        motionEvent.getClass();
        if (this.N) {
            ye4.c("MultiTouchListenerRemoteControl", "onTouch: ignore touch event");
            return true;
        }
        float x = motionEvent.getX();
        PointF pointF = this.z;
        pointF.x = x;
        pointF.y = motionEvent.getY();
        int action = motionEvent.getAction();
        int pointerCount = motionEvent.getPointerCount();
        yb3 yb3Var = yb3.m;
        if (pointerCount <= 1) {
            yb3 yb3Var2 = yb3.n;
            yb3 yb3Var3 = yb3.p;
            yt2 yt2Var = this.O;
            PointF pointF2 = this.B;
            PointF pointF3 = this.D;
            if (action != 0) {
                yb3 yb3Var4 = yb3.q;
                yb3 yb3Var5 = yb3.t;
                PointF pointF4 = this.C;
                if (action == 1) {
                    pv4 pv4Var = this.M;
                    if (pv4Var != null) {
                        pv4Var.cancel();
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    this.u = jUptimeMillis;
                    long j = jUptimeMillis - this.t;
                    yb3 yb3Var6 = this.y;
                    if (yb3Var6 == yb3Var4 || yb3Var6 == yb3Var5) {
                        c1 c1Var = this.s;
                        if (c1Var != null) {
                            c1Var.e(0);
                        }
                        if (this.y == yb3Var5) {
                            yt2Var.getClass();
                            pointF4.getClass();
                            if (pointF4.length() > 10.0f) {
                                Timer timer = new Timer();
                                timer.scheduleAtFixedRate(new io.sentry.v((nx3) yt2Var.n, pointF4), 16L, 16L);
                                yt2Var.f2642o = timer;
                            }
                        }
                        this.y = yb3Var;
                        this.x = SystemClock.uptimeMillis();
                        return true;
                    }
                    if (j < 500) {
                        PointF pointF5 = new PointF(pointF.x - pointF3.x, pointF.y - pointF3.y);
                        float f = pointF5.x;
                        float f2 = pointF5.y;
                        if (((float) Math.sqrt((f2 * f2) + (f * f))) < this.q) {
                            yb3 yb3Var7 = this.y;
                            if (yb3Var7 == yb3Var2 || yb3Var7 == yb3Var3) {
                                c1 c1Var2 = this.s;
                                if (c1Var2 != null) {
                                    c1Var2.e(0);
                                }
                                c1 c1Var3 = this.s;
                                z = true;
                                if (c1Var3 != null) {
                                    c1Var3.d(1);
                                }
                                c1 c1Var4 = this.s;
                                if (c1Var4 != null) {
                                    c1Var4.e(0);
                                }
                                c1 c1Var5 = this.s;
                                if (c1Var5 != null) {
                                    c1Var5.d(1);
                                }
                                this.y = yb3Var;
                            } else {
                                pv4 pv4Var2 = this.L;
                                if (pv4Var2 != null) {
                                    pv4Var2.cancel();
                                }
                                pv4 pv4Var3 = new pv4(this, (byte) 0);
                                p53.a.schedule(pv4Var3, 300L);
                                this.L = pv4Var3;
                                this.y = yb3Var2;
                                z = true;
                            }
                            this.x = SystemClock.uptimeMillis();
                            return z;
                        }
                    }
                } else {
                    if (action == 2) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        long j2 = jUptimeMillis2 - this.w;
                        long j3 = jUptimeMillis2 - this.x;
                        float f3 = pointF3.x - pointF.x;
                        float f4 = pointF3.y - pointF.y;
                        float fSqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                        yb3 yb3Var8 = this.y;
                        if (yb3Var8 == yb3Var3 && fSqrt > this.f1870o) {
                            pv4 pv4Var4 = this.M;
                            if (pv4Var4 != null) {
                                pv4Var4.cancel();
                            }
                            c1 c1Var6 = this.s;
                            if (c1Var6 != null) {
                                c1Var6.e(1);
                            }
                            this.y = yb3Var4;
                            this.x = jUptimeMillis2;
                        } else if (yb3Var8 != yb3Var3 && fSqrt > this.p && j2 > 250 && j3 > 250) {
                            pv4 pv4Var5 = this.M;
                            if (pv4Var5 != null) {
                                pv4Var5.cancel();
                            }
                            float f5 = pointF.x - pointF2.x;
                            float f6 = pointF.y - pointF2.y;
                            this.y = yb3Var5;
                            c1 c1Var7 = this.s;
                            if (c1Var7 != null) {
                                c1Var7.l(f5, f6);
                            }
                            pointF4.set(f5, f6);
                            pointF2.x = pointF.x;
                            pointF2.y = pointF.y;
                        }
                        pointF2.x = pointF.x;
                        pointF2.y = pointF.y;
                        return true;
                    }
                    if (action == 3) {
                        return false;
                    }
                }
            } else {
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                Timer timer2 = (Timer) yt2Var.f2642o;
                if (timer2 != null) {
                    timer2.cancel();
                }
                Timer timer3 = (Timer) yt2Var.f2642o;
                if (timer3 != null) {
                    timer3.purge();
                }
                yt2Var.f2642o = null;
                if (jUptimeMillis3 - this.u < 350) {
                    yb3 yb3Var9 = this.y;
                    if (yb3Var9 == yb3Var2) {
                        this.y = yb3Var3;
                        pv4 pv4Var6 = this.L;
                        if (pv4Var6 != null) {
                            pv4Var6.cancel();
                        }
                    } else {
                        ye4.a.b("Input", "onDown with gesture = " + yb3Var9.name());
                    }
                }
                this.t = jUptimeMillis3;
                pointF3.x = pointF.x;
                pointF3.y = pointF.y;
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                pv4 pv4Var7 = this.M;
                if (pv4Var7 != null) {
                    pv4Var7.cancel();
                }
                if (this.y != yb3Var3) {
                    pv4 pv4Var8 = new pv4(this, (byte) 1);
                    this.M = pv4Var8;
                    p53.a.schedule(pv4Var8, 800L);
                    return true;
                }
            }
            return true;
        }
        int i = action & 255;
        float x2 = motionEvent.getX(1);
        PointF pointF6 = this.A;
        pointF6.x = x2;
        pointF6.y = motionEvent.getY(1);
        PointF pointF7 = this.E;
        if (i == 2) {
            long jUptimeMillis4 = SystemClock.uptimeMillis();
            long j4 = jUptimeMillis4 - this.w;
            long j5 = jUptimeMillis4 - this.v;
            float f7 = pointF.x - pointF6.x;
            float f8 = pointF.y - pointF6.y;
            float fSqrt2 = (float) Math.sqrt((f8 * f8) + (f7 * f7));
            float f9 = (pointF.x + pointF6.x) / 2.0f;
            PointF pointF8 = this.F;
            pointF8.x = f9;
            float f10 = (pointF.y + pointF6.y) / 2.0f;
            pointF8.y = f10;
            float f11 = pointF7.x - f9;
            float f12 = pointF7.y - f10;
            float fSqrt3 = (float) Math.sqrt((f12 * f12) + (f11 * f11));
            if (j5 > 50) {
                float fAbs = Math.abs(this.G - fSqrt2);
                yb3 yb3Var10 = this.y;
                yb3 yb3Var11 = yb3.r;
                float f13 = this.m;
                yb3 yb3Var12 = yb3.s;
                if (yb3Var10 != yb3Var12 && fSqrt3 > this.n && fAbs < f13) {
                    if (yb3Var10 != yb3Var11) {
                        this.I = pointF8.x;
                        this.J = pointF8.y;
                    }
                    float f14 = pointF8.x;
                    int i2 = (int) (f14 - this.I);
                    float f15 = pointF8.y;
                    int i3 = (int) (f15 - this.J);
                    this.I = f14;
                    this.J = f15;
                    int iAbs = Math.abs(i2);
                    int iAbs2 = Math.abs(i3);
                    c1 c1Var8 = this.s;
                    if (iAbs > iAbs2) {
                        if (c1Var8 != null) {
                            int i4 = (int) (i2 * (-0.09f));
                            ub3 ub3Var2 = c1Var8.i;
                            if (ub3Var2 != null) {
                                ub3Var2.a(i4, true);
                            }
                        }
                    } else if (c1Var8 != null && (ub3Var = c1Var8.i) != null) {
                        ub3Var.a(i3, false);
                    }
                    this.y = yb3Var11;
                    this.x = SystemClock.uptimeMillis();
                } else if (yb3Var10 == yb3Var11 || fAbs <= f13) {
                    if (yb3Var10 == yb3Var11 || yb3Var10 == yb3Var12) {
                        this.y = yb3Var;
                    }
                } else if (j4 > 250) {
                    j97 j97Var = this.K;
                    if (j97Var != null && (i12Var = (i12) j97Var.getValue()) != null) {
                        float fPow = (float) Math.pow(20.0d, (fSqrt2 - this.H) / i12Var.a);
                        na3 na3Var = this.r;
                        if (na3Var != null) {
                            na3Var.f(fPow, 0.0f, 0.0f);
                        }
                        this.y = yb3Var12;
                        this.x = SystemClock.uptimeMillis();
                    }
                }
            }
            this.H = fSqrt2;
            return true;
        }
        if (i == 5) {
            pv4 pv4Var9 = this.M;
            if (pv4Var9 != null) {
                pv4Var9.cancel();
            }
            this.v = SystemClock.uptimeMillis();
            float f16 = pointF.x - pointF6.x;
            float f17 = pointF.y - pointF6.y;
            float fSqrt4 = (float) Math.sqrt((f17 * f17) + (f16 * f16));
            this.G = fSqrt4;
            this.H = fSqrt4;
            float f18 = (pointF.x + pointF6.x) / 2.0f;
            pointF7.x = f18;
            float f19 = (pointF.y + pointF6.y) / 2.0f;
            pointF7.y = f19;
            this.I = f18;
            this.J = f19;
            return true;
        }
        if (i == 6) {
            this.w = SystemClock.uptimeMillis();
            this.y = yb3Var;
            return true;
        }
        return true;
    }
}
