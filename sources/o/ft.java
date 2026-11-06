package o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ft implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ft(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        byte b = this.m;
        boolean z = false;
        Object obj = this.n;
        switch (b) {
            case 0:
                ot otVar = (ot) obj;
                if (!otVar.getInternalPopup().a()) {
                    otVar.r.m(otVar.getTextDirection(), otVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = otVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                lt ltVar = (lt) obj;
                ot otVar2 = ltVar.R;
                if (otVar2.isAttachedToWindow() && otVar2.getGlobalVisibleRect(ltVar.P)) {
                    ltVar.r();
                    ltVar.g();
                } else {
                    ltVar.dismiss();
                }
                break;
            case 2:
                fm0 fm0Var = (fm0) obj;
                ArrayList arrayList = fm0Var.t;
                if (fm0Var.a() && arrayList.size() > 0 && !((em0) arrayList.get(0)).a.J) {
                    View view = fm0Var.A;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((em0) it.next()).a.g();
                        }
                    } else {
                        fm0Var.dismiss();
                    }
                    break;
                }
                break;
            case 3:
                NavigationView navigationView = (NavigationView) obj;
                int[] iArr = navigationView.v;
                navigationView.getLocationOnScreen(iArr);
                boolean z2 = iArr[1] == 0;
                h15 h15Var = navigationView.s;
                if (h15Var.B != z2) {
                    h15Var.B = z2;
                    int i = (h15Var.n.getChildCount() == 0 && h15Var.B) ? h15Var.D : 0;
                    NavigationMenuView navigationMenuView = h15Var.m;
                    navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z2);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    boolean z3 = activity.findViewById(R.id.content).getHeight() == navigationView.getHeight();
                    boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    if (z3 && z4) {
                        z = true;
                    }
                    navigationView.setDrawBottomInsetForeground(z);
                }
                break;
            default:
                r87 r87Var = (r87) obj;
                aq4 aq4Var = r87Var.t;
                if (r87Var.a() && !aq4Var.J) {
                    View view2 = r87Var.y;
                    if (view2 != null && view2.isShown()) {
                        aq4Var.g();
                    } else {
                        r87Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
