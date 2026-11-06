package com.teamviewer.remotecontrolviewlib.preferences;

import android.R;
import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import kotlin.Metadata;
import o.dr5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/preferences/MarkupPreference;", "Landroidx/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MarkupPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void k(dr5 dr5Var) {
        super.k(dr5Var);
        TextView textView = (TextView) dr5Var.m.findViewById(R.id.summary);
        if (textView != null) {
            Context context = this.m;
            String string = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.tv_lock_privacy_explainer);
            string.getClass();
            String string2 = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.tv_lock_privacy_detail);
            string2.getClass();
            String string3 = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.tv_lock_privacy_detail_content, string2);
            string3.getClass();
            textView.setText(Html.fromHtml(string + " " + string3, 0));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
