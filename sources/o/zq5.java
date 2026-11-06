package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zq5 extends cx2 implements iw2 {
    public static final zq5 n = new zq5(3, SharedPreferences.Editor.class, "putInt", "putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        int iIntValue = ((Number) obj3).intValue();
        editor.getClass();
        return editor.putInt((String) obj2, iIntValue);
    }
}
