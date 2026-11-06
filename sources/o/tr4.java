package o;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tr4 extends py0 {
    public Function0 q;
    public xr4 r;
    public long s;
    public final View t;
    public final sr4 u;

    public tr4(Function0 function0, xr4 xr4Var, long j, View view, j04 j04Var, in1 in1Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.q = function0;
        this.r = xr4Var;
        this.s = j;
        this.t = view;
        Window window = getWindow();
        if (window == null) {
            hk0.l("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        n67.r(window, false);
        sr4 sr4Var = new sr4(getContext());
        sr4Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        sr4Var.setClipChildren(false);
        sr4Var.setElevation(in1Var.d0(8.0f));
        sr4Var.setOutlineProvider(new c12((byte) 1));
        this.u = sr4Var;
        setContentView(sr4Var);
        sr4Var.setTag(R.id.view_tree_lifecycle_owner, n67.l(view));
        sr4Var.setTag(R.id.view_tree_view_model_store_owner, v67.i(view));
        sr4Var.setTag(R.id.view_tree_saved_state_registry_owner, o67.j(view));
        i(this.q, this.r, this.s, j04Var);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void i(Function0 function0, xr4 xr4Var, long j, j04 j04Var) {
        int i;
        x67 tk8Var;
        this.q = function0;
        this.r = xr4Var;
        this.s = j;
        xr4Var.getClass();
        ViewGroup.LayoutParams layoutParams = this.t.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal = j04Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
            i = 1;
        }
        this.u.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
        Window window4 = getWindow();
        window4.getClass();
        Window window5 = getWindow();
        window5.getClass();
        l07 l07Var = new l07(window5.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            tk8Var = new vk8(window4, l07Var, (byte) 1);
        } else {
            tk8Var = i2 >= 30 ? new tk8(window4, l07Var, (byte) 1) : new tk8(window4, l07Var, (byte) 0);
        }
        tk8Var.v(ep1.u(j));
        tk8Var.u(ep1.u(j));
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.q.a();
        }
        return zOnTouchEvent;
    }
}
