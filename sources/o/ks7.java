package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.BaseInputConnection;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks7 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ks7(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        sf4 sf4Var;
        d11 d11Var;
        WorkDatabase workDatabase;
        boolean zA;
        byte b = this.m;
        boolean z = true;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new BaseInputConnection(((ms7) obj).a, false);
            case 1:
                return new vk3(((zk3) obj).e());
            case 2:
                nt7 nt7Var = (nt7) obj;
                nt7Var.L = null;
                vn4.p0(nt7Var).U();
                vn4.p0(nt7Var).S();
                yo1.H(nt7Var);
                return Boolean.TRUE;
            case 3:
                wv7 wv7Var = (wv7) obj;
                wv7Var.Z.invoke(Boolean.valueOf(!wv7Var.Y));
                return f88.a;
            case 4:
                d11 d11Var2 = (d11) obj;
                dd6 dd6Var = new dd6();
                b75 b75Var = new b75();
                b75Var.c.add(new w38(d11Var2));
                b93 b93Var = new b93(new ar(d11Var2, (byte) 26));
                b93Var.b = z83.n;
                b75Var.c.add(b93Var);
                for (nl3 nl3Var : (List) d11Var2.q) {
                    nl3Var.getClass();
                    b75Var.c.add(nl3Var);
                }
                TimeUnit.MILLISECONDS.getClass();
                b75Var.w = ro8.b(15000L);
                b75Var.x = ro8.b(120000L);
                List listL = qf0.L(z41.h, z41.g);
                if (!listL.equals(b75Var.r)) {
                    b75Var.B = null;
                }
                b75Var.r = ro8.j(listL);
                dd6Var.a = new c75(b75Var);
                dd6Var.b((uc1) d11Var2.p);
                dd6Var.c((String) d11Var2.n);
                return dd6Var.d().r((Class) d11Var2.m);
            case 5:
                f88 f88Var = f88.a;
                ((VectorPainter) obj).u.setValue(f88Var);
                return f88Var;
            case 6:
                yc8 yc8Var = (yc8) obj;
                return BigInteger.valueOf(yc8Var.m).shiftLeft(32).or(BigInteger.valueOf(yc8Var.n)).shiftLeft(32).or(BigInteger.valueOf(yc8Var.f2599o));
            case 7:
                Bundle bundle = ((th8) obj).r;
                if (bundle != null && (sf4Var = (sf4) pm8.w(bundle, "LOGIN_SOURCE_KEY", sf4.class)) != null) {
                    return sf4Var;
                }
                hk0.g("Login source not provided or invalid");
                return null;
            case 8:
                dm8 dm8Var = (dm8) obj;
                String str = lb2.a;
                nm8 nm8Var = dm8Var.a;
                HashSet hashSet = new HashSet();
                hashSet.addAll(dm8Var.e);
                HashSet hashSetB = dm8.b(dm8Var);
                Iterator it = hashSet.iterator();
                do {
                    if (!it.hasNext()) {
                        hashSet.removeAll(dm8Var.e);
                        z = false;
                    }
                    if (!z) {
                        hk0.h(dm8Var, ")", "WorkContinuation has cycles (");
                        return null;
                    }
                    d11Var = nm8Var.b;
                    workDatabase = nm8Var.c;
                    workDatabase.getClass();
                    workDatabase.b();
                    try {
                        d11Var.getClass();
                        lq1.m(workDatabase, d11Var, dm8Var);
                        zA = lb2.a(dm8Var);
                        workDatabase.p();
                        workDatabase.l();
                        if (zA) {
                            aj6.b(d11Var, workDatabase, nm8Var.e);
                        }
                        return f88.a;
                    } catch (Throwable th) {
                        workDatabase.l();
                        throw th;
                    }
                } while (!hashSetB.contains((String) it.next()));
                if (!z) {
                    hk0.h(dm8Var, ")", "WorkContinuation has cycles (");
                    return null;
                }
                d11Var = nm8Var.b;
                workDatabase = nm8Var.c;
                workDatabase.getClass();
                workDatabase.b();
                d11Var.getClass();
                lq1.m(workDatabase, d11Var, dm8Var);
                zA = lb2.a(dm8Var);
                workDatabase.p();
                workDatabase.l();
                if (zA) {
                    aj6.b(d11Var, workDatabase, nm8Var.e);
                }
                return f88.a;
            case ep1.b /* 9 */:
                nm8 nm8Var2 = (nm8) obj;
                WorkDatabase workDatabase2 = nm8Var2.c;
                Context context = nm8Var2.a;
                String str2 = xh7.q;
                if (Build.VERSION.SDK_INT >= 34) {
                    kp3.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListE = xh7.e(context, jobScheduler);
                if (arrayListE != null && !arrayListE.isEmpty()) {
                    Iterator it2 = arrayListE.iterator();
                    while (it2.hasNext()) {
                        xh7.a(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                ((Number) au8.M(workDatabase2.w().a, false, true, new yb8((byte) 15))).intValue();
                aj6.b(nm8Var2.b, workDatabase2, nm8Var2.e);
                return f88.a;
            default:
                return ((Worker) obj).c();
        }
    }
}
