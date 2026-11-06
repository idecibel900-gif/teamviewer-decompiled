package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import o.ea2;
import o.ei3;
import o.ql5;
import o.wb1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lo/ei3;", "Lo/ql5;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformInitializer implements ei3 {
    @Override // o.ei3
    public final List a() {
        return ea2.m;
    }

    @Override // o.ei3
    public final Object b(Context context) {
        context.getClass();
        ql5 ql5Var = ql5.a;
        Object obj = ql5.a;
        wb1 wb1Var = obj != null ? (wb1) obj : null;
        if (wb1Var != null) {
            wb1Var.a(context);
        }
        return ql5.a;
    }
}
