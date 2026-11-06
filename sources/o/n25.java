package o;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n25 {
    public static final SparseArray m;
    public static final /* synthetic */ n25[] n;

    /* JADX INFO: Fake field, exist only in values array */
    n25 EF1;

    static {
        n25 n25Var = new n25("MOBILE", 0);
        n25 n25Var2 = new n25("WIFI", 1);
        n25 n25Var3 = new n25("MOBILE_MMS", 2);
        n25 n25Var4 = new n25("MOBILE_SUPL", 3);
        n25 n25Var5 = new n25("MOBILE_DUN", 4);
        n25 n25Var6 = new n25("MOBILE_HIPRI", 5);
        n25 n25Var7 = new n25("WIMAX", 6);
        n25 n25Var8 = new n25("BLUETOOTH", 7);
        n25 n25Var9 = new n25("DUMMY", 8);
        n25 n25Var10 = new n25("ETHERNET", 9);
        n25 n25Var11 = new n25("MOBILE_FOTA", 10);
        n25 n25Var12 = new n25("MOBILE_IMS", 11);
        n25 n25Var13 = new n25("MOBILE_CBS", 12);
        n25 n25Var14 = new n25("WIFI_P2P", 13);
        n25 n25Var15 = new n25("MOBILE_IA", 14);
        n25 n25Var16 = new n25("MOBILE_EMERGENCY", 15);
        n25 n25Var17 = new n25("PROXY", 16);
        n25 n25Var18 = new n25("VPN", 17);
        n25 n25Var19 = new n25("NONE", 18);
        n = new n25[]{n25Var, n25Var2, n25Var3, n25Var4, n25Var5, n25Var6, n25Var7, n25Var8, n25Var9, n25Var10, n25Var11, n25Var12, n25Var13, n25Var14, n25Var15, n25Var16, n25Var17, n25Var18, n25Var19};
        SparseArray sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(0, n25Var);
        sparseArray.put(1, n25Var2);
        sparseArray.put(2, n25Var3);
        sparseArray.put(3, n25Var4);
        sparseArray.put(4, n25Var5);
        sparseArray.put(5, n25Var6);
        sparseArray.put(6, n25Var7);
        sparseArray.put(7, n25Var8);
        sparseArray.put(8, n25Var9);
        sparseArray.put(9, n25Var10);
        sparseArray.put(10, n25Var11);
        sparseArray.put(11, n25Var12);
        sparseArray.put(12, n25Var13);
        sparseArray.put(13, n25Var14);
        sparseArray.put(14, n25Var15);
        sparseArray.put(15, n25Var16);
        sparseArray.put(16, n25Var17);
        sparseArray.put(17, n25Var18);
        sparseArray.put(-1, n25Var19);
    }

    public static n25 valueOf(String str) {
        return (n25) Enum.valueOf(n25.class, str);
    }

    public static n25[] values() {
        return (n25[]) n.clone();
    }
}
