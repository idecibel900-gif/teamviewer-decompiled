package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xq5 extends cx2 implements iw2 {
    public static final xq5 n = new xq5(3, SharedPreferences.Editor.class, "putBoolean", "putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        editor.getClass();
        return editor.putBoolean((String) obj2, zBooleanValue);
    }
}
