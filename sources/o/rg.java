package o;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg extends cx2 implements iw2 {
    public final /* synthetic */ byte n = 1;

    public /* synthetic */ rg(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.n) {
            case 0:
                if (obj != null) {
                    io.sentry.h2.f();
                    return null;
                }
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.U0;
                Resources resources = androidComposeView.getContext().getResources();
                return Boolean.valueOf(eh.a.a(androidComposeView, null, new lz0(new ln1(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((y07) obj2).a, (Function1) obj3)));
            default:
                String str = (String) obj;
                Function0 function0 = (Function0) obj2;
                Function0 function1 = (Function0) obj3;
                str.getClass();
                function0.getClass();
                function1.getClass();
                mi2 mi2Var = (mi2) this.receiver;
                mi2Var.getClass();
                mi2Var.W0(true);
                mi2Var.n.UploadFeedback(str, mi2Var.r);
                mi2Var.s = new m5((Object) function0, (Object) function1, (Object) mi2Var, (byte) 20);
                return f88.a;
        }
    }
}
