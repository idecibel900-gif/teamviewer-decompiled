package o;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qt implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1862o;
    public final /* synthetic */ Object p;

    public qt(TextView textView, Typeface typeface, int i) {
        this.m = (byte) 0;
        this.f1862o = textView;
        this.p = typeface;
        this.n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        d66 adapter;
        int iJ;
        byte b = this.m;
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.f1862o;
        switch (b) {
            case 0:
                TextView textView = (TextView) obj2;
                Typeface typeface = (Typeface) obj;
                ni4 ni4Var = st.a;
                String fontVariationSettings = textView.getFontVariationSettings();
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    st.a(textView, null);
                }
                textView.setTypeface(typeface, i);
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    st.a(textView, fontVariationSettings);
                }
                break;
            case 1:
                ((q60) obj).G0(i, (CharSequence) obj2);
                break;
            case 2:
                ((BottomSheetBehavior) obj).D((View) obj2, i);
                break;
            default:
                in3 in3Var = (in3) obj2;
                c76 c76Var = in3Var.e;
                ln3 ln3Var = (ln3) obj;
                RecyclerView recyclerView2 = ln3Var.r;
                if (recyclerView2 != null && recyclerView2.E && !in3Var.k && c76Var.b() != -1) {
                    i66 itemAnimator = ln3Var.r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.f()) {
                        ArrayList arrayList = ln3Var.p;
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (((in3) arrayList.get(i2)).l) {
                            }
                        }
                        ae aeVar = ln3Var.m;
                        c76Var.getClass();
                        s sVar = (s) c76Var;
                        ((View) aeVar.c).setVisibility(0);
                        new Handler(Looper.getMainLooper()).postDelayed(new io.sentry.b5((Object) aeVar, (byte) 22), 900L);
                        r rVar = r.m;
                        r rVar2 = i == 4 ? rVar : r.n;
                        j93 j93Var = (j93) aeVar.d;
                        View viewV = rVar2 == rVar ? sVar.v() : sVar.t();
                        View viewU = rVar2 == rVar ? sVar.u() : sVar.s();
                        int i3 = rVar2 == rVar ? R.color.monitoring_alert_recheck_background_end : R.color.monitoring_alert_acknowledge_background_end;
                        int i4 = rVar2 == rVar ? R.color.monitoring_alert_recheck_background_starting : R.color.monitoring_alert_acknowledge_background_starting;
                        xz2 xz2Var = new xz2((byte) 28);
                        View viewR = sVar.r();
                        viewR.getClass();
                        viewU.getClass();
                        viewV.getClass();
                        int i5 = (sVar.E == null || (recyclerView = sVar.D) == null || (adapter = recyclerView.getAdapter()) == null || (iJ = sVar.D.J(sVar)) == -1 || sVar.E != adapter) ? -1 : iJ;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(500L);
                        alphaAnimation.setInterpolator(new DecelerateInterpolator());
                        alphaAnimation.setAnimationListener(new ee(viewV, viewU, i3, j93Var, rVar2, i5, viewR, xz2Var, i4));
                        viewV.startAnimation(alphaAnimation);
                    }
                    ln3Var.r.post(this);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qt(byte b, int i, Object obj, Object obj2) {
        this.m = b;
        this.p = obj;
        this.f1862o = obj2;
        this.n = i;
    }

    public qt(q60 q60Var, int i, CharSequence charSequence) {
        this.m = (byte) 1;
        this.p = q60Var;
        this.n = i;
        this.f1862o = charSequence;
    }
}
