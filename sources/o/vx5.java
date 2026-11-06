package o;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vx5 {
    public static final vx5 m;
    public static final /* synthetic */ vx5[] n;

    static {
        vx5 vx5Var = new vx5("DEFAULT", 0);
        m = vx5Var;
        vx5 vx5Var2 = new vx5("UNMETERED_ONLY", 1);
        vx5 vx5Var3 = new vx5("UNMETERED_OR_DAILY", 2);
        vx5 vx5Var4 = new vx5("FAST_IF_RADIO_AWAKE", 3);
        vx5 vx5Var5 = new vx5("NEVER", 4);
        vx5 vx5Var6 = new vx5("UNRECOGNIZED", 5);
        n = new vx5[]{vx5Var, vx5Var2, vx5Var3, vx5Var4, vx5Var5, vx5Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, vx5Var);
        sparseArray.put(1, vx5Var2);
        sparseArray.put(2, vx5Var3);
        sparseArray.put(3, vx5Var4);
        sparseArray.put(4, vx5Var5);
        sparseArray.put(-1, vx5Var6);
    }

    public static vx5 valueOf(String str) {
        return (vx5) Enum.valueOf(vx5.class, str);
    }

    public static vx5[] values() {
        return (vx5[]) n.clone();
    }
}
