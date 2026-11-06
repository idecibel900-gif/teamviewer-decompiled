package o;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class wh7 {
    public static final String b = we4.i("SystemJobInfoConverter");
    public final ComponentName a;

    public wh7(Context context, yi5 yi5Var) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
