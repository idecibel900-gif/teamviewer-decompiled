package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import o.an8;
import o.au8;
import o.cn8;
import o.k02;
import o.lc4;
import o.nm8;
import o.rm8;
import o.th7;
import o.we4;
import o.wh;
import o.yb8;
import o.ze6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final lc4 c() {
        nm8 nm8VarA = nm8.a(this.a);
        WorkDatabase workDatabase = nm8VarA.c;
        workDatabase.getClass();
        an8 an8VarW = workDatabase.w();
        rm8 rm8VarU = workDatabase.u();
        cn8 cn8VarX = workDatabase.x();
        th7 th7VarT = workDatabase.t();
        Object obj = nm8VarA.b.p;
        List list = (List) au8.M(an8VarW.a, true, false, new wh(System.currentTimeMillis() - 86400000, (byte) 6));
        ze6 ze6Var = an8VarW.a;
        List list2 = (List) au8.M(ze6Var, true, false, new yb8((byte) 17));
        List list3 = (List) au8.M(ze6Var, true, false, new yb8((byte) 14));
        if (!list.isEmpty()) {
            we4 we4VarF = we4.f();
            String str = k02.a;
            we4VarF.g(str, "Recently completed work:\n\n");
            we4.f().g(str, k02.a(rm8VarU, cn8VarX, th7VarT, list));
        }
        if (!list2.isEmpty()) {
            we4 we4VarF2 = we4.f();
            String str2 = k02.a;
            we4VarF2.g(str2, "Running work:\n\n");
            we4.f().g(str2, k02.a(rm8VarU, cn8VarX, th7VarT, list2));
        }
        if (!list3.isEmpty()) {
            we4 we4VarF3 = we4.f();
            String str3 = k02.a;
            we4VarF3.g(str3, "Enqueued work:\n\n");
            we4.f().g(str3, k02.a(rm8VarU, cn8VarX, th7VarT, list3));
        }
        return new lc4();
    }
}
