package io.sentry.android.core;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import io.sentry.f6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import o.my0;
import o.oh7;
import o.y72;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f134o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ y2(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, io.sentry.g1 g1Var) {
        this.f134o = atomicReference;
        this.n = view;
        this.p = list;
        this.q = countDownLatch;
        this.r = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.r;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.f134o;
        switch (b) {
            case 0:
                AtomicReference atomicReference = (AtomicReference) obj4;
                View view = this.n;
                List list = (List) obj3;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                io.sentry.g1 g1Var = (io.sentry.g1) obj;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    io.sentry.protocol.j0 j0Var = new io.sentry.protocol.j0("android_view_system", arrayList);
                    io.sentry.protocol.k0 k0VarF = ViewHierarchyEventProcessor.f(view);
                    arrayList.add(k0VarF);
                    ViewHierarchyEventProcessor.e(view, k0VarF, list);
                    atomicReference.set(j0Var);
                    countDownLatch.countDown();
                } catch (Throwable th) {
                    g1Var.d(f6.ERROR, "Failed to process view hierarchy.", th);
                    return;
                }
                break;
            default:
                oh7 oh7Var = (oh7) obj3;
                oh7 oh7Var2 = (oh7) obj2;
                Window window = ((my0) obj).getWindow();
                window.getClass();
                Function1 function1 = oh7Var.c;
                View view2 = this.n;
                Resources resources = view2.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
                Function1 function2 = oh7Var2.c;
                Resources resources2 = view2.getResources();
                resources2.getClass();
                ((y72) obj4).b(oh7Var, oh7Var2, window, view2, zBooleanValue, ((Boolean) function2.invoke(resources2)).booleanValue());
                break;
        }
    }

    public /* synthetic */ y2(y72 y72Var, oh7 oh7Var, oh7 oh7Var2, my0 my0Var, View view) {
        this.f134o = y72Var;
        this.p = oh7Var;
        this.q = oh7Var2;
        this.r = my0Var;
        this.n = view;
    }
}
