package o;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class tm7 {
    public int a;
    public View b;
    public TabLayout c;
    public vm7 d;

    public final void a() {
        TabLayout tabLayout = this.c;
        if (tabLayout != null) {
            tabLayout.i(this);
        } else {
            hk0.g("Tab not attached to a TabLayout");
        }
    }

    public final void b() {
        vm7 vm7Var = this.d;
        if (vm7Var != null) {
            vm7Var.d();
        }
    }
}
