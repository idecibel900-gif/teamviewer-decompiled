package o;

import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi4 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ M2MClientActivity n;

    public /* synthetic */ qi4(M2MClientActivity m2MClientActivity, byte b) {
        this.m = b;
        this.n = m2MClientActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                kc3 kc3Var = (kc3) obj;
                int i = M2MClientActivity.h0;
                String str = kc3Var.a;
                long j = kc3Var.b;
                boolean z = kc3Var.c;
                String str2 = kc3Var.d;
                long j2 = kc3Var.e;
                if (it1.c != null) {
                    im3.b0(this.n, str, j, z, str2, j2);
                    return f88.a;
                }
                im3.e0("viewFactory");
                throw null;
            default:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(im3.n(weakReference.get(), this.n));
        }
    }
}
