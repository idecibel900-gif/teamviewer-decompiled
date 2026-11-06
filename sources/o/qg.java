package o;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class qg extends p3 {
    public final /* synthetic */ AndroidComposeView p;
    public final /* synthetic */ LayoutNode q;
    public final /* synthetic */ AndroidComposeView r;

    public qg(AndroidComposeView androidComposeView, LayoutNode layoutNode, AndroidComposeView androidComposeView2) {
        this.p = androidComposeView;
        this.q = layoutNode;
        this.r = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // o.p3
    public final void d(View view, g4 g4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        this.m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.p;
        bh bhVar = androidComposeView.I;
        if (bhVar.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        LayoutNode layoutNode = this.q;
        LayoutNode layoutNodeF = layoutNode.F();
        while (true) {
            if (layoutNodeF == null) {
                layoutNodeF = null;
                break;
            } else if (layoutNodeF.S.f(8)) {
                break;
            } else {
                layoutNodeF = layoutNodeF.F();
            }
        }
        Integer numValueOf = layoutNodeF != null ? Integer.valueOf(layoutNodeF.n) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        g4Var.b = iIntValue;
        AndroidComposeView androidComposeView2 = this.r;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i = layoutNode.n;
        int iD = bhVar.N.d(i);
        if (iD != -1) {
            xl xlVarN = bt1.N(androidComposeView.getAndroidViewsHandler$ui(), iD);
            if (xlVarN != null) {
                accessibilityNodeInfo.setTraversalBefore(xlVarN);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iD);
            }
            androidComposeView.b(i, accessibilityNodeInfo, bhVar.P);
        }
        int iD2 = bhVar.O.d(i);
        if (iD2 != -1) {
            xl xlVarN2 = bt1.N(androidComposeView.getAndroidViewsHandler$ui(), iD2);
            if (xlVarN2 != null) {
                accessibilityNodeInfo.setTraversalAfter(xlVarN2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iD2);
            }
            androidComposeView.b(i, accessibilityNodeInfo, bhVar.Q);
        }
    }
}
