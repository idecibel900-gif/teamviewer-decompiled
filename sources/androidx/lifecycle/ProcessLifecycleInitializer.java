package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import o.ea2;
import o.ei3;
import o.hk0;
import o.iu;
import o.l84;
import o.o84;
import o.p84;
import o.ws5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lo/ei3;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements ei3 {
    @Override // o.ei3
    public final List a() {
        return ea2.m;
    }

    @Override // o.ei3
    public final Object b(Context context) {
        context.getClass();
        iu iuVarA = iu.A(context);
        iuVarA.getClass();
        if (!((HashSet) iuVarA.p).contains(ProcessLifecycleInitializer.class)) {
            hk0.l("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!p84.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new o84());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.u;
        processLifecycleOwner.getClass();
        processLifecycleOwner.q = new Handler();
        processLifecycleOwner.r.d(l84.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ws5(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
