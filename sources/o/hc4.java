package o;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class hc4 implements View.OnTouchListener {
    public static final int C = ViewConfiguration.getTapTimeout();
    public boolean A;
    public final o62 B;
    public final b00 m;
    public final AccelerateInterpolator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o62 f964o;
    public mt8 p;
    public final float[] q;
    public final float[] r;
    public final int s;
    public final float[] t;
    public final float[] u;
    public final float[] v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public hc4(o62 o62Var) {
        b00 b00Var = new b00();
        b00Var.e = Long.MIN_VALUE;
        b00Var.g = -1L;
        b00Var.f = 0L;
        this.m = b00Var;
        this.n = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.q = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.r = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.t = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.u = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v = fArr5;
        this.f964o = o62Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.s = C;
        b00Var.a = (short) 500;
        b00Var.b = (short) 500;
        this.B = o62Var;
    }

    public static float e(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float d(float f, float f2, float f3, int i) {
        float fE;
        float interpolation;
        float fE2 = e(this.q[i] * f2, 0.0f, this.r[i]);
        float f4 = f(f2 - f, fE2) - f(f, fE2);
        AccelerateInterpolator accelerateInterpolator = this.n;
        if (f4 >= 0.0f) {
            if (f4 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(f4);
            } else {
                fE = 0.0f;
            }
            if (fE == 0.0f) {
                return 0.0f;
            }
            float f5 = this.t[i];
            float f6 = this.u[i];
            float f7 = this.v[i];
            float f8 = f5 * f3;
            return fE > 0.0f ? e(fE * f8, f6, f7) : -e((-fE) * f8, f6, f7);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-f4);
        fE = e(interpolation, -1.0f, 1.0f);
        if (fE == 0.0f) {
            return 0.0f;
        }
        float f9 = this.t[i];
        float f10 = this.u[i];
        float f11 = this.v[i];
        float f12 = f9 * f3;
        if (fE > 0.0f) {
        }
    }

    public final float f(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.z) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void g() {
        int i = 0;
        if (this.x) {
            this.z = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        b00 b00Var = this.m;
        int i2 = (int) (jCurrentAnimationTimeMillis - b00Var.e);
        short s = b00Var.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        b00Var.i = i;
        b00Var.h = b00Var.a(jCurrentAnimationTimeMillis);
        b00Var.g = jCurrentAnimationTimeMillis;
    }

    public final boolean h() {
        o62 o62Var;
        int count;
        b00 b00Var = this.m;
        float f = b00Var.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(b00Var.c);
        if (iAbs != 0 && (count = (o62Var = this.B).getCount()) != 0) {
            int childCount = o62Var.getChildCount();
            int firstVisiblePosition = o62Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && o62Var.getChildAt(0).getTop() >= 0)) : !(i >= count && o62Var.getChildAt(childCount - 1).getBottom() <= o62Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
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
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.A
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L78
        L17:
            r8.g()
            return r1
        L1b:
            r8.y = r3
            r8.w = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            o.o62 r5 = r8.f964o
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.d(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.d(r10, r9, r4, r3)
            o.b00 r10 = r8.m
            r10.c = r0
            r10.d = r9
            boolean r9 = r8.z
            if (r9 != 0) goto L78
            boolean r9 = r8.h()
            if (r9 == 0) goto L78
            o.mt8 r9 = r8.p
            if (r9 != 0) goto L60
            o.mt8 r9 = new o.mt8
            r9.<init>(r8, r2)
            r8.p = r9
        L60:
            r8.z = r3
            r8.x = r3
            boolean r10 = r8.w
            if (r10 != 0) goto L73
            int r10 = r8.s
            if (r10 <= 0) goto L73
            long r6 = (long) r10
            java.util.WeakHashMap r10 = o.be8.a
            r5.postOnAnimationDelayed(r9, r6)
            goto L76
        L73:
            r9.run()
        L76:
            r8.w = r3
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hc4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
