package o;

import com.teamviewer.teamviewerlib.logging.PublishLogFilesZipWorker;

/* JADX INFO: loaded from: classes.dex */
public final class jx5 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ PublishLogFilesZipWorker n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1209o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx5(PublishLogFilesZipWorker publishLogFilesZipWorker, jc1 jc1Var) {
        super(jc1Var);
        this.n = publishLogFilesZipWorker;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1209o |= Integer.MIN_VALUE;
        return this.n.c(this);
    }
}
