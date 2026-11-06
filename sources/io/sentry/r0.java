package io.sentry;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o.au8;
import o.f88;
import o.jq5;
import o.kq5;
import o.o43;
import o.ud3;
import o.ve0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                t0 t0Var = (t0) obj;
                try {
                    t0Var.e.getClass();
                    t0Var.b = InetAddress.getLocalHost().getCanonicalHostName();
                    t0Var.c = System.currentTimeMillis() + ((long) t0Var.a);
                    return null;
                } finally {
                    t0Var.d.set(false);
                }
            case 1:
                return (Integer) ((AtomicReference) obj).get();
            case 2:
                return (Integer) obj;
            case 3:
                int i2 = ve0.F0;
                ((ve0) obj).H0();
                return f88.a;
            case 4:
                return ((ConfigStorageClient) obj).read();
            case 5:
                WorkDatabase workDatabase = ((ud3) obj).a;
                Long lA = workDatabase.s().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                int i3 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                kq5 kq5VarS = workDatabase.s();
                byte b2 = 26;
                au8.M(kq5VarS.a, false, true, new o43(kq5VarS, new jq5("next_job_scheduler_id", Long.valueOf(i3)), b2));
                if (iLongValue < 0 || iLongValue > Integer.MAX_VALUE) {
                    kq5 kq5VarS2 = workDatabase.s();
                    au8.M(kq5VarS2.a, false, true, new o43(kq5VarS2, new jq5("next_job_scheduler_id", 1L), b2));
                } else {
                    i = iLongValue;
                }
                return Integer.valueOf(i);
            case 6:
                return ((RemoteConfigComponent) obj).getDefault();
            default:
                return (AssetFileDescriptor) obj;
        }
    }
}
