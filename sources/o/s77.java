package o;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s77 {
    public static final yi5 m;
    public static final s77 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s77 f1990o;
    public static final s77 p;
    public static final s77 q;
    public static final /* synthetic */ s77[] r;

    static {
        s77 s77Var = new s77("REMOVED", 0);
        n = s77Var;
        s77 s77Var2 = new s77("VISIBLE", 1);
        f1990o = s77Var2;
        s77 s77Var3 = new s77("GONE", 2);
        p = s77Var3;
        s77 s77Var4 = new s77("INVISIBLE", 3);
        q = s77Var4;
        r = new s77[]{s77Var, s77Var2, s77Var3, s77Var4};
        m = new yi5((byte) 10);
    }

    public static s77 valueOf(String str) {
        return (s77) Enum.valueOf(s77.class, str);
    }

    public static s77[] values() {
        return (s77[]) r.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (su2.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (su2.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (su2.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (su2.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (su2.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iOrdinal != 3) {
            gk0.s();
            return;
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
