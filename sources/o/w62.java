package o;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class w62 extends hs7 {
    public final /* synthetic */ z62 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w62(z62 z62Var, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.q = z62Var;
    }

    @Override // o.hs7, o.p3
    public final void d(View view, g4 g4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        super.d(view, g4Var);
        if (this.q.a.getEditText().getKeyListener() == null) {
            g4Var.i("android.widget.Spinner");
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // o.p3
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        z62 z62Var = this.q;
        TextInputLayout textInputLayout = z62Var.a;
        EditText editText = textInputLayout.getEditText();
        if (!(editText instanceof AutoCompleteTextView)) {
            hk0.o("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (accessibilityEvent.getEventType() == 1 && z62Var.n.isTouchExplorationEnabled() && textInputLayout.getEditText().getKeyListener() == null) {
            z62Var.f(autoCompleteTextView);
        }
    }
}
