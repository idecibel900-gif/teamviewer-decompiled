package com.teamviewer.commonresourcelib.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.preference.Preference;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import kotlin.Metadata;
import o.el5;
import o.hy;
import o.lh7;
import o.n02;
import o.n37;
import o.nd;
import o.ov6;
import o.r47;
import o.xk1;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/teamviewer/commonresourcelib/preferences/VersionPreference;", "Landroidx/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "CommonResourceLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VersionPreference extends Preference {
    public nd Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        context.getClass();
        y();
        y();
    }

    @Override // androidx.preference.Preference
    public final void l() {
        nd ndVar = this.Y;
        ndVar.getClass();
        int i = ndVar.n + 1;
        ndVar.n = i;
        if (i >= 3) {
            ndVar.n = 0;
            Context context = this.m;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            layoutInflaterFrom.getClass();
            View viewInflate = layoutInflaterFrom.inflate(R.layout.dialog_attraction_guid, (ViewGroup) null, false);
            EditText editText = (EditText) r47.s(viewInflate, R.id.attraction_guid);
            if (editText == null) {
                yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.attraction_guid)));
                return;
            }
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            xk1 xk1Var = new xk1(frameLayout, editText, (byte) 7);
            this.Y.getClass();
            editText.setText(Settings.d(ov6.P_MID_ATTRACTION_GUID));
            context.getClass();
            n02 n02Var = new n02(context);
            n02Var.s = true;
            CharSequence text = context.getText(R.string.tv_attraction_guid);
            text.getClass();
            n02Var.d = text;
            frameLayout.getClass();
            n02Var.g = frameLayout;
            n02Var.h = 0;
            n02Var.i = true;
            String string = context.getString(R.string.tv_ok);
            string.getClass();
            lh7 lh7Var = new lh7(this, xk1Var, (byte) 9);
            n02Var.q = string;
            n02Var.r = lh7Var;
            String string2 = context.getString(R.string.tv_cancel);
            string2.getClass();
            el5 el5Var = new el5((byte) 16);
            n02Var.n = string2;
            n02Var.f1529o = el5Var;
            n02Var.a().show();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    public final void y() {
        String str;
        if (n37.b) {
            str = "QS";
        } else if (n37.c) {
            str = "HM";
        } else if (n37.a) {
            str = "CL";
        } else if (n37.d) {
            str = "AR";
        } else if (n37.e) {
            str = "PL";
        } else {
            str = "CL";
        }
        v("15.83.298 ".concat(str));
        this.Y = new nd(new hy(), (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        y();
        y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        y();
        y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionPreference(Context context) {
        super(context, null);
        context.getClass();
        y();
        y();
    }
}
