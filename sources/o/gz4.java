package o;

import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gz4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ mz4 n;

    public /* synthetic */ gz4(mz4 mz4Var, byte b) {
        this.m = b;
        this.n = mz4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        mz4 mz4Var = this.n;
        switch (b) {
            case 0:
                mz4Var.z.setValue(Boolean.FALSE);
                Iterator it = mz4Var.E.iterator();
                while (it.hasNext()) {
                    M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
                    if (m2MClientActivity != null) {
                        m2MClientActivity.K();
                    }
                }
                return f88Var;
            case 1:
                aj4 aj4Var = mz4Var.A;
                return Boolean.valueOf(aj4Var != null ? aj4Var.v() : false);
            case 2:
                boolean zN = im3.n(mz4Var.J.getValue(), Boolean.valueOf(mz4Var.I));
                mz4Var.v.r = zN;
                return zN ? nb3.n : nb3.m;
            default:
                qf2 qf2Var = mz4Var.J;
                qf2Var.setValue(qf2Var.a.a());
                qf2 qf2Var2 = mz4Var.K;
                qf2Var2.setValue(qf2Var2.a.a());
                return f88Var;
        }
    }
}
