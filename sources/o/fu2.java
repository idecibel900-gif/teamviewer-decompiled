package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class fu2 implements LayoutInflater.Factory2 {
    public final su2 m;

    public fu2(su2 su2Var) {
        this.m = su2Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        av2 av2VarH;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        su2 su2Var = this.m;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, su2Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uz5.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = ut2.class.isAssignableFrom(ku2.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    ut2 ut2VarE = resourceId != -1 ? su2Var.E(resourceId) : null;
                    if (ut2VarE == null && string != null) {
                        ut2VarE = su2Var.F(string);
                    }
                    if (ut2VarE == null && id != -1) {
                        ut2VarE = su2Var.E(id);
                    }
                    if (ut2VarE == null) {
                        ku2 ku2VarJ = su2Var.J();
                        context.getClassLoader();
                        ut2VarE = ku2VarJ.a(attributeValue);
                        ut2VarE.z = true;
                        ut2VarE.J = resourceId != 0 ? resourceId : id;
                        ut2VarE.K = id;
                        ut2VarE.L = string;
                        ut2VarE.A = true;
                        ut2VarE.F = su2Var;
                        wt2 wt2Var = su2Var.x;
                        ut2VarE.G = wt2Var;
                        Context context2 = wt2Var.t;
                        ut2VarE.S = true;
                        if ((wt2Var == null ? null : wt2Var.s) != null) {
                            ut2VarE.S = true;
                        }
                        av2VarH = su2Var.a(ut2VarE);
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "Fragment " + ut2VarE + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (ut2VarE.A) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        ut2VarE.A = true;
                        ut2VarE.F = su2Var;
                        wt2 wt2Var2 = su2Var.x;
                        ut2VarE.G = wt2Var2;
                        Context context3 = wt2Var2.t;
                        ut2VarE.S = true;
                        if ((wt2Var2 == null ? null : wt2Var2.s) != null) {
                            ut2VarE.S = true;
                        }
                        av2VarH = su2Var.h(ut2VarE);
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + ut2VarE + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    bv2 bv2Var = cv2.a;
                    cv2.b(new dv2(ut2VarE, "Attempting to use <fragment> tag to add fragment " + ut2VarE + " to container " + viewGroup));
                    cv2.a(ut2VarE).getClass();
                    ut2VarE.T = viewGroup;
                    av2VarH.k();
                    av2VarH.j();
                    View view2 = ut2VarE.U;
                    if (view2 == null) {
                        hk0.l(fx3.g("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (ut2VarE.U.getTag() == null) {
                        ut2VarE.U.setTag(string);
                    }
                    ut2VarE.U.addOnAttachStateChangeListener(new eu2(this, av2VarH));
                    return ut2VarE.U;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
