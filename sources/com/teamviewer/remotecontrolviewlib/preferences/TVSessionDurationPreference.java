package com.teamviewer.remotecontrolviewlib.preferences;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewerlib.preference.ViewModelStoreOwnerPreference;
import kotlin.Metadata;
import o.bf1;
import o.c36;
import o.dl5;
import o.du6;
import o.ez4;
import o.gd3;
import o.h57;
import o.hk0;
import o.kl7;
import o.mo7;
import o.p;
import o.pn5;
import o.q26;
import o.qs1;
import o.v26;
import o.ve8;
import o.w86;
import o.wt3;
import o.zt6;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/preferences/TVSessionDurationPreference;", "Lcom/teamviewer/teamviewerlib/preference/ViewModelStoreOwnerPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TVSessionDurationPreference extends ViewModelStoreOwnerPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionDurationPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.Preference
    public final void i() {
        gd3 gd3Var;
        du6 du6VarT;
        super.i();
        Context context = this.m;
        context.getClass();
        LifecycleOwner lifecycleOwnerV = qs1.V(context);
        if (lifecycleOwnerV != null) {
            c36 c36Var = zu1.c;
            if (c36Var == null) {
                hk0.g("Required value was null.");
                return;
            }
            mo7 mo7Var = ((zt6) c36Var.f).f;
            ve8 ve8Var = this.Y;
            if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
                dl5 dl5Var = new dl5(new q26(c36Var, (byte) 6), (byte) 2);
                bf1 bf1VarK = h57.k(this);
                ve8Var.getClass();
                bf1VarK.getClass();
                pn5 pn5Var = new pn5(ve8Var, dl5Var, bf1VarK);
                wt3 wt3VarB = w86.a.b(kl7.class);
                String strC = wt3VarB.c();
                if (strC == null) {
                    hk0.g("Local and anonymous classes can not be ViewModels");
                    return;
                }
                gd3Var = (gd3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            } else {
                dl5 dl5Var2 = new dl5(new v26(mo7Var, (byte) 1), (byte) 2);
                bf1 bf1VarK2 = h57.k(this);
                ve8Var.getClass();
                bf1VarK2.getClass();
                pn5 pn5Var2 = new pn5(ve8Var, dl5Var2, bf1VarK2);
                wt3 wt3VarB2 = w86.a.b(ez4.class);
                String strC2 = wt3VarB2.c();
                if (strC2 == null) {
                    hk0.g("Local and anonymous classes can not be ViewModels");
                    return;
                }
                gd3Var = (gd3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
            }
            gd3Var.Y().observe(lifecycleOwnerV, new p(this, (byte) 17));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionDurationPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionDurationPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionDurationPreference(Context context) {
        super(context);
        context.getClass();
    }
}
