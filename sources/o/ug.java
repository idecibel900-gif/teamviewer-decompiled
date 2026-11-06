package o;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ug extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ AndroidComposeView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2209o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(AndroidComposeView androidComposeView, jc1 jc1Var) {
        super(jc1Var);
        this.n = androidComposeView;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2209o |= Integer.MIN_VALUE;
        this.n.J(null, this);
        return ne1.m;
    }
}
