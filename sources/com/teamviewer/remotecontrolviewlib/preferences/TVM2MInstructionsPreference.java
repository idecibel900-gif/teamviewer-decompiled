package com.teamviewer.remotecontrolviewlib.preferences;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import kotlin.Metadata;
import o.im3;
import o.it1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/preferences/TVM2MInstructionsPreference;", "Landroidx/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TVM2MInstructionsPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVM2MInstructionsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.Preference
    public final void l() {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        Context context = this.m;
        Intent intent = new Intent(context, (Class<?>) M2MClientActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("extra_show_instructions_view", true);
        context.startActivity(intent);
    }
}
