package o;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1697o = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate m;
    public final o3 n;

    public p3(View.AccessibilityDelegate accessibilityDelegate) {
        this.m = accessibilityDelegate;
        this.n = new o3(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.m.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public df6 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.m.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new df6((Object) accessibilityNodeProvider, (byte) 6);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.m.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, g4 g4Var) {
        this.m.onInitializeAccessibilityNodeInfo(view, g4Var.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.m.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.m.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                a4 a4Var = (a4) list.get(i2);
                if (a4Var.a() == i) {
                    Class cls = a4Var.c;
                    p4 p4Var = a4Var.d;
                    if (p4Var != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e) {
                                io.sentry.android.core.v0.d("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zPerformAccessibilityAction = p4Var.c(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.m.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void h(View view, int i) {
        this.m.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.m.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public p3() {
        this(f1697o);
    }
}
