package o;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.remotecontrollib.gui.KeyboardInputView;
import com.teamviewer.remotecontrolviewlib.fragment.session.PilotMarkerTextInputFieldView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements TextWatcher {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ hc0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.m;
        boolean z = false;
        Object obj = this.n;
        switch (b) {
            case 0:
                editable.getClass();
                break;
            case 1:
                editable.getClass();
                po0 po0Var = (po0) obj;
                po0Var.k(po0Var.v);
                z = ub7.x0(editable.toString()).toString().length() > 0;
                View view = po0Var.w;
                if (view != null) {
                    view.setEnabled(z);
                }
                break;
            case 2:
                it0 it0Var = (it0) obj;
                TextInputLayout textInputLayout = it0Var.a;
                if (textInputLayout.getSuffixText() == null) {
                    if (textInputLayout.hasFocus() && editable.length() > 0) {
                        z = true;
                    }
                    it0Var.d(z);
                    break;
                }
                break;
            case 3:
                h11 h11Var = (h11) obj;
                h11Var.t = String.valueOf(editable);
                h11Var.p = true;
                break;
            case 4:
                editable.getClass();
                break;
            case 5:
                KeyboardInputView keyboardInputView = (KeyboardInputView) obj;
                if (editable != null && editable.length() != 0) {
                    if (keyboardInputView.x || ub7.T(editable, '\n') || keyboardInputView.getSelectionStart() != editable.length()) {
                        hc0 hc0Var = keyboardInputView.y;
                        keyboardInputView.removeTextChangedListener(hc0Var);
                        keyboardInputView.setText("");
                        keyboardInputView.w = "";
                        keyboardInputView.addTextChangedListener(hc0Var);
                        keyboardInputView.x = false;
                    }
                    break;
                }
                break;
            case 6:
                editable.getClass();
                PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) obj;
                Function1 onMarkerTextChanged = pilotMarkerTextInputFieldView.getOnMarkerTextChanged();
                if (onMarkerTextChanged != null) {
                    a65 a65Var = pilotMarkerTextInputFieldView.G;
                    onMarkerTextChanged.invoke(String.valueOf(a65Var != null ? ((EditText) a65Var.n).getText() : null));
                }
                break;
            case 7:
            case 8:
                break;
            default:
                TextInputLayout textInputLayout2 = (TextInputLayout) obj;
                textInputLayout2.s(!textInputLayout2.X0, false);
                if (textInputLayout2.v) {
                    textInputLayout2.n(editable.length());
                }
                if (textInputLayout2.C) {
                    textInputLayout2.t(editable.length());
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.m) {
            case 0:
                charSequence.getClass();
                break;
            case 1:
                charSequence.getClass();
                break;
            case 4:
                charSequence.getClass();
                break;
            case 5:
                KeyboardInputView keyboardInputView = (KeyboardInputView) this.n;
                dd3 dd3Var = keyboardInputView.t;
                if (dd3Var != null) {
                    oh3 oh3Var = (oh3) dd3Var;
                    if (oh3Var.a() || oh3Var.b() || (oh3Var.a & 8) == 8) {
                        keyboardInputView.x = true;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.m;
        int i4 = 0;
        Object obj = this.n;
        switch (b) {
            case 0:
                charSequence.getClass();
                ((ic0) obj).w0 = true;
                break;
            case 1:
                charSequence.getClass();
                break;
            case 4:
                charSequence.getClass();
                ii2 ii2Var = (ii2) obj;
                ii2Var.C0(ii2Var.q0);
                break;
            case 5:
                KeyboardInputView keyboardInputView = (KeyboardInputView) obj;
                dd3 dd3Var = keyboardInputView.t;
                if (dd3Var == null) {
                    ye4.c("KeyboardInputView", "Session keyboard is not available");
                    break;
                } else if (charSequence != null) {
                    int i5 = i3 - i2;
                    CharSequence charSequenceSubSequence = charSequence.subSequence(charSequence.length() - i3, charSequence.length());
                    CharSequence charSequenceSubSequence2 = i5 > 0 ? charSequence.subSequence(charSequence.length() - i5, charSequence.length()) : "";
                    if (i5 >= 0 && keyboardInputView.w.length() == i2 && !ub7.o0(charSequenceSubSequence, keyboardInputView.w)) {
                        KeyboardInputView.c(dd3Var, i2);
                        charSequenceSubSequence2 = charSequenceSubSequence;
                    }
                    if (i5 >= 0 || keyboardInputView.w.length() != i2) {
                        if (i5 < 0) {
                            KeyboardInputView.c(dd3Var, Math.abs(i5));
                        }
                    } else if (ub7.o0(keyboardInputView.w, charSequenceSubSequence)) {
                        KeyboardInputView.c(dd3Var, keyboardInputView.w.length() - charSequenceSubSequence.length());
                        charSequenceSubSequence2 = "";
                    } else {
                        KeyboardInputView.c(dd3Var, i2);
                        charSequenceSubSequence2 = charSequenceSubSequence;
                    }
                    if (ub7.U(charSequenceSubSequence, " ")) {
                        charSequenceSubSequence = "";
                    }
                    keyboardInputView.w = charSequenceSubSequence;
                    for (int i6 = 0; i6 < charSequenceSubSequence2.length(); i6++) {
                        char cCharAt = charSequenceSubSequence2.charAt(i6);
                        if (cCharAt == '\n') {
                            oh3 oh3Var = (oh3) dd3Var;
                            dg8 dg8Var = dg8.VK_RETURN;
                            oh3Var.g(dg8Var, false, 0);
                            oh3Var.g(dg8Var, true, 0);
                        } else {
                            ((oh3) dd3Var).f(cCharAt, false);
                        }
                    }
                    break;
                }
                break;
            case 7:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.B.getText();
                searchView.m0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.w(!zIsEmpty);
                if (searchView.k0 && !searchView.d0 && zIsEmpty) {
                    searchView.G.setVisibility(8);
                } else {
                    i4 = 8;
                }
                searchView.I.setVisibility(i4);
                searchView.s();
                searchView.v();
                if (searchView.W != null && !TextUtils.equals(charSequence, searchView.l0)) {
                    searchView.W.h(charSequence.toString());
                }
                searchView.l0 = charSequence.toString();
                break;
            case 8:
                ns6 ns6Var = ((ms6) obj).e1;
                ns6Var.getClass();
                String strValueOf = String.valueOf(charSequence);
                int length = strValueOf.length();
                int i7 = ns6Var.q;
                if (length > i7) {
                    ye4.c("SessionCommentViewModel", "comment length over the allowed amount");
                    ns6Var.r = strValueOf.substring(0, i7);
                } else {
                    ns6Var.r = strValueOf;
                }
                break;
        }
    }
}
