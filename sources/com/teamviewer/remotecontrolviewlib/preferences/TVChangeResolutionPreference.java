package com.teamviewer.remotecontrolviewlib.preferences;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.preference.ViewModelStoreOwnerPreference;
import kotlin.Metadata;
import o.a7;
import o.b6;
import o.bd3;
import o.c36;
import o.ct1;
import o.fc4;
import o.hk0;
import o.hk7;
import o.p02;
import o.qs1;
import o.r02;
import o.xk1;
import o.y46;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/preferences/TVChangeResolutionPreference;", "Lcom/teamviewer/teamviewerlib/preference/ViewModelStoreOwnerPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TVChangeResolutionPreference extends ViewModelStoreOwnerPreference {
    public final bd3 Z;
    public final hk7 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVChangeResolutionPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        this.Z = c36Var.c(this);
        this.a0 = new b6(this, (byte) 10);
    }

    @Override // androidx.preference.Preference
    public final void i() {
        super.i();
        Context context = this.m;
        context.getClass();
        LifecycleOwner lifecycleOwnerV = qs1.V(context);
        if (lifecycleOwnerV != null) {
            this.Z.n().observe(lifecycleOwnerV, new a7(new y46(this, (byte) 26), (byte) 12));
        }
    }

    @Override // androidx.preference.Preference
    public final void l() {
        fc4 fc4VarK0 = this.Z.k0();
        if (fc4VarK0 != null) {
            fc4VarK0.F0 = R.string.tv_resolution;
            fc4VarK0.K0 = R.string.tv_ok;
            fc4VarK0.O0 = R.string.tv_cancel;
            xk1 xk1Var = ct1.a;
            if (xk1Var != null) {
                xk1.M(this.a0, new r02(fc4VarK0, p02.Positive));
            }
            if (xk1Var != null) {
                xk1Var.L(fc4VarK0);
            }
            fc4VarK0.N0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVChangeResolutionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.c(this);
            this.a0 = new b6(this, (byte) 10);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVChangeResolutionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.c(this);
            this.a0 = new b6(this, (byte) 10);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVChangeResolutionPreference(Context context) {
        super(context);
        context.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.c(this);
            this.a0 = new b6(this, (byte) 10);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }
}
