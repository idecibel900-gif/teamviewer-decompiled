package o;

import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ug5 extends za2 {
    public final v62 d;
    public final et0 e;
    public final ft0 f;

    public ug5(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new v62(this, (byte) 1);
        this.e = new et0(this, (byte) 2);
        this.f = new ft0(this, (byte) 2);
    }

    @Override // o.za2
    public final void a() {
        Drawable drawableP = uf0.p(this.b, R.drawable.design_password_eye);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(drawableP);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new o6(this, (byte) 8));
        LinkedHashSet linkedHashSet = textInputLayout.q0;
        et0 et0Var = this.e;
        linkedHashSet.add(et0Var);
        if (textInputLayout.q != null) {
            et0Var.a(textInputLayout);
        }
        textInputLayout.u0.add(this.f);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    public final boolean d() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
