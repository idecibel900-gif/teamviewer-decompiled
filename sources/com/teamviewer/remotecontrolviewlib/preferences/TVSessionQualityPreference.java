package com.teamviewer.remotecontrolviewlib.preferences;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewerlib.preference.ViewModelStoreOwnerPreference;
import kotlin.Metadata;
import o.a7;
import o.b6;
import o.c36;
import o.hd3;
import o.hk0;
import o.hk7;
import o.ll7;
import o.nw4;
import o.xt2;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/preferences/TVSessionQualityPreference;", "Lcom/teamviewer/teamviewerlib/preference/ViewModelStoreOwnerPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TVSessionQualityPreference extends ViewModelStoreOwnerPreference {
    public final hd3 Z;
    public final hk7 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionQualityPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        this.Z = c36Var.l(this);
        this.a0 = new b6(this, (byte) 11);
        y();
    }

    @Override // androidx.preference.Preference
    public final void l() {
        Context context = this.m;
        context.getClass();
        ll7 ll7Var = new ll7(this, (byte) 0);
        this.Z.X((xt2) context, ll7Var);
    }

    public final void y() {
        nw4 nw4VarN = this.Z.n();
        Object obj = this.m;
        obj.getClass();
        nw4VarN.observe((LifecycleOwner) obj, new a7(new ll7(this, (byte) 1), (byte) 15));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionQualityPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.l(this);
            this.a0 = new b6(this, (byte) 11);
            y();
            return;
        }
        hk0.g("Required value was null.");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionQualityPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.l(this);
            this.a0 = new b6(this, (byte) 11);
            y();
            return;
        }
        hk0.g("Required value was null.");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVSessionQualityPreference(Context context) {
        super(context);
        context.getClass();
        c36 c36Var = zu1.c;
        if (c36Var != null) {
            this.Z = c36Var.l(this);
            this.a0 = new b6(this, (byte) 11);
            y();
            return;
        }
        hk0.g("Required value was null.");
        throw null;
    }
}
