package o;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends z00 implements hq2 {
    public final a65 m;
    public final ip6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AndroidComposeView f2603o;
    public final x56 p;
    public final String q;
    public final Rect r = new Rect();
    public final AutofillId s;
    public final lw4 t;
    public boolean u;

    public yf(a65 a65Var, ip6 ip6Var, AndroidComposeView androidComposeView, x56 x56Var, String str) {
        this.m = a65Var;
        this.n = ip6Var;
        this.f2603o = androidComposeView;
        this.p = x56Var;
        this.q = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw ua5.r("Required value was null.");
        }
        this.s = autofillId;
        this.t = new lw4();
    }

    @Override // o.hq2
    public final void a(br2 br2Var, br2 br2Var2) {
        LayoutNode layoutNodeP0;
        ap6 ap6VarH;
        LayoutNode layoutNodeP1;
        ap6 ap6VarH2;
        AndroidComposeView androidComposeView = this.f2603o;
        a65 a65Var = this.m;
        if (br2Var != null && (layoutNodeP1 = vn4.p0(br2Var)) != null && (ap6VarH2 = layoutNodeP1.H()) != null && xk0.z(ap6VarH2)) {
            a65Var.C0().notifyViewExited(androidComposeView, layoutNodeP1.n);
        }
        if (br2Var2 == null || (layoutNodeP0 = vn4.p0(br2Var2)) == null || (ap6VarH = layoutNodeP0.H()) == null || !xk0.z(ap6VarH)) {
            return;
        }
        int i = layoutNodeP0.n;
        x56 x56Var = this.p;
        LayoutNode layoutNode = (LayoutNode) x56Var.a.b(i);
        if (layoutNode == null || layoutNode.s == -4) {
            return;
        }
        ae aeVar = x56Var.c;
        int iD = x56Var.d(layoutNode);
        long[] jArr = (long[]) aeVar.c;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        a65Var.C0().notifyViewEntered(androidComposeView, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
