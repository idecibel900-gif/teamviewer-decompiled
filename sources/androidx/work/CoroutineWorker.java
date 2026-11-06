package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import o.de1;
import o.dp3;
import o.ds1;
import o.im3;
import o.jc1;
import o.kj0;
import o.nc4;
import o.qe1;
import o.re1;
import o.xk0;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lo/nc4;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "o/qe1", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends nc4 {
    public final WorkerParameters e;
    public final qe1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = qe1.f1823o;
    }

    @Override // o.nc4
    public final kj0 a() {
        dp3 dp3VarR = ds1.r();
        qe1 qe1Var = this.f;
        qe1Var.getClass();
        return zu1.B(xk0.G(qe1Var, dp3VarR), new re1(this, null, (byte) 0));
    }

    @Override // o.nc4
    public final kj0 b() {
        qe1 qe1Var = qe1.f1823o;
        de1 de1Var = this.f;
        if (im3.n(de1Var, qe1Var)) {
            de1Var = this.e.c;
        }
        de1Var.getClass();
        return zu1.B(de1Var.H0(ds1.r()), new re1(this, null, (byte) 1));
    }

    public abstract Object c(jc1 jc1Var);
}
