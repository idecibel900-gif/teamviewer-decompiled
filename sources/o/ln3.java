package o;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ln3 extends j66 {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final ae m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1385o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public kn3 y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public c76 c = null;
    public int l = -1;
    public byte n = 0;
    public final ArrayList p = new ArrayList();
    public final mt8 s = new mt8((Object) this, (byte) 13);
    public View w = null;
    public final hn3 z = new hn3(this);

    public ln3(ae aeVar) {
        this.m = aeVar;
    }

    public static boolean n(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // o.j66
    public final void d(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // o.j66
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        ae aeVar;
        ln3 ln3Var = this;
        if (ln3Var.c != null) {
            float[] fArr = ln3Var.b;
            ln3Var.m(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        c76 c76Var = ln3Var.c;
        byte b = ln3Var.n;
        ArrayList arrayList = ln3Var.p;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            aeVar = ln3Var.m;
            if (i >= size) {
                break;
            }
            in3 in3Var = (in3) arrayList.get(i);
            c76 c76Var2 = in3Var.e;
            float f4 = in3Var.a;
            float f5 = in3Var.c;
            if (f4 == f5) {
                in3Var.i = c76Var2.m.getTranslationX();
            } else {
                in3Var.i = ua5.c(f5, f4, in3Var.m, f4);
            }
            float f6 = in3Var.b;
            float f7 = in3Var.d;
            if (f6 == f7) {
                in3Var.j = c76Var2.m.getTranslationY();
            } else {
                in3Var.j = ua5.c(f7, f6, in3Var.m, f6);
            }
            int iSave = canvas.save();
            aeVar.l(canvas, recyclerView, in3Var.e, in3Var.i, in3Var.j, in3Var.f, false);
            canvas.restoreToCount(iSave);
            i++;
            ln3Var = this;
        }
        if (c76Var != null) {
            int iSave2 = canvas.save();
            aeVar.l(canvas, recyclerView, c76Var, f2, f, b, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // o.j66
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            m(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        c76 c76Var = this.c;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            in3 in3Var = (in3) arrayList.get(i);
            int iSave = canvas.save();
            c76 c76Var2 = in3Var.e;
            c76Var2.getClass();
            ((s) c76Var2).r().getClass();
            canvas.restoreToCount(iSave);
        }
        if (c76Var != null) {
            int iSave2 = canvas.save();
            ((s) c76Var).r().getClass();
            canvas.restoreToCount(iSave2);
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            in3 in3Var2 = (in3) arrayList.get(i2);
            boolean z2 = in3Var2.l;
            if (z2 && !in3Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        hn3 hn3Var = this.z;
        if (recyclerView2 != null) {
            recyclerView2.e0(this);
            RecyclerView recyclerView3 = this.r;
            recyclerView3.C.remove(hn3Var);
            if (recyclerView3.D == hn3Var) {
                recyclerView3.D = null;
            }
            ArrayList arrayList = this.r.O;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                in3 in3Var = (in3) arrayList2.get(0);
                in3Var.g.cancel();
                this.m.c(this.r, in3Var.e);
            }
            arrayList2.clear();
            this.w = null;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            kn3 kn3Var = this.y;
            if (kn3Var != null) {
                kn3Var.a = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        Resources resources = recyclerView.getResources();
        this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.i(this);
        this.r.C.add(hn3Var);
        RecyclerView recyclerView4 = this.r;
        ArrayList arrayList3 = recyclerView4.O;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            recyclerView4.O = arrayList3;
        }
        arrayList3.add(this);
        this.y = new kn3(this);
        this.x = new GestureDetector(this.r.getContext(), this.y);
    }

    public final int h(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.g);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.r.getWidth() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.h) <= width) {
            return 0;
        }
        return i2;
    }

    public final void i(int i, int i2, MotionEvent motionEvent) {
        View viewL;
        if (this.c != null || i != 2 || this.n == 2 || this.r.getScrollState() == 1) {
            return;
        }
        androidx.recyclerview.widget.a layoutManager = this.r.getLayoutManager();
        int i3 = this.l;
        c76 c76VarL = null;
        if (i3 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(iFindPointerIndex) - this.d;
            float y = motionEvent.getY(iFindPointerIndex) - this.e;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f = this.q;
            if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.o()) && ((fAbs2 <= fAbs || !layoutManager.p()) && (viewL = l(motionEvent)) != null))) {
                c76VarL = this.r.L(viewL);
            }
        }
        if (c76VarL == null) {
            return;
        }
        RecyclerView recyclerView = this.r;
        int iD = (ae.d(this.m.h(recyclerView, c76VarL), recyclerView.getLayoutDirection()) & 65280) >> 8;
        if (iD == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f2 = x2 - this.d;
        float f3 = y2 - this.e;
        float fAbs3 = Math.abs(f2);
        float fAbs4 = Math.abs(f3);
        float f4 = this.q;
        if (fAbs3 >= f4 || fAbs4 >= f4) {
            if (fAbs3 > fAbs4) {
                if (f2 < 0.0f && (iD & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iD & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iD & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iD & 2) == 0) {
                    return;
                }
            }
            this.i = 0.0f;
            this.h = 0.0f;
            this.l = motionEvent.getPointerId(0);
            p(c76VarL, 1);
        }
    }

    public final int j(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.g);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.r.getHeight() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.i) <= height) {
            return 0;
        }
        return i2;
    }

    public final void k(c76 c76Var, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            in3 in3Var = (in3) arrayList.get(size);
            if (in3Var.e == c76Var) {
                in3Var.k |= z;
                if (!in3Var.l) {
                    in3Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View l(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        c76 c76Var = this.c;
        if (c76Var != null) {
            View view = c76Var.m;
            if (n(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            in3 in3Var = (in3) arrayList.get(size);
            View view2 = in3Var.e.m;
            if (n(view2, x, y, in3Var.i, in3Var.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int iH = recyclerView.r.h() - 1; iH >= 0; iH--) {
            View viewG = recyclerView.r.g(iH);
            float translationX = viewG.getTranslationX();
            float translationY = viewG.getTranslationY();
            if (x >= viewG.getLeft() + translationX && x <= viewG.getRight() + translationX && y >= viewG.getTop() + translationY && y <= viewG.getBottom() + translationY) {
                return viewG;
            }
        }
        return null;
    }

    public final void m(float[] fArr) {
        if ((this.f1385o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.m.getLeft();
        } else {
            fArr[0] = this.c.m.getTranslationX();
        }
        if ((this.f1385o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.m.getTop();
        } else {
            fArr[1] = this.c.m.getTranslationY();
        }
    }

    public final void o(c76 c76Var) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (this.r.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.n != 2) {
            return;
        }
        int i = (int) (this.j + this.h);
        int i2 = (int) (this.k + this.i);
        View view = c76Var.m;
        if (Math.abs(i2 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.u;
            if (arrayList == null) {
                this.u = new ArrayList();
                this.v = new ArrayList();
            } else {
                arrayList.clear();
                this.v.clear();
            }
            int iRound = Math.round(this.j + this.h);
            int iRound2 = Math.round(this.k + this.i);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i3 = (iRound + width) / 2;
            int i4 = (iRound2 + height) / 2;
            androidx.recyclerview.widget.a layoutManager = this.r.getLayoutManager();
            int iG = layoutManager.G();
            int i5 = 0;
            while (i5 < iG) {
                char c2 = c;
                View viewF = layoutManager.F(i5);
                if (viewF != view && viewF.getBottom() >= iRound2 && viewF.getTop() <= height && viewF.getRight() >= iRound && viewF.getLeft() <= width) {
                    c76 c76VarL = this.r.L(viewF);
                    int iAbs5 = Math.abs(i3 - ((viewF.getRight() + viewF.getLeft()) / 2));
                    int iAbs6 = Math.abs(i4 - ((viewF.getBottom() + viewF.getTop()) / 2));
                    int i6 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    int size = this.u.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size) {
                        int i9 = size;
                        if (i6 <= ((Integer) this.v.get(i7)).intValue()) {
                            break;
                        }
                        i8++;
                        i7++;
                        size = i9;
                    }
                    this.u.add(i8, c76VarL);
                    this.v.add(i8, Integer.valueOf(i6));
                }
                i5++;
                c = c2;
                i = i;
                i2 = i2;
            }
            int i10 = i;
            int i11 = i2;
            ArrayList arrayList2 = this.u;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i10;
            int height2 = view.getHeight() + i11;
            int left2 = i10 - view.getLeft();
            int top2 = i11 - view.getTop();
            int size2 = arrayList2.size();
            c76 c76Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size2; i13++) {
                c76 c76Var3 = (c76) arrayList2.get(i13);
                if (left2 > 0 && (right = c76Var3.m.getRight() - width2) < 0 && c76Var3.m.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    c76Var2 = c76Var3;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = c76Var3.m.getLeft() - i10) > 0 && c76Var3.m.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    c76Var2 = c76Var3;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = c76Var3.m.getTop() - i11) > 0 && c76Var3.m.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    c76Var2 = c76Var3;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = c76Var3.m.getBottom() - height2) < 0 && c76Var3.m.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    c76Var2 = c76Var3;
                    i12 = iAbs;
                }
            }
            if (c76Var2 == null) {
                this.u.clear();
                this.v.clear();
            } else {
                c76Var2.b();
                c76Var.b();
                this.r.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.ae] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.c76] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.ae] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.ae] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p(c76 c76Var, int i) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        c76 c76Var2;
        boolean z2;
        ?? r4;
        int iJ;
        char c;
        float fSignum;
        Object obj;
        long j;
        if (c76Var == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        byte b = this.n;
        k(c76Var, true);
        this.n = i;
        if (i == 2) {
            if (c76Var == null) {
                hk0.g("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = c76Var.m;
        }
        int i2 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.c;
        ?? r0 = this.m;
        if (r2 != 0) {
            View view = r2.m;
            if (view.getParent() != null) {
                if (b == 2 || this.n == 2) {
                    iJ = 0;
                } else {
                    int iH = r0.h(this.r, r2);
                    int iD = (ae.d(iH, this.r.getLayoutDirection()) & 65280) >> 8;
                    if (iD == 0) {
                        iJ = 0;
                    } else {
                        int i3 = (iH & 65280) >> 8;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            iJ = h(iD);
                            if (iJ <= 0) {
                                iJ = j(iD);
                                if (iJ <= 0) {
                                    iJ = 0;
                                }
                            } else if ((i3 & iJ) == 0) {
                                iJ = ae.e(iJ, this.r.getLayoutDirection());
                            }
                        } else {
                            iJ = j(iD);
                            if (iJ <= 0) {
                                iJ = h(iD);
                                if (iJ <= 0) {
                                    iJ = 0;
                                } else if ((i3 & iJ) == 0) {
                                    iJ = ae.e(iJ, this.r.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iJ == 1 || iJ == 2) {
                    c = 0;
                    fSignum = Math.signum(this.i) * this.r.getHeight();
                    obj = null;
                } else if (iJ == 4 || iJ == 8 || iJ == 16 || iJ == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.h) * this.r.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (b == 2) {
                    c2 = '\b';
                } else if (iJ > 0) {
                    c2 = 2;
                }
                float[] fArr = this.b;
                m(fArr);
                char c3 = c2;
                ?? r15 = c;
                in3 in3Var = new in3(this, r2, b, fArr[c], fArr[1], fSignum2, fSignum, iJ, r2);
                i66 itemAnimator = this.r.getItemAnimator();
                if (itemAnimator == null) {
                    j = c3 == '\b' ? 200L : 250L;
                } else {
                    j = c3 == '\b' ? itemAnimator.e : itemAnimator.d;
                }
                ValueAnimator valueAnimator = in3Var.g;
                valueAnimator.setDuration(j);
                this.p.add(in3Var);
                r2.o(r15);
                valueAnimator.start();
                r4 = r0;
                z2 = true;
                c76Var2 = null;
                r14 = r15;
            } else {
                r14 = 0;
                if (view == this.w) {
                    c76Var2 = null;
                    this.w = null;
                } else {
                    c76Var2 = null;
                }
                ?? r5 = r0;
                r5.c(this.r, r2);
                z2 = false;
                r4 = r5;
            }
            this.c = c76Var2;
            z = z2;
            r3 = r4;
            r12 = r14;
        } else {
            r3 = r0;
            r12 = 0;
            z = false;
        }
        if (c76Var != null) {
            View view2 = c76Var.m;
            RecyclerView recyclerView = this.r;
            this.f1385o = (ae.d(r3.h(recyclerView, c76Var), recyclerView.getLayoutDirection()) & i2) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = c76Var;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.r.getParent();
        if (parent != 0) {
            if (this.c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.r.getLayoutManager().r = true;
        }
        c76 c76Var3 = this.c;
        if (c76Var3 != null) {
            c76Var3.m.getClass();
        }
        this.r.invalidate();
    }

    public final void q(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.d;
        this.h = fMax;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.h = fMax;
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
}
