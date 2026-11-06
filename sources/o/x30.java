package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x30 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        byte b = 1;
        if (i == 0) {
            f40 f40Var = (f40) message.obj;
            e40 e40Var = f40Var.c;
            e40Var.setOnAttachStateChangeListener(new y30(f40Var));
            if (e40Var.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = e40Var.getLayoutParams();
                if (layoutParams instanceof cd1) {
                    cd1 cd1Var = (cd1) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    df6 df6Var = baseTransientBottomBar$Behavior.h;
                    df6Var.getClass();
                    df6Var.n = f40Var.m;
                    baseTransientBottomBar$Behavior.b = new y30(f40Var);
                    cd1Var.b(baseTransientBottomBar$Behavior);
                    cd1Var.g = 80;
                }
                f40Var.e();
                e40Var.setVisibility(4);
                f40Var.a.addView(e40Var);
            }
            WeakHashMap weakHashMap = be8.a;
            if (e40Var.isLaidOut()) {
                f40Var.d();
                return true;
            }
            e40Var.setOnLayoutChangeListener(new y30(f40Var));
            return true;
        }
        byte b2 = 0;
        if (i != 1) {
            return false;
        }
        f40 f40Var2 = (f40) message.obj;
        int i2 = message.arg1;
        e40 e40Var2 = f40Var2.c;
        AccessibilityManager accessibilityManager = f40Var2.l;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || e40Var2.getVisibility() != 0) {
            f40Var2.b();
            return true;
        }
        if (e40Var2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setInterpolator(lo.a);
            valueAnimatorOfFloat.addUpdateListener(new w30(f40Var2, b2));
            valueAnimatorOfFloat.setDuration(75L);
            valueAnimatorOfFloat.addListener(new v30(f40Var2, i2, b));
            valueAnimatorOfFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        e40 e40Var3 = f40Var2.c;
        int height = e40Var3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = e40Var3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(lo.b);
        valueAnimator.setDuration(250L);
        byte b3 = 3;
        valueAnimator.addListener(new v30(f40Var2, i2, b3));
        valueAnimator.addUpdateListener(new w30(f40Var2, b3));
        valueAnimator.start();
        return true;
    }
}
