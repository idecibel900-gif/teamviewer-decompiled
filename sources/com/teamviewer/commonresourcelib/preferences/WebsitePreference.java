package com.teamviewer.commonresourcelib.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import kotlin.Metadata;
import o.lz5;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/commonresourcelib/preferences/WebsitePreference;", "Landroidx/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "CommonResourceLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WebsitePreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsitePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Context context2 = this.m;
        if (attributeSet == null) {
            yq4.r("This class is supposed to be used in a Preference XML");
            throw null;
        }
        this.C = false;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, lz5.a);
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, lz5.b);
        typedArrayObtainStyledAttributes2.getClass();
        String string2 = typedArrayObtainStyledAttributes2.getString(0);
        typedArrayObtainStyledAttributes2.recycle();
        Intent intent = new Intent();
        String packageName = context2.getPackageName();
        string.getClass();
        intent.setClassName(packageName, string);
        intent.putExtra("url", string2);
        intent.putExtra("title", this.s);
        this.x = intent;
    }
}
