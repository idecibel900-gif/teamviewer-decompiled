package o;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class np8 extends tp8 {
    public final /* synthetic */ Intent m;
    public final /* synthetic */ Activity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f1591o;

    /* JADX WARN: Multi-variable type inference failed */
    public np8(Intent intent, Activity activity, int i) {
        this.m = intent;
        this.n = activity;
        this.f1591o = i;
    }

    @Override // o.tp8
    public final void a() {
        Intent intent = this.m;
        if (intent != null) {
            this.n.startActivityForResult(intent, this.f1591o);
        }
    }
}
