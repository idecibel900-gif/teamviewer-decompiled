package o;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class gc implements q22 {
    public final /* synthetic */ Window a;
    public final /* synthetic */ int b;

    public gc(Window window, int i) {
        this.a = window;
        this.b = i;
    }

    @Override // o.q22
    public final void a() {
        this.a.setSoftInputMode(this.b);
    }
}
