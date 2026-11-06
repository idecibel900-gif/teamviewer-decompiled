package o;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class d12 extends py0 {
    public Function0 q;
    public a12 r;
    public final View s;
    public final y02 t;
    public boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d12(Function0 function0, a12 a12Var, View view, j04 j04Var, in1 in1Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        boolean z = false;
        this.q = function0;
        this.r = a12Var;
        this.s = view;
        Window window = getWindow();
        if (window == null) {
            hk0.l("Dialog has no window");
            throw null;
        }
        a12 a12Var2 = this.r;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            a12Var2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        byte b = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.r.getClass();
        n67.r(window, true);
        window.setGravity(17);
        this.r.getClass();
        y02 y02Var = new y02(getContext(), window);
        this.r.getClass();
        setTitle("");
        y02Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        y02Var.setClipChildren(false);
        y02Var.setElevation(in1Var.d0(8.0f));
        y02Var.setOutlineProvider(new c12((byte) 0));
        this.t = y02Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            i(viewGroup);
        }
        setContentView(y02Var);
        y02Var.setTag(R.id.view_tree_lifecycle_owner, n67.l(view));
        y02Var.setTag(R.id.view_tree_view_model_store_owner, v67.i(view));
        y02Var.setTag(R.id.view_tree_saved_state_registry_owner, o67.j(view));
        j(this.q, this.r, j04Var);
        o75 o75VarC = c();
        bi biVar = new bi(this, b);
        o75VarC.getClass();
        o75VarC.a(this, new r10((byte) 8, biVar, z));
    }

    public static final void i(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof y02) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                i(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void j(Function0 function0, a12 a12Var, j04 j04Var) {
        int i;
        this.q = function0;
        this.r = a12Var;
        hn6 hn6Var = a12Var.c;
        boolean zB = gk.b(this.s);
        int iOrdinal = hn6Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    gk0.s();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = j04Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                gk0.s();
                return;
            }
            i = 1;
        }
        y02 y02Var = this.t;
        y02Var.setLayoutDirection(i);
        boolean z = a12Var.d;
        Window window2 = y02Var.v;
        boolean z2 = (y02Var.z && z == y02Var.x && true == y02Var.y) ? false : true;
        y02Var.x = z;
        y02Var.y = true;
        if (z2) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z ? -2 : -1;
            if (i2 != attributes.width || !y02Var.z) {
                window2.setLayout(i2, -2);
                y02Var.z = true;
            }
        }
        setCanceledOnTouchOutside(a12Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.r.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.q.a();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iS0;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.r.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.u = false;
            return zOnTouchEvent;
        }
        y02 y02Var = this.t;
        y02Var.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = y02Var.getChildAt(0)) != null) {
            int left = childAt.getLeft() + y02Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + y02Var.getTop();
            int height = childAt.getHeight() + top;
            int iS1 = vn4.s0(motionEvent.getX());
            if (left <= iS1 && iS1 <= width && top <= (iS0 = vn4.s0(motionEvent.getY())) && iS0 <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.u = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.u = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.u = false;
                return zOnTouchEvent;
            }
        } else if (this.u) {
            this.q.a();
            this.u = false;
            return true;
        }
        return zOnTouchEvent;
    }
}
