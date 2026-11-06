package o;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xf1 extends za2 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf1(TextInputLayout textInputLayout, byte b) {
        super(textInputLayout);
        this.d = b;
    }

    @Override // o.za2
    public final void a() {
        byte b = this.d;
        TextInputLayout textInputLayout = this.a;
        switch (b) {
            case 0:
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                break;
            default:
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconDrawable((Drawable) null);
                textInputLayout.setEndIconContentDescription((CharSequence) null);
                break;
        }
    }
}
