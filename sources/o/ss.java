package o;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public class ss extends py0 implements bs {
    public qs q;
    public final rs r;

    /* JADX WARN: Type inference failed for: r2v2, types: [o.rs] */
    public ss(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.r = new ex3() { // from class: o.rs
            @Override // o.ex3
            public final boolean s(KeyEvent keyEvent) {
                return this.m.j(keyEvent);
            }
        };
        hs hsVarI = i();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((qs) hsVarI).d0 = i;
        hsVarI.e();
    }

    @Override // o.py0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        qs qsVar = (qs) i();
        qsVar.w();
        ((ViewGroup) qsVar.L.findViewById(android.R.id.content)).addView(view, layoutParams);
        qsVar.y.a(qsVar.x.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        i().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return xo1.J(this.r, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        qs qsVar = (qs) i();
        qsVar.w();
        return qsVar.x.findViewById(i);
    }

    public final hs i() {
        qs qsVar = this.q;
        if (qsVar != null) {
            return qsVar;
        }
        gs gsVar = hs.m;
        qs qsVar2 = new qs(getContext(), getWindow(), this, this);
        this.q = qsVar2;
        return qsVar2;
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        i().c();
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.py0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        i().b();
        super.onCreate(bundle);
        i().e();
    }

    @Override // o.py0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        qs qsVar = (qs) i();
        qsVar.A();
        ck3 ck3Var = qsVar.z;
        if (ck3Var != null) {
            ck3Var.q0(false);
        }
    }

    @Override // o.py0, android.app.Dialog
    public void setContentView(int i) {
        f();
        i().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        i().m(getContext().getString(i));
    }

    @Override // o.py0, android.app.Dialog
    public void setContentView(View view) {
        f();
        i().k(view);
    }

    @Override // o.py0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        i().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        i().m(charSequence);
    }
}
