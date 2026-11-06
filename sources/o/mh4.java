package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mh4 extends yz3 implements Function1 {
    public final /* synthetic */ Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Matrix f1470o;
    public final /* synthetic */ ei4 p;
    public final /* synthetic */ qh4 q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ px4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh4(Rect rect, Matrix matrix, ei4 ei4Var, qh4 qh4Var, Context context, Function0 function0, px4 px4Var) {
        super(1);
        this.n = rect;
        this.f1470o = matrix;
        this.p = ei4Var;
        this.q = qh4Var;
        this.r = context;
        this.s = function0;
        this.t = px4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u52 u52Var = (u52) obj;
        u52Var.getClass();
        ll0 ll0VarX = u52Var.h0().x();
        Rect rect = this.n;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rect.height())) & 4294967295L) | (((long) Float.floatToRawIntBits(rect.width())) << 32);
        long jS0 = (((long) vn4.s0(Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)))) & 4294967295L) | (((long) vn4.s0(Float.intBitsToFloat((int) (u52Var.d() >> 32)))) << 32);
        float fK = e8.k(jFloatToRawIntBits, u52Var.d());
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK)) & 4294967295L);
        int i = qi6.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        int i2 = qi6.a;
        int i3 = (int) (jFloatToRawIntBits2 >> 32);
        int i4 = (int) (jFloatToRawIntBits2 & 4294967295L);
        long jIntBitsToFloat = (((long) ((int) (Float.intBitsToFloat(i4) * Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))))) & 4294967295L) | (((long) ((int) (Float.intBitsToFloat(i3) * fIntBitsToFloat))) << 32);
        long jRound = (((long) Math.round(((u52Var.getLayoutDirection() == j04.m ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (jS0 >> 32)) - ((int) (jIntBitsToFloat >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (jS0 & 4294967295L)) - ((int) (jIntBitsToFloat & 4294967295L))) / 2.0f))) & 4294967295L);
        Matrix matrix = this.f1470o;
        matrix.reset();
        matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
        ei4 ei4Var = this.p;
        mg1 mg1Var = ei4Var.s;
        mi4 mi4Var = ei4Var.n;
        boolean zRemove = mg1Var.a.remove(fi4.m);
        if (ei4Var.m != null && zRemove) {
            ei4Var.b();
        }
        ei4Var.Q = 1;
        ei4Var.c();
        ei4Var.R = 1;
        ArrayList arrayList = ei4Var.p;
        qh4 qh4Var = ei4Var.m;
        qh4 qh4Var2 = this.q;
        if (qh4Var != qh4Var2) {
            ei4Var.L = true;
            if (mi4Var.y) {
                mi4Var.cancel();
                if (!ei4Var.isVisible()) {
                    ei4Var.P = 1;
                }
            }
            ei4Var.m = null;
            ei4Var.u = null;
            ei4Var.q = null;
            ei4Var.O = -3.4028235E38f;
            mi4Var.x = null;
            mi4Var.v = -2.14748365E9f;
            mi4Var.w = 2.14748365E9f;
            ei4Var.invalidateSelf();
            ei4Var.m = qh4Var2;
            ei4Var.b();
            boolean z = mi4Var.x == null;
            mi4Var.x = qh4Var2;
            if (z) {
                mi4Var.j(Math.max(mi4Var.v, qh4Var2.l), Math.min(mi4Var.w, qh4Var2.m));
            } else {
                mi4Var.j((int) qh4Var2.l, (int) qh4Var2.m);
            }
            float f = mi4Var.t;
            mi4Var.t = 0.0f;
            mi4Var.s = 0.0f;
            mi4Var.i((int) f);
            mi4Var.g();
            ei4Var.m(mi4Var.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                di4 di4Var = (di4) it.next();
                if (di4Var != null) {
                    di4Var.run();
                }
                it.remove();
            }
            arrayList.clear();
            ei4Var.c();
            Drawable.Callback callback = ei4Var.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(ei4Var);
            }
        }
        if (this.t.getValue() != null) {
            io.sentry.h2.f();
            return null;
        }
        ei4Var.w = true;
        if (true != ei4Var.t) {
            ei4Var.t = true;
            t01 t01Var = ei4Var.u;
            if (t01Var != null) {
                t01Var.J = true;
            }
            ei4Var.invalidateSelf();
        }
        ym4 ym4VarG = ei4Var.g();
        if (ei4Var.a(this.r) || ym4VarG == null) {
            ei4Var.m(((Number) this.s.a()).floatValue());
        } else {
            ei4Var.m(ym4VarG.b);
        }
        ei4Var.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvasB = dg.b(ll0VarX);
        pc0 pc0Var = ei4Var.N;
        ThreadPoolExecutor threadPoolExecutor = ei4.T;
        Semaphore semaphore = ei4Var.M;
        t01 t01Var2 = ei4Var.u;
        qh4 qh4Var3 = ei4Var.m;
        if (t01Var2 != null && qh4Var3 != null) {
            int i5 = ei4Var.R;
            if (i5 == 0) {
                i5 = 1;
            }
            boolean z2 = i5 == 2;
            if (z2) {
                try {
                    semaphore.acquire();
                    if (ei4Var.n()) {
                        ei4Var.m(mi4Var.a());
                    }
                } catch (InterruptedException unused) {
                    if (z2) {
                        semaphore.release();
                        if (t01Var2.I != mi4Var.a()) {
                        }
                    }
                    return f88.a;
                } catch (Throwable th) {
                    if (z2) {
                        semaphore.release();
                        if (t01Var2.I != mi4Var.a()) {
                            threadPoolExecutor.execute(pc0Var);
                        }
                    }
                    throw th;
                }
            }
            int i6 = ei4Var.v;
            if (ei4Var.x) {
                canvasB.save();
                canvasB.concat(matrix);
                ei4Var.j(canvasB, t01Var2);
                canvasB.restore();
            } else {
                t01Var2.f(canvasB, matrix, i6, null);
            }
            ei4Var.L = false;
            if (z2) {
                semaphore.release();
                if (t01Var2.I != mi4Var.a()) {
                    threadPoolExecutor.execute(pc0Var);
                }
            }
        }
        return f88.a;
    }
}
