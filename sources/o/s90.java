package o;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s90 extends ss {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public q90 B;
    public BottomSheetBehavior s;
    public FrameLayout t;
    public CoordinatorLayout u;
    public FrameLayout v;
    public boolean w;
    public boolean x;
    public boolean y;
    public r90 z;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        l();
        super.cancel();
    }

    public final void k() {
        if (this.t == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.t = frameLayout;
            this.u = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.t.findViewById(R.id.design_bottom_sheet);
            this.v = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorX = BottomSheetBehavior.x(frameLayout2);
            this.s = bottomSheetBehaviorX;
            q90 q90Var = this.B;
            ArrayList arrayList = bottomSheetBehaviorX.P;
            if (!arrayList.contains(q90Var)) {
                arrayList.add(q90Var);
            }
            this.s.z(this.w);
        }
    }

    public final BottomSheetBehavior l() {
        if (this.s == null) {
            k();
        }
        return this.s;
    }

    public final FrameLayout m(View view, int i, ViewGroup.LayoutParams layoutParams) {
        k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.t.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.A) {
            FrameLayout frameLayout = this.v;
            df6 df6Var = new df6((Object) this, (byte) 28);
            WeakHashMap weakHashMap = be8.a;
            sd8.c(frameLayout, df6Var);
        }
        this.v.removeAllViews();
        FrameLayout frameLayout2 = this.v;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new o6(this, (byte) 2));
        be8.m(this.v, new z30(this, (byte) 1));
        this.v.setOnTouchListener(new d40((byte) 1));
        return this.t;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.A && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.t;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.u;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // o.ss, o.py0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // o.py0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.s;
        if (bottomSheetBehavior == null || bottomSheetBehavior.F != 5) {
            return;
        }
        bottomSheetBehavior.B(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.w != z) {
            this.w = z;
            BottomSheetBehavior bottomSheetBehavior = this.s;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.z(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.w) {
            this.w = true;
        }
        this.x = z;
        this.y = true;
    }

    @Override // o.ss, o.py0, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(m(view, 0, null));
    }

    @Override // o.ss, o.py0, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(m(null, i, null));
    }

    @Override // o.ss, o.py0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m(view, 0, layoutParams));
    }
}
