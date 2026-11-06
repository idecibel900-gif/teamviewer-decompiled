package o;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import com.teamviewer.remotecontrolviewlib.activity.WebLoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class wh8 {
    public final Context a;
    public final f8 b;

    public wh8(Context context, qk4 qk4Var) {
        this.a = context;
        this.b = qk4Var;
    }

    public final void a(boolean z) {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) WebLoginActivity.class);
        intent.putExtra("EXTRA_IS_SIGN_UP", z);
        this.b.a(intent, new df6(ActivityOptions.makeCustomAnimation(context, 0, 0), (byte) 9));
    }
}
