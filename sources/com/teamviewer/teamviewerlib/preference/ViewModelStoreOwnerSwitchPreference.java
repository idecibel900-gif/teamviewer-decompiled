package com.teamviewer.teamviewerlib.preference;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import kotlin.Metadata;
import o.ve8;
import o.we8;
import o.xt2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/teamviewer/teamviewerlib/preference/ViewModelStoreOwnerSwitchPreference;", "Lo/we8;", "Landroidx/preference/SwitchPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class ViewModelStoreOwnerSwitchPreference extends SwitchPreference implements we8 {
    public final ve8 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelStoreOwnerSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        Context baseContext = new ContextWrapper(this.m).getBaseContext();
        baseContext.getClass();
        this.g0 = ((xt2) baseContext).getG0();
    }

    @Override // androidx.preference.Preference
    public final void m() {
        super.m();
        this.g0.a();
    }

    @Override // o.we8
    /* JADX INFO: renamed from: o, reason: from getter */
    public final ve8 getG0() {
        return this.g0;
    }

    public ViewModelStoreOwnerSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context baseContext = new ContextWrapper(context).getBaseContext();
        baseContext.getClass();
        this.g0 = ((xt2) baseContext).getG0();
    }

    public ViewModelStoreOwnerSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        Context baseContext = new ContextWrapper(context).getBaseContext();
        baseContext.getClass();
        this.g0 = ((xt2) baseContext).getG0();
    }

    public ViewModelStoreOwnerSwitchPreference(Context context) {
        super(context, null);
        Context baseContext = new ContextWrapper(this.m).getBaseContext();
        baseContext.getClass();
        this.g0 = ((xt2) baseContext).getG0();
    }
}
