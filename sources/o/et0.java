package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class et0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ za2 b;

    public /* synthetic */ et0(za2 za2Var, byte b) {
        this.a = b;
        this.b = za2Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        byte b = this.a;
        za2 za2Var = this.b;
        switch (b) {
            case 0:
                it0 it0Var = (it0) za2Var;
                hc0 hc0Var = it0Var.d;
                EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(editText.hasFocus() && editText.getText().length() > 0);
                textInputLayout.setEndIconCheckable(false);
                editText.setOnFocusChangeListener(it0Var.e);
                editText.removeTextChangedListener(hc0Var);
                editText.addTextChangedListener(hc0Var);
                break;
            case 1:
                EditText editText2 = textInputLayout.getEditText();
                if (!(editText2 instanceof AutoCompleteTextView)) {
                    hk0.o("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                } else {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
                    z62 z62Var = (z62) za2Var;
                    v62 v62Var = z62Var.d;
                    TextInputLayout textInputLayout2 = z62Var.a;
                    int boxBackgroundMode = textInputLayout2.getBoxBackgroundMode();
                    if (boxBackgroundMode == 2) {
                        autoCompleteTextView.setDropDownBackgroundDrawable(z62Var.m);
                    } else if (boxBackgroundMode == 1) {
                        autoCompleteTextView.setDropDownBackgroundDrawable(z62Var.l);
                    }
                    if (autoCompleteTextView.getKeyListener() == null) {
                        int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                        qn4 boxBackground = textInputLayout2.getBoxBackground();
                        int iD0 = io1.d0(autoCompleteTextView, R.attr.colorControlHighlight);
                        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                        if (boxBackgroundMode2 == 2) {
                            int iD1 = io1.d0(autoCompleteTextView, R.attr.colorSurface);
                            qn4 qn4Var = new qn4(boxBackground.m.a);
                            int iR = wo1.R(0.1f, iD0, iD1);
                            qn4Var.l(new ColorStateList(iArr, new int[]{iR, 0}));
                            qn4Var.setTint(iD1);
                            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iR, iD1});
                            qn4 qn4Var2 = new qn4(boxBackground.m.a);
                            qn4Var2.setTint(-1);
                            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, qn4Var, qn4Var2), boxBackground});
                            WeakHashMap weakHashMap = be8.a;
                            autoCompleteTextView.setBackground(layerDrawable);
                        } else if (boxBackgroundMode2 == 1) {
                            int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{wo1.R(0.1f, iD0, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
                            WeakHashMap weakHashMap2 = be8.a;
                            autoCompleteTextView.setBackground(rippleDrawable);
                        }
                    }
                    autoCompleteTextView.setOnTouchListener(new x62(z62Var, autoCompleteTextView));
                    autoCompleteTextView.setOnFocusChangeListener(z62Var.e);
                    autoCompleteTextView.setOnDismissListener(new y62(z62Var));
                    autoCompleteTextView.setThreshold(0);
                    autoCompleteTextView.removeTextChangedListener(v62Var);
                    autoCompleteTextView.addTextChangedListener(v62Var);
                    textInputLayout.setEndIconCheckable(true);
                    textInputLayout.setErrorIconDrawable((Drawable) null);
                    if (autoCompleteTextView.getKeyListener() == null) {
                        CheckableImageButton checkableImageButton = z62Var.c;
                        WeakHashMap weakHashMap3 = be8.a;
                        checkableImageButton.setImportantForAccessibility(2);
                    }
                    textInputLayout.setTextInputAccessibilityDelegate(z62Var.f);
                    textInputLayout.setEndIconVisible(true);
                }
                break;
            default:
                EditText editText3 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                ug5 ug5Var = (ug5) za2Var;
                ug5Var.c.setChecked(!ug5Var.d());
                v62 v62Var2 = ug5Var.d;
                editText3.removeTextChangedListener(v62Var2);
                editText3.addTextChangedListener(v62Var2);
                break;
        }
    }
}
