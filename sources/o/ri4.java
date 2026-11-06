package o;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.teamviewer.libs.materialtoolbar.ToolbarViewMovable;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ KeyEvent.Callback n;

    public /* synthetic */ ri4(KeyEvent.Callback callback, byte b) {
        this.m = b;
        this.n = callback;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.m;
        KeyEvent.Callback callback = this.n;
        switch (b) {
            case 0:
                M2MClientActivity m2MClientActivity = (M2MClientActivity) callback;
                int i = M2MClientActivity.h0;
                Rect rect = new Rect();
                View decorView = m2MClientActivity.getWindow().getDecorView();
                decorView.getClass();
                decorView.getWindowVisibleDisplayFrame(rect);
                int height = (decorView.getHeight() - rect.height()) - rect.top;
                if (height != m2MClientActivity.Q) {
                    View view = m2MClientActivity.R;
                    ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
                    RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.setMargins(0, 0, 0, height);
                    }
                    View view2 = m2MClientActivity.R;
                    if (view2 != null) {
                        view2.requestLayout();
                    }
                    m2MClientActivity.Q = height;
                    return;
                }
                return;
            case 1:
                PilotSessionActivity pilotSessionActivity = (PilotSessionActivity) callback;
                int i2 = PilotSessionActivity.U;
                Rect rect2 = new Rect();
                cj3 cj3Var = pilotSessionActivity.N;
                if (cj3Var == null) {
                    im3.e0("binding");
                    throw null;
                }
                ((ConstraintLayout) cj3Var.f531o).getWindowVisibleDisplayFrame(rect2);
                cj3 cj3Var2 = pilotSessionActivity.N;
                if (cj3Var2 == null) {
                    im3.e0("binding");
                    throw null;
                }
                int height2 = ((ConstraintLayout) cj3Var2.f531o).getRootView().getHeight() - (rect2.bottom - rect2.top);
                Rect rect3 = new Rect();
                pilotSessionActivity.getWindow().peekDecorView().getWindowVisibleDisplayFrame(rect3);
                int i3 = rect3.top;
                int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
                boolean z = height2 > i3 + (identifier != 0 ? Resources.getSystem().getDimensionPixelSize(identifier) : 0);
                if (pilotSessionActivity.S != z) {
                    if (!z) {
                        pilotSessionActivity.J();
                    } else if (Build.VERSION.SDK_INT >= 30) {
                        WindowInsetsController insetsController = pilotSessionActivity.getWindow().getInsetsController();
                        if (insetsController != null) {
                            insetsController.show(WindowInsets.Type.navigationBars() | WindowInsets.Type.statusBars());
                        }
                    } else {
                        pilotSessionActivity.getWindow().getDecorView().setSystemUiVisibility(0);
                    }
                }
                pilotSessionActivity.S = z;
                return;
            default:
                int i4 = ToolbarViewMovable.r;
                ((ToolbarViewMovable) callback).requestLayout();
                return;
        }
    }
}
