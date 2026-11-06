package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class lp4 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, fq4 {
    public gd7 m;
    public od n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xb4 f1391o;

    @Override // o.fq4
    public final void b(jp4 jp4Var, boolean z) {
        od odVar;
        if ((z || jp4Var == this.m) && (odVar = this.n) != null) {
            odVar.dismiss();
        }
    }

    @Override // o.fq4
    public final boolean m0(jp4 jp4Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        gd7 gd7Var = this.m;
        xb4 xb4Var = this.f1391o;
        wb4 wb4Var = xb4Var.r;
        if (wb4Var == null) {
            wb4Var = new wb4(xb4Var);
            xb4Var.r = wb4Var;
        }
        gd7Var.s(wb4Var.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1391o.b(this.m, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        gd7 gd7Var = this.m;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.n.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.n.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                gd7Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return gd7Var.performShortcut(i, keyEvent, 0);
    }
}
