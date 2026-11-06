package com.teamviewer.remotecontrolviewlib.preferences;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.teamviewer.teamviewerlib.preference.ViewModelStoreOwnerPreference;
import kotlin.Metadata;
import o.c36;
import o.hk0;
import o.k72;
import o.p;
import o.qs1;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/preferences/DyngateIDPreference;", "Lcom/teamviewer/teamviewerlib/preference/ViewModelStoreOwnerPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DyngateIDPreference extends ViewModelStoreOwnerPreference {
    public final k72 Z;
    public final Observer a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DyngateIDPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        this.Z = c36Var.h(this);
        this.a0 = new p(this, (byte) 2);
    }

    @Override // androidx.preference.Preference
    public final void i() {
        super.i();
        Context context = this.m;
        context.getClass();
        LifecycleOwner lifecycleOwnerV = qs1.V(context);
        if (lifecycleOwnerV != null) {
            this.Z.f1234o.observe(lifecycleOwnerV, this.a0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DyngateIDPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.h(this);
            this.a0 = new p(this, (byte) 2);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DyngateIDPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.h(this);
            this.a0 = new p(this, (byte) 2);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DyngateIDPreference(Context context) {
        super(context);
        context.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.h(this);
            this.a0 = new p(this, (byte) 2);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }
}
