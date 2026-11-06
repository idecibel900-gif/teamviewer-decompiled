package o;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.material.textview.MaterialTextView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi3 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2706o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ zi3(View view, MaterialTextView materialTextView, MaterialTextView materialTextView2, aj3 aj3Var, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.m = (byte) 0;
        this.n = view;
        this.f2706o = materialTextView;
        this.p = materialTextView2;
        this.t = aj3Var;
        this.q = materialTextView3;
        this.r = materialTextView4;
        this.s = materialTextView5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l07 ji8Var;
        int i;
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z = false;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.p;
        Object obj7 = this.f2706o;
        Object obj8 = this.n;
        switch (b) {
            case 0:
                MaterialTextView materialTextView = (MaterialTextView) obj7;
                MaterialTextView materialTextView2 = (MaterialTextView) obj6;
                aj3 aj3Var = (aj3) obj2;
                MaterialTextView materialTextView3 = (MaterialTextView) obj5;
                MaterialTextView materialTextView4 = (MaterialTextView) obj4;
                MaterialTextView materialTextView5 = (MaterialTextView) obj3;
                rc3 rc3Var = (rc3) obj;
                b28.a((ViewGroup) ((View) obj8).findViewById(R.id.quick_action_bottom_sheet_layout), new sm0());
                if (rc3Var != null) {
                    if (rc3Var instanceof pc3) {
                        materialTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.interaction_method_mouse, 0, 0, 0);
                        materialTextView2.setText(aj3Var.I(R.string.interaction_mode_mouse_description));
                        materialTextView3.setText(aj3Var.I(R.string.interaction_mode_drag_to_move_the_mouse));
                        materialTextView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.drag_to_move_the_mouse, 0, 0);
                        materialTextView4.setText(aj3Var.I(R.string.interaction_mode_two_fingers_to_scroll));
                        materialTextView4.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.two_fingers_to_scroll, 0, 0);
                        materialTextView5.setText(aj3Var.I(R.string.interaction_mode_double_tap_and_drag_to_select));
                        materialTextView5.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.double_tap_and_drag_to_select, 0, 0);
                        return f88Var;
                    }
                    if (rc3Var instanceof qc3) {
                        materialTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.interaction_method_touch, 0, 0, 0);
                        materialTextView2.setText(aj3Var.I(R.string.interaction_mode_touch_description));
                        materialTextView3.setText(aj3Var.I(R.string.interaction_mode_two_fingers_to_pan));
                        materialTextView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.two_fingers_to_pan, 0, 0);
                        materialTextView4.setText(aj3Var.I(R.string.interaction_mode_one_finger_to_scroll));
                        materialTextView4.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.one_finger_to_scroll, 0, 0);
                        materialTextView5.setText(aj3Var.I(R.string.interaction_mode_long_press_and_drag_to_select));
                        materialTextView5.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.long_press_and_drag_to_select, 0, 0);
                        return f88Var;
                    }
                }
                gk0.s();
                return null;
            case 1:
                List list = (List) obj8;
                Function1 function1 = (Function1) obj7;
                Function1 function2 = (Function1) obj6;
                Function1 function3 = (Function1) obj5;
                Function1 function4 = (Function1) obj4;
                iw2 iw2Var = (iw2) obj3;
                String str = (String) obj2;
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                h44Var.b(list.size(), function1 != null ? new y2(function1, list, (byte) 17) : null, new ha1(list, (byte) 7), new yy0(802480018, true, new dn6(list, function2, function3, function4, iw2Var, str)));
                return f88Var;
            default:
                dm7 dm7Var = (dm7) obj8;
                String str2 = (String) obj7;
                px4 px4Var = (px4) obj6;
                px4 px4Var2 = (px4) obj5;
                px4 px4Var3 = (px4) obj4;
                me1 me1Var = (me1) obj3;
                px4 px4Var4 = (px4) obj2;
                Context context = (Context) obj;
                context.getClass();
                WebView webView = (dm7Var == null || !dm7Var.e) ? new WebView(context) : new WebView(new ContextThemeWrapper(context, R.style.Theme_AppCompat_DayNight));
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(dm7Var != null && dm7Var.a);
                settings.setBuiltInZoomControls(dm7Var != null && dm7Var.b);
                settings.setDisplayZoomControls(false);
                if (dm7Var != null && dm7Var.c) {
                    z = true;
                }
                settings.setAllowFileAccess(z);
                if (dm7Var != null && dm7Var.e && (i = Build.VERSION.SDK_INT) >= 29 && i < 33) {
                    settings.setForceDark(1);
                }
                if (dm7Var != null && dm7Var.e && ri8.a("ALGORITHMIC_DARKENING")) {
                    WebSettings settings2 = webView.getSettings();
                    if (!ri8.a.b()) {
                        yq4.r("This method is not supported by the current version of the framework and the current WebView APK");
                        return null;
                    }
                    try {
                        ji8Var = new l07((WebSettingsBoundaryInterface) ka0.r(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) si8.a.n).convertSettings(settings2)), (byte) 26);
                    } catch (ClassCastException e) {
                        if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(settings2.getClass().getCanonicalName())) {
                            throw e;
                        }
                        io.sentry.android.core.v0.d("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
                        ji8Var = new ji8(null, (byte) 26);
                    }
                    ji8Var.G();
                    break;
                }
                webView.setWebViewClient(new em7(px4Var, px4Var2, px4Var3, dm7Var, me1Var, px4Var4));
                webView.loadUrl(str2);
                return webView;
        }
    }

    public /* synthetic */ zi3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.m = b;
        this.n = obj;
        this.f2706o = obj2;
        this.p = obj3;
        this.q = obj4;
        this.r = obj5;
        this.s = obj6;
        this.t = obj7;
    }
}
