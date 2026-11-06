package o;

import android.view.View;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class ch {
    public static final ch a = new ch();

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
