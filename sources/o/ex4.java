package o;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ex4 implements dj5 {
    public final String a;
    public final Context b;
    public final Activity c;
    public final bg5 d;

    public ex4(String str, Context context, Activity activity) {
        str.getClass();
        this.a = str;
        this.b = context;
        this.c = activity;
        this.d = h57.p(b());
    }

    @Override // o.dj5
    public final String a() {
        return this.a;
    }

    public final gj5 b() {
        String str = this.a;
        str.getClass();
        return hm3.h(this.b, str) == 0 ? fj5.a : new ej5(hm3.C(this.c, str));
    }

    public final void c() {
        this.d.setValue(b());
    }

    @Override // o.dj5
    public final gj5 getStatus() {
        return (gj5) this.d.getValue();
    }
}
