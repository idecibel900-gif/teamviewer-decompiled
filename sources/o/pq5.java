package o;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* JADX INFO: loaded from: classes.dex */
public abstract class pq5 extends v02 implements DialogInterface.OnClickListener {
    public DialogPreference F0;
    public CharSequence G0;
    public CharSequence H0;
    public CharSequence I0;
    public CharSequence J0;
    public int K0;
    public BitmapDrawable L0;
    public int M0;

    @Override // o.v02
    public final Dialog C0(Bundle bundle) {
        this.M0 = -2;
        nd ndVar = new nd(r0());
        CharSequence charSequence = this.G0;
        jd jdVar = (jd) ndVar.f1562o;
        jdVar.d = charSequence;
        jdVar.c = this.L0;
        jdVar.g = this.H0;
        jdVar.h = this;
        jdVar.i = this.I0;
        jdVar.j = this;
        r0();
        int i = this.K0;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterD0 = this.Z;
            if (layoutInflaterD0 == null) {
                layoutInflaterD0 = d0(null);
                this.Z = layoutInflaterD0;
            }
            viewInflate = layoutInflaterD0.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            G0(viewInflate);
            jdVar.r = viewInflate;
        } else {
            jdVar.f = this.J0;
        }
        I0(ndVar);
        od odVarE = ndVar.e();
        if (this instanceof g82) {
            Window window = odVarE.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                oq5.a(window);
                return odVarE;
            }
            g82 g82Var = (g82) this;
            g82Var.Q0 = SystemClock.currentThreadTimeMillis();
            g82Var.J0();
        }
        return odVarE;
    }

    public final DialogPreference F0() {
        PreferenceScreen preferenceScreen;
        DialogPreference dialogPreference = this.F0;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        String string = q0().getString("key");
        br5 br5Var = ((rq5) K(true)).q0;
        Preference preferenceY = null;
        if (br5Var != null && (preferenceScreen = (PreferenceScreen) br5Var.g) != null) {
            preferenceY = preferenceScreen.y(string);
        }
        DialogPreference dialogPreference2 = (DialogPreference) preferenceY;
        this.F0 = dialogPreference2;
        return dialogPreference2;
    }

    public void G0(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.J0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void H0(boolean z);

    public void I0(nd ndVar) {
    }

    @Override // o.v02, o.ut2
    public void X(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        super.X(bundle);
        ut2 ut2VarK = K(true);
        if (!(ut2VarK instanceof rq5)) {
            hk0.l("Target fragment must implement TargetFragment interface");
            return;
        }
        rq5 rq5Var = (rq5) ut2VarK;
        String string = q0().getString("key");
        if (bundle != null) {
            this.G0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.H0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.I0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.J0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.K0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.L0 = new BitmapDrawable(H(), bitmap);
                return;
            }
            return;
        }
        br5 br5Var = rq5Var.q0;
        Preference preferenceY = null;
        if (br5Var != null && (preferenceScreen = (PreferenceScreen) br5Var.g) != null) {
            preferenceY = preferenceScreen.y(string);
        }
        DialogPreference dialogPreference = (DialogPreference) preferenceY;
        this.F0 = dialogPreference;
        this.G0 = dialogPreference.Y;
        this.H0 = dialogPreference.b0;
        this.I0 = dialogPreference.c0;
        this.J0 = dialogPreference.Z;
        this.K0 = dialogPreference.d0;
        Drawable drawable = dialogPreference.a0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.L0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.L0 = new BitmapDrawable(H(), bitmapCreateBitmap);
    }

    @Override // o.v02, o.ut2
    public void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.G0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.H0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.I0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.J0);
        bundle.putInt("PreferenceDialogFragment.layout", this.K0);
        BitmapDrawable bitmapDrawable = this.L0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.M0 = i;
    }

    @Override // o.v02, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        H0(this.M0 == -1);
    }
}
