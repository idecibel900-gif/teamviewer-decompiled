package o;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class gp5 {
    public final bg5 a;
    public final bg5 b;

    public gp5() {
        Boolean bool = Boolean.FALSE;
        this.a = h57.p(bool);
        this.b = h57.p(bool);
    }

    public final void a(z7 z7Var) {
        Intent intent = z7Var.n;
        if (z7Var.m == -1) {
            if (intent != null && intent.getBooleanExtra("active_license", false)) {
                this.b.setValue(Boolean.TRUE);
            }
            if (intent == null || !intent.getBooleanExtra("purchase_successful", false)) {
                return;
            }
            this.a.setValue(Boolean.TRUE);
        }
    }

    public final void b(Bundle bundle) {
        bundle.putBoolean("show_active_license", ((Boolean) this.a.getValue()).booleanValue());
        bundle.putBoolean("show_success_message", ((Boolean) this.b.getValue()).booleanValue());
    }

    public final void c(Bundle bundle, ComposeView composeView) {
        byte b = 0;
        if (bundle != null) {
            this.a.setValue(Boolean.valueOf(bundle.getBoolean("show_success_message", false)));
            this.b.setValue(Boolean.valueOf(bundle.getBoolean("show_active_license", false)));
        }
        composeView.setContent(new yy0(-1265571848, true, new ep5(this, b)));
    }
}
