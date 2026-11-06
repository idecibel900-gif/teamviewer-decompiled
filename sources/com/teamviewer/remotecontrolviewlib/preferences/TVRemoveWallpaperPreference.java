package com.teamviewer.remotecontrolviewlib.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Switch;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.preference.ViewModelStoreOwnerSwitchPreference;
import kotlin.Metadata;
import o.a7;
import o.c36;
import o.dr5;
import o.fd3;
import o.hk0;
import o.hl7;
import o.qs1;
import o.w60;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/preferences/TVRemoveWallpaperPreference;", "Lcom/teamviewer/teamviewerlib/preference/ViewModelStoreOwnerSwitchPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TVRemoveWallpaperPreference extends ViewModelStoreOwnerSwitchPreference {
    public final fd3 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVRemoveWallpaperPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.h0 = c36Var.k(this);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void k(dr5 dr5Var) {
        super.k(dr5Var);
        View view = dr5Var.m;
        view.getClass();
        Switch r6 = (Switch) view.findViewById(R.id.custom_switch);
        Context context = this.m;
        context.getClass();
        LifecycleOwner lifecycleOwnerV = qs1.V(context);
        if (lifecycleOwnerV != null) {
            this.h0.v0().observe(lifecycleOwnerV, new a7(new hl7(r6, (byte) 1), (byte) 14));
        }
        if (r6 != null) {
            r6.setOnCheckedChangeListener(new w60(this, (byte) 2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVRemoveWallpaperPreference(Context context) {
        super(context);
        context.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.h0 = c36Var.k(this);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVRemoveWallpaperPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.h0 = c36Var.k(this);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVRemoveWallpaperPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        attributeSet.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.h0 = c36Var.k(this);
        } else {
            hk0.g("Required value was null.");
            throw null;
        }
    }
}
