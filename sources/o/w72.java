package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class w72 extends View {
    public final /* synthetic */ io.sentry.android.core.y2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w72(io.sentry.android.core.y2 y2Var, Context context) {
        super(context);
        this.m = y2Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.m.run();
    }
}
