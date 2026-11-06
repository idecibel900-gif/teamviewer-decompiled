package com.teamviewer.teamviewerlib.logging;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import o.ac;
import o.ct1;
import o.g22;
import o.gk1;
import o.hc1;
import o.hk0;
import o.im3;
import o.jc1;
import o.jx5;
import o.ne1;
import o.tk1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/teamviewerlib/logging/PublishLogFilesZipWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "applicationContext", "Landroidx/work/WorkerParameters;", "workParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PublishLogFilesZipWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishLogFilesZipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(jc1 jc1Var) {
        jx5 jx5Var;
        if (jc1Var instanceof jx5) {
            jx5Var = (jx5) jc1Var;
            int i = jx5Var.f1209o;
            if ((i & Integer.MIN_VALUE) != 0) {
                jx5Var.f1209o = i - Integer.MIN_VALUE;
            } else {
                jx5Var = new jx5(this, jc1Var);
            }
        } else {
            jx5Var = new jx5(this, jc1Var);
        }
        Object objJ0 = jx5Var.m;
        int i2 = jx5Var.f1209o;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(objJ0);
            tk1 tk1Var = g22.a;
            gk1 gk1Var = gk1.f901o;
            ac acVar = new ac(this, hc1Var, (byte) 11);
            jx5Var.f1209o = 1;
            objJ0 = im3.j0(gk1Var, acVar, jx5Var);
            ne1 ne1Var = ne1.m;
            if (objJ0 == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objJ0);
        }
        objJ0.getClass();
        return objJ0;
    }
}
