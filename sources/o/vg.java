package o;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ bh n;

    public /* synthetic */ vg(bh bhVar, byte b) {
        this.m = b;
        this.n = bhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        bh bhVar = this.n;
        switch (b) {
            case 0:
                View view = bhVar.p;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                ck6 ck6Var = (ck6) obj;
                if (ck6Var.n.contains(ck6Var)) {
                    pc5 snapshotObserver = bhVar.p.getSnapshotObserver();
                    snapshotObserver.a.f(ck6Var, bhVar.Y, new x8(ck6Var, bhVar, (byte) 2));
                }
                return f88.a;
        }
    }
}
