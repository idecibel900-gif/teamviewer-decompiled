package o;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ge8 extends xl {
    public final View N;
    public final x15 O;
    public mh6 P;
    public Function1 Q;
    public Function1 R;
    public Function1 S;

    public ge8(Context context, Function1 function1, sx2 sx2Var, nh6 nh6Var, int i, Owner owner) {
        View view = (View) function1.invoke(context);
        x15 x15Var = new x15();
        super(context, sx2Var, i, x15Var, view, owner);
        this.N = view;
        this.O = x15Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objF = nh6Var != null ? nh6Var.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (nh6Var != null) {
            setSavableRegistryEntry(nh6Var.g(strValueOf, new sl(this, (byte) 2)));
        }
        t2 t2Var = di1.a;
        this.Q = t2Var;
        this.R = t2Var;
        this.S = t2Var;
    }

    public static final void m(ge8 ge8Var) {
        ge8Var.S.invoke(ge8Var.N);
        ge8Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(mh6 mh6Var) {
        mh6 mh6Var2 = this.P;
        if (mh6Var2 != null) {
            ((ep3) mh6Var2).G();
        }
        this.P = mh6Var;
    }

    public final x15 getDispatcher() {
        return this.O;
    }

    public final Function1 getReleaseBlock() {
        return this.S;
    }

    public final Function1 getResetBlock() {
        return this.R;
    }

    public /* bridge */ /* synthetic */ u0 getSubCompositionView() {
        return null;
    }

    public final Function1 getUpdateBlock() {
        return this.Q;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1 function1) {
        this.S = function1;
        setRelease(new sl(this, (byte) 3));
    }

    public final void setResetBlock(Function1 function1) {
        this.R = function1;
        setReset(new sl(this, (byte) 4));
    }

    public final void setUpdateBlock(Function1 function1) {
        this.Q = function1;
        setUpdate(new sl(this, (byte) 5));
    }
}
