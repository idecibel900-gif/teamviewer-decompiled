package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class yo5 extends u0 {
    public static final le5 P = new le5((byte) 7);
    public final el5 A;
    public final WindowManager B;
    public final WindowManager.LayoutParams C;
    public bp5 D;
    public j04 E;
    public final bg5 F;
    public final bg5 G;
    public zk3 H;
    public final eo1 I;
    public final Rect J;
    public final br5 K;
    public iq L;
    public final bg5 M;
    public boolean N;
    public final int[] O;
    public Function0 v;
    public cp5 w;
    public String x;
    public final View y;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo5(Function0 function0, cp5 cp5Var, String str, View view, in1 in1Var, bp5 bp5Var, UUID uuid, boolean z) {
        super(view.getContext(), null);
        int i = Build.VERSION.SDK_INT;
        byte b = 1;
        el5 ap5Var = i >= 30 ? new ap5(b) : i >= 29 ? new zo5(b) : new el5(b);
        this.v = function0;
        this.w = cp5Var;
        this.x = str;
        this.y = view;
        this.z = z;
        this.A = ap5Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.B = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        cp5 cp5Var2 = this.w;
        boolean zB = gk.b(view);
        boolean z2 = cp5Var2.b;
        int i2 = cp5Var2.a;
        if (z2 && zB) {
            i2 |= 8192;
        } else if (z2 && !zB) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.w.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.C = layoutParams;
        this.D = bp5Var;
        this.E = j04.m;
        this.F = h57.p(null);
        this.G = h57.p(null);
        this.I = d57.b(new vm3((Object) this, (byte) 24));
        this.J = new Rect();
        this.K = new br5(new ak(this, (byte) 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, n67.l(view));
        setTag(R.id.view_tree_view_model_store_owner, v67.i(view));
        setTag(R.id.view_tree_saved_state_registry_owner, o67.j(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(in1Var.d0(8.0f));
        setOutlineProvider(new c12((byte) 2));
        this.M = h57.p(mo8.c);
        this.O = new int[2];
    }

    private final hw2 getContent() {
        return (hw2) this.M.getValue();
    }

    private final zk3 getDisplayBounds() {
        int i = this.w.a & 512;
        View view = this.y;
        Rect rect = this.J;
        el5 el5Var = this.A;
        if (i == 0) {
            el5Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            el5Var.e(view, rect);
        }
        return new zk3(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    private final i04 getParentLayoutCoordinates() {
        return (i04) this.G.getValue();
    }

    public static final boolean l(yo5 yo5Var) {
        i04 parentLayoutCoordinates = yo5Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.m()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || yo5Var.m37getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(hw2 hw2Var) {
        this.M.setValue(hw2Var);
    }

    private final void setParentLayoutCoordinates(i04 i04Var) {
        this.G.setValue(i04Var);
    }

    @Override // o.u0
    public final void a(int i, ux2 ux2Var) {
        ux2Var.Y(-857613600);
        int i2 = (ux2Var.h(this) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gg4((byte) 7, i, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.w.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.v;
                if (function0 != null) {
                    function0.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.u0
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.w.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.C;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.A.getClass();
        this.B.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.I.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.C;
    }

    public final j04 getParentLayoutDirection() {
        return this.E;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final dl3 m37getPopupContentSizebOM6tXw() {
        return (dl3) this.F.getValue();
    }

    public final bp5 getPositionProvider() {
        return this.D;
    }

    @Override // o.u0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.N;
    }

    public u0 getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.x;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // o.u0
    public final void h(int i, int i2) {
        this.w.getClass();
        zk3 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.f(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.c(), Integer.MIN_VALUE));
    }

    public final void m(n01 n01Var, hw2 hw2Var) {
        setParentCompositionContext(n01Var);
        setContent(hw2Var);
        this.N = true;
    }

    public final void n(Function0 function0, cp5 cp5Var, String str, j04 j04Var) {
        int i;
        this.v = function0;
        this.x = str;
        if (!im3.n(this.w, cp5Var)) {
            cp5Var.getClass();
            this.w = cp5Var;
            boolean zB = gk.b(this.y);
            boolean z = cp5Var.b;
            int i2 = cp5Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.C;
            layoutParams.flags = i2;
            this.A.getClass();
            this.B.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = j04Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void o() {
        i04 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.m()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long j = parentLayoutCoordinates.j();
            long jA = this.z ? parentLayoutCoordinates.A(0L) : parentLayoutCoordinates.e(0L);
            zk3 zk3VarE = vs1.e((((long) Math.round(Float.intBitsToFloat((int) (jA >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jA & 4294967295L))))), j);
            if (zk3VarE.equals(this.H)) {
                return;
            }
            this.H = zk3VarE;
            q();
        }
    }

    @Override // o.u0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.g();
        if (!this.w.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        iq iqVar = this.L;
        if (iqVar == null) {
            iq iqVar2 = new iq(this.v, (byte) 0);
            this.L = iqVar2;
            iqVar = iqVar2;
        }
        c4.m(this, iqVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        br5 br5Var = this.K;
        ar arVar = (ar) br5Var.i;
        if (arVar != null) {
            arVar.n();
        }
        br5Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            c4.n(this, this.L);
        }
        this.L = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.w.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.v;
            if (function0 != null) {
                function0.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function1 = this.v;
            if (function1 != null) {
                function1.a();
            }
        }
        return true;
    }

    public final void p(i04 i04Var) {
        setParentLayoutCoordinates(i04Var);
        o();
    }

    public final void q() {
        dl3 dl3VarM37getPopupContentSizebOM6tXw;
        final zk3 zk3Var = this.H;
        if (zk3Var == null || (dl3VarM37getPopupContentSizebOM6tXw = m37getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = dl3VarM37getPopupContentSizebOM6tXw.a;
        zk3 displayBounds = getDisplayBounds();
        final long jC = (((long) displayBounds.c()) & 4294967295L) | (((long) displayBounds.f()) << 32);
        final j76 j76Var = new j76();
        j76Var.m = 0L;
        this.K.f(this, P, new Function0() { // from class: o.xo5
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                yo5 yo5Var = this;
                j76Var.m = yo5Var.D.f(jC, j, zk3Var, yo5Var.E);
                return f88.a;
            }
        });
        long j2 = j76Var.m;
        WindowManager.LayoutParams layoutParams = this.C;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.w.e;
        el5 el5Var = this.A;
        if (z) {
            el5Var.i(this, (int) (jC >> 32), (int) (jC & 4294967295L));
        }
        el5Var.getClass();
        this.B.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(j04 j04Var) {
        this.E = j04Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m38setPopupContentSizefhxjrPA(dl3 dl3Var) {
        this.F.setValue(dl3Var);
    }

    public final void setPositionProvider(bp5 bp5Var) {
        this.D = bp5Var;
    }

    public final void setTestTag(String str) {
        this.x = str;
    }
}
