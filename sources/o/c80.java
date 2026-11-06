package o;

import android.app.Activity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c80 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Activity n;

    public /* synthetic */ c80(Activity activity, byte b) {
        this.m = b;
        this.n = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        Activity activity = this.n;
        String str = (String) obj;
        switch (b) {
            case 0:
                str.getClass();
                return Boolean.valueOf(hm3.C(activity, str));
            default:
                int i = yc0.G0;
                if (activity != null) {
                    activity.setTitle(str);
                }
                return f88.a;
        }
    }
}
