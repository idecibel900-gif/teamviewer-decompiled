package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.gy8;
import o.hv2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ d n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Activity f99o;

    public /* synthetic */ b(d dVar, Activity activity, byte b) {
        this.m = b;
        this.n = dVar;
        this.f99o = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Activity activity = this.f99o;
        d dVar = this.n;
        switch (b) {
            case 0:
                gy8 gy8Var = ((FrameMetricsAggregator) ((io.sentry.util.h) dVar.m).a()).a;
                gy8Var.getClass();
                if (gy8.h == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    gy8.h = handlerThread;
                    handlerThread.start();
                    gy8.i = new Handler(gy8.h.getLooper());
                }
                for (int i = 0; i <= 8; i++) {
                    SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) gy8Var.c;
                    if (sparseIntArrayArr[i] == null && (gy8Var.b & (1 << i)) != 0) {
                        sparseIntArrayArr[i] = new SparseIntArray();
                    }
                }
                activity.getWindow().addOnFrameMetricsAvailableListener((hv2) gy8Var.e, gy8.i);
                ((ArrayList) gy8Var.d).add(new WeakReference(activity));
                break;
            default:
                gy8 gy8Var2 = ((FrameMetricsAggregator) ((io.sentry.util.h) dVar.m).a()).a;
                ArrayList<WeakReference> arrayList = (ArrayList) gy8Var2.d;
                for (WeakReference weakReference : arrayList) {
                    if (weakReference.get() == activity) {
                        arrayList.remove(weakReference);
                        activity.getWindow().removeOnFrameMetricsAvailableListener((hv2) gy8Var2.e);
                        break;
                    }
                }
                activity.getWindow().removeOnFrameMetricsAvailableListener((hv2) gy8Var2.e);
                break;
        }
    }
}
