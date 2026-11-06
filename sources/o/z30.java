package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class z30 extends p3 {
    public final /* synthetic */ byte p;
    public final /* synthetic */ Object q;

    public /* synthetic */ z30(Object obj, byte b) {
        this.p = b;
        this.q = obj;
    }

    @Override // o.p3
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.p) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.q).p);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // o.p3
    public final void d(View view, g4 g4Var) {
        byte b = this.p;
        View.AccessibilityDelegate accessibilityDelegate = this.m;
        Object obj = this.q;
        switch (b) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                g4Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (!((s90) obj).w) {
                    accessibilityNodeInfo2.setDismissable(false);
                } else {
                    g4Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                }
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.q);
                accessibilityNodeInfo3.setChecked(checkableImageButton.p);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).J);
                break;
            default:
                cr5 cr5Var = (cr5) obj;
                cr5Var.s.d(view, g4Var);
                RecyclerView recyclerView = cr5Var.r;
                recyclerView.getClass();
                c76 c76VarM = RecyclerView.M(view);
                int iB = c76VarM != null ? c76VarM.b() : -1;
                d66 adapter = recyclerView.getAdapter();
                if (adapter instanceof uq5) {
                    ((uq5) adapter).j(iB);
                    break;
                }
                break;
        }
    }

    @Override // o.p3
    public boolean g(View view, int i, Bundle bundle) {
        byte b = this.p;
        Object obj = this.q;
        switch (b) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((f37) ((f40) obj)).a(3);
                return true;
            case 1:
                if (i == 1048576) {
                    s90 s90Var = (s90) obj;
                    if (s90Var.w) {
                        s90Var.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 2:
            case 3:
            default:
                return super.g(view, i, bundle);
            case 4:
                return ((cr5) obj).s.g(view, i, bundle);
        }
    }
}
