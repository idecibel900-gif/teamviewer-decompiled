package o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class s92 implements TextWatcher {
    public final EditText m;
    public r92 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1995o = true;

    public s92(EditText editText) {
        this.m = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            a92 a92VarA = a92.a();
            if (editableText == null) {
                length = 0;
            } else {
                a92VarA.getClass();
                length = editableText.length();
            }
            a92VarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.m;
        if (!editText.isInEditMode() && this.f1995o && a92.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = a92.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    a92.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            a92 a92VarA = a92.a();
            r92 r92Var = this.n;
            if (r92Var == null) {
                r92Var = new r92(editText);
                this.n = r92Var;
            }
            a92VarA.h(r92Var);
        }
    }
}
