package o;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l78 implements jv {
    public final Object m;
    public final ArrayList n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1337o;

    public l78(LayoutNode layoutNode) {
        this.m = layoutNode;
        this.f1337o = layoutNode;
    }

    public final void a() {
        this.n.clear();
        this.f1337o = this.m;
        ((LayoutNode) this.m).o0();
    }

    @Override // o.jv
    public final void c(int i, Object obj) {
        ((LayoutNode) this.f1337o).N(i, (LayoutNode) obj);
    }

    @Override // o.jv
    public final void d(Object obj) {
        this.n.add(this.f1337o);
        this.f1337o = obj;
    }

    @Override // o.jv
    public final void e() {
        x56 rectManager;
        yf autofillManager;
        x56 rectManager2;
        LayoutNode layoutNode = (LayoutNode) this.f1337o;
        nf nfVar = layoutNode.S;
        if (!layoutNode.W()) {
            ki3.a("onReuse is only expected on attached node");
        }
        ge8 ge8Var = layoutNode.B;
        if (ge8Var != null) {
            View view = ge8Var.n;
            if (view.getParent() != ge8Var) {
                ge8Var.addView(view);
            } else {
                ge8Var.r.a();
            }
        }
        p14 p14Var = layoutNode.T;
        if (p14Var != null) {
            p14Var.i(false);
        }
        layoutNode.G = false;
        if (layoutNode.c0) {
            layoutNode.c0 = false;
        } else {
            es4 es4Var = (kn7) layoutNode.S.f;
            for (es4 es4Var2 = es4Var; es4Var2 != null; es4Var2 = es4Var2.q) {
                if (es4Var2.z) {
                    es4Var2.P0();
                }
            }
            for (es4 es4Var3 = es4Var; es4Var3 != null; es4Var3 = es4Var3.q) {
                if (es4Var3.z) {
                    es4Var3.R0();
                }
            }
            while (es4Var != null) {
                if (es4Var.z) {
                    es4Var.L0();
                }
                es4Var = es4Var.q;
            }
        }
        int i = layoutNode.n;
        Owner owner = layoutNode.A;
        if (owner != null && (rectManager2 = owner.getRectManager()) != null) {
            rectManager2.h(layoutNode);
        }
        layoutNode.n = cp6.a.addAndGet(1);
        Owner owner2 = layoutNode.A;
        if (owner2 != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) owner2;
            androidComposeView.m3getLayoutNodes().g(i);
            androidComposeView.m3getLayoutNodes().i(layoutNode.n, layoutNode);
        }
        for (es4 es4Var4 = (es4) nfVar.g; es4Var4 != null; es4Var4 = es4Var4.r) {
            es4Var4.K0();
        }
        nfVar.k();
        if (nfVar.f(8)) {
            layoutNode.U();
        }
        LayoutNode.v0(layoutNode);
        Owner owner3 = layoutNode.A;
        if (owner3 != null && (autofillManager = ((AndroidComposeView) owner3).getAutofillManager()) != null) {
            AndroidComposeView androidComposeView2 = autofillManager.f2603o;
            a65 a65Var = autofillManager.m;
            lw4 lw4Var = autofillManager.t;
            if (lw4Var.e(i)) {
                a65Var.J0(androidComposeView2, i, false);
            }
            ap6 ap6VarH = layoutNode.H();
            if (ap6VarH != null && ap6VarH.m.b(kp6.r)) {
                lw4Var.a(layoutNode.n);
                a65Var.J0(androidComposeView2, layoutNode.n, true);
            }
        }
        Owner owner4 = layoutNode.A;
        if (owner4 == null || (rectManager = owner4.getRectManager()) == null) {
            return;
        }
        rectManager.g(layoutNode);
    }

    @Override // o.jv
    public final void f(int i, int i2, int i3) {
        ((LayoutNode) this.f1337o).h0(i, i2, i3);
    }

    @Override // o.jv
    public final void g(int i, int i2) {
        ((LayoutNode) this.f1337o).p0(i, i2);
    }

    @Override // o.jv
    public final void i() {
        ArrayList arrayList = this.n;
        this.f1337o = arrayList.remove(arrayList.size() - 1);
    }

    @Override // o.jv
    public final void j(int i, Object obj) {
    }

    @Override // o.jv
    public final void l() {
        Owner owner = ((LayoutNode) this.m).A;
        if (owner != null) {
            ((AndroidComposeView) owner).u();
        }
    }

    @Override // o.jv
    public final Object m() {
        return this.f1337o;
    }
}
